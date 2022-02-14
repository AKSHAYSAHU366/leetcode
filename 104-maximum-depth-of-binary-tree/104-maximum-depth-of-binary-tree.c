#include <stdio.h>
#include <stdlib.h>
/*Definition for a binary tree node.
    struct TreeNode {
       int val;
   struct TreeNode *left;
      struct TreeNode *right;
  };*/
 

int maxDepth(struct TreeNode* root){
    if(root==NULL)
        return 0;
    if(root->left==NULL&&root->right==NULL)
    {
        return 1;
    }
    int l=0,r=0;
       if(root->left!=NULL)
       {
      l=maxDepth(root->left);
       }
    if(root->right!=NULL)
    {
     r=maxDepth(root->right);
    }
      if(l>r)
      {
          return l+1;
      }
    else
    {
        return r+1;
    }
}