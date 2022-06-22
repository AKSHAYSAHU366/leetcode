class Solution {
    public int quicksortq(int h,int l,int nums[])
    {
      
        int p=h;
        int q=l;
        int i=p;
        //int j=i+1;
        for(int j=i+1;j<=q;j++)
        {
            if(nums[j]<=nums[p])
            {
                i++;
                int k=nums[i];
                nums[i]=nums[j];
                nums[j]=k;
            }
            
        }
        int k=nums[i];
        nums[i]=nums[p];
        nums[p]=k;
        return i;
        
        
    }
    public int findKthLargest1(int l1,int h,int[] nums, int k) {
        if(l1==h)
            return nums[l1];
       // int l=nums.length-1;
        int i=quicksortq(l1,h,nums);
        if(i==k)
        {
            return nums[i];
        }
        else if(k>i)
        {
           i= findKthLargest1(i+1,h,nums,k);
        }
        else
        {
          i= findKthLargest1(l1,i-1,nums,k);
        }
        return i;
            
    }

    public int findKthLargest(int[] nums, int k) {
        k=nums.length-k;
       return findKthLargest1(0,nums.length-1,nums,k);
    }
}