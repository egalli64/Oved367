use me;

-- Nome degli employees e del loro department
select e.first_name, e.last_name, d.department_name
from employees e join departments d using (department_id)
order by e.last_name;

-- Nome degli employees e job title
select e.first_name, e.last_name, j.job_title
from employees e join jobs j using (job_id)
order by e.last_name;

-- Nome degli employees che hanno il salario minimo o massimo previsto per il loro job title
select e.first_name, e.last_name, e.job_id, e.salary, j.min_salary, j.max_salary
from employees e join jobs j using (job_id)
where e.salary = j.max_salary or e.salary = j.min_salary;

-- Nome degli employees basati in UK
select e.first_name, e.last_name, d.department_id, d.department_name, l.country_id
from employees e join departments d using (department_id)
				 join locations l using (location_id)
where country_id = 'UK';

-- Nome dei departments e manager associato
select d.department_name, d.manager_id, e.first_name, e.last_name, e.employee_id
from departments d join employees e using (department_id)
where e.employee_id = d.manager_id;

-- Nome dei departments e, se esiste, del relativo manager
select d.department_name, d.manager_id, e.first_name, e.last_name
from departments d left outer join employees e
on (d.manager_id = e.employee_id)
order by d.department_name;

-- Nome dei departments che non hanno un manager associato
select d.department_name
from departments d
where d.manager_id is null;

-- Nome degli employees e del loro manager
select e.first_name, e.last_name, m.first_name as "Manager first_name", m.last_name as "Manager last_name"
from employees e left outer join employees m
on (e.manager_id = m.employee_id);