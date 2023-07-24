package Lv0.이어붙인수;

import java.util.Arrays;


class Solution {
    public int solution(int[] numList) {
        StringBuilder evenSb = new StringBuilder();
        StringBuilder oddSb = new StringBuilder();

        Arrays.stream(numList)
                .forEach(v -> {
                    if (v % 2 == 0) evenSb.append(v);
                    else oddSb.append(v);
                });

        int evenNum = Integer.parseInt(evenSb.toString());
        int oddNum = Integer.parseInt(oddSb.toString());

        return evenNum + oddNum;
    }
}