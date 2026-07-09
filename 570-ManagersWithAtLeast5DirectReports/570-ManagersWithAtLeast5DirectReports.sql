-- Last updated: 7/9/2026, 3:10:12 PM
# Write your MySQL query statement below
SELECT name
FROM Employee 
WHERE id IN(
    SELECT managerId
    FROM employee
   GROUP BY managerId
   HAVING COUNT(*)>=5
)
