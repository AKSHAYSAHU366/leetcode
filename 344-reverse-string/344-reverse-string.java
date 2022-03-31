class Solution {
    void printstr( char []s, int l,int r)
    {
        if(l<=r)
        {
           // System.out.println(s[l]);
            return;
        }
        char a= s[r];
         s[r]= s[l];
          s[l]=a;
        printstr(s,l-1,r+1);
       // System.out.println(s[l]);
        
        
    }
    public void reverseString(char[] s) {
        printstr(s,s.length-1,0);
    }
}