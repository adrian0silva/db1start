/*1 - faça insert na tabela UF com todas as siglas dos estados do Brasil.
2 - insira as seguintes cidades:
Para o SC
* Chapecó
* Blumenau
* Joinville

Para o PR
* Curitiba
* Maringá
* Lunardeli
* Apucarana
* Santa fé
* São Miguel do Iguaçu
* Arapongas
* Ponta Grossa
* Jandaia do Sul

Para o SP
*Ribeirão Preto

3 - Realize a remoção dos estados que não tem cidades

4 - Insira novas cidades no estado de SP

5 - Realize a atualização do nome das cidades:
* Lunardeli para Lunardelli
* Jandaia do Sul para Jandaia
* Maringá para Cidade Canção

6 - Faça um select que retorne o nome das cidades e seus respectivos estados. Ordene por estados e posteriomente pelo nome das cidades 

7 - Retorne quantas cidades cada estado possui :) (não expliquei ainda)
dica: veja group by e count()

8 - Insira tres pessoas na base de dados. Cada uma destas pessoas deve ter dois enderecos (um comercial e outro residencial). As cidades que devem ser usadas são do estado do PR (você escolhe).

9 -Insira duas pessoas na base de dados. Cada uma destas pessoas deve ter dois enderecos (um comercial e outro residencial). As cidades que devem ser usadas são do estado de SP (você escolhe).

10 - Insira duas pessoas na base de dados. Cada uma destas pessoas deve ter um endereco do tipo comercial. As cidades que devem ser usadas são do estado de SC (você escolhe).

11 - Faça um select que retorne o nome das pessoas e seus respectivos enderecos (com cidade e estado). Ordene por nome de pessoa, nome do estado e nome da cidade

12 - remova todos as pessoas que tem endereço da cidade de Ribeirão Preto

13 - Mude todos os endereços residenciais do sistema. Eles devem ter cep 00000000

14 - altere o nome da coluna prestador_fk para cliente_fk. 

15 - Insira dois recibos sendo que eles devem ter clientes residentes no PR e o prestador de servico deve ser o mesmo (não importando o estado). Exemplo: 
* cliente fusca, da cidade curitiba, no PR. Prestador: DB1, estado PR.
* cliente tamara, da cidade maringá, no PR. Prestador: DB1, estado PR.


16 - Insira dois recibos sendo que eles devem ter clientes residentes no PR e prestadores de serviços diferentes. Exemplo: 
* cliente fusca, da cidade curitiba, no PR. Prestador: FCV, estado PR.
* cliente tamara, da cidade maringá, no PR. Prestador: USP, estado SP.

17 - Realize uma consulta na base de dados e exiba os seguintes dados:
* numero do recibo
* data emissao do recibo
* valor do recibo
* nome do cliente 
* estado do cliente
* nome do emitente
* estado do emitente

ordene por data de recibo, nome do cliente e nome do emitente

18 - Faça uma consulta que mostre:
* quantidade de recibos emitidos no PR
* valor total de recibos emitidos no PR*/

-- 1)
INSERT INTO UF (NOME)
VALUES("AM"),("BA"),("CE"),("DF"),("ES"),("GO"),("MA"),("MT"),("MS"),("MG"),("PA"),("PB"),("PR"),("PE"),("PI"),
		("RJ"),("RN"),("RS"),("RO"),("RR"),("SC"),("SP"),("SE"),("TO");
SELECT * FROM UF;

-- 2)
INSERT INTO CIDADE (NOME,UF_ID)
VALUES ("Chapecó",28),("Blumenau",28),("Joinville",28);

INSERT INTO CIDADE (NOME,UF_ID)
VALUES ("Curitiba",20),("Maringá",20),("Lunardeli",20),("Apucarana",20),("Santa fé",20),("São Miguel do Iguaçu",20),("Arapongas",20),
		("Ponta Grossa",20),("Jandaia do Sul",20);

INSERT INTO CIDADE (NOME,UF_ID)
VALUES ("Ribeirão Preto",29);

SELECT * FROM CIDADE;

SELECT U.NOME,C.NOME
FROM UF as U
INNER JOIN CIDADE as C
                on U.ID <> C.UF_ID;
                

-- 3)
DELETE FROM UF 
INNER JOIN CIDADE 
	ON UF_ID = ID 
WHERE ID = 'Alfreds Futterkiste';

 