class Solution {
   List<List<Integer>> result;
   List<List<Integer>> prevList;
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        result = new ArrayList<>();
        prevList = new ArrayList<>();
        go(nums,0);
        result.add(List.of());
        return result;
    }
    
    private void go(int[] nums,int idx){
        if(idx == nums.length) return;
        List<List<Integer>> buffer = new ArrayList<>(); 
        if(idx > 0 && nums[idx-1] == nums[idx]){
            for(List<Integer> p : prevList){
                List<Integer> f = new ArrayList<Integer>(p);
                f.add(nums[idx]);
                buffer.add(f);
            }
             prevList.clear();
        }
        else{
            for(List<Integer> p : result){
                List<Integer> f = new ArrayList<Integer>(p);
                f.add(nums[idx]);
                buffer.add(f);
            }
             prevList.clear();
            result.add(List.of(nums[idx]));
            prevList.add(List.of(nums[idx]));
        }
        result.addAll(buffer);
        prevList.addAll(buffer);
        
        go(nums,idx+1);
    }
}