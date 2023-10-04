package Lv0.문자열섞기;

class Solution {
    public String solution(String str1, String str2) {
        int size = str1.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }

        return sb.toString();
    }
}
