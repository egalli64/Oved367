-- Esercizi m3.s16
use me;


-- Salary: maggiore, minore, somma, media
select max(salary) 'MAX SALARY', min(salary) as 'MIN SALARY', sum(salary) as 'TOTAL SALARY', round(avg(salary), 2) as 'AVERAGE SALARY'
from employees;


-- Salary: maggiore, minore, somma, media - grouped by job_id
select job_id, max(salary) 'MAX SALARY', min(salary) as 'MIN SALARY', sum(salary) as 'TOTAL SALARY', round(avg(salary), 2) as 'AVERAGE SALARY'
from employees
group by job_id;


-- Quanti dipendenti ci sono per ogni job_id
select job_id, count(distinct employee_id) as 'n° employees'
from employees
group by job_id;


-- Quanti sono gli IT_PROG
select job_id, count(distinct employee_id) as 'n° employees'
from employees
where job_id = "IT_PROG";


-- Quanti sono i manager
select count(distinct manager_id)
from employees;


-- Nome dei dipendenti che non sono manager  (con trucco)
select employee_id, first_name, last_name
from employees
where employee_id not in (
	select distinct ifnull(manager_id, 0)
    from employees);


-- Nome dei dipendenti che non sono manager  (senza trucco)
select employee_id, first_name, last_name
from employees
where employee_id not in (
	select distinct manager_id
    from employees
    where manager_id is not null);


-- Differenza tra salario massimo e salario minimo, per ogni job_id, senza considerare dove la differenza è 0
select job_id, max(salary), min(salary), max(salary)-min(salary) as 'Difference'
from employees
group by job_id
having max(salary) != min(salary);


-- Salario minimo dei dipendenti, raggruppati per manager (senza considerare chi non ha manager né i gruppi con salario minimo minore di 6000)
select manager_id, min(salary)
from employees
where manager_id is not null
group by manager_id
having min(salary) >= 6000;



-- --------------------------------------------------------------
-- --------------------------------------------------------------

-- Indirizzi completi, tra locations e countries
select l.street_address, l.postal_code, l.city, l.state_province, c.country_name as 'country'
from locations l join countries c using(country_id);


-- Nome di tutti i dipendenti e dei loro rispettivi department
select e.first_name, e.last_name, d.department_name
from employees e join departments d using(department_id);


-- Nome di tutti i dipendenti basati a Toronto e dei loro rispettivi department
select e.first_name, e.last_name, d.department_name, l.city
from employees e join departments d using(department_id)
				 join locations l using(location_id)
where l.city = 'Toronto';


-- Chi è stato assunto prima di David Lee
select e.first_name, e.last_name, e.hire_date
from employees e
where e.hire_date < (
		select e.hire_date
        from employees e
        where e.first_name = 'David' and e.last_name = 'Lee');


-- Chi è stato assunto prima del proprio manager
select e.first_name, e.last_name, e.hire_date, m.first_name as 'manager first name', m.last_name as 'manager last name', m.hire_date as 'manager hire date'
from employees e join employees m
on (e.manager_id = m.employee_id)
where e.hire_date < m.hire_date;


-- Chi ha lo stesso manager di Lisa Ozer
select e.first_name, e.last_name, e.manager_id
from employees e
where e.manager_id = (
		select e.manager_id
        from employees e
        where e.first_name = 'Lisa' and e.last_name = 'Ozer');


-- Chi lavora in un department in cui c’è almeno un employee con una 'u' nel cognome		(TO BE FIXED!!)
select e.first_name, e.last_name, e.department_id
from employees e
group by e.department_id;
-- having e.last_name regexp 'u';


-- Chi lavora nel department Shipping
select e.first_name, e.last_name, e.department_id, d.department_name
from employees e join departments d using (department_id)
where (d.department_name = 'Shipping');

-- Chi ha come manager Steven King
select e.first_name, e.last_name, e.manager_id
from employees e join employees m
on (e.manager_id = m.employee_id)
where m.first_name = 'Steven' and m.last_name = 'King';


-- Nome e cognome degli employee con stipendio minimo
select e.first_name, e.last_name, e.salary
from employees e
where ( e.salary = (
	select min(salary)
    from employees)
    or e.salary = (
    select max(salary)
    from employees)
    );
    