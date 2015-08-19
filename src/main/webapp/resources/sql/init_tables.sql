DROP SCHEMA IF EXISTS CALORIZER;

CREATE SCHEMA CALORIZER;
USE CALORIZER;

CREATE TABLE USERS (
    ID INT(6) NOT NULL AUTO_INCREMENT,
    EMAIL VARCHAR(250) NOT NULL,
    PASSWORD VARCHAR(50) NOT NULL,
	REGISTRATION_DATE TIMESTAMP NOT NULL,
    PRIMARY KEY (ID),
    UNIQUE INDEX EMAIL (EMAIL)
) COLLATE='utf8_general_ci' ENGINE=InnoDB AUTO_INCREMENT=1;
 
CREATE TABLE ROLES (
    ID        INT(6) NOT NULL AUTO_INCREMENT,
    ROLENAME  VARCHAR(50) NOT NULL,
    PRIMARY KEY (ID),
    UNIQUE INDEX ROLENAME (ROLENAME)
) COLLATE='utf8_general_ci' ENGINE=InnoDB AUTO_INCREMENT=1;
 
CREATE TABLE USER_ROLES (  
    USER_ID INT(6) NOT NULL,  
    ROLE_ID INT(6) NOT NULL,  
    KEY USER (USER_ID),  
    KEY ROLE (ROLE_ID),  
    CONSTRAINT UR_FK_USER FOREIGN KEY (USER_ID) REFERENCES USERS (ID) ON DELETE CASCADE ON UPDATE CASCADE,  
    CONSTRAINT UR_FK_ROLE FOREIGN KEY (ROLE_ID) REFERENCES ROLES (ID) ON DELETE CASCADE ON UPDATE CASCADE 
) COLLATE='utf8_general_ci' ENGINE=InnoDB;