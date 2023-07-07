package Lv0.문자열뒤집기;

class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder(myString).reverse();
        return sb.toString();
    }
}