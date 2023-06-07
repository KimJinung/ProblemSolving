package Programmers.Lv2.소수찾기;

import java.util.*;

/*
주어진 numbers를 가지고 생성 가능한 모든 숫자 생성(재귀)
만든 숫자가 소수인지 확인

재귀를 사용하는 경우 숫자를 만들어 나가면서 해당 숫자가 소수인지 검사할 수 있다.
 */

class Solution {
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 0; i * i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    
    private Set<Integer> getPrimes(int accumulated, int[] numbers, boolean[] isUsed, Set<Integer> primes) {
        if (isPrime(accumulated)) primes.add(accumulated);

        for (int i = 0; i < numbers.length; i++) {
            if (isUsed[i]) continue;
            int nextAccumulated = accumulated * 10 + numbers[i];
            isUsed[i] = true;
            primes.addAll(getPrimes(nextAccumulated, numbers, isUsed, primes));
            isUsed[i] = false;
        }
        return primes;
    }

    public int solution(String numbers) {
        Set<Integer> primes = new HashSet<>();
        boolean[] isUsed = new boolean[numbers.length()];
        int[] nums = numbers.chars().map(c -> c - '0').toArray();
        getPrimes(0, nums, isUsed, primes);
        return primes.size();
    }
}
