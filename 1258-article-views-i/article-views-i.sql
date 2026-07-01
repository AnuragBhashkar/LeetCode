# Write your MySQL query statement below
select author_id as id
from Views v
where v.author_id=v.viewer_id
group by author_id
order by author_id;