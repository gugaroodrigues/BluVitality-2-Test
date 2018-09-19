DROP DATABASE IF EXISTS bluVitalityDatabase;
CREATE DATABASE IF NOT EXISTS bluVitalityDatabase;
USE bluVitalityDatabase;

CREATE TABLE usuarios(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    estado_civil VARCHAR(100),
    idade TINYINT,
    sexo CHAR,
    login VARCHAR(100),
    senha VARCHAR(100),
    cpf VARCHAR(14),
    rg VARCHAR(100),
    telefone VARCHAR(100),
    email VARCHAR(100),
    endereco VARCHAR(100),
    complemento VARCHAR(100),
    cidade VARCHAR(100),
    uf VARCHAR(2),
    naturalidade VARCHAR(100),
    data_nascimento DATE,
    nome_fic VARCHAR(100),
    tipo_sanguineo VARCHAR(3),
    contato_emergencia VARCHAR(100),
    convenio VARCHAR(100)
);

INSERT INTO usuarios (nome,estado_civil,idade,sexo,login,senha,cpf,rg,telefone,email,endereco,complemento,cidade,UF,naturalidade,data_nascimento,nome_fic,tipo_sanguineo,contato_emergencia,convenio) VALUES
('Rafael','solteiro',18,'M','RafhaHarada','R#h467913','123.456.789-09','54.321.987-2','47997835153','rafaelegal22@outlook.com','Rua Alguma Coisa Que Não Sei, 244, Jardim Inexistente','-','Blumenau','SC','SP','2000-03-24','-','A+','47997835153','000000009'),
('Cidmar','solteiro',19,'M','CidmarDeBoa','C#b789456','789.456.123-09','321.987.54-2','47978945612','cidmardeboa@outlook.com','Rua Alguma Coisa Que Não Sei, 255, Jardim Inexistente','Bl A Apto 100','Blumenau','SC','MS','1999-12-10','Kahoot Master','O+','47997835153','000000238'),
('Nattana','solteira',20,'F','NattanaNaLagoa','N#l123456','456.123.789-09','32.154.987-2','47932165498','nattananalagoa@outlook.com','Rua Alguma Coisa Que Não Sei, 266, Jardim Inexistente','-','Blumenau','SC','MG','1998-05-25','-','A+','47997835153','000001598'),
('Gustavo','solteiro',21,'M','GustavoBeleza','G#b147896','123.789.456-09','984.321.75-2','47974185296','gustavobeleza@outlook.com','Rua Alguma Coisa Que Não Sei, 277, Jardim Inexistente','-','Blumenau','SC','AC','1997-11-04','-','A+','47997835153','000000358'),
('Luana','solteira',22,'F','LuanaJoinha','L#j123698','789.123.456-09','987.421.35-2','47936925814','luanajoinha@outlook.com','Rua Alguma Coisa Que Não Sei, 288, Jardim Inexistente','-','Blumenau','SC','PE','1996-08-30','-','A+','47997835153','000000025');

CREATE TABLE cargos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    salario DOUBLE,
    carga_horaria TIME
);

INSERT INTO cargos (nome,salario,carga_horaria) VALUES
('Médico',99999.05,'20:00:00'),
('Gerente',999999.05,'10:00:00'),
('Dono',9999999.05,'03:00:00'),
('Recepcionista',2100,'08:00:00'),
('Limpeza',1100,'08:00:00');

CREATE TABLE funcionarios(
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    id_cargo INT,
    tipo VARCHAR(100),
    ativo BOOLEAN,
    FOREIGN KEY(id_usuario) REFERENCES usuarios(id),
    FOREIGN KEY(id_cargo) REFERENCES cargos(id)
);

INSERT INTO funcionarios (id_usuario,id_cargo,tipo,ativo) VALUES
(1,2,'funcionario',TRUE),
(2,1,'administrador',TRUE),
(3,1,'',FALSE),
(4,3,'administrador',TRUE),
(5,1,'funcionario',TRUE);

CREATE TABLE servicos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_funcionario INT,
    nome VARCHAR(100),
    descricao VARCHAR(100),
    tempo_execucao TIME,
    FOREIGN KEY(id_funcionario) REFERENCES funcionarios(id)
);

INSERT INTO servicos (id_funcionario,nome,descricao,tempo_execucao) VALUES
(1,'Recrutar recrutadores','Recrutar recrutadores eficientes.','02:00:00'),
(2,'"Trocar" um pulmão','Paciente levou um tiro de escopeta no pulmão direito, trocar o pulmão inteiro.','00:30:00'),
(3,'Lavagem cerebral','Paciente jogou League of Legends, limpar toda a sujeira do cerebro, colocar Dark Souls no lugar.','22:50:00'),
(4,'"Trocar" um coração','Paciente foi traido, dar remédios anti depressivos.','03:00:00');

CREATE TABLE eventos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    data_evento DATE,
    custo DOUBLE,
    receita DOUBLE
);

INSERT INTO eventos (nome,data_evento,custo,receita) VALUES
('Abertura do Hospital','2018-09-09',250000,0),
('Exercícios ao Ar Livre','2018-09-30',100000,256579),
('Palestra Sobre a Empresa','2018-10-15',350,0),
('Workshop','2018-10-20',590,0);

