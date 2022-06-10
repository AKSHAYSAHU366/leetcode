/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        StringBuffer s1=new StringBuffer();
        while(l1!=null)
        {
            s1.append(Integer.toString(l1.val));
            l1=l1.next;
            
        }
        StringBuffer s2=new StringBuffer();
         while(l2!=null)
        {
            s2.append(Integer.toString(l2.val));
             l2=l2.next;;
        }
        s1.reverse();
        s2.reverse();
        StringBuffer s=new StringBuffer("");
     if(s1.length()>=s2.length())
     {
         int j=s2.length()-1,l=0;
         for(int i=s1.length()-1;i>=0;i--)
         {
             if(j!=-1)
             {
               int r=(int)(s1.charAt(i))-48+(int)(s2.charAt(j))-48+l;
                 l=0;
                   if(i!=0|| (i==0&&r<10))
                 {
                  s.append(Integer.toString(r%10));
                 }
                 else
                 {
                     s.append(Integer.toString(r%10));
                     r=r/10;
                     s.append(Integer.toString(r));
                 }
                 if(r>=10)
                 {
                    l=1; 
                 }
                j--; 
             }
             else
             {
                   int r=(int)(s1.charAt(i))-48+l;
                   l=0;
                 if(i!=0|| (i==0&&r<10))
                 {
                  s.append(Integer.toString(r%10));
                 }
                 else
                 {
                     s.append(Integer.toString(r%10));
                     r=r/10;
                     s.append(Integer.toString(r));
                 }
                 
                 if(r>=10)
                 {
                    l=1; 
                 }
                 
             }
         }
         
     }
        else
        {
             int j=s1.length()-1,l=0;
         for(int i=s2.length()-1;i>=0;i--)
         {
             if(j!=-1)
             {
               int r=(int)(s1.charAt(j))-48+(int)(s2.charAt(i))-48+l;
                 l=0;
         if(i!=0|| (i==0&&r<10))
                 {
                  s.append(Integer.toString(r%10));
                 }
                 else
                 {
                     s.append(Integer.toString(r%10));
                     r=r/10;
                     s.append(Integer.toString(r));
                 }
                 if(r>=10)
                 {
                    l=1; 
                 }
                j--; 
             }
             else
             {
                   int r=(int)(s2.charAt(i))-48+l;
                   l=0;
                 if(i!=0|| (i==0&&r<10))
                 {
                  s.append(Integer.toString(r%10));
                 }
                 else
                 {
                      s.append(Integer.toString(r%10));
                     r=r/10;
                     s.append(Integer.toString(r));
                 }
                 
                 if(r>=10)
                 {
                    l=1; 
                 }
                 
             }
         }
        }
      //  StringBuffer s=new StringBuffer(n);
          System.out.println(s);
      //  s.reverse();
     
           ListNode w=new ListNode();
                 ListNode t=w;
        for(int i=0;i<s.length();i++)
        {
            if(i==0)
            {
                 t.val=Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            else
            {
                  t.next=new ListNode(Integer.parseInt(String.valueOf(s.charAt(i))));
                  t=t.next;
                t.next=null;
            }
            
        }
        return w;
        
    }
}