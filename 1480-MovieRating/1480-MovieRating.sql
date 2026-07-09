-- Last updated: 7/9/2026, 3:08:24 PM
# Write your MySQL query statement below
(select u.name as results
from Users u
join MovieRating m
on u.user_id=m.user_id

group by u.user_id, u.name
order by count(*) desc, u.name asc
limit 1)
union all
(select mv.title as results
from Movies mv
join MovieRating mr
on mv.movie_id=mr.movie_id
where DATE_FORMAT(mr.created_at,'%Y-%m')='2020-02'
group by mv.movie_id,mv.title
order by avg(mr.rating) desc,mv.title asc
limit 1
);



