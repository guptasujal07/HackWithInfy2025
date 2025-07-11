class Coinchange {

    public int coinChange(int[] coins, int amt) {
        int n = coins.length;
        int[][] dp = new int[n][amt + 1];

        // Base case: using only the first coin
        for (int a = 0; a <= amt; a++) {
            if (a % coins[0] == 0) {
                dp[0][a] = a / coins[0];
            } else {
                dp[0][a] = (int) 1e9; // Infinity
            }
        }

        // Fill DP table
        for (int i = 1; i < n; i++) {
            for (int a = 0; a <= amt; a++) {
                int pick = (int) 1e9;
                if (a >= coins[i]) {
                    pick = 1 + dp[i][a - coins[i]];
                }
                int noPick = dp[i - 1][a];
                dp[i][a] = Math.min(pick, noPick);
            }
        }

        int ans = dp[n - 1][amt];
        return ans >= (int) 1e9 ? -1 : ans;
    }

}
