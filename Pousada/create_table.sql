drop sequence sq_reserva;
drop table tb_reserva;
drop table tb_quarto;

create table tb_quarto (
	numero number(2) primary key not null,
	categoria varchar(100) not null,
	max_pessoas number(2) not null,
	valor_diaria number(5,2) not null
);

create table tb_reserva (
	id number primary key not null,
	id_quarto number not null,
	data_entrada date not null,
	data_saida date not null,
	qtde_pessoas number not null,
	constraint fk_quarto foreign key (id_quarto) references tb_quarto(numero)
);

create sequence sq_reserva increment by 1 start with 1 nocycle order;