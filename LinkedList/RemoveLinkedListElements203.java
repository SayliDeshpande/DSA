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
class RemoveLinkedListElements203 {
    public ListNode removeElements(ListNode head, int val) {
       /* if(head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;*/
      

      // second approach 

      ListNode track = new ListNode(0);
      track.next = head;
      ListNode prev = track, current = head;

      while(current != null){
        if(current.val == val ) prev.next = current.next;
        else prev = current;
        current = current.next;
      } 
      return track.next;
    }
}
//Time complexity: O(N), it's one pass solution.
//Space complexity: O(1) it's a constant space solution.
