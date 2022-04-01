class Solution {
    public String[] findRelativeRanks(int[] score) {
              ArrayList a=new ArrayList();
       //int n[]=new int[score.length];
      
        for(int j: score)
        {
           // n[i]=j;
           a.add(j);
            
        }
        Collections.sort(a,Collections.reverseOrder());
     
        String a1[]= new String[score.length];
        int t=0;
        for(int k:score)
        {
           int n = a.indexOf(k);
           if(n==0)
           {
               a1[t]="Gold Medal";

           }
           else if(n==1)
           {
               a1[t]="Silver Medal";
           }
           else if(n==2)
           {
               a1[t]="Bronze Medal";
           }
           else
           {
               a1[t]=Integer.toString(n+1);
           }
           // System.out.println(a1[t]);
            t++;
              }
        return a1;
    }
}