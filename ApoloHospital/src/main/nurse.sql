create table if not exists nurse(nurseid int primary key auto_increment,
 nursename varchar(30),department varchar(40),
 mobile varchar(10),salary int);
 
 insert into nurse(nursename,department,mobile,salary) values('shsmita','skin specilist','8975648577',19000);
insert into nurse(nursename,department,mobile,salary) values('varsha','orthopedic','956826342',18800);