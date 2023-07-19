package Lv0.숨어있는숫자의덧셈1;

class Solution {
    public int solution(String my_string) {
        int answer = 0;

        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                answer += c - '0';
            }
        }

        return answer;
    }
}