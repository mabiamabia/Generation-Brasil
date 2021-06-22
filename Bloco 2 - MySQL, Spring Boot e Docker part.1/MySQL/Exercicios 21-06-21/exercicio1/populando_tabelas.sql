-- populando a tabela --

USE db_generation_game_online;

INSERT INTO tb_classe(regiao, realeza)
	VALUES
    ("Norte", false),
    ("O vale", false),
    ("Ilhas de ferro", false),
    ("Rochedo Casterly", true),
    ("Jardim de cima", false),
    ("Dorne", false);
    
INSERT INTO tb_personagem(nome, casa, habilidade, caracteristica, ataque, defesa, numero_pessoas)
	VALUES
    ("Daenerys", "Targaryen","Fogo","Dragão", 2400, 6000, 2),
	("Jon Snow", "Baratheon","Fogo","Dragão",6000, 3800, 2),
	("Sansa", "Stark","Fogo","Dragão",1000, 560, 7),
	("Cersei", "Lannister","Fogo","Dragão",8000, 9000, 6),
	("Tyrion", "Lannister","Fogo","Dragão",560, 340, 6),
	("Oberyn", "Martell","Fogo","Dragão",3000, 2700, 5),
	("Robert", "Baratheon","Fogo","Dragão", 150, 760, 2);
    
SELECT * FROM tb_personagem;
    
