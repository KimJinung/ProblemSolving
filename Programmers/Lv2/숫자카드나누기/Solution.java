package Lv2.숫자카드나누기;

import java.util.Arrays;

class Solution {

    private int getGCD(int[] arr) {
        int gcd = 1;

        for (int i = 2; i <= arr[0]; i++) {
            boolean isPossible = true;
            for (int k : arr) {
                if (k % i != 0) {
                    isPossible = false;
                    break;
                }
            }
            if (isPossible) {
                gcd = i;
            }

        }
        return gcd;
    }

    private boolean isPossibleCase(int[] arr, int gcd) {
        for (int num : arr) {
            if (num % gcd == 0) return false;
        }
        return true;
    }

    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        int result1 = getGCD(arrayA);
        int result2 = getGCD(arrayB);

        if (isPossibleCase(arrayB, result1) && result1 > answer) answer = result1;
        if (isPossibleCase(arrayA, result2) && result2 > answer) answer = result2;

        return answer;
    }
}
