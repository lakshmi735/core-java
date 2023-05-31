CREATE DATABASE mtrproducts;
use mtrproducts;
CREATE TABLE mtrproducts(id int,prod_name varchar(20),prod_price int);


INSERT INTO mtrproducts VALUES(1,'karadhapudi',30);
INSERT INTO mtrproducts VALUES(2,'  jamun',100);

LTRIM(LEFT REMOVE):	will remove the leading spaces from data  ex:'   bangalore'

how to check spaces:using LENGTH we will check the spaces,spaces also take the memory

RTRIM:will remove the trailing spaces form data

SELECT LTRIM(prod_name) as spacce_remove

SELECT LTRIM(prod_name) FROM mtrproducts;
INSERT INTO mtrproducts VALUES
SELECT LTRIM(RTRIM('  PROJECT  ')) as spaces;

ORDER BY: 
by defalut it is assending order
VARCHAR:  OVER BY  is not used only for numeric we use
 SELECT * FROM olympic_games order by id;
 SELECT * FROM olympic_games order by id DESC;
  SELECT * FROM olympic_games order by country;
  Constraints:used to set limite the type of data or some rules for data by inserting
  when:constraints are applied to the columns bcz data is stored in columns
  are applied to creating the tables
  By using alter also can apply the constraints 
  
  1) NOT NULL CONSTRAINTS:not accept any null values in columne
 symtax: column name ,data type, not null constraints
  it will accept duplicate values
  it will not accept null values
  
  
  CREATE TABLE marriage(id int not null,bride_name varchar(20),groom_name varchar(20) not null,pujari varchar(20));
desc marriage;
INSERT INTO marriage values(1,'ajay','anvitha','aaa');
INSERT INTO marriage
contraints voilation: contraints related errors

unique: it will not accept duplicate values,it will accept null value

create table ghost(id int not null,ghost_name varchar(20) unique,ghost_song varchar(20));
insert into ghost value(1,'Annabele','rara');
insert into ghost value(1,null,'thangali');
select * from ghost;
desc ghost;
alter table ghost add column dress_code varchar(20) default 'white';
commit;
desc ghost;
3)CHECK: it limits the range of values in column  it will not accept duplicate and null values 
apply only for numbers

CREATE TABLE serials(id int  not null unique,ser_name varchar(30) unique,director varchar(20) not null unique,episode int,check(episode>=500));
insert into serials values(1,'gattimela','spoorthi',600);
insert into serials values(2,'kannadathi','ravi',500);
create table makeup(id  int unique,brand varchar(20) not null unique, type enum('powder','perfume','cream'),price int,expiry_date date,quantity int,check(price>=10 and quantity<5));
insert into makeup values(1,'ponds',2,11,'2023-01-23',3);
select * from makeup;
insert into makeup values(2,'lakme','powder',20,'2023-01-27',4);
insert into makeup values(null,'himalaya','cream',20,'2023-01-27',4);

4)primary key: uniquely identitify the each and every row while inserting the data
it have both not null and unique constraints by default defined on primary key
will not accept null values and duplicate value
each table will have only one primary key 
we can apply primary key to multiple column
we can not have multiple primary key in a single table
table should have only one primary key

commit;