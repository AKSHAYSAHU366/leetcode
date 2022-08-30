class Solution {
   
    public boolean canJump(int[] nums) {
        
          if(nums.length==1)
            return true;
         boolean count=true;
          for(int i:nums)
          {
            if(i==0)
                count=false;
          }
        if(count)
            return true;
        int reachable=0;
        for(int i=0;i<nums.length;i++)
        {
            if(reachable<i)
                return false;
            reachable=Math.max(reachable,i+nums[i]);
        }
        return true;
            
           
    }
}