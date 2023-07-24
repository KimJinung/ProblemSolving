package Lv0.배열비교하기;

import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int arr1Size = arr1.length;
        int arr2Size = arr2.length;

        if (arr1Size > arr2Size) return 1;
        else if (arr2Size > arr1Size) return -1;
        else {
            int arr1Sum = Arrays.stream(arr1).sum();
            int arr2Sum = Arrays.stream(arr2).sum();

            if (arr1Sum > arr2Sum) return 1;
            else if (arr2Sum > arr1Sum) return -1;
        }

        return 0;
    }
}