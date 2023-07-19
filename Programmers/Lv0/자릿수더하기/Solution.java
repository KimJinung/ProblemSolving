package Lv0.자릿수더하기;

class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            int value = n % 10;
            n /= 10;
            answer += value;
        }

        return answer;
    }
}