CREATE DATABASE IF NOT EXISTS porto;
USE porto;

CREATE TABLE IF NOT EXISTS marOceanoLago (
    nome VARCHAR(20),
    PRIMARY KEY (nome)
);

CREATE TABLE IF NOT EXISTS estadoPais (
    nome VARCHAR(20),
    continente VARCHAR(20) NOT NULL,
    PRIMARY KEY (nome)
);

CREATE TABLE IF NOT EXISTS tipodoNavio (
    tipo VARCHAR(20),
    tonelagem SMALLINT NOT NULL,
    casco VARCHAR(20) NOT NULL,
    PRIMARY KEY (tipo)
);

CREATE TABLE IF NOT EXISTS porto (
    nome VARCHAR(20),
    nomeMarOceano VARCHAR(20) NOT NULL,
    nomeEstadoPais VARCHAR(20) NOT NULL,
    PRIMARY KEY (nome, nomeEstadoPais),
    FOREIGN KEY (nomeMarOceano) REFERENCES marOceanoLago(nome),
    FOREIGN KEY (nomeEstadoPais) REFERENCES estadoPais(nome)
);

CREATE TABLE IF NOT EXISTS navio (
    navioNome VARCHAR(20),
    proprietario VARCHAR(20) NOT NULL,
    tipoNavio VARCHAR(20) NOT NULL,
    nomeEstadoPais VARCHAR(20) NOT NULL,
    portoNome VARCHAR(20),
    PRIMARY KEY (navioNome),
    FOREIGN KEY (tipoNavio) REFERENCES tipodoNavio(tipo),
    FOREIGN KEY (nomeEstadoPais) REFERENCES estadoPais(nome),
    FOREIGN KEY (portoNome, nomeEstadoPais) REFERENCES porto(nome, nomeEstadoPais)
);

CREATE TABLE IF NOT EXISTS visita (
    nNomeNavio VARCHAR(20),
    nomeEstadoPais VARCHAR(20),
    portoNome VARCHAR(20),
    dataChegada DATE NOT NULL,
    dataPartida DATE NOT NULL,
    PRIMARY KEY (nNomeNavio, nomeEstadoPais, portoNome, dataChegada),
    FOREIGN KEY (nNomeNavio) REFERENCES navio(navioNome),
    FOREIGN KEY (nomeEstadoPais) REFERENCES estadoPais(nome),
    FOREIGN KEY (portoNome, nomeEstadoPais) REFERENCES porto(nome, nomeEstadoPais)
);

CREATE TABLE IF NOT EXISTS movimentoNavio (
    NomeNavio VARCHAR(20),
    DataMovimento DATE NOT NULL,
    Tempo TIME NOT NULL,
    Longitude SMALLINT NOT NULL,
    Latitude SMALLINT NOT NULL,
    PRIMARY KEY (NomeNavio, DataMovimento, Tempo),
    FOREIGN KEY (NomeNavio) REFERENCES navio(navioNome)
);

INSERT INTO marOceanoLago (nome) VALUES 
('Mar do cuba'), 
('Oceano mae'), 
('Oceano Índio'), 
('Oceano bomdia'),
 ('Mar da Arábo'), 
 ('Mar nilo'), 
 ('Mar Negro'), 
 ('Mar de b');
 UPDATE marOceanoLago SET nome = ',Mar nilo - Atualizado' WHERE nome = 'Mar nilo';
UPDATE marOceanoLago SET nome = 'Pacífico - Atualizado' WHERE nome = 'Mardo Cuba';
DELETE FROM marOceanoLago WHERE nome = 'Mar de b';


INSERT INTO estadoPais (nome, continente) VALUES
 ('Brasil', 'América do Sul'), 
 ('Argentina', 'América do Sul'), 
 ('Chile', 'América do Sul'), 
 ('Australia', 'Oaa'),
 ('Rússia', 'naosei'),
 ('Canadá', 'América centro'),
 ('Estados Unidos', 'América'),
 ('Reino Unido', 'Europo'),
 ('França', 'Europa'), 
 ('Alemanha', 'Europa'),
 ('Índia', 'Ása'),
 ('China', 'Ása de frango');
 UPDATE estadoPais
