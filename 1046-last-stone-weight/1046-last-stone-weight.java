class Solution {
    public static int res(List a)
    {
        if(a.size()==1)
        {
            return (int)a.get(0);
        }
        if(a.size()==0)
        {
            return 0;
        }
        Collections.sort(a);
        int s=a.size()-1;
        if(a.get(s)==a.get(s-1))
        {
            a.remove(s);
            s--;
            a.remove(s);
            return res(a);
        }
        else
        {
            int y=(int)a.get(s)-(int)a.get(s-1);
            a.remove(s);
            s--;
            a.remove(s);
            a.add(y);
            return res(a);
        }
    }
    public int lastStoneWeight(int[] stones) {
      List a=new ArrayList();
        for(int i:stones)
        {
            a.add(i);
        }
        return res(a);   
    }
}