package Lv0.배열의원소삭제하기;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] deleteList) {
        HashMap<Integer, Boolean> hash = new HashMap<>();
        for (int v : deleteList) {
            hash.put(v, true);
        }

        List<Integer> list = new ArrayList<>();
        for (int v : arr) {
            if (hash.getOrDefault(v, false)) continue;
            list.add(v);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}