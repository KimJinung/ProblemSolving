package Programmers.Lv1.숫자문자열과영단어;

class Solution {
    private static final String[] numberWords = {
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine"
    };
    public int solution(String s) {
        for (int i = 0; i < numberWords.length; i++) {
            s = s.replace(numberWords[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}
