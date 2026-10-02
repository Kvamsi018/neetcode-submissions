class Solution {
    public boolean helpFn(String s, HashSet<String> set, int i, Boolean[] memo){
        if(i == s.length()){
            return true;
        }

        if(memo[i] != null) return memo[i];

        String str = "";
        for(int j=i;j<s.length();j++){
            str += s.charAt(j);

            if(set.contains(str)){
                if(helpFn(s, set, j+1, memo)){
                    return memo[i] = true;
                }
            }
        }
        
        return memo[i] = false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();

        for(String word : wordDict){
            set.add(word);
        }

        Boolean[] memo = new Boolean[s.length()];

        return helpFn(s, set, 0, memo);
    }
}
