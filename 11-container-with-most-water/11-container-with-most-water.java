class Solution {
    public int maxArea(int[] height) {
        if(height.length<2)
            return 0;
        int j=height.length-1;
        int temp=0;
        int i=0;
       while(i<=j)
        {
            int l=j-i;
            int b=0;
           try{
               if(height[i]<=height[j])
            {
             b=height[i];
                i++;
            }
            else
            {
                b=height[j];
                j--;
            }
           }
           catch(Exception E){};
            int area=l*b;
           if(area>temp)
               temp=area;
            
        }
        return temp;
    } 
}