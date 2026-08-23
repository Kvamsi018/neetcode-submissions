class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] sufPro = new int[n];

        sufPro[n-1] = prices[n-1];
        for(int i=n-2;i>=0;i--){
            sufPro[i] =Math.max(sufPro[i+1], prices[i]);
        }

        int maxProf = 0;
        for(int i=0;i<n;i++){
            int pro = sufPro[i] - prices[i];
            maxProf = Math.max(maxProf, pro);
        }

        return maxProf;
    }
}
