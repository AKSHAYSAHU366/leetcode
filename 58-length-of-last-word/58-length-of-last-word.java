class Solution {
    public int lengthOfLastWord(String s) {
        
       String s1;
        s1=s.trim();
       int i= s1.lastIndexOf(" ");
        
                  String s2=new String(s1.substring(i+1));
                return s2.length();
    }
}