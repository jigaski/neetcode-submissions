class Solution {
    public int maxProfit(int[] prices) {
        int prev = Integer.MAX_VALUE;
        int max_profit = 0;
        for (Integer num : prices) {
            if (num < prev) {
                prev = num;
            } else {
                int profit = num - prev;
                if (profit > max_profit) {
                    max_profit = profit;
                }
            }
        }
        return max_profit;
    }
}
