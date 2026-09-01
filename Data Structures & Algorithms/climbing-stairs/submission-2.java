class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int prev[] = new int[n];

        for(int i=0;i<n;i++){
            prev[i] = -1;
        }

        prev[0] = 1;
        prev[1] = 2;

        for(int i=2;i<n;i++){
            prev[i] = prev[i-2] + prev[i-1];
        }

        return prev[n-1];
    }
}
