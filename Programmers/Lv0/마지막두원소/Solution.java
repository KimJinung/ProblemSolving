package Lv0.마지막두원소;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

        int lastElement = num_list[num_list.length - 1];
        int targetElement = num_list[num_list.length - 2];

        answer[answer.length - 1] = lastElement > targetElement ? lastElement - targetElement : lastElement * 2;
        return answer;
    }
}

