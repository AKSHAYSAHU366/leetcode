class Solution
{
    public int findTheWinner(int n, int k)
    {
      return f(n,k)+1;
    }
      public int f(int n,int k)
         {
          if(n==1)
            {
               return 0;
            }
          else
            {
               return(f(n-1,k)+k)%n;
            }
         }
    
}