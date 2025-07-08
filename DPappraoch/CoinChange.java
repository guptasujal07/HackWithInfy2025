public class Solution {
    public int count(int coins[], int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        
        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] coins = {1, 2, 3};
        int sum = 4;
        
        int ways = sol.count(coins, sum);
        System.out.println("Number of ways to make sum " + sum + " is: " + ways);
    }
}
