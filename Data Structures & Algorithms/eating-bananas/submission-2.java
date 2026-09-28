class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        int max = 0;
        for(int i=0;i<n;i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }

        int u = max;
        int l = 1;

        while(l<=u){
            int m = (l+u)/2;
            int hrs = 0;
            for(int i=0;i<piles.length;i++){
                hrs  += (int)Math.ceil((double)piles[i]/m);
            }

            if(hrs<=h){
                u = m - 1;
            }else{
                l = m + 1;
            }
        }

        return l;
    }
}
