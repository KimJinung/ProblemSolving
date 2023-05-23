package Programmers.Lv2.문자열압축;

/*
입력 제한사항
- 입력 문자열 사이즈는 1000 이하 = O(n^2) 까지 가능

문제 풀이
1. 완전 탐색이 가능하므로 1~문자열 사이즈까지 모두 스플릿
2. 압축
3. 사이즈 체크
4. 1~3번 반복하면서 가장 작은 케이스 저장
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        for (int length = 1; length <= s.length(); length++) {
            int compressed = compress(s, length);

            if (compressed < answer) answer = compressed;
        }

        return answer;
    }

    private int compress(String s, int length) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        String lastToken = "";

        for (String token : tokenize(s, length)) {
            if (token.equals(lastToken)) {
                count++;
            } else {
                if (count > 1) builder.append(count);
                builder.append(lastToken);
                lastToken = token;
                count = 1;
            }
        }
        if (count > 1) builder.append(count);
        builder.append(lastToken);

        return builder.length();
    }

    private List<String> tokenize(String s, int tokenSize) {
        List<String> tokens = new ArrayList<>();

        for (int startIdx = 0; startIdx < s.length(); startIdx += tokenSize) {
            int endIdx = startIdx + tokenSize;
            if (endIdx > s.length()) endIdx = s.length();

            tokens.add(s.substring(startIdx, endIdx));
        }
        return tokens;
    }

}
