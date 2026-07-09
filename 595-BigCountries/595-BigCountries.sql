-- Last updated: 7/9/2026, 3:06:36 PM
SELECT
    name,
    population,
    area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;