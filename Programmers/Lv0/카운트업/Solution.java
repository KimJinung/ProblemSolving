package Lv0.카운트업;

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];

        int v = start;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = v++;
        }

        return answer;
    }
}
