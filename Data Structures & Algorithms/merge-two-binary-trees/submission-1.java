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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null) {
            return root2;
        }
        if(root2 == null) {
            return root1;
        }
        root1.val = merge(root1 , root2);
       root1.right = mergeTrees(root1.right , root2.right);
        root1.left = mergeTrees(root1.left , root2.left);
        return root1;
    }

    private int merge(TreeNode r1 , TreeNode r2 ) {
        
        if(r1 == null) {
            return r2.val;
        }
        if(r2 == null) { 
            return r1.val;
        }

        return r2.val + r1.val;
    }
}