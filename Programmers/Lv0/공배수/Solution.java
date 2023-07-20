package Lv0.공배수;

class Solution {
    private boolean isCommonMultiple(int value, int div) {
        return value % div == 0;
    }

    public int solution(int number, int n, int m) {
        return isCommonMultiple(number, n) && isCommonMultiple(number, m) ? 1 : 0;
    }
}
