create database db_rh;
use db_rh;

create table tb_funcionarios(
id bigint (5) auto_increment,
nome  varchar(30) not null,
sexo enum('M','F','Outro'),
cargo varchar (30) not null,
salario double,
presente boolean,
primary key(id)
);

drop table tb_funcionarios;
 truncate tb_funcionarios;


insert into tb_funcionarios(nome,sexo,cargo,salario,presente)values("Ana ","M","Auxiliar Fiscal", 2000.00,true);
insert into tb_funcionarios(nome,sexo,cargo,salario,presente)values("luiza ","F","Trader", 10000.00,true);
insert into tb_funcionarios(nome,sexo,cargo,salario,presente)values("Maria ","F","Analista", 4000.00,true);
insert into tb_funcionarios(nome,sexo,cargo,salario,presente)values("Kleber","Outro","Asssitente", 3000.00,true);
insert into tb_funcionarios(nome,sexo,cargo,salario,presente)values("Mateus ","M","RH", 2500.00,true);
insert into tb_funcionarios(nome,sexo,cargo,salario,presente)values("Luna ","F","Sypervisora", 6000.00,true);

select *from tb_funcionarios;



select* from  tb_funcionarios where salario >= 2000;


  Update tb_funcionarios Set salario = 1900  where id = '1';

