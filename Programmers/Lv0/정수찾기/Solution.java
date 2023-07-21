package Lv0.정수찾기;

class Solution {
    public int solution(int[] num_list, int n) {
        for (int v : num_list) {
            if (v == n) return 1;
        }

        return 0;
    }
}
