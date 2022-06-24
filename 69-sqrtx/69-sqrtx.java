class Solution {
    public int mySqrt(int x) {
        long i;
        if(x==1)
            return 1;
        for(i=0;i<=x/2;i++)
        {
            if(i*i>x)
            {
               break;
               // return i-1;
            }
        }
        return (int)i-1;
    }
}