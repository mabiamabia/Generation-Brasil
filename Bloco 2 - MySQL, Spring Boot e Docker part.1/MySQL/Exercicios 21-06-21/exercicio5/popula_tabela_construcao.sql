USE db_construindo_a_nossa_vida;

INSERT INTO tb_categoria(tipo, ambiente)
	VALUES
    ("moveis", "sala"),
    ("moveis", "quarto"),
    ("contrução", "externo"),
    ("Decoração", "interno"),
    ("Construção", "interno");

INSERT INTO tb_produto(nome, marca, preco, material, quantidade, fk_categoria)
	VAlUES
    ("Mesinha Castlevania", "madeirory", 120.00, "madeira", 15, 2),
    ("cama king", "Lua", 360.00, "estofado", 34, 1),
    ("cimento goodbom", "caroy", 13.00, "argila", 12, 3),
    ("cal", "caroy", 23.00, "pó", 123, 3),
    ("abajur", "eletrix", 108.99, "pano", 125, 2),
    ("cadeira", "madeirory", 60.00, "madeira", 5, 2),
    ("cortinas", "CasaMais", 65.00, "tecido", 8, 2),
    ("banco", "Ludacris",35.00, "plastico", 5, 2);
    
SELECT * FROM tb_produto;