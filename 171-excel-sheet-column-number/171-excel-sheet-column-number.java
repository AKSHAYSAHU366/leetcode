class Solution {
    public int titleToNumber(String columnTitle) {
        int l=columnTitle.length();
        int col_no=0,j=0;
        for(int i=l-1;i>=0;i--,j++)
        {
            int a=(int)columnTitle.charAt(i)-64;
            col_no=col_no+a*((int)Math.pow(26,j));
        }
        return col_no;
    }
}