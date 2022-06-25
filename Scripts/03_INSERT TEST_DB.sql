INSERT INTO Time (nome, pais, estadio, dtregistro)
	VALUES ('Arsenal', 'Inglaterra', 'Emirates Stadium','20220624')
	
SELECT * FROM TIME

INSERT INTO JOGADOR(nome, nacionalidade, cidade, nascimento, idtime_pk)
	VALUES ('Gabriel Jesus', 'Brasil', 'São Paulo', '19900929', 2);

SELECT * FROM JOGADOR

SELECT jogador.nome, time.nome FROM JOGADOR JOIN TIME ON idtime = idtime_fk --traz o jogador mais o time

INSERT INTO DETALHESTIME(cidade, dtfundacao, idtime_fk)
	VALUES ('Londres', '18980101', '2');
	
SELECT * FROM DETALHESTIME

SELECT TIME.NOME, CIDADE, ANOFUNDACAO FROM DETALHESTIME JOIN TIME ON idtime = idtime_fk --traz nome do time mais informacoes