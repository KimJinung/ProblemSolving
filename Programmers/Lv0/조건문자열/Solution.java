package Lv0.조건문자열;

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean answer;

        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                answer = n <= m;
            } else {
                answer = n < m;
            }
        } else {
            if (eq.equals("=")) {
                answer = n >= m;
            } else {
                answer = n > m;
            }
        }
        return answer ? 1 : 0;
    }
}