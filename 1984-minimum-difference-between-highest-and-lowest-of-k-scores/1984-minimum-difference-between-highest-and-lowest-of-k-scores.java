class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1)
            return 0;
      Arrays.sort(nums);
        int i=0,j=k-1,temp=Integer.MAX_VALUE;
        while(j<nums.length)
        {
            if((nums[j]-nums[i])<temp)
                temp=nums[j]-nums[i];
            i++;
            j++;
        }
        return temp;
    }
}