package Lv0.옷가게할인받기;

class Solution {
    public int solution(int price) {
        if (price >= 500000) {
            return price * 80 / 100;
        } else if (price >= 300000) {
            return price * 90 / 100;
        } else if (price >= 100000) {
            return price * 95 / 100;
        }

        return price;
    }
}