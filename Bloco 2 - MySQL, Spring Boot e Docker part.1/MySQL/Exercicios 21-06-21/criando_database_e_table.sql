-- criação do banco de dados --

CREATE DATABASE db_generation_game_online; 
USE db_generation_game_online;

-- criação das tabelas --

CREATE TABLE tb_classe(
id_classe INT AUTO_INCREMENT,
regiao VARCHAR(200),
realeza BOOLEAN,
PRIMARY KEY(id_classe)
);

CREATE TABLE tb_personagem(
id_persona INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(200) NOT NULL,
casa VARCHAR(200) NOT NULL,
habilidade VARCHAR(200) NOT NULL,
caracteristica VARCHAR(200) NOT NULL,
ataque INT NOT NULL,
defesa INT NOT NULL,
numero_pessoas INT NOT NULL,
fk_classe INT,
PRIMARY KEY(id_persona),
FOREIGN KEY(fk_classe) REFERENCES tb_classe(id_classe)
);

select * from tb_classe;


