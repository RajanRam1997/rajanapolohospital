create database apolohospital;

create table if not exists doctor(doctorid int primary key auto_increment,
doctorname varchar(30),specialization varchar(40),
mobile varchar(10),fees int);

insert into doctor(doctorname,specialization,mobile,fees) values('Dr.Patil','Orthopedic','8975648577',3000);
insert into doctor(doctorname,specialization,mobile,fees) values('Dr.Kale','Skin Specilist','9685647861',500);