package HighScoreKit.StackQueue.프로세스;

import java.util.*;
import java.util.stream.*;


class Solution {

    private static class CustomProcess {
        private final int pid;
        private final boolean isTarget;

        public CustomProcess(int pid, boolean isTarget) {
            this.pid = pid;
            this.isTarget = isTarget;
        }

        public int getPid() {
            return this.pid;
        }

        public boolean isTarget() {
            return this.isTarget;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 1;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<CustomProcess> queue = new LinkedList<>();

        pq.addAll(Arrays.stream(priorities).boxed().collect(Collectors.toList()));
        for (int i = 0; i < priorities.length; i++) {
            boolean target = i == location;
            CustomProcess job = new CustomProcess(priorities[i], target);
            queue.add(job);
        }

        Integer targetPriority = pq.poll();

        while (!queue.isEmpty()) {
            CustomProcess currentJob = queue.poll();

            if (currentJob.getPid() == targetPriority) {
                if (currentJob.isTarget()) return answer;
                targetPriority = pq.poll();
                answer++;
            } else {
                queue.add(currentJob);
            }
        }

        return answer;
    }
}