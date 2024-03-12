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
    public ListNode removeZeroSumSublists(ListNode head) {
      Map<Integer, ListNode> map = new HashMap<>();

        ListNode newNode = new ListNode(0);
        newNode.next = head;

        // Prefix Sum of linkedlist Element
        int sum = 0;
        for (ListNode p = newNode; p != null; p = p.next) {
            sum += p.val;
            map.put(sum, p);
        }

        sum = 0;
        for (ListNode p = newNode; p != null; p = p.next) {
            sum += p.val;
            p.next = map.get(sum).next;
        }

        return newNode.next;  
    }
}