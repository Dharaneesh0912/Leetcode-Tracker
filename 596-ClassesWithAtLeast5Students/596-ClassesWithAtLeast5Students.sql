-- Last updated: 7/9/2026, 3:06:35 PM
# Write your MySQL query statement below
SELECT
    class
FROM Courses
GROUP BY class
HAVING COUNT(DISTINCT student) >= 5;