USE db_construindo_a_nossa_vida;

INSERT INTO tb_categoria(tipo, ambiente)
	VALUES
    ("moveis", "sala"),
    ("moveis", "quarto"),
    ("contrução", "externo"),
    ("Decoração", "interno"),
    ("Construção", "interno");

INSERT INTO tb_produto(nome, duracao, preco, periodo, vagas, fk_categoria)
	VAlUES
    ("Matematica", 3, 15.000, "noturno", 30, 2),
	("Biologia", 5, 8.000, "diurno", 30, 2),
	("Tecnologia da informação", 2, 13.000, "integral", 30, 2),
	("Física", 4, 9.000, "noturno", 30, 2),
	("Geografia", 3, 10.000, "noturno", 30, 2),
	("História", 7, 2.000, "Integral", 30, 2),
	("portugues", 3, 1.000, "Diurno", 30, 2),
	("Pedagogia", 3, 150.000, "Integral", 30, 2);
    
SELECT * FROM tb_categoria;