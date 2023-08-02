package Lv0.뒤에서5등위로;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        Arrays.sort(numList);
        return Arrays.copyOfRange(numList, 5, numList.length);
    }
}
