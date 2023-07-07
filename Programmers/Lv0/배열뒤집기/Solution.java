package Lv0.배열뒤집기;

class Solution {
    public int[] solution(int[] numList) {
        int i = 0;
        int j = numList.length - 1;

        while (i < j) {
            int cache = numList[i];
            numList[i] = numList[j];
            numList[j] = cache;
            i++;
            j--;
        }

        return numList;
    }
}
