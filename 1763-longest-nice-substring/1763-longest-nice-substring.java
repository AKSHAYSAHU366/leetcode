class Solution {
    public String l(String s)
    {
        if(s.length()==1)
        {
            return "";
        }
        else
        {
           // Set set=new HashSet<>();
           
            for(int i=0;i<s.length();i++)
            {
                if(s.contains((s.charAt(i)+"").toUpperCase())&&s.contains((s.charAt(i)+"").toLowerCase()))
                {
                    continue;
                }
                String s1=l(s.substring(0,i));
                String s2=l(s.substring(i+1));
                if(s1.length()>=s2.length())
                    return s1;
                return s2;
            }
            return s;
         
        }
    }
    
    public String longestNiceSubstring(String s) {
        return l(s);
    }
}