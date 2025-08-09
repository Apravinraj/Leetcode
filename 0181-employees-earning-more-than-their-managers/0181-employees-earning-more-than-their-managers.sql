# Write your MySQL query statement below
select e.name as Employee
from employee as e
 join employee as m
on e.managerId = m.Id 
where e.salary > m.salary;


-- SELECT name AS Employee
-- FROM Employee
-- WHERE salary > (
--     SELECT salary
--     FROM Employee
--     WHERE id = Employee.managerId
-- );
