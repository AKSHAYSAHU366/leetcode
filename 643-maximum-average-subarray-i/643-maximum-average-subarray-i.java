class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double cur=0.0d,per=0.0d;
        int j=0;
        
        if(nums.length < k){
            return 0.0d;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(j>=k)
            {
                cur=cur+nums[i]-nums[i-k];
                if(cur>per)
                {
                    per=cur;
                }
                
            }
            else
            {
            cur=cur+nums[i];
            per = cur;
           
            if(cur>per)
            {
                per=cur;
            }
             j++;
            }
        }
        return per/k;
    }
}