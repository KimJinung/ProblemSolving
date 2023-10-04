package Lv0.코드처리하기;

class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        boolean mode = false;

        char[] codeArr = code.toCharArray();

        for (int i = 0; i < code.length(); i++) {
            if (Character.isAlphabetic(codeArr[i])) {
                if (!mode && i % 2 == 0) {
                    sb.append(codeArr[i]);
                } else if(mode && i % 2 == 1) {
                    sb.append(codeArr[i]);
                }
            } else {
                mode = !mode;
            }
        }

        String answer = sb.toString();

        return answer.equals("") ? "EMPTY" : answer;
    }
}