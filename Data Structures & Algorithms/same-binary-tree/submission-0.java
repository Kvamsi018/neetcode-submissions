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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        if(p==null && q==null) return true;
        if(p==null || q==null) return false;

        s1.push(p);
        s2.push(q);

        while(!s1.isEmpty() && !s2.isEmpty()){
            TreeNode n1 = s1.pop();
            TreeNode n2 = s2.pop();

            if(n1.val != n2.val) return false;

            if(n1.left == null && n2.left == null){}
            else if(n1.left == null || n2.left == null) return false;
            else {
                s1.push(n1.left);
                s2.push(n2.left);
            }


            if(n1.right == null && n2.right == null){}
            else if(n1.right == null || n2.right == null) return false;
            else {
                s1.push(n1.right);
                s2.push(n2.right);
            }
        }

        return s1.isEmpty() && s2.isEmpty();
    }
}
