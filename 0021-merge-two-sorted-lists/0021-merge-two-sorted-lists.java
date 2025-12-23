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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode head = list1;
        ListNode temp = list1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = list2;
        boolean swapped;
        do {
            swapped = false;
            ListNode curr = head;
            while (curr.next != null) {
                if (curr.val > curr.next.val) {
                    int t = curr.val;
                    curr.val = curr.next.val;
                    curr.next.val = t;
                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped);
        return head;
    }
}
