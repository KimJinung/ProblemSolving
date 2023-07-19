package Lv0.원소들의곱과합;

import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int sum = Arrays.stream(num_list).sum();
        int mul = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);

        return mul < sum * sum ? 1 : 0;
    }
}
