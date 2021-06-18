
create database comercio;
use comercio;
CREATE TABLE `produtos` (
  `id` mediumint(8),
  `nome` varchar(255),
  `marca` varchar(255),
  `preco` mediumint(8),
  `quantidade` mediumint(8),
  PRIMARY KEY (`id`)
);
INSERT INTO `produtos` (`id`,`nome`,`marca`,`preco`, `quantidade`) VALUES ('1',"Sabonte","Bom Cheiro",2, 830);
INSERT INTO `produtos` (`id`,`nome`,`marca`,`preco`, `quantidade`) VALUES ('2',"Pente","Keda",2, 830);
INSERT INTO `produtos` (`id`,`nome`,`marca`,`preco`, `quantidade`) VALUES ('3',"Escova","Tolgate",2, 830);
INSERT INTO `produtos` (`id`,`nome`,`marca`,`preco`, `quantidade`) VALUES ('4',"Desodorante","Bom Cheiro",2, 830);
INSERT INTO `produtos` (`id`,`nome`,`marca`,`preco`, `quantidade`) VALUES ('5',"Condicionador","Keda",2, 830);
INSERT INTO `produtos` (`id`,`nome`,`marca`,`preco`, `quantidade`) VALUES ('6',"Pasta de dente","Tolgate",2, 830);

select * from produtos;
select nome, preco, (preco > 500) from produtos;
select nome, preco, (preco < 500) from produtos;
update produtos set marca=Sabonete where quantidade=600; 

