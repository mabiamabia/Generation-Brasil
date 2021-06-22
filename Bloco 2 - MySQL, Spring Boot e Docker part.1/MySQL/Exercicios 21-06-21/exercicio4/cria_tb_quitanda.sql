-- criação do banco de dados --

CREATE DATABASE db_cidade_das_frutas; 
USE db_cidade_das_frutas; 

-- criação das tabelas --

CREATE TABLE tb_categoria(
id_categoria INT AUTO_INCREMENT,
tipo_categoria VARCHAR(200),    -- fruta da estação, fora de epoca, importada
Madura BOOLEAN,
PRIMARY KEY(id_categoria)
);

CREATE TABLE tb_produto(
id_produto INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(200) NOT NULL,
preco FLOAT NOT NULL,
cor VARCHAR(200) NOT NULL,
validade INT NOT NULL,
fk_categoria INT,
PRIMARY KEY(id_produto),
FOREIGN KEY(fk_categoria) REFERENCES tb_categoria(id_categoria)
);

select * from tb_produto;