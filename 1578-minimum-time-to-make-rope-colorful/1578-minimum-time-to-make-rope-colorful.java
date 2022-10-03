class Solution {
    public int minCost(String colors, int[] neededTime) {
        int i=0,count=0;
          char c[]=colors.toCharArray();
         for(int j=0;j<c.length-1;j++)
         {
             if(c[j]==c[j+1])
             {
                 count+=Math.min(neededTime[j],neededTime[j+1]);
                 if(neededTime[j+1]<neededTime[j])
                 {
                     neededTime[j+1]=neededTime[j];
                 }
             }
         }
        return count;
    }
}