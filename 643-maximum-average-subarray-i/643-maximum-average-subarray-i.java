class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        if(nums.length < k){
            return 0.0f;
        }
        
        double sum = 0.0f , temp = 0.0f;
        
        for(int i=0; i<k; i++){
            temp += nums[i];
        }
        
        sum = temp;
        
        for(int i=k; i<nums.length; i++){
            temp += nums[i] - nums[i-k];
            
            if(temp > sum){
                sum = temp;
            }
        }
        
        return sum/k;
    }
}