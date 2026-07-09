-- Last updated: 7/9/2026, 3:06:41 PM
# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id != 2
   OR referee_id IS NULL;