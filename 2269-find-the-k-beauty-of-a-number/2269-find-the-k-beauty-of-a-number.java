class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=Integer.toString(num);
        int count=0;
        int i=0,j=k-1;
        while(j<s.length())
        {
            int n=Integer.parseInt(s.substring(i,j+1));
            if(n==0)
            {
                i++;
                j++;
                continue;
            }
            if(num%n==0)
                count++;
            i++;
            j++;
        }
        return count;
    }
}