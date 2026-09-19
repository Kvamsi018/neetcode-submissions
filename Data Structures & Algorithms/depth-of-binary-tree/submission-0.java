/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int helpFn(TreeNode root){
        if(root == null) return 0;

        Stack st = new Stack();
        st.push(root);

        TreeNode t1 = root.left;
        TreeNode t2 = root.right;

        if(t1 != null) st.push(t1);
        if(t2 != null) st.push(t2);
        int cnt1 = 0, cnt2 = 0;
        while(!st.isEmpty()){
            st.pop();
            cnt1 = 1 + helpFn(t1);
            cnt2 = 1 + helpFn(t2);
        }
        return Math.max(cnt1 , cnt2);
    }
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int res = helpFn(root);

        return res;
    }
}
