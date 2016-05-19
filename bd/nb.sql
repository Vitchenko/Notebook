exec dbms_random.initialize(100000);

/*generate persons*/
CREATE OR REPLACE PROCEDURE person_generate 
	( Str_in IN number)
IS

BEGIN
	FOR i IN 1.. Str_in LOOP
		INSERT ALL 
    INTO person (Person_id, Lname, Fname, Adress, Pole, Email)
    VALUES (Person_sc.NEXTVAL, DBMS_RANDOM.STRING ('a', DBMS_RANDOM.VALUE (3,15)), 
    DBMS_RANDOM.STRING ('a', DBMS_RANDOM.VALUE (5,15)), 
    DBMS_RANDOM.STRING ('a', DBMS_RANDOM.VALUE (7,20)), 
    DBMS_RANDOM.VALUE (1,2), 
    DBMS_RANDOM.STRING ('x', DBMS_RANDOM.VALUE (3,8)) || '@te.net.ua ')
    INTO phones (id, ph_number, person_id)
    VALUES (Phones_sc.NEXTVAL, '+38'||to_char(round(DBMS_RANDOM.VALUE(10000000000,1000000000),0)), Person_sc.currval )
    SELECT * FROM dual;
	END LOOP;	
END;

--SET SERVEROUTPUT ON;


BEGIN
person_generate(50000);
End;

commit;

delete from PERSON where PERSON_ID>0;
delete from PHONES where ID>0;

commit;

ROLLBACK;

select * from person;

select * from nls_database_parameters;


delete from person where person_id > 1;
commit;















/*Database for notebook*/

Drop table Person;
commit;
CREATE TABLE Person
(   Person_id NUMBER (10) NOT NULL ,
    Lname     VARCHAR2 (50) ,
    Fname     VARCHAR2 (50) ,
    Photo BLOB ,
    Adress VARCHAR2 (200) ,
    Pole   NUMBER (2) NOT NULL
  )
ALTER TABLE Person ADD CONSTRAINT Person_PK PRIMARY KEY ( Person_id ) ;
ALTER TABLE Person ADD Email varchar2(50);
commit;

INSERT INTO	Person (Person_id, Lname, Fname, Adress,Pole) VALUES(Person_sc.nextval,'Ivan', 'Ivanov', 'Ulica 1',1);
INSERT INTO	Person (Person_id, Lname, Fname, Adress,Pole) VALUES(Person_sc.nextval,'Petr', 'Petrov', 'Ulica 2',1);
INSERT INTO	Person (Person_id, Lname, Fname, Adress,Pole) VALUES(Person_sc.nextval,'Ivana', 'Ivanova', 'Ulica 3',2);
INSERT INTO	Person (Person_id, Lname, Fname, Adress,Pole) VALUES(Person_sc.nextval,'Petra', 'Petrova', 'Ulica 4',2);



Drop table Phones;
commit;
CREATE TABLE Phones
  (
    id        NUMBER (10) NOT NULL ,
    Ph_number  VARCHAR2 (50) ,
    Person_id NUMBER (10) NOT NULL
  )
  
ALTER TABLE Phones ADD CONSTRAINT Phones_PK PRIMARY KEY ( id ) ;

drop SEQUENCE Phones_sc;
drop SEQUENCE Person_sc;
commit;
CREATE SEQUENCE Phones_sc START WITH 10 INCREMENT BY 1 CACHE 10;
CREATE SEQUENCE Person_sc START WITH 10 INCREMENT BY 1 CACHE 10;
commit;


INSERT INTO	Phones (id, Ph_number, Person_id) VALUES(Phones_sc.nextval,'+380674562125', '10');
INSERT INTO	Phones (id, Ph_number, Person_id) VALUES(Phones_sc.nextval,'+380504112125', '10');
INSERT INTO	Phones (id, Ph_number, Person_id) VALUES(Phones_sc.nextval,'+380934544125', '10');
INSERT INTO	Phones (id, Ph_number, Person_id) VALUES(Phones_sc.nextval,'+380674562123', '11');
INSERT INTO	Phones (id, Ph_number, Person_id) VALUES(Phones_sc.nextval,'+380504112123', '11');
INSERT INTO	Phones (id, Ph_number, Person_id) VALUES(Phones_sc.nextval,'+380934544123', '11');
INSERT INTO	Phones (id, Ph_number, Person_id) VALUES(Phones_sc.nextval,'+380674562124', '12');
INSERT INTO	Phones (id, Ph_number, Person_id) VALUES(Phones_sc.nextval,'+380504112124', '12');
INSERT INTO	Phones (id, Ph_number, Person_id) VALUES(Phones_sc.nextval,'+380934544124', '12');

commit;

CREATE TABLE Pole
  (
    Pole_id NUMBER (2) NOT NULL ,
    Name    VARCHAR2 (20)
  )
ALTER TABLE Pole ADD CONSTRAINT Pole_PK PRIMARY KEY ( Pole_id ) ;
ALTER TABLE Person ADD CONSTRAINT Person_Pole_FK FOREIGN KEY ( Pole ) REFERENCES Pole ( Pole_id ) NOT DEFERRABLE ;
ALTER TABLE Phones ADD CONSTRAINT Phones_Person_FK FOREIGN KEY ( Person_id ) REFERENCES Person ( Person_id ) NOT DEFERRABLE ;

ALTER TABLE Phones MODIFY ID number(10);
ALTER TABLE table_name MODIFY column_name column_type;

 
commit;


select * from person where PERSON_ID>20000;

select Lname from person where person_id<100;

INSERT ALL INTO person (Person_id, Lname, Fname, Adress, Pole, Email)
    VALUES (Person_sc.NEXTVAL, 'createFname', 'createFname', 'createAdress', 1, 'testcreate@te.net.ua ')
    INTO phones (id, ph_number, person_id)
    VALUES (Phones_sc.NEXTVAL, '+380678541478', Person_sc.currval )
    





SELECT Pr.PERSON_ID, Pr.LNAME, Pr.Fname, Pr.Adress, pl.NAME, Pr.Email, Ph.ph_number 
FROM Person Pr, Phones Ph, Pole pl 
where Pr.person_id = Ph.PERSON_ID and Pr.POLE=pl.POLE_ID;

select count (person_id) from PERSON;
