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
    public ListNode reverseIt(ListNode prev, ListNode curr) {
        ListNode head = null;
        if (curr.next != null) {
            ListNode travel = curr.next;
            curr.next = prev;
            return reverseIt(curr, travel);
        } else {
            curr.next = prev;
            head = curr;
        }
        return head;
    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head.next;
        head.next = null;
        return reverseIt(head, curr);
    }
}
