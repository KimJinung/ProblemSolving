package Lv0.아이스아메리카노;

class Solution {
    private final int americano = 5500;

    public int[] solution(int money) {
        int coupleOfCoffee = money / americano;
        int remainderMony = money - americano * coupleOfCoffee;
        return new int[] {coupleOfCoffee, remainderMony};
    }
}