### 9A.  Read all the existing records from the table coffee which is from the database test and delete an existing coffee product  from the table with its id and display the rest of the records using HTML and JSP to get the field and display the results respectively

### 9B. Read all the existing records from the table coffee which is from the database test and query coffee name starting with ‘D’  in the table using HTML and JSP to get the field and display the results respectively
---
## SQL Structure for 9 A and 9B

CREATE TABLE IF NOT EXISTS `coffee` (`id` int(5) NOT NULL
AUTO_INCREMENT,`coffee_name` varchar(100) NOT NULL,`priced` int(5), PRIMARY KEY (`id`)
);  
-- insert    

INSERT INTO coffee values (101,'Febary',120);    
INSERT INTO coffee values (102,'Royal',140);    
INSERT INTO coffee values (103,'Diamond',180);    


---
### 9C. Develop a JDBC project using MySQL to append  the fields empno,  empname and basicsalary into the table Emp of the database Employee by getting the fields  through keyboard and Generate the report as follows for the table Emp (Emp\_NO , Emp\_Name, Basicsalary ) using HTML and JSP to get the field and display the results respectively

### 9D. Develop a JDBC project using MySQL to delete the records in the table Emp of the database Employee by getting the name starting with ‘ID’   through keyboard and Generate the report as follows using HTML and JSP to get the field and display the results respectively
---
## SQL Structure for 9C and 9D
CREATE TABLE Emp (
Emp_NO INTEGER PRIMARY KEY,
Emp_Name TEXT NOT NULL,
Basicsalary INTEGER
);  
-- insert    
INSERT INTO EMPLOYEE VALUES (101, 'Ramesh', 25000);    
INSERT INTO EMPLOYEE VALUES (102, 'Ravi', 20000);    

---
