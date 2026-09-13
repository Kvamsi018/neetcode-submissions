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
        int len = 0;

        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }

        int nth = len - n;
        if(nth == 0){
            ListNode temp1 = head.next;
            head = temp1;
            return head;
        }

        ListNode curr = head;
        while(--nth != 0){
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}
