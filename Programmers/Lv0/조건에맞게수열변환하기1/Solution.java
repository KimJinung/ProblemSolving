package Lv0.조건에맞게수열변환하기1;

import java.util.*;


class Solution {
    private int condition(int num) {
        if (num >= 50 && num % 2 == 0) return num / 2;
        else if (num < 50 && num % 2 != 0) return num * 2;
        return num;
    }

    public int[] solution(int[] arr) {
        return Arrays.stream(arr)
                .map(v -> condition(v))
                .toArray();
    }
}