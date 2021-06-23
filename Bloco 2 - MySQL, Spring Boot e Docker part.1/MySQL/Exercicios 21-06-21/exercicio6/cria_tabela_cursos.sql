create database db_cursoDaMinhaVida;
USE db_cursoDaMinhaVida;

-- criação das tabelas --

CREATE TABLE tb_categoria(
id_categoria INT AUTO_INCREMENT,
segmento VARCHAR(200),			-- construção, decoração
tipo boolean,			-- ead, presencial, meio
PRIMARY KEY(id_categoria)
);

CREATE TABLE tb_produto(
id_produto INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(200) NOT NULL,
duracao INT NOT NULL,
preco FLOAT NOT NULL,
periodo VARCHAR(200) NOT NULL, -- integral, diurno, noturno
vagas INT NOT NULL,
fk_categoria INT,
PRIMARY KEY(id_produto),
FOREIGN KEY(fk_categoria) REFERENCES tb_categoria(id_categoria)
);

select * from tb_produto;
