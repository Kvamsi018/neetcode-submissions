public class Solution {
    public int cntPal(String s, int l, int r){
        int res = 0;
        while (l >= 0 && r < s.length() &&
                   s.charAt(l) == s.charAt(r)) {
                res++;
                l--;
                r++;
            }
        return res;
    }
    public int countSubstrings(String s) {
        int res = 0;

        for(int i=0;i<s.length();i++){
            res += cntPal(s, i, i);
            res += cntPal(s, i, i+1);
        }

        return res;
    }
}