package Lv0.문자열뒤의n글자;

class Solution {
    public String solution(String my_string, int n) {
        int beginIndex = my_string.length() - n;
        int endIndex = my_string.length();

        return my_string.substring(beginIndex, endIndex);
    }
}