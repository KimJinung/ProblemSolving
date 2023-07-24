package Lv0.원하는문자열찾기;

class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();

        return myString.contains(pat) ? 1 : 0;
    }
}