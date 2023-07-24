package Lv0.배열의길이에따라다른연산하기;

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int n) {
        int condition = arr.length % 2 == 0 ? 1 : 0;

        return IntStream.range(0, arr.length)
                .map(i -> (i % 2 == condition) ? arr[i] += n : arr[i])
                .toArray();
    }
}
