# Spring-Boot-Hospital-Database-management-application
1.	Abstract:

The objective of this project is to maintain the Patients details in a particular hospital. This project has the capability to display the Patients detail like name age, gender, symptoms, Present medication, bed number, and possible discharge from the hospital. This project can be used in the hospital to maintain the Patients track records.



2.	Introduction:

In the present world maintaining the Patient record in paper copy is hard, so this project provides an alternative approach to maintain the records by using existing technology, As the technology is growing much deeper into day to day life, by using it we can make life easier. In this project one such idea is proposed.  i. e  maintaining the patient record using SQL database. As this project runs as the web server the details of patients can we accessed anywhere.










3.	Tools Used:

	The technical detail of the project is as follows. This is spring boot Maven web application, In this Application, I am using  Java for the Backend code. HTML for front-end. And java script for the communication. Here I am using Microsoft SQL for database Storage. 
Tools used are as follow:
•	Eclipse  - For  Writing code and Creating project and build
•	Microsoft SQL Service – SQL service which will run in localhost
•	Maven Package – package installed in eclipse 
•	SQL Developer  - To Create database file and to create Tables and for connection to service 


4.	Configuration: 

•	The tools maintained in the tools used section need to be install.  
•	Java (above 8) needs to be install
•	Create The Database file and table using MYSQL Work Bench.
•	The DataBase file name should match with the one which given in the configuration file  and table name also should match.
•	Configuration in the code need to be change to connect with MYSQL server (user name and password)  as shown below

 


•	TomCat web server should run in the eclipse once the application start running 

 

After the above configuration the application will start normally . then in the web browser give Url as  localhost:8080


5.	Project Output
•	Show the existing patients details 

 
•	Add new patient do Database

 
•	Display the patient details with new patient detail

 

•	Remove patient from DataBase

 




6.	Summary: 

	This project  able to store the patient details in the SQL DataBase and able to retrieve the data one request. This project is limited to localhost and this can be further improvise to use in big way
