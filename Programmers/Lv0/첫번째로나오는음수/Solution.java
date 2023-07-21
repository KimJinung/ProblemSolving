package Lv0.첫번째로나오는음수;

class Solution {
    public int solution(int[] numList) {
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] < 0) return i;
        }

        return -1;
    }
}
