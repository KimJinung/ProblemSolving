package Lv3.단어변환;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Solution {

    private static class Word {
        public final String word;
        public final int depth;

        public Word(String word, int depth) {
            this.word = word;
            this.depth = depth;
        }
    }

    private boolean isConvertable(String origin, String target) {
        int diffCount = 0;

        for (int i = 0; i < origin.length(); i++) {
            if (origin.charAt(i) == target.charAt(i)) continue;
            diffCount += 1;
        }

        return diffCount == 1;
    }

    public int solution(String begin, String target, String[] words) {
        Word start = new Word(begin, 0);
        Queue<Word> q = new LinkedList<>();
        q.add(start);

        HashMap<String, Boolean> isUsed = new HashMap<>();
        for (String word : words) {
            isUsed.put(word, false);
        }

        while (!q.isEmpty()) {
            Word word = q.poll();

            if (word.word.equals(target)) return word.depth;

            for (String nextWord : words) {
                if (isUsed.get(nextWord)) continue;
                if (isConvertable(word.word, nextWord)) {
                    q.add(new Word(nextWord, word.depth + 1));
                    isUsed.put(nextWord, true);
                }
            }
        }
        return 0;
    }
}