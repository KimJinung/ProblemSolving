package HighScoreKit.StackQueue.같은숫자는싫어;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stk = new Stack<>();

        for (int num : arr) {
            if (!stk.isEmpty() && stk.peek() == num) continue;
            stk.add(num);
        }

        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
