-- Last updated: 7/9/2026, 3:09:51 PM
# Write your MySQL query statement below
SELECT  MAX(num) AS num
FROM (
SELECT num
FROM MyNumbers
GROUP BY num
HAVING COUNT(num)=1
) AS single_numbers;
