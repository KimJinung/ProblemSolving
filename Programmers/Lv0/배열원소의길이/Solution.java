package Lv0.배열원소의길이;

import java.util.Arrays;

class Solution {
    public int[] solution(String[] strList) {
        return Arrays.stream(strList)
                .mapToInt(String::length)
                .toArray();
    }
}