package Lv0.글자지우기;

import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Boolean> removeMap = new HashMap<>();

        for (int idx : indices) {
            removeMap.put(idx, true);
        }

        for (int i = 0; i < my_string.length(); i++) {
            if (removeMap.getOrDefault(i, false)) continue;
            sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }
}