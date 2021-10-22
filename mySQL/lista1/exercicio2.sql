CREATE DATABASE db_ecommerce;
USE db_ecommerce;

CREATE TABLE tb_produtos(
	cod_produto INT NOT NULL AUTO_INCREMENT,
    item VARCHAR(255),
    cor VARCHAR(255),
    tamanho VARCHAR(255),
    valor DOUBLE NULL,
    PRIMARY KEY(cod_produto)
);

INSERT INTO tb_produtos(item, cor, tamanho, valor) VALUES
("Sofá-cama","bege","3 lugares",1200.00),
("Cama box", "branca", "Queen", 499.00),
("Microondas", "inox", "26 litros", 350.00),
("Air fryer", "preta", "4 litros", 400.00),
("Notebook", "grafite", "15 polegadas", 3500.00),
("Bicicleta", "verde", "Aro 29", 1300.00),
("Tv Smart", "preta", "50 polegadas", 3000.00),
("Smartphone", "vermelho", "13 polegadas", 1200.00)
;

SELECT * FROM tb_produtos WHERE valor>500;

SELECT * FROM tb_produtos WHERE valor<500;

UPDATE tb_produtos SET cor = "amarela" WHERE cod_produto= 6;