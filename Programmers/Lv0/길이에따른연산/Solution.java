package Lv0.길이에따른연산;

import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int size = num_list.length;

        if (size > 10) return Arrays.stream(num_list).sum();

        return Arrays.stream(num_list)
                .reduce(1, (a ,b) -> a * b);
    }
}