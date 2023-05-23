package Programmers.Lv1.삼진법뒤집기;

class Solution {
    public int solution(int n) {
        String ternary = Integer.toString(n, 3);
        String reversedTernary = new StringBuilder(ternary).reverse().toString();
        return Integer.parseInt(reversedTernary, 3);
    }
}