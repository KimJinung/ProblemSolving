package Lv2.타겟넘버;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    private static class Node {
        public int acc;
        public int index;

        public Node(int acc, int index) {
            this.acc = acc;
            this.index = index;
        }
    }

    public int solution(int[] numbers, int target) {
        int answer = 0;

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0, 0));

        while (!q.isEmpty()) {
            Node node = q.poll();

            if (node.index == numbers.length) {
                if (node.acc == target) answer++;
                continue;
            }

            int value = numbers[node.index];
            int nextIndex = node.index + 1;
            q.add(new Node(node.acc + value, nextIndex));
            q.add(new Node(node.acc - value, nextIndex));
        }

        return answer;
    }
}