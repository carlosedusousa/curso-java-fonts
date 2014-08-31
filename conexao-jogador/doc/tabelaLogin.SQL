#--DROP DATABASE testes;
#--CREATE DATABASE testes;
#--USE testes;

#Login
DELETE FROM logins;
DROP TABLE logins;

CREATE TABLE logins (
id INT AUTO_INCREMENT,
usuario VARCHAR(200),
senha VARCHAR(255),
PRIMARY KEY(id)
);

INSERT INTO logins () VALUES (1,"usuario", "senha");
INSERT INTO logins () VALUES (2,"teste", "teste");
INSERT INTO logins () VALUES (3,"root", "root");

SELECT * FROM logins;