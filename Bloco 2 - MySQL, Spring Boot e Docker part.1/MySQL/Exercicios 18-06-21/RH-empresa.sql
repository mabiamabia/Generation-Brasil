create database funcionaries;
show databases;
use funcionaries;
CREATE TABLE `funcionaries3` (
  `id` mediumint(8),
  `nome` varchar(255),
  `cargo` varchar(255),
  `cpf` mediumint(8),
  `salario` mediumint(8),
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;
show tables;
describe funcionaries3;

INSERT INTO `funcionaries3` (`id`,`nome`,`cargo`,`cpf`, `salario`) VALUES ('1',"Mario","Balconista",123447, 1000);
INSERT INTO `funcionaries3` (`id`,`nome`,`cargo`,`cpf`, `salario`) VALUES ('2',"Patricia","Garçonete",3521307, 1500);
INSERT INTO `funcionaries3` (`id`,`nome`,`cargo`,`cpf`, `salario`) VALUES ('3',"Jean","Cozinheiro",123456, 7000);
INSERT INTO `funcionaries3` (`id`,`nome`,`cargo`,`cpf`, `salario`) VALUES ('4',"Larissa","Cozinheira",76345, 7000);
INSERT INTO `funcionaries3` (`id`,`nome`,`cargo`,`cpf`, `salario`) VALUES ('5',"Ronaldo","Faxineiro",98214, 3000);
INSERT INTO `funcionaries3` (`id`,`nome`,`cargo`,`cpf`, `salario`) VALUES ('6',"Sara","Gerente",234123, 4000);
  
select * from funcionaries3;
select nome, salario, (salario > 2000) from funcionaries3;
select nome, salario, (salario < 2000) from funcionaries3;
update funcionaries3 set Mario=Marcos where nome=Marcos; 





