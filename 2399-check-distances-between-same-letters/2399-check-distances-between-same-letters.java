import java.util.*;
class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray())
        {
            set.add(c);
            
        }
        boolean b=true;
        for(char c:set)
        {
            int m=s.indexOf(c);
            int d=(int)c-97;
            int d1=distance[d]+1+m;
            if(d1>=s.length())
            {
               b=false;
                break;
            }
            else if(c!=s.charAt(d1))
            {
                b=false;
                break;
            }
                
        }
        return b;
    }
}