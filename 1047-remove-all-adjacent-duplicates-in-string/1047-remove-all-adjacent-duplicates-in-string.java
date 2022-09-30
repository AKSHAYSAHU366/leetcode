class Solution {
    public String removeDuplicates(String s) {
        StringBuilder d=new StringBuilder(s);
        int i=0;
      //  int j=0;
        while(i<d.length()-1)
        {
           // j=i;
            if(d.charAt(i)==d.charAt(i+1))
            {
                d.deleteCharAt(i);
                d.deleteCharAt(i);
                if(i==0)
                {
                    i=0;
                }
                else
                {
                    i--;
                }
            }
            else
            i++;
            
        }
        return d.toString();
    }
}