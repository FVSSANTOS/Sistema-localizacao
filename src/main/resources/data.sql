create table tb_cidade (
    id_cidade bigint not null primary key,
    nome varchar(50) not null,
    qtd_habitantes bigint
);

insert into tb_cidade
    (id_cidade, nome, qtd_habitantes)
values
    (1,'Sao Paulo',12396372),
    (2,'Rio de Janeiro',10000000),
    (3,'Fortaleza',12396372),
    (4,'Salvador',12396372),
    (5,'Belo Horizonte',12396372),
    (6,'Porto Alegre',12396372),
    (7,'Porto Velho',12396372),
    (8,'Palmas',12396372),
    (9,'Recife',12396372);

  selext * from tb_cidade where nome like "%"  