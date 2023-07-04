package Lv2.마법의엘리베이터;


class Solution {

    private int elevator(int storey) {
        if (storey == 0) return 0;
        if (storey < 10) return Math.min(storey, 11 - storey);
        if (storey % 10 == 0) return elevator(storey / 10);

        int remainder = storey % 10;

        int up = 10 - remainder + elevator(storey + 10 - remainder);
        int down = remainder + elevator(storey - remainder);

        return Math.min(up, down);
    }

    public int solution(int storey) {
        return elevator(storey);
    }
}