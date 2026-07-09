-- Last updated: 7/9/2026, 3:12:25 PM
# Write your MySQL query statement below
SELECT DISTINCT I1.num AS ConsecutiveNums
FROM Logs I1
JOIN Logs I2
ON I1.id = I2.id-1
JOIN Logs I3
ON I2.id=I3.id-1
WHERE I1.num=I2.num
AND I2.num=I3.num;