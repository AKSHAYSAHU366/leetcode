class Solution {
    public String removeStars(String s) {
        StringBuffer sb=new StringBuffer("");
        int j=-1;
        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)!='*')
          {
               j++;
               sb.append(s.charAt(i));
               
          }
            else
            {
                if(j!=-1)
              {  sb.deleteCharAt(j);
                 j--;
              }
            }
        }
        return sb.toString();
    }
}