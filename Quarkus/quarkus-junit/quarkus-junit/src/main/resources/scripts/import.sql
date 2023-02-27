-- Incluir aqui o script de carga DML e DDL do seu modelo de banco de dados.
CREATE SCHEMA IF NOT EXISTS teste AUTHORIZATION sa;

CREATE TABLE IF NOT EXISTS teste.USUARIOS (
   id BIGINT NOT NULL,
   nome VARCHAR(100) NOT NULL,
   sexo VARCHAR(100) NOT NULL,
   PRIMARY KEY (id)
);

-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
DELETE teste.USUARIOS;

INSERT INTO teste.USUARIOS (id, nome, sexo) VALUES(1, 'Murilo', 'Masculino');
INSERT INTO teste.USUARIOS (id, nome, sexo) VALUES(2, 'Anaryel', 'Feminino');




