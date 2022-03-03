class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=i+1;
        int k=1;
        if(nums.length==1)
        {
            return 1;
        }
        while(j<nums.length)
        {
            if(nums[i]!=nums[j])
            {
                if(i==0)
                {
                    k++;
                    nums[k-1]=nums[j];
                    i=j;
                
                }
                else
                {
                    k=k+1;
                    nums[k-1]=nums[j];
                    i=j;
                   
                }

            }
            j++;
        }
        return k;
    }
    
}