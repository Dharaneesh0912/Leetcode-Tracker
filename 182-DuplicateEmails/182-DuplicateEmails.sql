-- Last updated: 7/9/2026, 3:07:42 PM
# Write your MySQL query statement below
# Please upvote, if you like my solution
# 1
SELECT email from Person
group by email
having count(email) > 1;

