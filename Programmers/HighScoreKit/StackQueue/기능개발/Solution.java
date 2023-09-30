package HighScoreKit.StackQueue.기능개발;

import java.util.*;

class Solution {

    private static class Work {
        public int progress;
        public int speed;

        public Work(int startProgress, int speed) {
            this.progress = startProgress;
            this.speed = speed;
        }

        public boolean isDone() {
            return this.progress >= 100;
        }

        public void update() {
            this.progress += this.speed;
        }
    }

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Work> queue = new LinkedList<>();
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < progresses.length; i++) {
            Work instance = new Work(progresses[i], speeds[i]);
            queue.add(instance);
        }

        while (!queue.isEmpty()) {
            int doneCount = 0;

            for (Work work : queue) {
                work.update();
            }

            while (!queue.isEmpty() && queue.peek().isDone()) {
                doneCount++;
                queue.poll();
            }

            if (doneCount > 0) stk.add(doneCount);
        }

        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
