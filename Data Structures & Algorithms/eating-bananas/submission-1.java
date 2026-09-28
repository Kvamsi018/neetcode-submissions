class Solution {
    public int helpFn(int m, int[] piles){
        int hrs = 0;
        for(int i=0;i<piles.length;i++){
            hrs  += (int)Math.ceil((double)piles[i]/m);
        }

        return hrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int times = h/n;

        int max = 0;
        for(int i=0;i<n;i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }

        int u = (int)Math.ceil((double)max/times);
        int l = 1;

        int min = max;

        while(l<=u){
            int m = (l+u)/2;
            int hrs = 0;
            for(int i=0;i<piles.length;i++){
                hrs  += (int)Math.ceil((double)piles[i]/m);
            }

            if(hrs<=h){
                min = hrs;
                u = m - 1;
            }else{
                l = m + 1;
            }
        }

        return l;
    }
}
