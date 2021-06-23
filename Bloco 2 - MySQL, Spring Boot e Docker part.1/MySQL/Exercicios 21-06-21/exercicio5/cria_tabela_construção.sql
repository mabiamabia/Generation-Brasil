create database db_construindo_a_nossa_vida;
USE db_construindo_a_nossa_vida;

-- criação das tabelas --

CREATE TABLE tb_categoria(
id_categoria INT AUTO_INCREMENT,
tipo VARCHAR(200),			-- construção, decoração
ambiente varchar(200),			-- cozinha, sala, quarto
PRIMARY KEY(id_categoria)
);

CREATE TABLE tb_produto(
id_produto INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(200) NOT NULL,
marca VARCHAR(200) NOT NULL,
preco FLOAT NOT NULL,
material VARCHAR(200) NOT NULL,
quantidade INT NOT NULL,
fk_categoria INT,
PRIMARY KEY(id_produto),
FOREIGN KEY(fk_categoria) REFERENCES tb_categoria(id_categoria)
);

select * from tb_produto;
