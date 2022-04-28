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
    public ListNode middleNode(ListNode head) {
       
        ListNode curr=head;
        ListNode curr2=head;
        try
        {
            
        
        if( head==null || head.next==null)
        {
            return head;
        }
        while(curr2.next!=null || curr2.next.next!=null)
        {
            curr=curr.next;
            curr2=curr2.next.next;
        }
       /*  if(curr2.next.next==null)
         {
             return curr.next;
         }*/
        
        }
        catch(Exception e){}
        return curr;
    }
}

