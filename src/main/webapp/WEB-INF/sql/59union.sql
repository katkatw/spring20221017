USE mydb6;
SELECT * FROM TableA -- 집합은 중복이 없다 UNION
UNION						
SELECT * FROM TableB;

SELECT * FROM TableA -- 중복된 것도 나오게 하는 UNION ALL
UNION ALL						
SELECT * FROM TableB;

-- FULL OUTER JOIN
SELECT * FROM TableA a LEFT JOIN TableB b ON a.col1 = b.c1
UNION
SELECT * FROM TableA a RIGHT JOIN TableB b ON a.col1 = b.c1;