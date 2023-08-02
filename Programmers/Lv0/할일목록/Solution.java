package Lv0.할일목록;

import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] todoList, boolean[] finished) {
        return IntStream.range(0, finished.length)
                .filter(i -> !finished[i])
                .mapToObj(i -> todoList[i])
                .toArray(String[]::new);
    }
}
