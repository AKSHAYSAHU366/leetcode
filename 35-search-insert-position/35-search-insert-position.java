class Solution {
     int bis(int nums[],int target,int p,int q)
    {  
    int start = 0, end = nums.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
    public int searchInsert(int[] nums, int target) {
       return  bis(nums,target,0,nums.length);
    }
}