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
    public boolean is(TreeNode root ,int targetSum,int sum)
    {
        if(root==null)
            return false;
        if(root.left==null&&root.right==null)
        {
            sum+=root.val;
            if(sum==targetSum)
            return true;
            else
             return false;
        }
      
        sum+=root.val;
            
        return is(root.left,targetSum,sum)||is(root.right,targetSum,sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return is(root,targetSum,0);
    }
}