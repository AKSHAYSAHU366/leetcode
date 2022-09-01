class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         Arrays.sort(nums);
     
      Set<Integer> s=new HashSet<>();
      for(int i=0;i<nums.length;i++)
      {
         int d=nums.length-i;
          int r=Arrays.binarySearch(nums,d);
          if(r<0)
          {
            //System.out.println(d+" num not find ");
              s.add(d);
          }
          else
          {
           // System.out.println(d+" we got ");
          }
      }
      List<Integer> arr=new ArrayList<Integer>(s);
     // System.out.println(arr);
        return arr;
    }
}