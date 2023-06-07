package Programmers.Lv2.카펫;

/*
전체 카펫 개수 = height * width
갈색: height * 2 + (width - 2) * 2
노란색: width * height - (갈색 개수)

테두리가 존재하므로 가로 길이와 세로 길이의 최소 값은 3
갈색 카펫의 최대 개수 5000개
*/

class Solution {
    public int[] solution(int brown, int yellow) {

        for (int width = 3; width <= 5000; width++) {
            for (int height = 3; height <= width; height++) {
                int brownCapet = height * 2 + (width - 2) * 2;
                int yellowCapet = width * height - brownCapet;

                if (brownCapet == brown && yellowCapet == yellow) {
                    return new int[] {width, height};
                }
            }
        }
        return null;
    }
}
