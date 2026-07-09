-- Last updated: 7/9/2026, 3:09:14 PM
# Write your MySQL query statement below
select p.project_id,
round(avg(e.experience_years),2) as average_years
from Project p 
left join Employee e
on p.employee_id= e.employee_id 
group by project_id