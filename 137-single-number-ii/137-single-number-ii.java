class Solution {
    public int singleNumber(int[] nums) {
        try{
        Arrays.sort(nums);
        if(nums.length==1)
            return nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            if(i==0)
            {
              if(nums[i]<nums[i+1])
                  return nums[i];
            }
            else if(i+1==nums.length-1)
            {
                if(nums[i]<nums[i+1])
                    return nums[i+1];
            }
            else
            {
                if((nums[i]<nums[i+1])&&(nums[i]>nums[i-1]))
                    return nums[i];
            }
        }
        }
        catch(Exception e)
        {}
        return -1;
    }
}