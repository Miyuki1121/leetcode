/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null)
        {
            return l2;
        }
        if(l2 == null)
        {
            return l1;
        }
        ListNode l3 = l1;
        int pls = 0;
        ListNode Pre = new ListNode(0);
        while(l1 != null && l2 != null)
        {
            Pre = l1;
            l1.val = l1.val + l2.val + pls;
            pls = l1.val / 10;
            l1.val = l1.val % 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l2 != null)
        {
            Pre.next = l2;
            l1 = l2;
        }
        while(l1 != null && pls != 0)
        {
            Pre = l1;
            l1.val = l1.val + pls;
            pls = l1.val / 10;
            l1.val = l1.val % 10;
            l1 = l1.next;
        }
        if(pls != 0)
        {
            Pre.next = new ListNode(pls);
        }
        return l3;
    }
}