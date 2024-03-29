package Programmers.Lv1.시저암호;

class Solution {
    private char push(char c, int n) {
        if (!Character.isAlphabetic(c)) return c;

        int startOffset = Character.isUpperCase(c) ? 'A' :'a';
        int position = (c - startOffset);
        position = (position + n) % ('z' - 'a' + 1);
        return (char) (startOffset + position);

    }

    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            sb.append(push(c, n));
        }

        return sb.toString();
    }
}