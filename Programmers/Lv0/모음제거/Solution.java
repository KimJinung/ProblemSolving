package Lv0.모음제거;

class Solution {
    public String solution(String myString) {
        return myString.replaceAll("[aeiou]", "");
    }
}