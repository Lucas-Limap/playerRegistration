
CREATE SEQUENCE time_idtime_seq;

CREATE TABLE time (
                idTime INTEGER NOT NULL DEFAULT nextval('time_idtime_seq'),
                nome VARCHAR(50) NOT NULL,
                pais VARCHAR(30) NOT NULL,
                estadio VARCHAR(50) NOT NULL,
                CONSTRAINT time_pk PRIMARY KEY (idTime)
);


ALTER SEQUENCE time_idtime_seq OWNED BY time.idTime;

CREATE SEQUENCE jogador_idjogador_seq;

CREATE TABLE jogador (
                idJogador INTEGER NOT NULL DEFAULT nextval('jogador_idjogador_seq'),
                nome VARCHAR(100) NOT NULL,
                nacionalidade VARCHAR(50) NOT NULL,
                cidade VARCHAR(30) NOT NULL,
                Nascimento DATE NOT NULL,
                idTime_pk INTEGER NOT NULL,
                CONSTRAINT jogador_pk PRIMARY KEY (idJogador)
);


ALTER SEQUENCE jogador_idjogador_seq OWNED BY jogador.idJogador;

CREATE SEQUENCE detalhestime_iddetalhe_seq;

CREATE TABLE detalhesTime (
                idDetalhe INTEGER NOT NULL DEFAULT nextval('detalhestime_iddetalhe_seq'),
                cidade VARCHAR(30) NOT NULL,
                dtFundacao DATE NOT NULL,
                idTime_fk INTEGER NOT NULL,
                CONSTRAINT detalhestime_pk PRIMARY KEY (idDetalhe)
);


ALTER SEQUENCE detalhestime_iddetalhe_seq OWNED BY detalhesTime.idDetalhe;

ALTER TABLE detalhesTime ADD CONSTRAINT time_detalhestime_fk
FOREIGN KEY (idTime_fk)
REFERENCES time (idTime)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE jogador ADD CONSTRAINT time_jogador_fk
FOREIGN KEY (idTime_pk)
REFERENCES time (idTime)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;