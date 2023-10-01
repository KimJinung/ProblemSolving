package HighScoreKit.BruteForce.카펫;

/*
갈색 카펫 = 2 * (width + height - 2)
노란색 카펫 = width * height - 갈색 카펫

갈색 카펫은 최소 8, 노란색 카펫은 1이다.
따라서 최소 카펫의 사이즈는 9(8 + 1)이며 3x3이다.
그러므로 minHeight와 minWidth는 [3, 3]이 된다.

갈색 카펫은 최대 5000개 이하다.
즉 2 * (width + height - 2) <= 5,000 이고,
이때 width가 최대가 되기 위해서는 height가 최소가 되어야 한다.
minHeight는 3이므로,
2 * (width + 3 - 2) <= 5000
= maxWidth = 2,499
*/

class Solution {
    int maxWidth = 2499;

    public int[] solution(int brown, int yellow) {
        for (int w = 3; w <= maxWidth; w++) {
            for (int h = 3; h <= w; h++) {
                int brownCapet = 2 * (w - 2 + h);
                int yellowCapet = w * h - brownCapet;

                if (brownCapet == brown && yellowCapet == yellow) {
                    return new int[] {w, h};
                }
            }
        }

        return null;
    }
}
