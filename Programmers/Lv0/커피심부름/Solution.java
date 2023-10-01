package Lv0.커피심부름;

class Solution {
    String LATTE = "cafelatte";

    public int solution(String[] orders) {
        int answer = 0;

        for (String order : orders) {
            order = order.replaceAll("ice|hot", "");
            if (order.equals(LATTE)) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }

        return answer;
    }
}