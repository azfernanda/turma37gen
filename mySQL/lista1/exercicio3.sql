CREATE DATABASE db_escola;
USE db_escola;

CREATE TABLE tb_alunos(
	cod_aluno INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255),
    serie VARCHAR(255),
	disciplina VARCHAR(255),
    nota DOUBLE NULL,
    PRIMARY KEY(cod_aluno)
);

INSERT INTO tb_alunos(nome, serie, disciplina, nota) VALUES
("Letícia Barbosa","7ª","História", 10),
("José Maria", "5ª", "Matemática", 6.5),
("Larissa Manoela", "8ª", "Inglês", 8.5),
("Elton John", "7ª", "Música", 10),
("Brenda Carla", "8ª", "Física", 3),
("Ana Banana", "6ª", "Ciências", 9),
("Pedro Thiago", "5ª", "Literatura",5),
("Valentina Enza", "7ª", "Sociologia", 7.5)
;

SELECT * FROM tb_alunos WHERE nota>7;

SELECT * FROM tb_alunos WHERE nota<7;

UPDATE tb_alunos SET nota = 4 WHERE cod_aluno= 7;