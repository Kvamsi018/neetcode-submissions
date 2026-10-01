class Solution {
    public int helpFn(int[] coins, int amount, int i){
        if(amount == 0) return 0;
        if(i==0){
            if(amount%coins[i] == 0) return amount/coins[i];
            else return 10000;
        }

        int take = 10000;
        if(amount>=coins[i]) take = helpFn(coins, amount-coins[i], i) + 1;
        int notTake = helpFn(coins, amount, i-1);
        return Math.min(take, notTake);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int res = helpFn(coins, amount, n-1);

        return (res >= 10000) ? -1 : res;
    }
}
