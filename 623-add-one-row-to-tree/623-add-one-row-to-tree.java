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
    public void is(TreeNode root,int val,int depth,int re)
    {
      if(re==depth-1)
      {
          TreeNode n1=new TreeNode(val);
          TreeNode n2=new TreeNode(val);
          n1.left=root.left;
          n1.right=null;
          n2.right=root.right;
          n2.left=null;
          root.left=n1;
          root.right=n2;
          return ;
      }
        if(root.left!=null)
        is(root.left,val,depth,re+1);
        if(root.right!=null)
        is(root.right,val,depth,re+1);
        
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1)
        {
             TreeNode n1=new TreeNode(val);
              n1.left=root;
             n1.right=null;
            
            return n1;
            
        }
        is(root,val,depth,1);
        return root;
        
    }
}