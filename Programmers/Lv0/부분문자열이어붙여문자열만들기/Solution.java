package Lv0.부분문자열이어붙여문자열만들기;

class Solution {
    public String solution(String[] myStrings, int[][] parts) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1];
            String substring = myStrings[i].substring(start, end + 1);
            sb.append(substring);
        }

        return sb.toString();
    }
}