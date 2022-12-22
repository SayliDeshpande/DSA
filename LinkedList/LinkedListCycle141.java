/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
         // Floyd's Cycle Finding Algorithm  -a slow pointer and a fast pointer.
         //with this approach we can avoid using extra space.
       if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next; //The slow pointer moves one step at a time  
            fast = fast.next.next; //the fast pointer moves two steps at a time.
        }
        return true;  // in cycle, slow anf fast pointer will eventually


        //////////////////////////
        // Same can be solved by Approach #2 using hash set

     /*   Set<ListNode> set = new HashSet<>();

        while(head != null){
            if(set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }
        return false;*/
    }
}
