package Lv0.수조작하기1;

class Solution {

    private int move(int n, char c) {
        switch (c) {
            case 'w' -> n++;
            case 's' -> n--;
            case 'd' -> n += 10;
            case 'a' -> n -= 10;
        }
        return n;
    }

    public int solution(int n, String control) {
        for (char c : control.toCharArray()) {
            n = move(n, c);
        }

        return n;
    }
}