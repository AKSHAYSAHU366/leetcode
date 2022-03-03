class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
        {
            return 0;
        }
        else
        {
            int n=needle.length();
            int i=0;
            while(i<haystack.length()&&i+n<=haystack.length())
            {
                if(haystack.substring(i,i+n).equals(needle))
                {
                    return i;
                }
            i++;
            }
        }
        return -1;
    }
}