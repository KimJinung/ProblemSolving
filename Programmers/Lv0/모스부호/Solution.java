package Lv0.모스부호;

import java.util.HashMap;
import java.util.Map;

class Solution {

    String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."};

    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        Map<String, Character> morseMap = new HashMap<>();

        for (int i = 0; i < morse.length; i++) {
            morseMap.put(morse[i], (char) (97 + i));
        }

        String[] words = letter.split(" ");

        for (String v : words) {
            sb.append(morseMap.get(v));
        }

        return sb.toString();
    }
}
