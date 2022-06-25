ALTER TABLE detalhestime
    ADD COLUMN mascote character varying(30) NOT NULL,
	ADD COLUMN torcedor character varying(30) NOT NULL,
	ADD COLUMN dtRegistro DATE NOT NULL;
	
ALTER TABLE detalhestime DROP COLUMN dtfundacao

ALTER TABLE detalhestime
	ADD COLUMN anoFundacao VARCHAR(4) NOT NULL
	
ALTER TABLE time
	ADD COLUMN dtRegistro DATE NOT NULL

ALTER TABLE jogador
	ADD COLUMN dtRegistro DATE NOT NULL

ALTER TABLE jogador DROP COLUMN nascimento

ALTER TABLE jogador
	ADD COLUMN anoNascimento VARCHAR(4) NOT NULL
	
ALTER TABLE jogador
    RENAME idtime_pk TO idtime_fk;
	
	
