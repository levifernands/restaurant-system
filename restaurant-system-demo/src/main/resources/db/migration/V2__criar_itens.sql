CREATE TABLE tb_itens (
	id int8 NOT NULL,
	name varchar(255) NOT NULL,
	description varchar(255) NOT NULL,
	price double NOT NULL,
	CONSTRAINT tb_itens_pkey PRIMARY KEY (id)
);

insert into tb_itens(id, name, description, price) values (1,  'Item 1', 'Este é o primeiro item teste do cardápio', 20.99);