CREATE DATABASE EmployeeManagement;
USE EmployeeManagement;


CREATE TABLE Department (
   DeptID INT PRIMARY KEY,
   DeptName VARCHAR(50),
   Location VARCHAR(50)
);


INSERT INTO Department VALUES
(101,'HR','Hyderabad'),
(102,'Finance','Mumbai'),
(103,'IT','Bangalore'),
(104,'Sales','Chennai');


CREATE TABLE Employee (
   EmpID INT PRIMARY KEY,
   EmpName VARCHAR(50),
   Gender VARCHAR(10),
   Age INT,
   Salary DECIMAL(10,2),
   Designation VARCHAR(50),
   DeptID INT,
   HireDate DATE,
   FOREIGN KEY (DeptID) REFERENCES Department(DeptID)
);



INSERT INTO Employee VALUES
(1,'Amit','Male',28,45000,'Software Engineer',103,'2022-05-10'),
(2,'Priya','Female',30,55000,'HR Manager',101,'2021-03-15'),
(3,'Rahul','Male',27,50000,'Accountant',102,'2023-01-20'),
(4,'Sneha','Female',25,42000,'Sales Executive',104,'2022-09-12'),
(5,'Kiran','Male',31,60000,'Team Lead',103,'2020-11-18');


CREATE TABLE Attendance (
   AttendanceID INT PRIMARY KEY,
   EmpID INT,
   AttendanceDate DATE,
   Status VARCHAR(10),
   FOREIGN KEY (EmpID) REFERENCES Employee(EmpID)
);

INSERT INTO Attendance VALUES
(1,1,'2026-07-01','Present'),
(2,2,'2026-07-01','Present'),
(3,3,'2026-07-01','Absent'),
(4,4,'2026-07-01','Present'),
(5,5,'2026-07-01','Present');

-- Basic queries
select * from employee;
select empname , salary from employee;
select empname, salary from employee where salary > 50000;
select empname, age from employee where age > 30;

-- Where Clause
select e.empname, d.deptname from employee e , department d where
e.deptid = d.deptid and d.deptname = 'IT';

select empname from employee where gender = "female";

select empname, hiredate from employee where hiredate >  2022-01-01;


-- Order By

select * from employee ORDER BY salary DESC;
select * from employee ORDER BY empname;

-- Aggregate Functions
select count(*) from employee;
select max(salary) from employee;
select min(salary) from employee;
select avg(salary) from employee;
select sum(salary) from employee;

-- Group By
Select deptid , count(deptid) from employee group by deptid;
Select e.deptid , d.deptname , count(e.deptid) from employee e join department d on d.deptid
 = e.deptid group by e.deptid, d.empname;
-- along with names
SELECT e.deptid,
       d.deptname,
       COUNT(e.deptid) 
FROM employee e
JOIN department d
ON d.deptid = e.deptid
GROUP BY e.deptid, d.deptname;

Select deptid , avg(salary) from employee group by deptid;
Select deptid , max(salary) from employee group by deptid;

-- Joins
select e.empname , d.deptname from employee e join department d 
on e.deptid = d.deptid;

select e.empname , d.deptname, d.location from employee e join department d 
on e.deptid = d.deptid;

select e.empname , a.* from employee e join attendance a
on e.empid = a.empid;

-- update
update employee set salary = salary + (0.1 * salary) where 
deptid = (select deptid from department where deptname = "IT");

update employee set designation = "Accountant" where empid = 5;

update employee set deptid = 104 where empid = 5;


-- delete
delete from employee where salary < 40000;
delete from attendance where attendanceid = 1;

-- views
CREATE VIEW EmployeeDetails AS
SELECT e.EmpID, e.EmpName, d.DeptName, e.Salary
FROM Employee e
JOIN Department d ON e.DeptID = d.DeptID;

select * from employeedetails;


-- procedure
DELIMITER //

CREATE PROCEDURE GetEmployees()
BEGIN
   SELECT * FROM Employee;
END //

 CALL GetEmployees();



