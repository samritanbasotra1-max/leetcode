// Last updated: 29/06/2026, 22:56:51
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13
14        ListNode dummy=new ListNode(0);
15        dummy.next=head;
16
17       ListNode fast= dummy;
18       ListNode slow = dummy;
19       for(int i=0;i<=n;i++){
20         fast=fast.next;
21       }
22       while(fast!=null){
23        slow=slow.next;
24        fast=fast.next;
25    
26       }
27       slow.next=slow.next.next;
28        return dummy.next;
29        
30    }
31}