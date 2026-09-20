class Solution {
    public void helpFn(int[] nums, int target, List<Integer> li, List<List<Integer>> list, int i){
        if(target == 0) {
            list.add(new ArrayList<>(li));
            return ;
        }
        if(i==nums.length || target<0) return ;

        helpFn(nums, target, li, list, i+1);
        if(nums[i] <= target) {
            li.add(nums[i]);
            helpFn(nums, target - nums[i], li, list, i);

            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li = new ArrayList<>();

        helpFn(nums, target, li, list, 0);

        return list;
    }
}
