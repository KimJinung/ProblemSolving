package Lv2.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private static final int[] dx = {0, 0, 1, -1};
    private static final int[] dy = {1, -1, 0, 0};

    private static class Dot {
        public final int x;
        public final int y;

        public Dot(int y, int x) {
            this.x = x;
            this.y = y;
        }
    }

    private int BFS(int[][] maps) {
        int row = maps.length - 1;
        int col = maps[0].length - 1;

        Queue<Dot> q = new LinkedList<>();
        q.add(new Dot(0, 0));

        while (!q.isEmpty()) {
            Dot dot = q.poll();
            int cost = maps[dot.y][dot.x];

            for (int i = 0; i < 4; i++) {
                int ny = dot.y + dy[i];
                int nx = dot.x + dx[i];

                if (nx < 0 || nx > col || ny < 0 || ny > row) continue;
                else if (maps[ny][nx] == 0) continue;

                if (maps[ny][nx] == 1 || maps[ny][nx] > cost + 1) {
                    maps[ny][nx] = cost + 1;
                    q.add(new Dot(ny, nx));
                }
            }
        }

        return maps[row][col];
    }

    public int solution(int[][] maps) {
        int answer = BFS(maps);
        return answer > 1 ? answer : -1;
    }
}