-- Last updated: 7/9/2026, 3:09:46 PM
# Write your MySQL query statement below
update salary 
set sex=
case
when sex='m' then 'f'
else 'm'
end;