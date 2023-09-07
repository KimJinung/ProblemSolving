package Lv0.합성수찾기

class Solution {

    private boolean isComposition(int n) {
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) cnt++;
        }

        return cnt >= 3;
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            if (isComposition(i)) answer++;
        }

        return answer;
    }
}
