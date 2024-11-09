Create Database Axisbank;
Use Axisbank;
CREATE TABLE axisbank_customer (customer_id INT PRIMARY KEY,
customerName VARCHAR(20), state Varchar(20),
balance FLOAT Not null, credit_limit INT,
applicable BOOLEAN, cvv INT,
expiry_date DATE not null, kyc_status VARCHAR(20));

Insert into axisbank_customer values( 01, "Poornachandra","Karnataka" ,10000.80, 30000, 1, 255,'2026-05-20', "Verified"),
( 02, "Vishnu","Telangana",60000 ,15000, 1, 325,'2026-08-20', "Pending"),
( 03, "Charan","Telangana",81000, 40000, 1, 319,'2027-02-01', "Verified"),
( 04, "Vaibhav","Maharastra",61000.50, 24000, 0, 115,'2024-12-08', "Verified"),
( 05, "Bhavya","Telangana",55000, 21000, 1, 221,'2028-04-11', "Verified"),
( 06, "Ranbir","Maharastra",82000, 40000, 0, 333,'2027-02-01', "Pending"),
( 07, "Shashank","Punjab",6000, 80000, 0, 312,'2026-01-02', "Verified"),
( 08, "Ranveer","Goa",15000,10000, 1, 212,'2025-02-20', "Verified"),
( 09, "Pooja","Telangana",2000, 10000, 0, 691,'2025-03-01', "Pending"),
( 10, "Pranav","Karnataka",35000, 20000, 0, 302,'2026-06-12', "Verified"),
( 11, "Rohan","Goa",18000, 15000, 1, 123,'2028-11-09', "Verified"),
( 12, "Arjun","Punjab",91100, 100000, 1, 552,'2026-05-19', "Verified"),
( 13, "Yash","Bihar",8000, 8000, 0, 229,'2025-01-21', "Pending"),
( 14, "Aryan","Gujrat",55000, 40000, 1, 619,'2027-06-21', "Verified"),
( 15, "Paras","Kerala",13000.10, 25000, 1, 220,'2025-01-23', "Verified"),
( 16, "Rohit","Bihar", 19000, 60000, 1, 751,'2026-06-05', "Verified"),
( 17, "Abhishek","Maharastra",68000, 70000, 1, 654,'2024-11-14', "Verified"),
( 18, "Pruthvi","Assam",91000, 80000, 0, 181,'2024-11-20', "Verified"),
( 19, "Neha","Kerala",9100, 40000, 1, 329,'2024-12-01', "Pending"),
( 20, "Tanvi","Assam",22000, 50000, 1,564,'2027-12-01', "Verified");

SELECT * 
FROM axisbank_customer;

SELECT * 
FROM axisbank_customer
WHERE kyc_status = 'Verified';

SELECT SUM(balance) Sum_Balance
FROM axisbank_customer
WHERE kyc_status = 'Verified';

SELECT AVG(balance) Avg_Balance, State
FROM axisbank_customer
GROUP BY State;

SELECT customerName
FROM axisbank_customer
WHERE credit_limit > 45000;

SELECT customerName
FROM axisbank_customer
WHERE credit_limit > 50000
AND expiry_date > '2025-12-31';




