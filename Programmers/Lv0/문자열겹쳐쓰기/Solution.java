package Lv0.문자열겹쳐쓰기;

class Solution {
    public String solution(String myString, String overwriteString, int s) {
        StringBuilder sb = new StringBuilder();
        int end = overwriteString.length() + s - 1;

        for (int i = 0; i < myString.length(); i++) {
            if (i < s || i > end) {
                sb.append(myString.charAt(i));
            } else {
                sb.append(overwriteString.charAt(i - s));
            }
        }

        return sb.toString();
    }
}