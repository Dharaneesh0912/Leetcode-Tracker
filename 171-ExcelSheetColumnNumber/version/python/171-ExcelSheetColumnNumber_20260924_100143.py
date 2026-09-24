# Last updated: 9/24/2026, 10:01:43 AM
1class Solution:
2    def titleToNumber(self, columnTitle: str) -> int:
3            A=1
4            B=2
5            C=3
6            D=4
7            E=5
8            F=6
9            G=7
10            H=8
11            I=9
12            J=10
13            K=11
14            L=12
15            M=13
16            N=14
17            O=15
18            P=16
19            Q=17
20            R=18
21            S=19
22            T=20
23            U=21
24            V=22
25            W=23
26            X=24
27            Y=25
28            Z=26
29            result=0
30            for i in columnTitle:
31                j=ord(i)-64
32                result=result*26+j
33            return(result)
34        