class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;

        for(int i=0;i<s.length();i++){
            HashSet<Character> set = new HashSet<>();
            int j = i;

            while(j<s.length()){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
                j++;
            }
            maxLen = Math.max(maxLen, set.size());
        }

        return maxLen;
    }
}
