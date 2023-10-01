package HighScoreKit.BruteForce.피로도;

class Solution {
    private int DFS(int fatigue, int[][] dungeons, boolean[] isUsed) {
        int result = 0;

        for (int i = 0; i < dungeons.length; i++) {
            int needFatigue = dungeons[i][0];
            int useFatigue = dungeons[i][1];

            if (!isUsed[i] && fatigue >= needFatigue) {
                isUsed[i] = true;
                result = Math.max(1 + DFS(fatigue - useFatigue, dungeons, isUsed), result);
                isUsed[i] = false;
            }
        }

        return result;
    }


    public int solution(int k, int[][] dungeons) {
        return DFS(k, dungeons, new boolean[dungeons.length]);
    }
}