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
    public boolean path(TreeNode root,int targetSum)
    {
        if(root==null)
        {
            return false;
        }
        if((root.left==null&& root.right==null))
          {  if(targetSum==root.val)
             return true;
              return false;
          }
  
         return path(root.left,targetSum-root.val)||path(root.right,targetSum-root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root==null)
            return false;
        if(targetSum==root.val&&root.left==null&&root.right==null)
        {
            return true;
        }
         return path(root,targetSum);
    }
}