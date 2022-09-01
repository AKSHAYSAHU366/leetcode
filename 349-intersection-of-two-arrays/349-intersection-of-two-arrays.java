import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int i=0;
      int j=0;
      HashSet<Integer> arr=new HashSet<Integer>();
      while((i<nums1.length)&&(j<nums2.length))
      {
          if(nums1[i]==nums2[j])
          {
              arr.add(nums1[i]);
              i++;
              j++;
              
          }
         else if(nums1[i]>nums2[j])
          {
              j++;
          }
          else 
              i++;
      }
       // ArrayList a=new ArrayList(arr);
       int ar[]=new int[arr.size()];
        int u=0;
        for(int o:arr)
        {
           ar[u]=o;
            u++;
        }
        return ar;
    }
    
}