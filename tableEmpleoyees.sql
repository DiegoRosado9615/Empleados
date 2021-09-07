create table employee(id int not null,
					 Gender_id int,
					 job_id int, 
                     namee varchar(255),
                     last_name varchar (255),
                     BirthDate date,
                     primary key(id)
                     );


create table EMPLOYEE_WORKKED_HOURS(
									employeed_id int not null,
                                    worked_hours int,
                                    worked_date date,
                                    id int not null,
									foreign key (id) references employee (id) );
                     
create table jobs(namee varchar(255),
					salary float (9,2) ,
                    id int not null,
                    primary key(id),
					foreign key (id) references employee(id));

create table genders (id int not null,
					 namee varchar(255),
                     primary key(id),
					 foreign key (id) references employee(id));