package Lv0.머쓱이보다키큰사람;

import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array)
                .filter(h -> h > height)
                .count();
    }
}