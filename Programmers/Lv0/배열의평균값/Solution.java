package Lv0.배열의평균값;

import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
