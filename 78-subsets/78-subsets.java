class Solution {
    List<List<Integer>> list1 = new ArrayList<List<Integer>>();

    void powerset(List<Integer> n1, int i, List<Integer> n2) {
        if (i == n1.size()) {
            list1.add(new ArrayList(n2));
            System.out.println("added  " + n2);
            return;
        }
        try {

            int t = n1.get(i);
            n2.add(t);
            powerset(n1, i + 1, n2);
            n2.remove(n2.size() - 1);
            powerset(n1, i + 1, n2);
        } catch (Exception e) {
        }
    }
 
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> n1 = new ArrayList<Integer>();
        for (int a : nums) {
            n1.add(a);
        }
        List<Integer> n2 = new ArrayList<Integer>();
        powerset(n1, 0, n2);
        return list1; 
    }
}