// Time Complexity is O(Max(m,n))
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr = headA;
        int lenA = 0;
        while(curr != null) {
            curr = curr.next;
            lenA++;
        }        
        int lenB = 0;
        curr = headB;
        while(curr != null) {
            curr = curr.next;
            lenB++;
        }
        while(lenA < lenB) {
            headB = headB.next;
            lenB--;
        }
        while(lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while(headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
        
    }
}
