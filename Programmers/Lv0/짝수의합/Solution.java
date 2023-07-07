package Lv0.짝수의합;

import java.util.stream.IntStream;

import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(2, n)
                .filter(i -> i % 2 == 0)
                .reduce(0, (a, b) -> a + b);
    }
}