import java.util.*;
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       Queue<Integer> q=new LinkedList<>();
        for(int i:tickets)
        {
            q.offer(i);
        }
        boolean b=false;
        int count=0;
        int h=k;
        while(q.size()>=1)
        {
            int num=q.poll();
            num--;
            count++;
            if(h==0&&num==0)
            {
               return count; 
            }
            else
            {
                if(h==0)
                {
                    q.offer(num);
                    h=q.size()-1;
                    
                }
                else
                {
                    if(num==0)
                    h--;
                    else
                    {
                      q.offer(num);
                        h--;
                    }
                }
            }
        }
        return 0;
    }
}