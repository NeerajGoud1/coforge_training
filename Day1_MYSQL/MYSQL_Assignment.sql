
-- Assignment-1
Create DATABASE School;
use school;

create table Students ( 
StudentID INT Primary Key ,
Name VARCHAR(50),
Age INT,
Gender VARCHAR(10),
City VARCHAR(50));


-- Assignment-2
INSERT INTO Students (StudentID, Name, Age, Gender, City)
VALUES
(101, 'Rahul', 20, 'Male', 'Hyderabad'),
(102, 'Priya', 19, 'Female', 'Chennai'),
(103, 'Arjun', 21, 'Male', 'Bengaluru'),
(104, 'Sneha', 20, 'Female', 'Mumbai'),
(105, 'Kiran', 22, 'Male', 'Pune');

-- Assignment-3
select * from Students;
select name, city from Students;
select * from Students where age > 20;
select * from Students where gender = "female";
select * from Students where city = "Hyderabad";


-- Assignment-4
select * from Students ORDER BY name;
select * from Students ORDER BY age DESC;
select * from Students ORDER BY city ASC, name ASC;

-- Assignment-5
select * from Students where age BETWEEN 19 and 20;
select * from Students where name like 'R%';
select * from Students where city like '%i';
select * from Students where age = 20 or age = 22;

-- Assignment-6
update  Students set city = "Delhi" where name = "Rahul";
update Students set age = age + 1 where name = "Arjun";
update Students set city = "Kolkata" where name = "Sneha";

-- Assignment-7
delete from Students where studentid = 105;
delete from Students where city = "chennai";






	


 
