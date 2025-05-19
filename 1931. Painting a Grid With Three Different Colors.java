// 1931. Painting a Grid With Three Different Colors
// https://leetcode.com/problems/painting-a-grid-with-three-different-colors/description/?envType=daily-question&envId=2025-05-18

class Solution {
    private static final int MOD = 1_000_000_007;
    public int colorTheGrid(int m, int n) {
        List<Integer> patterns = new ArrayList<>();
        generatePatterns(0, m, 0, patterns);
        int[][] dp = new int[n][patterns.size()];
        Arrays.fill(dp[0], 1);
        
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < patterns.size(); i++) {
                for (int k = 0; k < patterns.size(); k++) {
                    if (isValid(patterns.get(i), patterns.get(k), m)) {
                        dp[j][i] = (dp[j][i] + dp[j - 1][k]) % MOD;
                    }
                }
            }
        }
        
        int result = 0;
        for (int x : dp[n - 1]) {
            result = (result + x) % MOD;
        }
        return result;
    }

    private void generatePatterns(int index, int m, int current, List<Integer> patterns) {
        if (index == m) {
            patterns.add(current);
            return;
        }
        for (int color = 1; color <= 3; color++) {
            if (index == 0 || (current % 10 != color)) {
                generatePatterns(index + 1, m, current * 10 + color, patterns);
            }
        }
    }

    private boolean isValid(int prev, int curr, int m) {
        for (int i = 0; i < m; i++) {
            if (prev % 10 == curr % 10) return false;
            prev /= 10;
            curr /= 10;
        }
        return true;
    }
}