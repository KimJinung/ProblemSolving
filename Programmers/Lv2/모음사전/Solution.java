package Programmers.Lv2.모음사전;


import java.util.*;

class Solution {
    private static char[] VOWEL = "AEIOU".toCharArray();

    private void generate(String word, List<String> words) {
        words.add(word);
        if (word.length() == 5) return;

        for (char ch : VOWEL) {
            generate(word + ch, words);
        }
    }

    public int solution(String word) {
        ArrayList<String> words = new ArrayList<>();
        generate("", words);
        return words.indexOf(word);
    }
}