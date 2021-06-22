-- populando a tabela --

USE db_cidade_das_frutas;

INSERT INTO tb_categoria(tipo_categoria, madura)
	VALUES
    ("da estação", false),
    ("importada", false),
    ("fora de epoca", true),
    ("importada", true),
    ("da estação", false),
    ("fora de epoca", true);
    
INSERT INTO tb_produto(nome, preco, cor, validade, fk_categoria)
	VALUES
    ("Manga", 5.00,"Amarela",06-06-21, 2),
	("Maça", 2.40,"vermelha",23-06-21, 2),
    ("pera", 11.00,"Amarela",12-07-21, 1),
    ("Banana", 5.00,"Amarela",06-06-21, 3),
    ("Limão", 5.00,"Verde",26-12-21, 2),
    ("Laranja", 3.00,"Laranja",06-06-2021, 5),
    ("Uva", 5.00,"Roxa",14-06-21, 2),
    ("Melancia", 20.00,"Vermelha",13-06-21, 2);
    
SELECT * FROM tb_produto;