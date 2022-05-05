USE `maveric22`;
DROP procedure IF EXISTS `add_customer`;

DELIMITER $$
USE `maveric22`$$
CREATE PROCEDURE `add_customer` (custid INT,custname varchar(45),email varchar(45),mobile BIGINT,addressid INT)
BEGIN
	 INSERT INTO CUSTOMER VALUES(custid,custname,email,mobile,addressid);
END$$

DELIMITER ;