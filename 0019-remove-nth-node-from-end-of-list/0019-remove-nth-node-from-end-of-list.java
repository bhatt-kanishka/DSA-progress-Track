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
    public ListNode removeNthFromEnd(ListNode head, int n) {


    if(head == null || head.next == null){ return null;}
    int count = 1;
    
     ListNode current = new ListNode();
        current = head;
        
        while(current.next != null){
            current = current.next;
            count++;
        }

    if(count == n){ return head.next;}
    
        ListNode node = new ListNode();
        node = head;
        for(int i=0 ; i<count-n-1 ; i++){
            node = node.next;
        }
        node.next = node.next.next;
     
     return head;
}
    }
