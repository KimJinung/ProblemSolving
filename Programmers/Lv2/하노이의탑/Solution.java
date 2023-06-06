package Programmers.Lv2.하노이의탑;

import java.util.*;

/*
대표적인 재귀 문제

상태: (원판 개수, from, to)
종료 조건: 옮겨야 할 원판의 개수가 1개
점화식:
[1]: 원판을 바로 3번 기둥으로 옮긴다. (종료 조건)
[2]: 제일 작은 원판을 2번으로 옮긴다. + 가장 큰 원판을 3번으로 옮긴다. + 제일 작은 원판을 3번으로 이동시킨다.
[3]: [2]번의 결과를 3번이 아닌 2번으로 가게 한다. + 가장 큰 원판 3번 이동 + 2번 기둥을 1번으로 옮긴다. + 1번 기둥에서 3번으로 간다.
[4]: [3]번 결과를 2번으로 가게 한다. + 가장 큰 원판 3번 이동 + 2번 기둥을 1번으로 옮긴다. + 1번 기둥에서 3번으로 간다.

(n, from, to) =
(n-1, from, empty)
+ (1, from, to)
+ (n-1, empty, to) *empty -> from -> to 순서로 가므로
*/


class Solution {

    private void hanoi(int n, int from, int to, List<int[]> process) {
        if (n == 1) {
            process.add(new int[] {from, to});
            return;
        }
        int empty = 6 - from - to;
        hanoi(n - 1, from, empty, process);
        hanoi(1, from, to, process);
        hanoi(n - 1, empty, to, process);
    }

    public int[][] solution(int n) {
        ArrayList<int[]> process = new ArrayList<>();
        hanoi(n, 1, 3, process);
        return process.toArray(new int[0][]);
    }
}
