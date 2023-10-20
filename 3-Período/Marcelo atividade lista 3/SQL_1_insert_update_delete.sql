create database if not exists empresa;
USE empresa;

CREATE TABLE if not exists empregado(	
    SSN INT,
    primeiro_nome VARCHAR(30) NOT NULL,
    sobre_nome VARCHAR(50) NOT NULL,
    DataNascimento date NOT NULL,
    sexo boolean NOT NULL,
    salario DECIMAL(5,2) NOT NULL,
    SSNSupervisor INT,
    NomeDepartamento VARCHAR(20), 
    
    PRIMARY KEY (SSN)
);

ALTER TABLE empregado
ADD FOREIGN KEY (SSNSupervisor) REFERENCES empregado(ssn);

ALTER TABLE empregado ADD (numeroDep SMALLINT);




-- Endereço (ID, Rua, Número, Bairro, CEP, *SSNEmpregado)
CREATE TABLE endereco(
id INT auto_increment,
rua VARCHAR(50) NOT NULL,
numero SMALLINT,
bairro VARCHAR(20) NOT NULL,
cep VARCHAR (9) NOT NULL,
ssnEmpregado INT NOT NULL,

PRIMARY KEY (id),
FOREIGN KEY(ssnEmpregado) REFERENCES empregado(ssn)
);

-- Dependentes (*SSNEmpregado, nome, Sexo, DataNascimento, Parentesco)
CREATE TABLE if not exists dependentes(
ssnEmpregado INT NOT NULL,
nome VARCHAR (20) NOT NULL,
sexo VARCHAR(1), 
dataNasc DATE,
parentesco VARCHAR(15),

PRIMARY KEY (ssnEmpregado, nome),
FOREIGN KEY (ssnEmpregado) REFERENCES empregado(ssn)
);

-- Departamento (Nome, Número, *SSNGerente, DataInicio)

CREATE TABLE if not exists Departamento(
	nome VARCHAR(20) NOT NULL,
    numero SMALLINT NOT NULL,
    SSNGerente INT NOT NULL,
    datainicio date,
	PRIMARY KEY (nome,numero),
    foreign key (SSNGerente) references empregado(SSN)
);

ALTER TABLE empregado
ADD FOREIGN KEY (NomeDepartamento, numeroDep) REFERENCES Departamento(nome, numero);



-- Localizacoes_Dep (*Nome,* Número, descrição)
CREATE TABLE if not exists localizacoes_dep(
nome VARCHAR (20) NOT NULL,
numero SMALLINT NOT NULL,
descricao VARCHAR(50),

PRIMARY KEY (nome, numero, descricao),
FOREIGN KEY (nome, numero) REFERENCES departamento (nome, numero)
);


CREATE TABLE if not exists projeto(
numero INT NOT NULL,
nome VARCHAR (20) NOT NULL,
localizacao VARCHAR (50),
nomeDep VARCHAR (20) NOT NULL,
numeroDep SMALLINT NOT NULL,

PRIMARY KEY (numero, nome),
FOREIGN KEY (nomeDep, numeroDep) REFERENCES localizacoes_dep (nome, numero)
);

-- Empregado_Trabalha_Projeto ( *SSNEmpregado, *NúmeroProj, *NomeProj, Horas)
CREATE TABLE empregado_trabalha_projeto(
ssnEmpregado INT NOT NULL,
numeroProj INT NOT NULL,
nomeProj VARCHAR (20) NOT NULL,
horas TIME NOT NULL,

PRIMARY KEY (ssnEmpregado, numeroProj, nomeProj),
FOREIGN KEY (ssnEmpregado) REFERENCES empregado(ssn),
FOREIGN KEY (numeroProj, nomeProj) REFERENCES projeto(numero, nome)
);


