create database db_comercio;
use db_comercio;

create table tb_produtos(
 idproduto bigint(5) auto_increment,
 nomeproduto varchar(20) not null,
 descricao varchar(20),
 setordeproducao varchar(20),
 codigodebarra int,
 valor double,
 primary key(idproduto)
 
  );
  
  select * from tb_produtos;
  
  truncate tb_produtos;
  
  insert into tb_produtos (nomeproduto,descricao,setordeproducao,codigodebarra,valor)values("Iphone","celular","apple", 457842154, 2000);
  insert into tb_produtos (nomeproduto,descricao,setordeproducao,codigodebarra,valor)values("bananafone ","que vem da bananeira","frutatech", 548751244, 450);
  insert into tb_produtos (nomeproduto,descricao,setordeproducao,codigodebarra,valor)values("tv ","1080 hd","televisão", 587144584, 4000.50);
  insert into tb_produtos (nomeproduto,descricao,setordeproducao,codigodebarra,valor)values("mia3","celular 48 mp"," xiaomi", 45744445, 1000.50);
  insert into tb_produtos (nomeproduto,descricao,setordeproducao,codigodebarra,valor)values(" camera "," 50 mp","fotografia", 54781245, 999.50);
  insert into tb_produtos (nomeproduto,descricao,setordeproducao,codigodebarra,valor)values("motox ","celular","motorola", 54878524, 950.50);
  insert into tb_produtos (nomeproduto,descricao,setordeproducao,codigodebarra,valor)values("roda "," de carro","veiculo", 45478412, 179.50);
  insert into tb_produtos (nomeproduto,descricao,setordeproducao,codigodebarra,valor)values("sapato","de pe","calçado", 45145751, 49.99);
  
  
  select* from  tb_produtos where valor >= 500;
  
  select* from  tb_produtos where valor <= 500;
  
  Update tb_produtos Set valor = 499  where idproduto = '2';
  
  

  
  
  
