class Solution {
    public boolean isHappy(int n) {
       HashSet a=new HashSet();
            while(n!=1)
                
            {
                int cur=n;
                int sum=0;
            while(cur!=0)
            {
                 sum+=(cur%10)*(cur%10);
                cur=cur/10;
            }
               
                if(a.contains(sum))
                {
                    return false;
                }
                a.add(sum);
                n=sum;
                
            }
            return true;
        }
    }
