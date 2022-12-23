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
class MiddleofLinkedList876 {
    public ListNode middleNode(ListNode head) {
        //using two pointers

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next; //make fast pointer traverse twice as slow. When fast reaches the end of the list, slow must be in the middle.
        }
        return slow; // so return slow
    }
}

// Time complexity : O(N)  where NNN is the number of nodes in the given list.
// space complexity : O(1) the space used by slow and fast.
