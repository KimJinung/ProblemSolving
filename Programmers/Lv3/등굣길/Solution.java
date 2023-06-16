package Programmers.Lv3.등굣길;

import java.util.Arrays;

class Solution {

    private int route(int x, int y, int col, int row, boolean[][] isPuddle, int[][] map) {
        // 상태: 현재 좌표
        // 종료 조건: 목적지 도착 or 웅덩이 or 범위 이탈
        // 점화식: (x, y) = (x + 1, y) + (y + 1, x)
        if (x > col || y > row) return 0;
        if (isPuddle[y][x]) return 0;
        if (x == col && y == row) return 1;
        if (map[y][x] != -1) return map[y][x];

        int routes = route(x + 1, y, col, row, isPuddle, map)
                + route(x, y + 1, col, row, isPuddle, map);

        return map[y][x] = routes % 1000000007;
    }

    public int solution(int m, int n, int[][] puddles) {
        int row = n;
        int col = m;

        int[][] map = new int[row + 1][col + 1];
        boolean[][] isPuddle = new boolean[row + 1][col + 1];

        for (int[] r: map) {
            Arrays.fill(r, -1);
        }

        for (int[] p : puddles) {
            isPuddle[p[1]][p[0]] = true;
        }

        return route(1, 1, col, row, isPuddle, map);
    }
}

// 누적합 풀이. 난이도는 훨씬 쉬운데 문제를 더 잘파악하고 있어야 규칙 발견하기가 쉽다.
class Solution2 {
    public int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[n + 1][m + 1];
        map[1][1] = 1;

        for (int[] p : puddles) {
            map[p[1]][p[0]] = -1;
        }

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= m; col++) {
                if (map[row][col] != -1) {
                    if (0 < col - 1 && map[row][col - 1] != -1) {
                        map[row][col] += map[row][col - 1];
                    }
                    if (0 < row - 1 && map[row - 1][col] != -1) {
                        map[row][col] += map[row - 1][col];
                    }
                    map[row][col] %= 1000000007;
                }
            }
        }
        return map[n][m];
    }
}
