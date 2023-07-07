package Lv0.순서쌍의개수;

import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .count();
    }
}
