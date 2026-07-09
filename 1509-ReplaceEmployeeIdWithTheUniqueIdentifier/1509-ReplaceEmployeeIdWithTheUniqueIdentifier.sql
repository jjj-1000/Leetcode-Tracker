-- Last updated: 7/9/2026, 3:08:20 PM
# Write your MySQL query statement below
select 
eu.unique_id as unique_id, e.name as name
from Employees e 
left join EmployeeUNI eu 
on e.id = eu.id