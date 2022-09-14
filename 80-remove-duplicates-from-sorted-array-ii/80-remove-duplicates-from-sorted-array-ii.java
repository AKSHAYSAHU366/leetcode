class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k=nums.length;
        int v=nums[0];
        int l=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==v)
            {
               l++; 
                if(l>=3)
                {
                    nums[i]='_';
                    k--;
                }
            }
            else
            {
                v=nums[i];
                l=1;
            }
                
            
        }
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!='_')
            {
                nums[j]=nums[i];
                j++;
            }
            
            
            
        }
        return k;
        
    }
}