package Lv0.제곱수인지확인하기;

class Solution {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);

        if (sqrt % 1 == 0) return 1;
        return 2;
    }
}