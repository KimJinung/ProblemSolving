package HighScoreKit.StackQueue.올바른괄호;

import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stk = new Stack<>();

        for (Character br : s.toCharArray()) {
            switch(br) {
                case '(':
                    stk.add(br);
                    continue;
                case ')':
                    if (stk.isEmpty() || stk.peek() != '(') return false;
                    stk.pop();
            }
        }

        return stk.isEmpty();
    }
}
