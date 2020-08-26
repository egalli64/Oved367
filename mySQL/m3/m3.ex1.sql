use me;

-- Qual è il salario corrente, quale sarebbe con un incremento dell’8.5%, qual è il delta come valore assoluto?
select first_name, last_name, salary, round(salary*1.085, 2) as 'Increased salary'
from employees;

-- Quanti giorni sono passati dall'assunzione ad oggi?
select first_name, last_name, hire_date, datediff(curdate(), hire_date) as 'Delta'
from employees;

-- Quant'è la commissione di ognuno o 'no value'
select first_name, last_name, ifnull(commission_pct, 'no value') as 'Commission'
from employees;