class Solution {
    public void reverseString(char[] s) {
        int j = s.length-1;
        for(int i=0; i<s.length/2 ; i++){
            char a = s[i];
            char b = s[j];
            s[i] = b;
            s[j] = a;
             j--;

        }
        
    }
}