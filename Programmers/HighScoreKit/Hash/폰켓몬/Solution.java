package HighScoreKit.Hash.폰켓몬;

import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int chooseCount = nums.length / 2;
        HashMap<Integer, Boolean> pocketMonMap = new HashMap<>();

        for (int pocketMon : nums) {
            if (!pocketMonMap.getOrDefault(pocketMon, false)) {
                pocketMonMap.put(pocketMon, true);
                answer++;
                chooseCount--;

                if (chooseCount == 0) {
                    break;
                }
            }
        }

        return answer;
    }
}
