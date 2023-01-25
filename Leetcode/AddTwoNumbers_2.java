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
class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       // to store resul, need a list
       ListNode dummy = new ListNode(0); // initiate with any value, say 0
       // because it is sum of numbers , need to take care about carry 
       int carry = 0;
        ListNode curr = dummy;
       // iterate and sum the nides of gives lists
       while(l1 != null || l2 != null || carry == 1){
           int sum = 0; // to store total sum
           if(l1 != null){
               sum += l1.val;
               l1 = l1.next;
           }
           if(l2 != null){
               sum += l2.val;
               l2 = l2.next;
           }
           sum += carry;
           carry = sum / 10;
           ListNode node = new ListNode(sum % 10);
           curr.next = node;
           curr = curr.next;
       }
       return dummy.next;
    }
}

/*
Time Complexity :- BigO(max(N, M)) where N is length of l1 & M is length of l2
Space Complexity :- BigO(max(N,M))
*/
