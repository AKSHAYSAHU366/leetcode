import java.lang.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean f=false;
    HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i]))
            {
                if((Math.abs(h.get(nums[i])-i))<=k)
                {
                   f=true;
                    return f;
                }
                else
                {
                     h.put(nums[i],i);
                }
                
            }
            else
            {
                h.put(nums[i],i);
            }
            
        }
        return f;
    }
}