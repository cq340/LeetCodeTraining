package April;

import java.util.Arrays;

public class numSplit {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1);

        for (int i = 3; i <= n; ++i) {
            for (int j = 1; j < i; ++j) {
                int val = Math.max(j * (i - j), j * dp[i - j]);
                dp[i] = Math.max(dp[i], val);
            }
        }
        return dp[n];
    }
}
