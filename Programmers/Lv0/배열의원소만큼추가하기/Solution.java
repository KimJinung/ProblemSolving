package Lv0.배열의원소만큼추가하기;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int size = Arrays.stream(arr).sum();
        int[] answer = new int[size];
        int index = 0;

        for (int v : arr) {
            for (int j = 0; j < v; j++) {
                answer[index++] = v;
            }
        }

        return answer;
    }
}