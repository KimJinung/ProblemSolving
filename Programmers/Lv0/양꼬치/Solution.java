package Lv0.양꼬치;

class Solution {
    private final int LAMB = 12000;
    private final int BEVERAGE = 2000;

    public int solution(int n, int k) {
        int lambFee = n * LAMB;
        int serviceBeverageCount = n / 10;
        int beverageFee = (k - serviceBeverageCount) * BEVERAGE;
        return lambFee + beverageFee;
    }
}