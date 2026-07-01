// Last updated: 01/07/2026, 23:45:57
1
2        
3        import java.util.Stack;
4
5class Solution {
6    public boolean isValid(String s) {
7
8        Stack<Character> stack = new Stack<>();
9
10        for (char ch : s.toCharArray()) {
11
12            
13            if (ch == '(' || ch == '{' || ch == '[') {
14                stack.push(ch);
15            }
16
17            
18            else {
19
20                if (stack.isEmpty()) {
21                    return false;
22                }
23
24                char top = stack.pop();
25
26                if ((ch == ')' && top != '(') ||
27                    (ch == '}' && top != '{') ||
28                    (ch == ']' && top != '[')) {
29                    return false;
30                }
31            }
32        }
33
34        return stack.isEmpty();
35    }
36}
37    