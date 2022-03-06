class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int currl=1,prevl=1;
       // int l=1,r=1;
       // int a=nums.length;
        if(nums.length==0)
        {
            return 0;
        }
        for(int i=0;i<nums.length-1;i++)
        {
           if(nums[i]<nums[i+1])
           {
             currl++;  
           }
            else
            {
                currl=1;
            }
            
            if(prevl<currl)
            {
                prevl=currl;
            }
           
        }
        return prevl;
    }
}
