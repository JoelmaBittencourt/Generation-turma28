create database jogos_online;

use jogos_online;

create table tb_classe(id_classe int auto_increment primary key,nomeClasse char(10));

select*from tb_classe;

insert into tb_classe(nomeClasse) values

("cavaleiro"),
("arqueiro"),
("gaviao"),
("mago"),
("girlpower");


create table tb_personagem(id_personagem int auto_increment primary key,
nome char(10),
ataque int,
defesa int,
id_classe int,
 constraint fk_classe foreign key(id_classe)references tb_classe(id_classe));

select*from tb_personagem;

insert into tb_personagem(nome,ataque,defesa,id_classe) values
("Diego",1000,1000,3),
("joelma",5000,2000,5),
("nanci",3000,1000,1),
("maria",4000,8000,4),
("ana",3000,2000,1);

select nome,ataque,defesa,nomeClasse from tb_personagem inner join tb_classe on tb_classe.id_classe = tb_personagem.id_classe where ataque>2000;

select* from tb_personagem inner join tb_classe on tb_classe.id_classe = tb_personagem.id_classe where defesa>2000;

select* from tb_personagem inner join tb_classe on tb_classe.id_classe = tb_personagem.id_classe where nome like '%A%';