// Given a linked list, swap every two adjacent nodes and return its head. 
// You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)


// Example 1:
// Input: head = [1,2,3,4]
// Output: [2,1,4,3]

// Example 2:
// Input: head = []
// Output: []

// Example 3:
// Input: head = [1]
// Output: [1]

// Example 4:
// Input: head = [1,2,3]
// Output: [2,1,3]


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
        if ( head.next == null || head.next.next == null) return head;
        ListNode res = new ListNode(0);
        res.next = head;
        listNode cur = res;
        while ( cur.next != 0 && cur.next.next != 0 ){
            ListNode next = head.next;
            ListNode temp = head.next.next;
            cur.next = next;
            next.next = head;
            head.next = temp;
            cur = head;
            head = head.next;
        }
        return res.next;
    }
}