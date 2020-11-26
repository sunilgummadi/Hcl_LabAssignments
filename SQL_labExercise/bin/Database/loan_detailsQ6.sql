CREATE DATABASE IF NOT EXISTS hcl;
DROP TABLE IF EXISTS Loan_Details;
DROP TABLE IF EXISTS Account_Master;
DROP TABLE IF EXISTS Customer_Master;



CREATE TABLE IF NOT EXISTS Customer_Master(customer_number VARCHAR(10) NOT NULL,customer_first_name VARCHAR(125) NOT NULL,customer_last_name VARCHAR(125),PRIMARY KEY (customer_number));
CREATE TABLE IF NOT EXISTS Account_Master(account_number BIGINT NOT NULL,account_opening_date DATE NOT NULL,customer_number VARCHAR(10) NOT NULL,PRIMARY KEY(account_number),FOREIGN KEY (customer_number) REFERENCES Customer_Master(customer_number));
CREATE TABLE IF NOT EXISTS Loan_Details(customer_number VARCHAR(10) NOT NULL,FOREIGN KEY (customer_number) REFERENCES Customer_Master(customer_number));
																			 

INSERT INTO Customer_Master VALUES('7995039932','Sunil Kumar','Gummadi');
INSERT INTO Customer_Master VALUES('8106353369','Chaitanya','Ampolu');
INSERT INTO Customer_Master VALUES('8341414502','Surya','Gambali');
INSERT INTO Customer_Master VALUES('9177887377','Teja','Boddu');
INSERT INTO Customer_Master VALUES('8841414502','Cherry','Gompa');
INSERT INTO Customer_Master VALUES('9977887377','Murali','Boddu');

INSERT INTO Account_Master VALUES(325416897142,'2020-11-23','7995039932');
INSERT INTO Account_Master VALUES(325416797143,'2020-10-03','8106353369');
INSERT INTO Account_Master VALUES(325416897144,'2019-05-23','9177887377');
INSERT INTO Account_Master VALUES(325416897045,'2019-07-13','8341414502');

INSERT INTO Loan_Details VALUES('8106353369');
INSERT INTO Loan_Details VALUES('8841414502');
INSERT INTO Loan_Details VALUES('9977887377');

SELECT count(ld.customer_number) Count
FROM Customer_Master cm INNER JOIN Loan_Details ld
ON  cm.customer_number=ld.customer_number
WHERE cm.customer_number NOT IN ( SELECT customer_number FROM Account_Master);
--prints 2
