class Solution {
    public int se(int []nums, int target,int l,int h)
    { 
        if(l==h)
        {
            if(nums[l]==target)
            {
                return l;
            }
            return -1;
        }
    
        int mid=(l+h)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        if(nums[mid]>target)
        {
            return se(nums,target,l,mid);
        }
        return se(nums,target,mid+1,h);
    }
    public int search(int[] nums, int target) {
         return se(nums,target,0,nums.length-1);
    }
}