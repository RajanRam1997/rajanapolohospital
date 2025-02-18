create table if not exists technician(technicianid int primary key auto_increment,
technicianname varchar(30),
machineoperator varchar(40),
 mobile varchar(10),salary int);
 
 insert into technician(technicianname,machineoperator,mobile,salary) values('sagar','ventilator ','8657268577',20000);
  insert into technician(technicianname,machineoperator,mobile,salary) values('yash','ECG machine','9478226831',16000);