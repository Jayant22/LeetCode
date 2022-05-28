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
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null)
            return head;
        int count = 0;
        ListNode tempHead = head, foundNode; 
        while(tempHead != null){
            count++;
            tempHead = tempHead.next;
        }
        
        count = (int)Math.ceil(count/2);
        
        while(count>0){
            count--;
            head = head.next;
        }
        
        return head;
    }
}