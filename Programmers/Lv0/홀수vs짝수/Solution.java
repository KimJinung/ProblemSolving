package Lv0.홀수vs짝수;

class Solution {
    public int solution(int[] numList) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < numList.length; i++) {
            int index = i + 1;
            if (index % 2 == 0) {
                even += numList[i];
            } else {
                odd += numList[i];
            }
        }
        return Math.max(odd, even);
    }
}
