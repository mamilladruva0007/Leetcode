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
        if (head == null) return null;

        ListNode current = head;
        ListNode current1 = head.next;

        while (current1 != null) {
            if (current.val == current1.val) {
                current.next = current1.next;
            } else {
                current = current1;
            }
            current1 = current.next; 
        }
        return head;
    }
}

