package Lv0.컨트롤제트;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int cache = 0;

        for (String command : s.trim().split(" ")) {
            if (command.equals("Z")) {
                answer -= cache;
            } else{
                int v = Integer.parseInt(command);
                answer += v;
                cache = v;
            }

        }

        return answer;
    }
}