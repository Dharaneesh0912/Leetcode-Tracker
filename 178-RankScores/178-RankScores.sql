-- Last updated: 7/9/2026, 3:07:49 PM
SELECT
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
    -- Note: SQL Server Use `[rank]` instead of `rank`.
FROM Scores
ORDER BY score DESC;