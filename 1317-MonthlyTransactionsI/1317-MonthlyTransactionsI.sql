-- Last updated: 7/9/2026, 3:08:51 PM
select DATE_FORMAT(trans_date,'%Y-%m') as month, country,count(*) as trans_count,sum(state='approved') as approved_count,sum(amount) as trans_total_amount,sum(if(state ='approved', amount,0)) as approved_total_amount
from Transactions 
 
group by month,country;
