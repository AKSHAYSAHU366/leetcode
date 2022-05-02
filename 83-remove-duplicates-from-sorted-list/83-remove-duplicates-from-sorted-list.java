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
    public ListNode deleteDuplicates(ListNode head) {
        try{
      ListNode curr=head;
        if(head==null|| head.next==null)
        {
            return head;
        }
    
        while(curr.next!=null)
        {
            if(curr.val==curr.next.val)
            {
                curr.next=curr.next.next;
            }
            if(curr.next!=null && curr.val!=curr.next.val)
            curr=curr.next;
        }
    
       
       
     }
        catch(Exception e){}
        return head;
        
    }
}