CREATE TABLE demo.customer
( `id` BIGINT(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `name` VARCHAR(255) DEFAULT  NULL ,
  `contact` VARCHAR(255) DEFAULT  NULL ,
  `telephone` VARCHAR(255) DEFAULT NULL ,
  `email` VARCHAR(255) DEFAULT NULL ,
  `remark` TEXT
) ;


INSERT INTO customer  VALUES ('1','customer1','Jack','13888889999','12@gmail.com',NULL );
INSERT INTO customer  VALUES ('2','customer2','Mum','13888889999','12@gmail.com',NULL );

SELECT * FROM customer;