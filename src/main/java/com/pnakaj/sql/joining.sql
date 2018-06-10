Suppose you have two tables, with a single column each, and data as follows:

A    B
-    -
1    3
2    4
3    5
4    6

#Inner join
An inner join using either of the equivalent queries gives the intersection of the two tables, i.e. the two rows they have in common.

select * from a INNER JOIN b on a.a = b.b;
select a.*, b.*  from a,b where a.a = b.b;

a | b
--+--
3 | 3
4 | 4

#Left outer join
A left outer join will give all rows in A, plus any common rows in B.

select * from a LEFT OUTER JOIN b on a.a = b.b;
select a.*, b.*  from a,b where a.a = b.b(+);

a |  b
--+-----
1 | null
2 | null
3 |    3
4 |    4

#Right outer join
A right outer join will give all rows in B, plus any common rows in A.

select * from a RIGHT OUTER JOIN b on a.a = b.b;
select a.*, b.*  from a,b where a.a(+) = b.b;

a    |  b
-----+----
3    |  3
4    |  4
null |  5
null |  6

#Full outer join
A full outer join will give you the union of A and B, i.e. all the rows in A and all the rows in B. If something in A
 doesnot have a corresponding datum in B, then the B portion is null, and vice versa.

select * from a FULL OUTER JOIN b on a.a = b.b;

 a   |  b
-----+-----
   1 | null
   2 | null
   3 |    3
   4 |    4
null |    6
null |    5

create table Employee(
id number(3),
name varchar(5)
);

insert INTO employee VALUES(101,'A');
insert INTO employee VALUES(102,'B');
insert INTO employee VALUES(103,'C');
insert INTO employee VALUES(104,'D');
insert INTO employee VALUES(105,'E');
insert INTO employee VALUES(106,'F');
insert INTO employee VALUES(107,'G');
insert INTO employee VALUES(108,'H');

create table Department(
id number(4),
name varchar(8)
);

insert INTO Department VALUES(1001,'phy');
insert INTO Department VALUES(1002,'che');
insert INTO Department VALUES(1003,'math');
insert INTO Department VALUES(1004,'bio');
insert INTO Department VALUES(1005,'his');
insert INTO Department VALUES(1006,'geo');
insert INTO Department VALUES(1007,'civ');
insert INTO Department VALUES(1008,'eng');


create table Employee_Department(
id number(5),
eid number(3),
dId number(4)
);

insert INTO Employee_Department VALUES(10001,101,1001);
insert INTO Employee_Department VALUES(10002,101,1002);
insert INTO Employee_Department VALUES(10003,102,1003);
insert INTO Employee_Department VALUES(10004,102,1004);
insert INTO Employee_Department VALUES(10005,102,1005);
insert INTO Employee_Department VALUES(10006,103,1004);
insert INTO Employee_Department VALUES(10007,103,1006);
insert INTO Employee_Department VALUES(10008,103,1008);
insert INTO Employee_Department VALUES(10008,104,1008);


