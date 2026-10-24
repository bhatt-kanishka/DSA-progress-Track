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
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null || head.next.next == null){return ;}
      
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        ListNode first = head.next;
        ListNode sec = head.next.next;

        while(sec.next != null && sec.next.next != null){
            first = first.next;
            sec = sec.next.next;
        }
          current = first.next;
          first.next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        ListNode swap1 = head;
        ListNode swap2 = prev;

        while(swap2 != null){
            ListNode v = swap1.next;
            ListNode k = swap2.next;

            swap1.next = swap2;
            swap2.next = v;

             swap1 = v;
             swap2 =  k ;
        }

    }
}