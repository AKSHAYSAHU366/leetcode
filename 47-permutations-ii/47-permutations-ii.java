class Solution {
     List<List<Integer>> lists = new ArrayList();
      Set<List<Integer>> list2=new HashSet();
     static void swa(int nums[],int l,int i)
    {
         int t=nums[l];
         nums[l]=nums[i];
         nums[i]=t;
         
    }
    void per(int nums[],int l,int r)
    {
      if(l==nums.length-1)
        {
            //System.out.println(s);
            List<Integer> t=new ArrayList<Integer>();
           for(int j:nums)
           {
               t.add(j);
            }
          list2.add(t);
            return;
        }
       for(int i=l;i<r;i++)
       {
           swa(nums,l,i);
           per(nums,l+1,r);
           swa(nums,l,i);

       }   
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        per(nums,0,nums.length);
        for(List u:list2)
        {
            lists.add(u);
        }
        return lists;
    }
}