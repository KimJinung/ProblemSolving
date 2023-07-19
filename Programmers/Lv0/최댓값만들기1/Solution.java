package Lv0.최댓값만들기1;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int size = numbers.length;
        return numbers[size - 1] * numbers[size - 2];
    }
}