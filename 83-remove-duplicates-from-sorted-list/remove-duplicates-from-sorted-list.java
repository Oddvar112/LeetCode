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
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        HashMap<Integer, Integer> ordbok = new HashMap<>();
        
        while (head != null) {
            if (!ordbok.containsKey(head.val)) {
                ordbok.put(head.val, head.val);
                current.next = new ListNode(head.val);
                current = current.next;
            }
            head = head.next;
        }
        
        return dummy.next;
    }
}   