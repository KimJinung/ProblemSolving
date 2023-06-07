package Programmers.Lv2.교점에별만들기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private static class Point {
        public final long x, y;

        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    private Point getIntersection(long a, long b, long e, long c, long d, long f) {
        double x = (double) (b * f - e * d) / (a * d - b * c);
        double y = (double) (e * c - a * f) / (a * d - b * c);

        if (x % 1 != 0 || y % 1 != 0) return null;

        return new Point((long) x, (long) y);
    }

    private Point getMaxPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point point : points) {
            if (point.x > x) x = point.x;
            if (point.y > y) y = point.y;
        }

        return new Point(x, y);
    }

    private Point getMinPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point point : points) {
            if (point.x < x) x = point.x;
            if (point.y < y) y = point.y;
        }

        return new Point(x, y);
    }

    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < line.length -1 ; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point intersection = getIntersection(
                        line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);

                if (intersection != null) {
                    points.add(intersection);
                }
            }
        }

        Point maxPoint = getMaxPoint(points);
        Point minPoint = getMinPoint(points);

        int rowSize = (int) (maxPoint.y - minPoint.y + 1);
        int colSize = (int) (maxPoint.x - minPoint.x + 1);

        char[][] arr = new char[rowSize][colSize];

        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }

        for (Point point : points) {
            int x = (int) (point.x - minPoint.x);
            int y = (int) (maxPoint.y - point.y);

            arr[x][y] = '*';
        }

        String[] answer = new String[arr.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = new String(arr[i]);
        }

        return answer;
    }
}
