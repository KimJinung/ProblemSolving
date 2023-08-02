package Lv0.더크게합치기;

class Solution {
    private int customSum(int value1, int value2) {
        return Integer.parseInt(String.valueOf(value1) + value2);
    }

    public int solution(int a, int b) {
        return Math.max(customSum(a, b), customSum(b, a));
    }
}