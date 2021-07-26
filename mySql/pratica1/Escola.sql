create database escola_alunos;

use escola_alunos;

create table alunos(id_alunos int auto_increment primary key,nome char(10),idade int,nota double) ;

select * from alunos;

insert into alunos(nome,idade,nota)values
("Diego",17,10.0),
("joelma",21,10.0),
("Nanci",25,4.0),
("Ana",14,6.5),
("Maria",30,8.6),
("Laura",16,8.7);

select*from alunos where nota>=7.0;
select* from alunos where nota<=7.0;

update alunos set nota=3.2 where id_alunos='1';

