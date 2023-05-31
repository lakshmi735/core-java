use festival;
create table bus_details(id int primary key,b_source varchar(20),b_destination varchar(20),b_type varchar(20),price int);
insert into bus_details values(1,'shivamogga','bangalore','KSRTC',300);
insert into bus_details values(2,'madikeri','sagara','NEKSRTC',310);
insert into bus_details values(3,'gulbarga','mangalore','SVT',315);
insert into bus_details values(4,'bellary','davanagere','KSRTC',350);
insert into bus_details values(5,'hassan','gulbarga','VRL',500);
insert into bus_details values(6,'bangalore','bijapur','KSRTC',400);
insert into bus_details values(7,'shivamogga','hassan','SVT',250);
insert into bus_details values(8,'chikkamanaglore','bellary','NEKSRTC',550);
insert into bus_details values(9,'chitradurga','hoskote','NEKSRTC',450);
insert into bus_details values(10,'belagavi','bidar','AKMS',350);
insert into bus_details values(11,'gulbarga','bangalore','VRL',1300);
insert into bus_details values(12,'shivamogga','gulbarga','SVT',500);
insert into bus_details values(13,'darmasthala','bangalore','VRL',700);
insert into bus_details values(14,'hubli','haasn','KSRTC',550);
insert into bus_details values(15,'shivamogga','sagara','SVT',450);
insert into bus_details values(16,'bijapur','managalore','NEKSRTC',1200);
insert into bus_details values(17,'hassan','bangalore','KSRTC',560);
insert into bus_details values(18,'hoskote','darmasthala','VRL',600);
insert into bus_details values(19,'bidar','gulbarga','AKMS',700);
insert into bus_details values(20,'shivamogga','hoskote','SVT',1000);
SELECT count(b_type) as num,b_type from bus_details group by b_type order by num desc;
select sum(price),b_type as fare from bus_details group by b_type;
having
SELECT count(b_type) as num,b_type from bus_details group by b_type having num >4;
select sum(price)as fare,b_type as fare from bus_details group by b_type having fare > 500 and fare < 3000;

lock:
LOCK TABLE bus_details READ;
UPDATE bus_details set b_source='hassn' where id=1;

unlock table;
view:

create view view_name as select * from table_name;
create view bus_view as select * from bus_deatils;
select * from bus_deatils;
update bus_details set b_source ='tumkur' where id=1;
select * from bus_view;
create table bus_view2 as select id b_type from bus_details;
select * from bus_view2;