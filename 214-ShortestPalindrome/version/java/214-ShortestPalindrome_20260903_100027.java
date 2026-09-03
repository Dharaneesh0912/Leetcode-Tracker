// Last updated: 9/3/2026, 10:00:27 AM
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> st = new Stack<>();
4        char sgn = '+';
5        long n = 0;
6        
7        for (int i = 0; i < s.length(); i++) {
8            char c = s.charAt(i);
9            if (Character.isDigit(c)) {
10                n = n * 10 + (c - '0');
11            }
12            if ((!Character.isDigit(c) && !Character.isWhitespace(c)) || i == s.length() - 1) {
13                if (sgn == '+') st.push((int)n);
14                else if (sgn == '-') st.push((int)(-n));
15                else if (sgn == '*') st.push(st.pop() * (int)n);
16                else if (sgn == '/') st.push(st.pop() / (int)n);
17                
18                sgn = c;
19                n = 0;
20            }
21        }
22        
23        int res = 0;
24        while (!st.isEmpty()) {
25            res += st.pop();
26        }
27        return res;
28    }
29}