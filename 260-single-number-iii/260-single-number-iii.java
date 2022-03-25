class Solution {
    public int[] singleNumber(int[] nums)
    {
        int sum = 0;
        for (int i=0;i<nums.length;i++)
        {
            sum = (sum^nums[i]);
        }
        sum = (sum &-sum);
        int sum1 = 0;
        int sum2 = 0;
      for(int i = 0;i<nums.length;i++)
        {
            if((nums[i]&sum)==0)
            {
                 sum1 = sum1^nums[i];
                
            }
            else
            {
                 sum2 = sum2^nums[i];
            }
        }
       
      
        int arr[] = new int[2];
        arr[0] = sum1;
        arr[1] = sum2;
        
        return arr;
    }
}

