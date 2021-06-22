
create database escola;
use escola;
CREATE TABLE `alunes` (
  `id` mediumint(8),
  `nome` varchar(255),
  `idade` mediumint(8),
  `serie` mediumint(8),
  `notaFinal` mediumint(8),
  PRIMARY KEY (`id`)
);
INSERT INTO `alunes` (`id`,`nome`,`idade`,`serie`, `notaFinal`) VALUES ('1',"Maria", 14 , 8 , 9);
INSERT INTO `alunes` (`id`,`nome`,`idade`,`serie`, `notaFinal`) VALUES ('2',"Joao", 12 , 6 , 5);
INSERT INTO `alunes` (`id`,`nome`,`idade`,`serie`, `notaFinal`) VALUES ('3',"Pedro", 17 , 2 , 8);
INSERT INTO `alunes` (`id`,`nome`,`idade`,`serie`, `notaFinal`) VALUES ('4',"Bianca", 9 , 3 , 10);
INSERT INTO `alunes` (`id`,`nome`,`idade`,`serie`, `notaFinal`) VALUES ('5',"Rosalinda", 13 , 7 , 10);
INSERT INTO `alunes` (`id`,`nome`,`idade`,`serie`, `notaFinal`) VALUES ('6',"Lucinda", 16 , 1 , 4);

select * from alunes;
select nome, notaFinal, (notaFinal > 7) from alunes;
select nome, notaFinal, (notaFinal < 7) from alunes;
update funcionaries3 set Mario=Marcos where nome=Marcos; 
