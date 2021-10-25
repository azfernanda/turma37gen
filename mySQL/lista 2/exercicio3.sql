CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categoria (
    id_categoria INT AUTO_INCREMENT,
    cliente VARCHAR(255) NOT NULL,
    tipo_produto ENUM ('Cosmético', 'Remédio'),
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto (
    id_produto INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    quantidade INT NOT NULL,
    marca VARCHAR(255) NOT NULL,
    valor DOUBLE NOT NULL,
    fk_id_categoria INT,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria (id_categoria)
    );

INSERT INTO tb_categoria (cliente, tipo_produto) VALUES
("Barbara", "Cosmético"),
("Maria Luiza", "Remédio"),
("Mayara", "Remédio"),
("Danillo", "Cosmético"),
("Cecilia", "Remédio");

SELECT * FROM tb_categoria;

INSERT INTO tb_produto(nome, quantidade, marca, valor, fk_id_categoria) VALUES
("Dorflex", 10, "Dolorex", 10.00, 2),
("Band-Aid", 10, "Needs", 21.00, 2),
("Shampoo", 375, "Seda", 27.00, 1),
("Dipirona", 12, "Prati", 3.00, 2),
("Sabonete facial", 240, "Darrow", 60.00, 1),
("Histamin", 20, "Neo Química", 10.00, 2),
("Absorvente", 1, "Always", 32.00, 1),
("Coletor menstrual", 1, "Feministy", 13.00, 1);

SELECT * FROM tb_produto ;

SELECT * FROM tb_produto WHERE valor > 50.00 ;

SELECT * FROM tb_produto WHERE valor > 3.00 AND valor < 50.00 ;

SELECT * FROM tb_produto WHERE nome LIKE 'b%' ;

SELECT * FROM tb_categoria INNER JOIN tb_produto
ON tb_produto.fk_id_categoria = tb_categoria.id_categoria;

SELECT * FROM tb_categoria INNER JOIN tb_produto
ON tb_produto.fk_id_categoria = tb_categoria.id_categoria WHERE id_categoria = 2;