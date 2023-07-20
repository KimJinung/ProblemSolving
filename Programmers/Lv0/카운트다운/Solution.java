package Lv0.카운트다운;

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];

        int value = start;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = value--;
        }

        return answer;
    }
}
