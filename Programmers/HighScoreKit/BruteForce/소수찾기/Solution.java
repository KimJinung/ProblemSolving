package HighScoreKit.BruteForce.소수찾기;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    private boolean isPrime(int number) {
        if (number < 2) return false;

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    private void recursive(String acc, char[] numbers, boolean[] isUsed, Set<Integer> primes) {
        for (int i = 0; i < numbers.length; i++) {
            if (isUsed[i]) continue;
            String nextAcc = acc + numbers[i];
            int num = Integer.parseInt(nextAcc);
            if (isPrime(num)) primes.add(num);

            isUsed[i] = true;
            recursive(nextAcc, numbers, isUsed, primes);
            isUsed[i] = false;
        }
    }

    public int solution(String numbers) {
        char[] numArrays = numbers.toCharArray();
        Set<Integer> primes = new HashSet<>();
        recursive("", numArrays, new boolean[numArrays.length], primes);
        return primes.size();
    }
}
