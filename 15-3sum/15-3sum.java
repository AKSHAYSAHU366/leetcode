class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
          Arrays.sort(nums);

        List<List<Integer>> a = new LinkedList<>();
        int p = 0;
        int q = 0, sum = 0;

        if (nums.length < 3) {
            return a;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            sum = (-1) * nums[i];
            if (i == 0 || i > 0 && nums[i] != nums[i - 1]) {
                p = i + 1;
                q = nums.length - 1;
                while (p < q) {
                    if (nums[p] + nums[q] == sum) {
                        a.add(Arrays.asList(nums[i], nums[p], nums[q]));
                        while (p < q && nums[p] == nums[p + 1]) {
                            p++;

                        }
                        while (p < q && nums[q] == nums[q - 1]) {
                            q--;
                        }

                        p++;
                        q--;
                    } else {
                        if (sum > nums[p] + nums[q]) {
                            p++;
                        } else {
                            q--;
                        }
                    }
                }
            }
        }
        return a;
        
    }
}