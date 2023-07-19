package Lv0.문자반복출력하기;

class Solution {
    public String solution(String myString, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) {
            for (int i = 0; i < n; i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
