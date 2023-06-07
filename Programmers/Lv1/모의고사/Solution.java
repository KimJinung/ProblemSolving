package Programmers.Lv1.모의고사;

import java.util.stream.IntStream;

class Solution {
    private static final int[][] PATTERNS = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };

    private int getPicked(int student, int problem) {
        int[] pattern = PATTERNS[student];
        return pattern[problem % pattern.length];
    }

    public int[] solution(int[] answers) {
        int[] OMR = new int[3];
        int max = 0;

        for (int problem = 0; problem < answers.length; problem++) {
            int correctAnswer = answers[problem];

            for (int student = 0; student < 3; student++) {
                int pick = getPicked(student, problem);
                if (pick == correctAnswer) {
                    if (++OMR[student] > max) {
                        max = OMR[student];
                    }
                }
            }
        }
        final int finalMax = max;

        return IntStream.range(0, 3)
                .filter(i -> OMR[i] == finalMax)
                .map(i -> i + 1)
                .toArray();
    }
}