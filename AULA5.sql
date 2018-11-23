-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;
-- -----------------------------------------------------
-- Table `mydb`.`UF`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`UF` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(2) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table `mydb`.`CIDADE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`CIDADE` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `uf_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_CIDADE_UF_idx` (`uf_id` ASC) ,
  CONSTRAINT `fk_CIDADE_UF`
    FOREIGN KEY (`uf_id`)
    REFERENCES `mydb`.`UF` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
INSERT INTO UF (NOME)
VALUES("AM"),("BA"),("CE"),("DF"),("ES"),("GO"),("MA"),("MT"),("MS"),("MG"),("PA"),("PB"),("PR"),("PE"),("PI"),
		("RJ"),("RN"),("RS"),("RO"),("RR"),("SC"),("SP"),("SE"),("TO");
SELECT * FROM UF;
-- 2)
INSERT INTO CIDADE (NOME,UF_ID)
VALUES ("Chapecó",21),("Blumenau",21),("Joinville",21);

INSERT INTO CIDADE (NOME,UF_ID)
VALUES ("Curitiba",13),("Maringá",13),("Lunardeli",13),("Apucarana",13),("Santa fé",13),("São Miguel do Iguaçu",13),("Arapongas",13),
		("Ponta Grossa",13),("Jandaia do Sul",13);

INSERT INTO CIDADE (NOME,UF_ID)
VALUES ("Ribeirão Preto",22);

SELECT * FROM CIDADE;

delete from uf where id in (
select * from (select uf.id from uf left join cidade on cidade.uf_id = uf.id where cidade.uf_id is null) as u
);


INSERT INTO CIDADE (nome,uf_id)
VALUES("Carapicuiba",22);


INSERT INTO CIDADE (nome,uf_id)
VALUES("GFG",22);

INSERT INTO CIDADE (nome,uf_id)
VALUES("NOME",80);




/*5 - Realize a atualização do nome das cidades:
* Lunardeli para Lunardelli
* Jandaia do Sul para Jandaia
* Maringá para Cidade Canção
*/

UPDATE CIDADE
SET NOME='Jandaia'
WHERE NOME='Jandaia do sul';

SELECT NOME FROM CIDADE WHERE NOME = "Lunardeli";


UPDATE CIDADE
SET NOME='outro'
WHERE NOME='Lunardeli';

/*6 - Faça um select que retorne o nome das cidades e seus respectivos estados. Ordene por estados e posteriomente pelo nome das cidades 
*/

SELECT CIDADE.NOME,UF_ID,UF.NOME
FROM CIDADE,UF
ORDER BY UF.NOME;

SELECT CIDADE.NOME,UF_ID,UF.NOME
FROM CIDADE,UF
ORDER BY CIDADE.NOME;
/*/**/

SELECT C.NOME,U.NOME FROM CIDADE C
INNER JOIN UF U ON U.ID = C.UF_ID
ORDER BY U.NOME,C.NOME;

/*7 - Retorne quantas cidades cada estado possui :) (não expliquei ainda)
dica: veja group by e count()*/

SELECT COUNT(UF_ID)
FROM CIDADE
WHERE CIDADE = 13;

ALTER TABLE ENDERECO
MODIFY COLUMN TIPO VARCHAR(10) NULL;
