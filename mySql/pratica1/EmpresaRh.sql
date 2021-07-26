create database empresa_rh;/*criei banco de dados*/

drop database empresa_rh;

use  empresa_rh;

create table funcionarios(id_funcionario int auto_increment primary key,nome char(30),cargo char(20),salario double);


select * from funcionarios;

drop table funcionarios;

insert into funcionarios (nome,cargo,salario) values
("Diego","Contador",2000),
("Joelma","chefe",10000),
("Nanci","Historiadora",500);

truncate table funcionarios;/*limpa a tabela*/

select * from funcionarios where salario>= 2000;
select*from funcionarios where salario<=2000;

update funcionarios set salario=50000 where id_funcionario='1';/*mudar salario pelo id*/
