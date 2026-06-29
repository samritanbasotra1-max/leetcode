// Last updated: 29/06/2026, 23:21:36
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
12    public boolean isPalindrome(ListNode head) {
13        ListNode fast=head;
14        ListNode slow=head;
15
16        while(fast !=null&&fast.next !=null){
17            fast=fast.next.next;
18            slow=slow.next;
19        }
20        ListNode prev=null;
21        while(slow !=null){
22            ListNode next= slow.next;
23            slow.next=prev;
24             prev = slow;
25            slow = next;
26
27
28        }
29         ListNode first = head;
30        ListNode second = prev;
31
32         while (second != null) {
33
34            if (first.val != second.val)
35                return false;
36
37            first = first.next;
38            second = second.next;
39        }
40         return true;
41
42
43    }
44}