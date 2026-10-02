class Solution {
    public int maxProduct(int[] nums) {
        int min = 1, max = 1;

        int maxVal = nums[0];
        for(int num : nums){
            int temp = max*num;
            max = Math.max(num, Math.max(min*num, max*num));
            min = Math.min(num, Math.min(min*num, temp));

            maxVal = Math.max(maxVal, max);
        }

        return maxVal;
    }
}
