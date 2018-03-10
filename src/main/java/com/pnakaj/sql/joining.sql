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
A full outer join will give you the union of A and B, i.e. all the rows in A and all the rows in B. If something in A doesn't have a corresponding datum in B, then the B portion is null, and vice versa.

select * from a FULL OUTER JOIN b on a.a = b.b;

 a   |  b
-----+-----
   1 | null
   2 | null
   3 |    3
   4 |    4
null |    6
null |    5