SET nome = 'Brasil - existe' WHERE nome = 'Brasil';
UPDATE estadoPais SET nome = 'EUA - existe' WHERE continente = 'naosei';
DELETE FROM estadoPais WHERE nome = 'China';
 
 INSERT INTO tipodoNavio (tipo, tonelagem, casco) VALUES
    ('Cargueiro', 5000, 'Aço'),
    ('Petroleiro', 10000, 'Aço'),
    ('Porta-Contêineres', 8000, 'Aço'),
    ('Ferry', 3000, 'Alumínio'),
    ('Cruzeiro', 6000, 'Aço'),
    ('Pesqueiro', 1500, 'Madeira'),
    ('Iate', 500, 'Fibra de Vidro'),
    ('Submarino', 2000, 'Aço'),
    ('Veleiro', 1000, 'Madeira'),
    ('Lancha', 750, 'Fibra de Vidro');
    UPDATE tipodoNavio
SET tipo = 'Cargueiro contém' WHERE tipo = 'Cargueiro';
UPDATE tipodoNavio SET tipo = 'Petroleiro 2' WHERE tipo = 'Petroleiro';
DELETE FROM tipodoNavio WHERE tipo = 'Porta-Contêineres';

INSERT INTO porto (nome, nomeMarOceano, nomeEstadoPais) VALUES 
('Porto de Santos', 'Oceano ','Brasil'),
 ('Porto Assis',
 'Oceano ',
 'Estados');
 UPDATE porto SET nome = 'Porto de Santos - Atualizado' WHERE nome = 'Porto de Santos';
UPDATE porto SET nomeEstadoPais = 'Brasil - Atualizado' WHERE nomeEstadoPais = 'Brasil';
DELETE FROM porto
WHERE nome = 'Porto Assis';
 
 INSERT INTO visita (nNomeNavio, nomeEstadoPais, portoNome, dataChegada, dataPartida) VALUES
    ('Navio 1', 'Brasil', 'Porto de S', '2023-10-01', '2023-10-05'),
    ('Navio 2', 'EUA', 'Porto de Los A', '2023-10-02', '2023-10-06'),
    ('Navio 3', 'China', 'Porto de X', '2023-10-03', '2023-10-07'),
    ('Navio 4', 'Austrália', 'Porto de S', '2023-10-04', '2023-10-08'),
    ('Navio 5', 'Rússia', 'Porto de São P', '2023-10-05', '2023-10-09'),
    ('Navio 6', 'Nigéria', 'Porto de L', '2023-10-06', '2023-10-10'),
    ('Navio 7', 'Suécia', 'Porto de G', '2023-10-07', '2023-10-11'),
    ('Navio 8', 'Irã', 'Porto de B', '2023-10-08', '2023-10-12'),
    ('Navio 9', 'G', 'Porto de P', '2023-10-09', '2023-10-13'),
    ('Navio 10', 'J', 'Porto de K', '2023-10-10', '2023-10-14');
    UPDATE visita SET dataPartida = '2023-10-15' WHERE nNomeNavio = 'Navio 1';
UPDATE visita SET portoNome = 'Porto Aberto'WHERE nNomeNavio = 'Navio 8';
DELETE FROM visita WHERE nNomeNavio = 'Navio 9';

INSERT INTO movimentoNavio (NomeNavio, DataMovimento, Tempo, Longitude, Latitude) VALUES
    ('Navio 1', '2023-10-01', '08:00:00', 40, -30),
    ('Navio 2', '2023-10-02', '08:30:00', 45, -35),
    ('Navio 3', '2023-10-03', '09:00:00', 42, -33),
    ('Navio 4', '2023-10-04', '07:45:00', 50, -40),
    ('Navio 5', '2023-10-05', '10:15:00', 38, -28),
    ('Navio 6', '2023-10-06', '09:30:00', 47, -32),
    ('Navio 7', '2023-10-07', '08:45:00', 39, -29),
    ('Navio 8', '2023-10-08', '07:30:00', 44, -34),
    ('Navio 9', '2023-10-09', '10:45:00', 41, -31),
    ('Navio 10', '2023-10-10', '09:15:00', 49, -37);
UPDATE movimentoNavio SET Longitude = 55 WHERE NomeNavio = 'Navio 1' AND DataMovimento = '2023-10-01';
UPDATE movimentoNavio SET Latitude = -25 WHERE NomeNavio = 'Navio 2' AND DataMovimento = '2023-10-02';
DELETE FROM movimentoNavio WHERE NomeNavio = 'Navio 3' AND DataMovimento = '2023-10-03';