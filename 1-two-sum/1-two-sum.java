class Solution {
    public int[] twoSum(int[] nums, int target) {
        int t[]=new int[2];
        ArrayList a=new ArrayList();
        
        for(int m:nums)
        {
            a.add(m);
        }
        ArrayList b=new ArrayList(a);
        Collections.sort(a);
        for(int i=0;i<a.size();i++)
        {
           int I1=(Integer)(a.get(i));
           int w=I1;
            if((target-w)>=w)
            {
                for(int j=i+1;j<a.size();j++)
                {    
                      int I2=(Integer)(a.get(j));
                    int w1=I2;
                   if((w1+w)==target)
                   {
                     if(w1==w)
                     {
                       t[0]=b.indexOf(a.get(i));
                       b.set(t[0],null);
                       t[1]=b.indexOf(a.get(j));
                       return t;
                         
                     }
                       else{
                       t[0]=b.indexOf(a.get(i));
                      
                       t[1]=b.indexOf(a.get(j));
                       return t;
                         
                       }
                       
                   }
                }
            }
        }
        return t;
        
    }
}