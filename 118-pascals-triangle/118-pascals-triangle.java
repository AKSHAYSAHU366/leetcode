class Solution {
    public void function(List<List<Integer>> lists,int numRows,int count )
    {
        if(count>numRows)
          return;
           //List<List<Integer>> lists = new ArrayList<>();
     else if(count==1)
      {
        List <Integer> l=new ArrayList<Integer>();
          l.add(1);
          lists.add(l);
          ++count;
          function(lists, numRows, count);
        
      }
    else  if(count==2)
      {
        List <Integer> l=new ArrayList<Integer>();
        l.add(1);
        l.add(1);
          lists.add(l);
          ++count;
          function(lists, numRows, count);
      }
      
      else
      {
       //   List <Integer> l=new ArrayList<Integer>();
          List <Integer> l1=new ArrayList<Integer>();
          int past=0;
          for(int i=0;i<lists.get(count-2).size();i++)
          {
           
            if(lists.get(count-2).get(i)==1)
            {
              // l1.add(past+1);
                
                //past=1;
                if(i==lists.get(count-2).size()-1)
                {
                  l1.add(past+1);
                  l1.add(1);
                }
                else
                {
                  l1.add(1);
                }
            }
            else
            {
              l1.add(past+lists.get(count-2).get(i));
            }
             past=lists.get(count-2).get(i);
          }
     lists.add(l1);
     ++count;
     function(lists, numRows, count);
          
      }
    }
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> lists = new ArrayList<>();
       function(lists, numRows,1);
       return lists;
        
    }
}