-- Last updated: 7/9/2026, 3:09:18 PM
# Write your MySQL query statement below
select p.product_name,s.year,s.price
from Sales s
left join Product p
on s.product_id=p.product_id
