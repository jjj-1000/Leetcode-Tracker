-- Last updated: 7/9/2026, 3:12:13 PM
# Write your MySQL query statement below
DELETE  P1
FROM PERSON P1
JOIN PERSON P2
ON p1.email=p2.email
WHERE p1.id>p2.id;