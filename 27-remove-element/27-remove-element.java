import java.util.*;
class Solution {
    public void assertion(int nums[],int i,int l)
    {
        for(int j=i;j<l-1;j++)
        {
            nums[j]=nums[j+1];
        }
    }
    public int removeElement(int[] nums, int val) {
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            if(nums[i]==val)
            {
                assertion(nums,i,l);
                l--;
                i--;
            }
        }
        return l;
    }
}