class Solution {
    public String longestCommonPrefix(String[] strs) {
        // System.out.println("Hello world!");
       // String ag[] = { "flbcad", "flbsdk", "flas", "flgh" };
        Arrays.sort(strs);
        int i = strs[0].length() - 1;
        int j = strs[strs.length - 1].length() - 1;
        int k;
        for (k = 0; k <= i; k++) {
            if (strs[0].charAt(k) != strs[strs.length - 1].charAt(k)) {
                break;
            }
        }
        if (k - 1 == -1) {

            System.out.println("not founded ");
            return "";
        } else {
            //System.out.println(strs[0].substring(0, k));
            //System.out.println("hey buddy you got it ")
            return strs[0].substring(0, k);
        }
    }
}