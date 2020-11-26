DROP TABLE IF EXISTS Customer;

CREATE TABLE IF NOT EXISTS Customer(customer_number VARCHAR(10) NOT NULL PRIMARY KEY,customer_place VARCHAR(50));
INSERT INTO Customer VALUES('7995039932','Chennai');
INSERT INTO Customer VALUES('9874563211','Bangalore');
INSERT INTO Customer VALUES('8965471230','Hyderabad');
INSERT INTO Customer VALUES('7412589637','Chennai');
INSERT INTO Customer VALUES('9321456874','Pune');
INSERT INTO Customer VALUES('8741236905','Chennai');
INSERT INTO Customer VALUES('7852364190','Delhi');

SELECT COUNT(customer_number) AS Cust_Count FROM Customer WHERE Customer_Place='Chennai';