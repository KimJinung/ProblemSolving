package Programmers.Lv1.문자열다루기기본;

class Solution {
    public boolean solution(String s) {
        return s.matches("[0-9]{4}|[0-9]{6}");
    }
}