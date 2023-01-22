CREATE DATABASE eveningbatch;

show databases;

use eveningbatch;
/*Syntax for creating the table
CREATE TABLE table_name(column_name datatype,column_name......);*/
 
CREATE TABLE river(id int,name varchar(30),location varchar(20),size bigint);

SELECT * FROM river;

/*SYNTAX for insertingng the data into table
INSERT INTO table_name VALUES(data1,data2,data3.....datan);*/

INSERT INTO river VALUES(1,'kaveri','Talakadu',600);
INSERT INTO river VALUES(2,'Thugabadra','shivamogga',450);


CREATE DATABASE olympic_games;
show databases;
use olympic_games;
CREATE  TABLE olympic_games(id int, game_type varchar(20),player_name varchar(20),country varchar(20),no_of_player int,no_of_teams int,no_of_medals int,medal_type varchar(20),jersey_no  int,winning_prize_amount bigint);
SELECT * FROM olympic_games;
INSERT INTO olympic_games VALUES(1,'Athletics','Abhi','India',10,2,4,'gold',27,150000);
INSERT INTO olympic_games VALUES(2,'Swimming','Michael Phelps','United States',2,1,4,'gold',18,250000);
INSERT INTO olympic_games VALUES(3,'Golf','Larisa','Soviet Union',10,2,4,'Silver',11,6550000);
INSERT INTO olympic_games VALUES(4,'Volleyball','Carl','Norway',5,1,2,'Bronze',7,189000);
INSERT INTO olympic_games VALUES(5,'Badminton','Paavo Nurmi','Finland',8,4,3,'gold',19,480000);
INSERT INTO olympic_games VALUES(6,'Frencing','Ole Einar','Norway',10,2,4,'Bronze',27,100000);
INSERT INTO olympic_games VALUES(7,'Boxing','Lovlina Borgohain','India',1,1,1,'gold',20,500000);
INSERT INTO olympic_games VALUES(8,'Shooting','Chris Hoy','italy',4,2,1,'gold',4,250000);
INSERT INTO olympic_games VALUES(9,'Footboll','Natalie','Garmany',6,2,2,'Silver',5,80000);
INSERT INTO olympic_games VALUES(10,'handboll','Nedo','Italy',10,2,4,'gold',7,158000);
INSERT INTO olympic_games VALUES(11,'Ice Hockey','Amy Van','Japan',8,4,1,'Bronze',2,28000);
INSERT INTO olympic_games VALUES(12,'Tennis','Carl','Hungary',4,2,1,'Silver',7,150000);
INSERT INTO olympic_games VALUES(13,'Weightlifting','Emma Mckeon','Austalia',10,5,2,'silver',25,450000);
INSERT INTO olympic_games VALUES(14,'Diving','Ville','Finland',4,1,4,'gold',9,80000);
INSERT INTO olympic_games VALUES(15,'Karate','Martin','France',10,5,1,'gold',30,450000);
INSERT INTO olympic_games VALUES(16,'Artistic Swimming','Aaron Peirsol','United states',6,2,1,'Silver',46,50000);
INSERT INTO olympic_games VALUES(17,'Luge','Gray Hall','Romania',4,1,1,'gold',5,40000);
INSERT INTO olympic_games VALUES(18,'Diving','Willis','USA',6,2,2,'Bronze',23,788000);
INSERT INTO olympic_games VALUES(19,'Speed Skating','Clas Thunberg','France',4,1,1,'Silver',17,250000);
INSERT INTO olympic_games VALUES(20,'Cycling','Bradley','Italy',10,5,3,'Silver',6,700000);
INSERT INTO olympic_games VALUES(21,'Hurdles','Norman Prutchard','India',1,1,1,'Silver',26,500000);
INSERT INTO olympic_games VALUES(22,'Hockey','Dhyan Chand and Team','India',12,1,1,'Gold',5,700000);
INSERT INTO olympic_games VALUES(23,'BanatamWeight','KD Jadhav','India',1,1,1,'Bronze',21,2500000);
INSERT INTO olympic_games VALUES(24,'WeightLifting','Karnam Malleswari','India',1,1,1,'Bronze',14,2000000);
INSERT INTO olympic_games VALUES(25,'shooting','Rajyavardhan Singh','India',1,1,1,'Silver',12,3500000);
INSERT INTO olympic_games VALUES(26,'Boxing','Vijender Singh','India',1,1,1,'Bronze',5,4000000);
INSERT INTO olympic_games VALUES(27,'Batminton','Saina Nehwal','India',1,1,1,'Bronze',15,5400000);
INSERT INTO olympic_games VALUES(28,'Batminton','PV Sindu','India',1,1,1,'Silver',29,3000000);
INSERT INTO olympic_games VALUES(29,'Javelin throw','Abhinav Bindra','India',1,1,1,'Gold',15,350000);
INSERT INTO olympic_games VALUES(30,'Wresting','Bajrang Punia','India',1,1,1,'Bronze',2,50000);
INSERT INTO olympic_games VALUES(31,'Tennis','Leander Paes','India',1,1,1,'Bronze',10,200000);
INSERT INTO olympic_games VALUES(32,'Swimming','Ryan Lochte','USA',1,1,1,'Gold',23,150000);
INSERT INTO olympic_games VALUES(33,'Cycling','Danuta','Sweden',1,1,1,'Gold',9,400000);
INSERT INTO olympic_games VALUES(34,'Gymnastics','Boris','USA',10,5,2,'Silver',23,2410000);
INSERT INTO olympic_games VALUES(35,'Athletics','Allyson','Britain',6,3,2,'Silver',14,302000);
INSERT INTO olympic_games VALUES(36,'Boxing','Katie','Hungray',2,1,1,'Gold',23,400000);
INSERT INTO olympic_games VALUES(37,'Frencing','Svetlana','USA',6,3,1,'Bronze',20,5200000);
INSERT INTO olympic_games VALUES(38,'Speed Skating','Ireen Wust','Netherlands',1,1,1,'Gold',2,560000);
INSERT INTO olympic_games VALUES(39,'Cycling','Chirs Hoy','Britain',1,1,1,'Silver',12,300000);
INSERT INTO olympic_games VALUES(40,'Swimming','Carl','USA',1,1,1,'Bronze',16,2300000);

SELECT * from olympic_games;
