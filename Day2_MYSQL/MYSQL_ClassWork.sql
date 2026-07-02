use mydatabase;

create table tbl_employee (
eid INTEGER, ename VARCHAR(50),
esalary INTEGER, dno INTEGER);

desc tbl_employee;


INSERT INTO tbl_employee VALUES
(104, "Rahul", 30000, 20);

SET SQL_SAFE_UPDATES = 0;

update  tbl_employee set dno = 10 where eid = 103;

select * from tbl_employee;

select dno , count(*) as "total no of employee"
from tbl_employee group by dno;


select dno, sum(esalary), avg(esalary) , min(esalary),
max(esalary) from tbl_employee group by dno;

select dno, sum(esalary), avg(esalary) , min(esalary),
max(esalary) from tbl_employee group by dno 
having min(esalary) > 10000;


select dno, sum(esalary), avg(esalary) , min(esalary),
max(esalary) from tbl_employee group by dno
order by dno DESC;

select dno, sum(esalary), avg(esalary) , min(esalary),
max(esalary) from tbl_employee order by dno DESC 
group by dno; -- error


-- subquery

create table tbl_dept
( dno INTEGER, dname VARCHAR(50));

insert into tbl_dept values(
20 , "Testing");

select * from tbl_dept;

select dname from tbl_dept where dno =
 (select dno from tbl_employee where eid=101);
 
 select * from tbl_employee where
 dno = 
 (select dno from tbl_dept where dname = "Testing");

select dname from tbl_dept where 
dno = 
(select dno from tbl_employee where ename = "Ramesh");


select dname from tbl_dept where dno = 
(select dno from tbl_employee where eid = 101 or eid = 102);

select dname from tbl_dept where dno in
(select dno from tbl_employee where eid = 101 or eid = 102);

drop table tbl_employee;

create table tbl_employee (
eid INTEGER primary key, ename VARCHAR(50) not null,
esalary INTEGER check(esalary > 0), email varchar(20) unique,
dno INTEGER);

-- constraint violated
Insert into tbl_employee values
(101, "Ramesh", -10000,  "abc@gmail.com", 10);

drop table tbl_employee;
drop table tbl_dept;

create table tbl_dept(dno integer primary key, dname varchar(20));

create table tbl_employee (
eid INTEGER primary key, ename VARCHAR(50),
esalary INTEGER, dno INTEGER, 
foreign key (dno) references tbl_dept(dno));

insert into tbl_employee values (101, "Ramesh", 20000, 10);
select * from tbl_employee;
select * from tbl_dept;
insert into tbl_dept values(10, "Testing");

-- Procedures

DELIMITER //

create procedure insertEmployee(in eid integer, in ename varchar(20),
in esalary integer, in dno integer )
begin
  insert into tbl_employee (eid, ename, esalary, dno) 
  values (eid, ename, esalary, dno);
end //

call insertEmployee(103, "Valan", 3000, 10);

drop procedure insertEmployee;

select * from tbl_employee;

DELIMITER //
create procedure getEmployeeName(in empid integer, out empname varchar(20))
begin
  select ename into empname from tbl_employee where eid = empid;
end //

call getEmployeeName(101, @empname);
select @empname;

DELIMITER //
create function getEmpName(empid integer) returns varchar(20) DETERMINISTIC
begin
  declare empname varchar(20);
  select ename into empname from tbl_employee where eid = empid;
  return empname;
end //

select getEmpName(101);

-- Joins


select * from tbl_employee;
select * from tb

-- equi join
Select e.ename , d.dname from tbl_employee e, tbl_dept d
where e.dno = d.dno;

Select e.ename , d.dname from tbl_employee e join tbl_dept d
on e.dno = d.dno;

-- non equi join
Select e.ename , d.dname from tbl_employee e join  tbl_dept d
on e.dno != d.dno;

-- inner join
Select e.ename , d.dname from tbl_employee e inner join  tbl_dept d
on e.dno = d.dno;

-- outer join
Select e.ename , d.dname from tbl_employee e full outer join  tbl_dept d
on e.dno = d.dno;

-- left join
Select e.ename , d.dname from tbl_employee e left  join  tbl_dept d
on e.dno = d.dno;

-- right join
Select e.ename , d.dname from tbl_employee e right  join  tbl_dept d
on e.dno = d.dno;

-- cross join
Select e.ename , d.dname from tbl_employee e cross  join  tbl_dept d;

select * from tbl_dept;
select * from tbl_employee;






