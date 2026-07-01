use mydatabase;

CREATE table tbl_employee (
eid INTEGER,
ename VARCHAR(50),
esalary INTEGER);

desc tbl_employee;

Insert INTO tbl_employee VALUES (
101,
'Ramesh',
10000
);

Insert INTO tbl_employee VALUES (
102,
'Suresh',
20000
);

select * from tbl_employee;

select eid, esalary from tbl_employee;

Insert INTO tbl_employee VALUES (103, null, 30000);
Insert INTO tbl_employee (eid, esalary) VALUES (104, 40000);

select * from tbl_employee where eid <> 101;
 
 select ename from tbl_employee where esalary <= 30000;
 
select eid, ename from tbl_employee where ename is null;
  
select eid, ename from tbl_employee where ename is not null;

select * from tbl_employee where eid in (101, 103);

select * from tbl_employee where eid not in (101, 103);

select * from tbl_employee where eid in (101, 105);

select * from tbl_employee where esalary between 10000 and 40000;

select * from tbl_employee where esalary not between 40000 and 10000; 

select * from tbl_employee where ename like '%e%';

select * from tbl_employee where ename not like '%e%';

SET SQL_SAFE_UPDATES = 0;

update tbl_employee set esalary = 0 where eid = 101;

select * from tbl_employee;

rollback;

delete from tbl_employee where ename is null;

select eid as "Employee Id", sysdate() as "current date",
'Neeraj', 100 + 200  'sum' from tbl_employee;

alter table tbl_employee add column dno integer;

alter table tbl_employee add  dsalary integer;

alter table tbl_employee drop column dno;

alter table tbl_employee rename column eid to empid;

truncate table tbl_employee;

rename table tbl_employee to tbl_employee1;


