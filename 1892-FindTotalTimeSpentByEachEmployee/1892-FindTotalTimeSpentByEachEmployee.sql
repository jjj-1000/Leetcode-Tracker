-- Last updated: 7/9/2026, 3:07:46 PM
# Write your MySQL query statement 
select event_day as day,emp_id, sum(out_time-in_time) as total_time
from Employees 
group by event_day,emp_id;

