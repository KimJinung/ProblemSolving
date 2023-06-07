class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isUpper = true;

        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if (isUpper) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                isUpper = !isUpper;
            } else {
                answer.append(c);
                isUpper = true;
            }
        }
        return answer.toString();
    }
}