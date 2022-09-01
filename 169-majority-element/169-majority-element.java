class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int temp=1;
        int index=0;
        int n=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==n)
            {
                temp++;
                if(temp>count)
                {
                    count=temp;
                    index=i;
                }
        
            }
            else
            {
                temp=1;
                n=nums[i];
            }
        }
        return nums[index];
    }
}