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
        if(head == null || head.next == null || head.next.next == null) return;
        ListNode main = head;
        while(main != null && main.next != null){
            ListNode curr = main;
            while(curr.next.next != null){
                curr = curr.next;
            }
            ListNode last = curr.next;

            curr.next = null;

            last.next = main.next;
            main.next = last;

            main = last.next;

            if(main == null) break;
        }
    }
}
