package HighScoreKit.BruteForce.최소직사각형;

import java.util.Arrays;

class Solution {

    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            Arrays.sort(size);
            int width =  size[0];
            int height = size[1];

            if (width > maxWidth) maxWidth = width;
            if (height > maxHeight) maxHeight = height;
        }

        return maxWidth * maxHeight;
    }
}
