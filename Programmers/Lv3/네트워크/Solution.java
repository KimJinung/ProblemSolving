package Lv3.네트워크;

import java.util.Stack;

class Solution {
    private boolean[] dfs(int startNode, int[][] computers, boolean[] visited) {
        Stack<Integer> stk = new Stack<>();
        stk.add(startNode);

        while (!stk.isEmpty()) {
            Integer node = stk.pop();

            if (visited[node]) continue;
            visited[node] = true;

            for (int nextNode = 0; nextNode < computers[node].length; nextNode++) {
                if (computers[node][nextNode] == 0) continue;
                if (nextNode == node) continue;
                if (visited[nextNode]) continue;
                stk.add(nextNode);
            }
        }

        return visited;
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited = dfs(i, computers, visited);
                answer += 1;
            }
        }
        return answer;
    }
}
