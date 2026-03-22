# Sistema de Auto Escola (Java)

## Descrição
Este projeto consiste em uma aplicação simples desenvolvida em Java com o objetivo de simular o funcionamento básico de uma auto escola. O sistema permite o cadastro de alunos, controle de aulas teóricas e práticas, além da verificação de requisitos para a realização do exame final.

---

## Funcionalidades

- Cadastro de alunos
- Registro de aulas teóricas e práticas
- Cancelamento de aulas
- Validação de requisitos mínimos para exame
- Simulação de realização de exame
- Exibição de resultados no terminal

---

## Estrutura do Projeto

### Classes principais

**Aluno**
- nome : String
- idade : int
- tipoVeiculo : String
- aulasTeoricas : int
- aulasPraticas : int
- aprovado : boolean

Métodos:
- agendarAulaTeorica()
- agendarAulaPratica()
- cancelarAulaTeorica()
- cancelarAulaPratica()
- realizarExame()

---

**Instrutor**
- nome : String
- experiencia : int
- categoria : String

---

**Veiculo**
- tipo : String
- modelo : String
- placa : String

---

**AutoEscola**
- lista de alunos (até 4 no cenário atual)

Métodos:
- adicionarAluno(Aluno aluno)
- exibirResumo()

---

**Main**
Responsável por executar o sistema e simular os cenários.

---

## Execução

Ao executar a classe `Main`, o sistema realiza:

1. Inicialização da auto escola
2. Cadastro de quatro alunos
3. Criação de instrutor e veículo
4. Simulação de:
    - Agendamento de aulas
    - Cancelamento de aulas
    - Tentativa de exame
    - Realização de exame

---

## Regras de Negócio

- O aluno precisa de no mínimo:
    - 5 aulas teóricas
    - 5 aulas práticas  
      para poder realizar o exame

- Caso não atenda aos requisitos, o exame não é permitido

- Caso atenda, o resultado (aprovado/reprovado) é definido na execução

---

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)

---

## Integrantes

| Nome                      | RM     |
|---------------------------|--------|
| Pedro Marchese            | 563339 |
| Bruno Bagattini Fernandes | rm     |
| Pedro Henrique Sartorelli Ferreira | 563281|
| Rafael Felix Souza             | 565855     |
| Matheus Brasil Borges Sevilha Angelotti| 561456     |
| Nathália dos Santos Cordeiro| 563072     |





