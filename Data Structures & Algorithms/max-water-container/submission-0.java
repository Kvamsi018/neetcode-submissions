class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;

        int i = 0, j = n-1;
        int max = 0;
        while(i<j){
            int wid = Math.min(heights[i], heights[j]);
            int len = j-i;

            max = Math.max(max, wid * len);
            if(heights[i]<=heights[j]){
                i++;
            }else{
                j--;
            }
        }

        return max;
    }
}
