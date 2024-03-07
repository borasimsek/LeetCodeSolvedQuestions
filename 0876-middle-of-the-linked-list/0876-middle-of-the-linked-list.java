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
        ListNode empty = new ListNode();
        if (head == null){
            return empty;
        }
        ListNode counter = head;
        int count = 0;
        while(counter != null){
            count++;
            counter = counter.next;
        }
        ListNode result = head;
        
        for(int i = 0; i < (count/2) ;i++){
            result = result.next;
        }
        return result;
    }
}