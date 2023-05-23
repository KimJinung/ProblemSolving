package Programmers.Lv1.문자열내p와y의개수;

class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();

        int ps = s.replace("y", "").length();
        int ys = s.replace("p", "").length();

        return ps == ys;
    }
}
