package Lv1.K번째수;

import java.util.*;

class Solution {

    private int method(int[] arr, int i, int j, int k) {
        int[] subArr = Arrays.copyOfRange(arr, i - 1, j);
        Arrays.sort(subArr);
        return subArr[k - 1];
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            answer[i] = method(array, command[0], command[1], command[2]);
        }

        return answer;
    }
}