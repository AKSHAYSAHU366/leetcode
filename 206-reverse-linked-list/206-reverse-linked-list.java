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
    public ListNode reverseList(ListNode head) {
        while(head==null||head.next==null)
        {
            return head;
        }
        
        ListNode curr=null;
        ListNode temp=head;
        ListNode temp2=head;
        while(temp2!=null)
        {
            temp=temp2.next;
            temp2.next=curr;
            curr=temp2;
            temp2=temp;
        }
        return curr;
    }
}