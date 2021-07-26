create database comercio_produtos;

use comercio_produtos;

create table produtos(id_produtos int auto_increment primary key,nome char(10),descriçao char(30),preço double);

select*from produtos;

insert into produtos(nome,descriçao,preço)values
("shampoo","extrato de laranja",100),
("condicionador","extrato de flores",40),
("mascara","extrato de limao",55),
("creme de pentear","extrato de rosas",30);

select*from produtos where preço>=50;	
select*from produtos where preço<50;

update produtos set preço=40 where id_produtos='4';