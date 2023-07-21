package Lv0.n번째원소부터;

import java.util.Arrays;


class Solution {
    public int[] solution(int[] numList, int n) {
        return Arrays.copyOfRange(numList, n - 1, numList.length);
    }
}
