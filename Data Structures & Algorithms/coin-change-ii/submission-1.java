class Solution {
    public int helpFn(int amount, int[] coins, int i, int[][] memo){
        if(amount == 0) return 1;
        if(i==0){
            return (amount%coins[0]==0) ? 1 : 0;
        }
        if(memo[amount][i] != -1) return memo[amount][i];

        int take = 0;
        if(amount>=coins[i]) {
            take = helpFn(amount-coins[i], coins, i, memo);
        }
        int notTake = helpFn(amount, coins, i-1, memo);
        memo[amount][i] = take + notTake;

        return memo[amount][i];
    }
    public int change(int amount, int[] coins) {
        int[][] memo = new int[amount + 1][coins.length];

        for(int i=0;i<=amount;i++){
            Arrays.fill(memo[i], -1);
        }

        Arrays.sort(coins);

        return helpFn(amount, coins, coins.length-1, memo);
    }
}
