CREATE DATABASE IF NOT EXISTS hcl;
DROP TABLE IF EXISTS Account_Master;
DROP TABLE IF EXISTS Customer_Master;
CREATE TABLE IF NOT EXISTS Customer_Master(customer_number VARCHAR(10) NOT NULL,customer_first_name VARCHAR(125) NOT NULL,customer_last_name VARCHAR(125),PRIMARY KEY (customer_number));
CREATE TABLE IF NOT EXISTS Account_Master(account_number BIGINT NOT NULL,account_opening_date DATE NOT NULL,customer_number VARCHAR(10) NOT NULL,PRIMARY KEY(account_number),FOREIGN KEY (customer_number) REFERENCES Customer_Master(customer_number));
DESC Account_Master;

INSERT INTO Customer_Master VALUES('7995039932','Sunil Kumar','Gummadi');
INSERT INTO Customer_Master VALUES('8106353369','Sunil Kumar','Gummadi');
INSERT INTO Customer_Master VALUES('9177887377','Sunil Kumar','Gummadi');
INSERT INTO Customer_Master VALUES('8341414502','Sunil Kumar','Gummadi');
INSERT INTO Account_Master VALUES(325416897142,'2020-11-23','7995039932');
INSERT INTO Account_Master VALUES(325416797143,'2020-10-03','8106353369');
INSERT INTO Account_Master VALUES(325416897144,'2019-05-23','9177887377');
INSERT INTO Account_Master VALUES(325416897045,'2019-07-13','8341414502');

SELECT am.account_number,am.customer_number,cm.customer_first_name,cm.customer_last_name,am.account_opening_date
FROM Customer_Master cm INNER JOIN Account_Master am
ON cm.customer_number=am.customer_number
ORDER BY account_number