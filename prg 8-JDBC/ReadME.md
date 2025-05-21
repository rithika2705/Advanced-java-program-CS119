### 8A. Read all the existing records from the table coffee which is from the database test and insert a new coffee product into it \[Create a table coffee with fields ( id,coffee\_name,price)] using HTML and JSP to get the fields and display the results respectively

### 8B. Read all the existing records from the table coffee which is from the database test and update an existing coffee product  in the table with its id. \[Create a table coffee with fields ( id,coffee\_name,price)] using HTML and JSP to get the fields and display the results respectively
---
## SQL STRUCTURE FOR 8A/8B

CREATE TABLE IF NOT EXISTS `coffee` (  
`id` int(5) NOT NULL AUTO_INCREMENT,  
`coffee_name` varchar(100) NOT NULL,  
`priced` int(5), PRIMARY KEY (`id`)  
);

-- insert  

INSERT INTO coffee values (101,'Febary',120);  
INSERT INTO coffee values (102,'Royal',140);  
INSERT INTO coffee values (103,'Diamond',180);  

---
### 8C. Develop a JDBC project using JSP to append  the fields empno,  empname and basicsalary into the table Emp of the database Employee by getting the fields  through keyboard and Generate the report as follows for the  TABLE Emp (Emp\_NO , Emp\_Name, Basicsalary ) using HTML and JSP to get the fields and display the results respectively

### 8D. Develop a JDBC project using JDBC to update  the fields empno,  empname and basicsalary into the table Emp of the database Employee  using HTML and JSP to get the fields and display the results respectively
---
## SQL STRUCTURE FOR 8C/8D
CREATE TABLE 'Emp' (  
'Emp_NO' INTEGER PRIMARY KEY,  
'Emp_Name' TEXT NOT NULL,  
'Basicsalary' INTEGER  
);  
-- insert  
INSERT INTO EMPLOYEE VALUES (101, 'Ramesh', 25000);  
INSERT INTO EMPLOYEE VALUES (102, 'Ravi', 20000);  
