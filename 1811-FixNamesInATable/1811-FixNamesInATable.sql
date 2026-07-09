-- Last updated: 7/9/2026, 3:07:51 PM
# Write your MySQL query statement below


select user_id,
concat(
      upper(left(name,1)),
      lower(substring(name,2))
    ) as name

from users
order by user_id;