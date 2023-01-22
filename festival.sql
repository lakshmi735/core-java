
CREATE TABLE festival(id int,fest_name varchar(20),fest_date varchar(20),fest_day varchar(10),region varchar(20),sweet varchar(20),fruit varchar(20),flower varchar(20),family_memebers int,location varchar(20));
INSERT INTO festival VALUES(1,'Dipavali','2022-11-22','Monday','Hindu','Mysorepak','Apple','Rose',10,'Bangalore');
INSERT INTO festival VALUES(2,'Dasara','2023-10-18','Friday','Hindu','Jamun','Orange','Lily',6,'Mysore');
INSERT INTO festival VALUES(3,'Sankrathi','2023-01-15','Sunday','Hindu','Dudpeda','Mango','Jasmine',9,'Hubbli');
INSERT INTO festival VALUES(4,'Yugadi','2023-03-20','Monday','Hindu','Mysorepak','Apple','Rose',15,'Bangalore');
INSERT INTO festival VALUES(5,'Ganesha Chathurthi','2022-08-22','Thursday','Hindu','Corret Halva','Apple','Lilly',5,'Hassan');
INSERT INTO festival VALUES(6,'Dipavali','2023-11-08','Tuesday','Hindu','Jamun','Apple','Rose',12,'Mangalore');
SELECT * FROM festival;
 ALTER TABLE festival RENAME COLUMN sweet to fest_sweet;
 ALTER TABLE festival RENAME COLUMN flower to fest_flower;
ALTER  TABLE festival MODIFY COLUMN fest_name varchar(50);
/*DESC:Describe
DESC:table_name; */
DESC festival;
ALTER TABLE festival MODIFY COLUMN fest_name bigint;
ALTER TABLE festival MODIFY COLUMN id bigint;
ALTER TABLE festival MODIFY COLUMN id varchar(20);
commit;