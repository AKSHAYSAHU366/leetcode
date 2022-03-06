class Solution {
    public int thirdMax(int[] nums) {
         Arrays.sort(nums);
        int max_no=nums[nums.length-1];
        int count=1;
        if(nums.length<3)
        {
            return max_no;
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(count==3)
            {
                return max_no;
            }
            else
            {
                if(i!=0&&nums[i]>nums[i-1])
                {
                    max_no=nums[i-1];
                    count++;
                }
            }
        }
        return nums[nums.length-1];
        
    }
}