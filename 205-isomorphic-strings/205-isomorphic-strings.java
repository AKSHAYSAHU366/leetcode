class Solution {
    public boolean isIsomorphic(String s, String t) {
     if(s.length()!=t.length())
        {
          return false;
        }
        ArrayList<Character> a=new ArrayList<Character>();
        ArrayList<Character> a1=new ArrayList<Character>();
        Map<Character,Character> num=new HashMap<>();
        boolean r=true;
        for(char s1:s.toCharArray())
        {
           a.add(s1);
        }
        for(char s1:t.toCharArray())
        {
           a1.add(s1);
        }
        //System.out.println(a);
        //System.out.println(a1);

        for(int i=0;i<a.size();i++)
        {
            char c1=a.get(i);
            char c2=a1.get(i);
           // System.out.print((Collections.frequency(a,c1)));
           // System.out.println((Collections.frequency(a1,c2)));
          //  num.putIfAbsent(c1,c2);
            /* if(Collections.frequency(a, c1)!=Collections.frequency(a1, c2))
             {
                return false;
             }*/
            if(num.containsKey(c1)==false&&num.containsValue(c2)==false)
            {
                num.put(c1,c2);
            }
            else
            {
             if(num.containsKey(c1)==true)
             {
                 if(c2==num.get(c1))
                 {
                 }
                 else
                 {
                   return false;
                 }
             }
                else
                {
                    return false;
                }
            }
         
        }
        return r;
    }
}