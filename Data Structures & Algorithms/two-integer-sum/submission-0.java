class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> st = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            st.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];

           if(st.containsKey(diff) && st.get(diff) != i){
            return new int[]{i, st.get(diff)};
           }
        }

        return new int[0];
    }
}
