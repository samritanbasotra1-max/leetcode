// Last updated: 30/06/2026, 14:58:38
1class Solution {
2    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
3
4        ListNode dummy = new ListNode(0);
5        ListNode tail = dummy;
6
7        int carry = 0;
8
9        while (l1 != null || l2 != null || carry != 0) {
10
11            int sum = carry;
12
13            if (l1 != null) {
14                sum += l1.val;
15                l1 = l1.next;
16            }
17
18            if (l2 != null) {
19                sum += l2.val;
20                l2 = l2.next;
21            }
22
23            carry = sum / 10;
24
25            tail.next = new ListNode(sum % 10);
26            tail = tail.next;
27        }
28
29        return dummy.next;
30    }
31}