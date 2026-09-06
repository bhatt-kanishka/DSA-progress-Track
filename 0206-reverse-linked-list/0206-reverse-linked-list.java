class Solution {
    public ListNode reverseList(ListNode head) {
        // Base case: empty list or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Recursive call: reverses the rest of the list
        ListNode newHead = reverseList(head.next);

        // Point the next node back to current node
        head.next.next = head;
        head.next = null;

        return newHead;
    }

}