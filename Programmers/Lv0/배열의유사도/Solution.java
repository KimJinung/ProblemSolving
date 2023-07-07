package Lv0.배열의유사도;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> stringSet = new HashSet<>(Arrays.asList(s1));

        return (int) Arrays.stream(s2)
                .filter(stringSet::contains)
                .count();
    }
}