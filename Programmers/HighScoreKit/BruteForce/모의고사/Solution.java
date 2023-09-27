package HighScoreKit.BruteForce.모의고사;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {

    int[][] answerArray = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };

    private int getAnswer(int studentNumber, int problemNumber) {
        int length = answerArray[studentNumber].length;
        return answerArray[studentNumber][problemNumber % length];
    }

    public int[] solution(int[] answers) {
        int[] answerCount = {0, 0, 0};

        for (int problemNumber = 0; problemNumber < answers.length; problemNumber++) {
            for (int student = 0; student < 3; student++) {
                if (getAnswer(student, problemNumber) == answers[problemNumber]) {
                    answerCount[student]++;
                }
            }
        }
        int highScore = Arrays.stream(answerCount).max().getAsInt();

        return IntStream.rangeClosed(0, 2)
                .filter(i-> answerCount[i] == highScore)
                .map(i -> i + 1)
                .toArray();
    }
}
