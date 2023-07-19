package Lv0.조건에맞게수열변환하기3;

import java.util.Arrays;


class Solution {
    private int[] mul(int[] arr, int k) {
        return Arrays.stream(arr)
                .map(v -> v * k)
                .toArray();
    }

    private int[] add(int[] arr, int k) {
        return Arrays.stream(arr)
                .map(v -> v + k)
                .toArray();
    }

    public int[] solution(int[] arr, int k) {
        if (k % 2 != 0) return mul(arr, k);
        return add(arr, k);
    }
}