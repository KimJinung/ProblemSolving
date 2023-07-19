package Lv0.중앙값구하기;

import java.util.Arrays;


class Solution {
    public int solution(int[] array) {
        int index = array.length / 2;
        Arrays.sort(array);
        return array[index];
    }
}
