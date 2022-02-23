class Solution {
    int fib(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        if(n==2)
        {
            return 1;
        }
        //return fib(n-1)+fib(n-2);
        int prev1=1;
        int prev2=1;
        int current=0;
        for(int i=3;i<=n;i++)
        {
            current=prev1+prev2;
            prev2=prev1;                       
            prev1=current;
        }
        return current;
    }
    public int climbStairs(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fib(n+1);
    }
}