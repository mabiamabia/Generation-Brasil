-- populando tabelas

use db_pizzaria_legal;

insert into tb_categoria(tipo_especial, quantidade)
values
("salgada", 2),
("salgada", 6),
("doce", 1),
("salgada", 2),
("mista", 4);

insert into tb_pizza(nome_pizza, tamanho, preco, sabor, borda, fk_categoria)
values
("Portuguesa", "Grande", 18.99, "queijo e manjericão", true, 1),
("Vegetariana", "pequena", 19.99, "tomate e milho", false, 1),
("Marguerita", "Grande", 23.99, "queijo e manjericão e tomate", true, 1),
("Brigadeiro", "media", 34.99, "chocolate e coco ralado", false, 2),
("Nutella", "Grande", 15.99, "nuttela e morango", true, 2),
("4 queijos", "Grande", 29.99, "queijo mussarela e queijo prato", false, 1),
("Havanna", "media", 28.99, "brocolis e alho", true, 3),
("Por do sol", "pequena", 15.99, "milho e catupiry", true, 3);

select * from tb_pizza;

-- select * from tb_pizza.preco < 20.00;

-- tb_pizza.preco > 29.00 and tb_pizza.preco < 60;

