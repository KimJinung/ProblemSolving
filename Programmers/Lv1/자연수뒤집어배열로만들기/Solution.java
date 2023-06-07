package Programmers.Lv1.자연수뒤집어배열로만들기;

class Solution {
    public int[] solution(long n) {
        return new StringBuilder()
                .append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
