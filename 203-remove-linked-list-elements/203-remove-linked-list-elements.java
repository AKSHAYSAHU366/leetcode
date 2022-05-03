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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr= head;
        ListNode temp=curr;
        try
        {
            if(head==null)
            {
                return null;
            }
            if(head.next==null)
            {
                if(head.val==val)
                {
                    return null;
                }
            }
                
            while(curr!=null)
         {
           if(curr==head && curr.val==val)
           {
               head=curr.next;
               temp=curr;
               curr=curr.next;
               
           }
                else
                {
                    
                    if(curr.val==val)
                    {
                        temp.next=curr.next;
                        curr=curr.next;
                    
                    }
                    else
                    {
                        temp=curr;
                        curr=curr.next;
                        
                    }
                   
                    
                }
     
         }
       
        }
        catch(Exception e){}
         return head;
    }
}