class Solution {
    long bin(long l,long h,long k)
    {
         if(l==h)
         {
                 if(l*l<=k)
                     return l;
                else
                    return l-1;
         }
        long mid=(l+h)/2;
        if(mid==l)
        {
            if(mid*mid<=k)
            {   if(h*h<=k)
                return h;
                else
                 return mid;
            }
            
            return mid-1;
        }
        if(mid*mid==k)
        {
            return mid;
        }
        else if(mid*mid<k)
        {
            return bin(mid+1,h,k);
        }
        return bin(l,mid-1,k);
    }
    public int mySqrt(int x) {
      long l=1,h=x;
        return (int)bin(l,h,x);
    }
}