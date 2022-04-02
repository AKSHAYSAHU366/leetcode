class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
          for(int i=0;i<nums.length;i++)
          {
              int current_sum=0;
              for(int j=i;j<nums.length;j++)
              {
             

                      current_sum=current_sum+nums[j];
                      if(current_sum==k)
                      {
                          count++;
                      }
                          
                 
              }
          }
        return count;
        
    }
}