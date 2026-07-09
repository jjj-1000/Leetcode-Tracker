-- Last updated: 7/9/2026, 3:12:20 PM
# Write your MySQL query statement below
SELECT c.name AS Customers
FROM Customers c
LEFT JOIN Orders o
ON c.id = o.customerid
WHERE o.id IS NULL;