CREATE TABLE expedicao(
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    id_funcionario INT,
    tipo VARCHAR(100),
    data_expedicao DATE,
    custo DOUBLE,
    FOREIGN KEY(id_usuario) REFERENCES usuarios(id),
    FOREIGN KEY(id_funcionario) REFERENCES funcionarios(id)
);

INSERT INTO expedicao (id_usuario,id_funcionario,tipo,data_expedicao,custo) VALUES
(1,2,'Exame','2018-09-10',250000),
(3,4,'Exame','2018-10-01',100000),
(2,3,'Consulta','2018-10-16',350),
(4,2,'Consulta','2018-10-21',590);

CREATE TABLE quartos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    id_funcionario INT,
    numero_quarto INT,
    tipo VARCHAR(100),
    data_entrada DATE,
    data_saida DATE,
    status VARCHAR(100),
    FOREIGN KEY(id_usuario) REFERENCES usuarios(id),
    FOREIGN KEY(id_funcionario) REFERENCES funcionarios(id)
);
INSERT INTO quartos (id_usuario, id_funcionario, numero_quarto, tipo ,data_entrada, data_saida, status) VALUES
(1, 2, 1001,'UTI','2018-09-20','2018-09-10','ativo'),
(3, 4, 1002,'UTI','2018-10-11','2018-10-03','inativo');

CREATE TABLE gastosFuncionarios(
    id INT AUTO_INCREMENT PRIMARY KEY,
    salario_mensal  DOUBLE NOT NULL,
    ferias_anuais_remuneradas  DOUBLE NOT NULL,
    um_terco_sobre_ferias  DOUBLE NOT NULL,
    decimo_terceiro_salario  DOUBLE NOT NULL,
    aviso_previo  DOUBLE NOT NULL,
    fgts_sobre_salario_mensal  DOUBLE NOT NULL,
    fgts_sobre_decimo_terceiro_aviso_previo_ferias  DOUBLE NOT NULL,
    multa_fgts  DOUBLE NOT NULL,
    ferias_sobre_aviso_previo  DOUBLE NOT NULL,
    decimo_terceiro_sobre_aviso_previo DOUBLE NOT NULL,
    um_terco_ferias_sobre_aviso_previo DOUBLE NOT NULL,
    fgts_sobre_recisao DOUBLE NOT NULL,
    inss_sobre_salario DOUBLE NOT NULL,
    inss_sobre_ferias_e_decimo_terceiro DOUBLE NOT NULL,
    indenizacao_um_dia_de_salario DOUBLE NOT NULL,
    total DOUBLE NOT NULL
);

CREATE TABLE contas(
    id INT AUTO_INCREMENT PRIMARY KEY,
    energia_eletrica  DOUBLE NOT NULL,
    agua  DOUBLE NOT NULL,
    gas  DOUBLE NOT NULL,
    telefone_e_internet  DOUBLE NOT NULL,
    aluguel  DOUBLE NOT NULL,
    fornecedores  DOUBLE NOT NULL,
    total  DOUBLE NOT NULL
);

CREATE TABLE gastosGerais(
    id INT AUTO_INCREMENT PRIMARY KEY,
    manutencao_equipamentos  DOUBLE NOT NULL,
    limpeza  DOUBLE NOT NULL,
    manutencao_estrutura  DOUBLE NOT NULL,
    alimentacao  DOUBLE NOT NULL,
    materiais_de_consumo  DOUBLE NOT NULL,
    medicamentos  DOUBLE NOT NULL,
    imprevistos  DOUBLE NOT NULL,
    total  DOUBLE NOT NULL
);

CREATE TABLE investimentos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(100) NOT NULL,
    descricao VARCHAR(100) NOT NULL,
    valor double NOT NULL
);

CREATE TABLE orcamento(
    id INT AUTO_INCREMENT PRIMARY KEY,
    orcamento  DOUBLE NOT NULL,
    reserva_imprevistos  DOUBLE NOT NULL,
    orcamento_investimentos  DOUBLE NOT NULL
);

CREATE TABLE custos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_gastoFuncionario INT NOT NULL,
    id_conta INT NOT NULL,
    id_gastoGeral INT NOT NULL,
    id_investimento INT NOT NULL,
    total DOUBLE NOT NULL,
    FOREIGN KEY(id_gastoFuncionario) REFERENCES gastosFuncionarios(id),
    FOREIGN KEY(id_conta) REFERENCES contas(id),
    FOREIGN KEY(id_gastoGeral) REFERENCES gastosGerais(id),
    FOREIGN KEY(id_investimento) REFERENCES investimentos(id)
);

CREATE TABLE receita(
    id INT AUTO_INCREMENT PRIMARY KEY,
    clientes_particulares  DOUBLE NOT NULL,
    convenio_sus  DOUBLE NOT NULL,
    outros_convenios  DOUBLE NOT NULL,
    servicos_a_faturar  DOUBLE NOT NULL,
    diversos  DOUBLE NOT NULL,
    adiantamentos_a_terceiros  DOUBLE NOT NULL,
    arrecadacoes  DOUBLE NOT NULL,
    bens_e_titulos_a_receber  DOUBLE NOT NULL,
    total  DOUBLE NOT NULL
);