-- Last updated: 7/9/2026, 3:07:58 PM
# Write your MySQL query statement below
select v.customer_id,count(*)  as count_no_trans
from Visits v
left join Transactions t
on v.visit_id=t.visit_id 
where t.transaction_id IS NULL
group by v.customer_id;
