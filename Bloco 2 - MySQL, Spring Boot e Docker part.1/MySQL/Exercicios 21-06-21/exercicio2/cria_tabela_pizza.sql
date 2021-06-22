CREATE database db_pizzaria_legal;

use db_pizzaria_legal;



CREATE TABLE tb_categoria(
id_categoria INT AUTO_INCREMENT,
tipo_especial VARCHAR(200), 			-- doce, salgada, mista
quantidade INT not null,
primary key(id_categoria)
);

create TABLE tb_pizza(
id_pizza INT not null AUTO_INCREMENT,
nome_pizza VARCHAR(200),
tamanho VARCHAR(200), 	-- pequeno, medio, grande
preco FLOAT not NULL,
sabor VARCHAR(200),
borda BOOLEAN,
fk_categoria INT not null,
PRIMARY KEY(id_pizza),
FOREIGN KEY(fk_categoria) REFERENCES tb_categoria(id_categoria)
);

select * from tb_pizza;
