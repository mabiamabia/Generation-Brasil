create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
id_categoria INT not null AUTO_INCREMENT,
nome VARCHAR(200),
tipo VARCHAR(200),
quantidade INT not null,
PRIMARY KEY(id_categoria)
);

create table tb_produto(
id_produto INT not null AUTO_INCREMENT,
nome VARCHAR(200),
preco INT not null,
validade INT not null,
tarja_preta boolean,
fk_categoria INT not null,
PRIMARY KEY(id_produto),
FOREIGN KEY(fk_categoria) references tb_categoria(id_categoria)
);



