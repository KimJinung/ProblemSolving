package Lv0.주사위게임1;

class Solution {
    private boolean isOdd(int num) {
        return num % 2 == 1;
    }

    public int solution(int a, int b) {
        if (isOdd(a) && isOdd(b)) return a * a + b * b;
        else if (isOdd(a) || isOdd(b)) return 2 * (a + b);
        return Math.abs(a - b);
    }
}
