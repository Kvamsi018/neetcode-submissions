class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int[] res = new int[2];

        while(left<right){
            int curr = numbers[left] + numbers[right];
            if(curr > target){
                right--;
            }else if(curr < target){
                left++;
            }else{
                return new int[]{left+1, right+1};
            }
        }

        return new int[1];
    }
}
