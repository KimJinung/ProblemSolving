package Lv2.HIndex;

import java.util.*;

class Solution {

    private boolean isValidHIndex(int[] arr, int h) {
        int idx = arr.length - h;
        return arr[idx] >= h;
    }

    public int solution(int[] citations) {
        Arrays.sort(citations);

        for (int h = citations.length; h >= 1; h--) {
            if (isValidHIndex(citations, h)) return h;
        }
        return 0;
    }

}