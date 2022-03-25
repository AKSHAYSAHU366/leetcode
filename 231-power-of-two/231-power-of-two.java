class Solution {
  
    public boolean isPowerOfTwo(int n) {
       // int count=0;
        if(n==1)
        {
            return true;
        }
        if(n==0||n%2!=0)
        {
            return false;
            
        }
        return isPowerOfTwo(n/2);
    }
}