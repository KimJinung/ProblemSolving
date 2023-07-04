package Lv2.마법의엘리베이터;

import java.util.Arrays;

class Solution {

    private int elevator(int index, int[] arr, int acc) {
        if (index == 0) {
            return Arrays.stream(arr).sum() + acc;
        }

        int[] nextArr = Arrays.copyOf(arr, arr.length);
        int nextAcc = 10 - nextArr[index];
        nextArr[index] = 0;
        nextArr[index - 1]++;
        index--;
        return Math.min(elevator(index, arr, acc), elevator(index, nextArr, acc + nextAcc));
    }

    public int solution(int storey) {
        String strNum = "0" + storey;
        int[] arr = strNum.chars().map(i -> i - '0').toArray();
        return elevator(arr.length - 1, arr, 0);
    }
}