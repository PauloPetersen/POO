CREATE TABLE cliente(codigo serial PRIMARY KEY, nome varchar(50),
telefone varchar(11), email varchar(40) unique;

INSERT INTO cliente (nome, telefone, email) VALUES('Adriano', '2322323', 'a@hotmail.com'),
												  ('Adriana', '23223233', 'adriana@hotmail.com'),
												  ('Catarina', '2422323', 'catarina@hotmail.com');