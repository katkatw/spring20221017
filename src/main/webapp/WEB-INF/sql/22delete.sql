-- DELETE : 테이블의 레코드 삭제

DELETE FROM Customers 
WHERE CustomerID = 1;

SELECT * FROM Customers
WHERE CustomerID = 1;

-- 고객테이블에서 90번 고객 삭제
-- 고객테이블에서 91번 고객 삭제 
SELECT * FROM Customers
WHERE CustomerID = 90;
SELECT * FROM Customers
WHERE CustomerID = 91; 

DELETE FROM Customers
WHERE CustomerID = 90;
DELETE FROM Customers
WHERE CustomerID = 91;

-- USA 고객들 지우기
DELETE FROM Customers
WHERE Country = 'USA';
SELECT * FROM Customers
WHERE Country = 'USA';

-- UK 고객들 지우기
-- Mexico 고객들 지우기 
DELETE FROM Customers
WHERE Country = 'UK';
DELETE FROM Customers
WHERE Country = 'Mexico';

SELECT * FROM Customers
WHERE Country = 'UK'; 
SELECT * FROM Customers
WHERE Country = 'Mexico';

DESC Customers;
SET SQL_SAFE_UPDATES = 0;

