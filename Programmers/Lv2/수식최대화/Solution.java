package Programmers.Lv2.수식최대화;

/*
1. 수식 계산이 가능하도록 연산자를 기준으로 토크나이징 한다.
2. 계산 우선순위를 생성하고, 우선순위에 따라 계산하는 메서드를 만든다.
 */

import java.util.*;

class Solution {
    private static final String[][] precedences = {
            "+-*".split(""),
            "+*-".split(""),
            "-+*".split(""),
            "-*+".split(""),
            "*+-".split(""),
            "*-+".split(""),
    };

    private long calculate(long left, long right, String op) {
        return switch(op) {
            case "+" -> left + right;
            case "-" -> left - right;
            case "*" -> left * right;
            default -> 0;
        };
    }

    private long calculate(List<String> tokens, String[] precedence) {
        for (String op : precedence) {
            for (int i = 0; i < tokens.size(); i++) {
                if (op.equals(tokens.get(i))) {
                    long left = Long.parseLong(tokens.get(i - 1));
                    long right = Long.parseLong(tokens.get(i + 1));
                    long result = calculate(left, right, op);
                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.add(i - 1, String.valueOf(result));
                    i -= 2;
                }
            }
        }
        return Long.parseLong(tokens.get(0));
    }

    public long solution(String expression) {
        long answer = 0;

        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*", true);
        List<String> tokens = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }

        for (String[] precedence : precedences) {
            long result = calculate(new ArrayList<>(tokens), precedence);
            long absoluteResult = Math.abs(result);
            if (absoluteResult > answer) {
                answer = absoluteResult;
            }
        }
        return answer;
    }

}

