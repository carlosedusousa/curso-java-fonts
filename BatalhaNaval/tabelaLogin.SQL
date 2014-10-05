DROP DATABASE testes;
CREATE DATABASE testes;
USE testes;


DELETE FROM jogadores;
DROP TABLE jogadores;

CREATE TABLE jogadores (
id INT AUTO_INCREMENT,
nome VARCHAR(200),
senha VARCHAR(255),
pais  VARCHAR(255),
imagem INT,
medalhas INT,
vitorias INT,
derrotas INT,
totalJogos INT,
PRIMARY KEY(id),
INDEX (nome),
INDEX (senha)
);

INSERT INTO jogadores () VALUES (1,"usuario", "senha","Brasil",1,1,5,0,0);
INSERT INTO jogadores () VALUES (2,"teste", "123456","Italia",1,2,10,0,0);
INSERT INTO jogadores () VALUES (3,"root345", "asroot","USA",1,3,15,0,0);
INSERT INTO jogadores () VALUES (4,"root6576", "sdfroot","USA",1,4,20,0,0);
INSERT INTO jogadores () VALUES (5,"root789", "gfdroot","USA",1,2,10,0,0);
INSERT INTO jogadores () VALUES (6,"root890", "hgfroot","USA",1,5,25,0,0);
INSERT INTO jogadores () VALUES (7,"root-0", "nbvroot","USA",1,6,30,0,0);


SELECT * FROM jogadores;