-- Last updated: 7/9/2026, 3:09:21 PM
# Write your MySQL query statement below
# Write your MySQL query statement below
SELECT customer_id
FROM Customer
GROUP BY customer_id
HAVING COUNT(DISTINCT product_key) = (SELECT COUNT(*) FROM Product);