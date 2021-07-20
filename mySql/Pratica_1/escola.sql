create database db_escola;
use db_escola;

create table tb_estudantes(
id bigint (5) auto_increment,
nome  varchar(30) not null,
idade int(3),
sexo enum('M','F','Outro'),
nota double,
presente boolean,
primary key(id)
);

drop table tb_funcionarios;
 truncate tb_funcionarios;


insert into tb_funcionarios(nome,idade,sexo,nota,presente)values("Ana ","7","F","8",true);
insert into tb_funcionarios(nome,idade,sexo,nota,presente)values("luiza","8","F","6",true);
insert into tb_funcionarios(nome,idade,sexo,nota,presente)values("Maria","7","F","8",true);
insert into tb_funcionarios(nome,idade,sexo,nota,presente)values("Kleber","7","M","10",true);
insert into tb_funcionarios(nome,idade,sexo,nota,presente)values("Mateus ","7","M","7",true);
insert into tb_funcionarios(nome,idade,sexo,nota,presente)values("Luna ","7","F","9",true);

select *from tb_funcionarios;



select* from  tb_estudantes where nota >= 7;


  Update tb_estudantes Set nota = 6  where id = '1';