insert into empregado( primeiro_nome, sobre_nome,DataNascimento, DataNascimento,sexo, salario, SSNSupervisor,NomeDepartamento) 
values ('fernando','valent','2023-10-19',1,199.2,999,'setor de motor'),
('Carlos', 'Santos', '1985-08-20', 1, 55000, 987654321, 'Tecnologia'),
    ('Ana', 'Pereira', '1988-11-03', 0, 48000, 234567890, 'Recursos Humanos'),
    ('João', 'Oliveira', '1995-02-28', 1, 60000, 345678901, 'Marketing'),
    ('Pedro', 'Ribeiro', '1983-04-10', 1, 75000, 456789012, 'lucro empresa'),
    ('Sofia', 'Ferreira', '1992-07-22', 0, 52000, 567890123, 'Vendas'),
    ('António', 'Gomes', '1979-09-14', 1, 68000, 678901234, 'Tecnologia'),
    ('Beatriz', 'Lima', '1997-12-01', 0, 58000, 789012345, 'Recursos Humanos'),
    ('Rui', 'Machado', '1987-03-07', 1, 62000, 890123456, 'Marketing'),
    ('Luisa', 'Rodrigues', '1994-06-18', 0, 70000, 901234567, 'Contabilidade');
    UPDATE empregado SET salario = 1999 WHERE SSN = 4;
    UPDATE empregado SET NomeDepartamento = 'Logística_RH' WHERE SSN = 2;
    DELETE FROM empregado WHERE SSN = 2;
    insert into empregado (numerodep) values('31999-99');
    INSERT INTO endereco (rua, numero, bairro, cep, ssnEmpregado)
VALUES
    ('Rua A', 123, 'Bairro do bairro', '12345-678', 1534),
    ('Rua B', 456, 'Bairro das graça', '98765-432', 2534),
    ('Rua C', 789, 'aaa do bairro', '54321-987', 353),
    ('Rua D', 101, 'aaaa', '24680-135', 475),
    ('Rua E', 202, 'bomdia', '86420-579', 56734),
    ('Rua F', 303, 'boanoite', '97531-246', 675),
    ('Rua G', 404, 'boamadrugada', '13879-642', 7675),
    ('Rua H', 505, 'bomanoitee', '71528-937', 834),
    ('Rua I', 606, 'boatarde', '28637-410', 9999),
    ('Rua J', 707, 'Bairro nao sei', '36291-874', 1034);

UPDATE endereco SET cep = '54321-000' WHERE id = 3;
UPDATE endereco SET bairro = 'Novo Bairro' WHERE id = 5;
DELETE FROM endereco WHERE id = 9999;
INSERT INTO localizacoes_dep (nome, numero, descricao)
VALUES 
('Sala de Conferências', 1, 'Descrição'),
    ('Escritório de Gerência', 2, 'Descrição '),
    ('Laboratório de Pesquisa', 3, 'Descrição '),
    ('Sala de Treinamento', 4, 'Descrição'),
    ('Sala de Reuniões', 6, 'Descrição '),
    ('Espaço de Coworking', 7, 'Descrição '),
    ('Laboratório de Testes', 8, 'Descrição '),
    ('Sala de Criatividade', 9, 'Descrição'),
    ('Estúdio de Gravação', 10, 'Descrição ');
    UPDATE localizacoes_dep
SET nome = 'Sala de Conferências - Atualizada'
WHERE nome = 'Sala de Conferências' AND numero = 1;
UPDATE localizacoes_dep
SET nome = 'Laboratório de Pesquisa - Atualizado'
WHERE nome = 'Laboratório de Pesquisa' AND numero = 3;
DELETE FROM localizacoes_dep
WHERE nome = 'Sala de Treinamento' AND numero = 4;
INSERT INTO projeto (numero, nome, localizacao, nomeDep, numeroDep)
VALUES
    (1, 'Projeto 1', 'Localização 1', 'Departamento A', 1),
    (2, 'Projeto 2', 'Localização 2', 'Departamento B', 2),
    (3, 'Projeto 3', 'Localização 3', 'Departamento C', 3),
    (4, 'Projeto 4', 'Localização 4', 'Departamento D', 4),
    (5, 'Projeto 5', 'Localização 5', 'Departamento E', 5),
    (6, 'Projeto 6', 'Localização 6', 'Departamento F', 6),
    (7, 'Projeto 7', 'Localização 7', 'Departamento G', 7),
    (8, 'Projeto 8', 'Localização 8', 'Departamento H', 8),
    (9, 'Projeto 9', 'Localização 9', 'Departamento I', 9),
    (10, 'Projeto 10', 'Localização 10', 'Departamento J', 10);
UPDATE projeto SET localizacao = 'Nova Localização 1' WHERE numero = 1;
UPDATE projeto SET nomeDep = 'Novo Departamento A' WHERE numero = 2;
DELETE FROM projeto WHERE numero = 3;
