-- Last updated: 7/9/2026, 3:09:01 PM
# Write your MySQL query statement below
select distinct author_id as id
from Views
where author_id=viewer_id
order by id;