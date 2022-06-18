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
    public ListNode swapPairs(ListNode head) {
//         if(head == null || head.next == null)   return head;
        
//         ListNode dummy = new ListNode(0), previous = dummy;
//         dummy.next = head;
//         while (previous.next != null && previous.next.next != null) {
//             ListNode curr = previous.next, successor = curr.next, temp = successor.next;
//             previous.next = successor;
//             successor.next = curr;
//             curr.next = temp;
//             previous = curr;
//         }
//         return dummy.next;
        
        if (head == null || head.next == null) return head;
        ListNode successor = head.next;
        head.next = swapPairs(successor.next);
        successor.next = head;
        return successor;
        
    }
}