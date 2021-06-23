USE db_generation_game_online;

-- select que retorna os personagens com o poder de ataque maior do que 2000 --
SELECT nome, ataque FROM tb_personagem 
	WHERE ataque > 2000;

-- select para retornar poder de defesa entre 1000 e 2000 --
SELECT nome "Nome" , defesa "Defesa" FROM tb_personagem 
	WHERE defesa >= 1000 AND defesa <= 2000;

-- select utilizando LIKE para encontrar personagens com a letra C --
SELECT nome "Nome:" FROM tb_personagem 
	WHERE nome  LIKE 'C%';
    
-- select com Inner join entre tabela classe e personagem --
SELECT * FROM tb_classe
	INNER JOIN tb_personagem ON tb_personagem.fk_classe = tb_classe.id_classe
    ORDER BY nome ASC;

-- select que retorna personagem de uma região especifica --
SELECT tb_personagem.nome "Nome:", tb_classe.regiao "Região:" 
	FROM tb_personagem
	INNER JOIN tb_classe ON tb_classe.id_classe = tb_personagem.fk_classe
    WHERE tb_classe.regiao = "Norte"
    ORDER BY tb_personagem.nome ASC;