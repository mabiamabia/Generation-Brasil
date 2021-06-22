use db_farmacia_do_bem;

insert into tb_categoria(nome, tipo, quantidade)
values
("Higiene", "cotonetes", 200),
("remedio controlado", "mensal", 200),
("remedio dor", "dor de cabeça", 200),
("saude", "intimo", 200),
("perfumaria", "desodorante", 200);

insert into tb_produto(nome, preco, validade, tarja_preta,fk_categoria)
values
("CotoNilto", 6.50, 2022, false, 1),
("remedio de pressão", 125.90, 2023, true, 1),
("absorvente", 6.50, 2022, false, 3),
("dorflex", 3.50, 2040, false, 1),
("Psicofarmaco", 640.50, 2025, true, 2),
("Mascara", 3.50, 2022, false, 1),
("Rinosssoro", 4.90, 2022, false, 1),
("desodorante dove", 11.50, 2027, false, 1);

select * from tb_produto;
