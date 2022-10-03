class Solution {
    public int[] plusOne(int[] digits) {
        int l=digits.length;
        if(digits[l-1]<9)     
        {
           digits[l-1]++; 
            return digits;
        }
        boolean b=true;
       // int t=-1;
        for(int i:digits)
        {
            if(i<9)
            {
                b=false;
               // t++;
                break;
            }
        }
        if(b)
        {
            int al[]=new int[l+1];
             for(int i=0;i<=l;i++)
             {
                 if(i>0)
                 {
                     al[i]=0;
                     
                 }
                 else
                 {
                     al[i]=1;
                 }
                 
             }
            return al;
        }
        int c=0;
        for(int i=l-1;i>=0;i--)
        {
           if(digits[i]==9)
           {
               digits[i]=0;
               c=1;
               
           }
            else
            {
                digits[i]+=c;
                break;
            }
        }
        return digits;
        
        
    }
}