// Last updated: 06/08/2026, 18:20:00
1class Solution {
2    public int smallestNumber(int n, int t) {
3
4        while (true) {
5            int product = digitProduct(n);
6
7            if (product % t == 0) {
8                return n;
9            }
10
11            n++;
12        }
13    }
14
15    private int digitProduct(int num) {
16        int product = 1;
17
18        while (num > 0) {
19            product *= (num % 10);
20            num /= 10;
21        }
22
23        return product;
24    }
25}