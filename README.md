# 🩺 Projeto: Consulta Agendada

Este projeto foi desenvolvido como parte da disciplina de **Linguagem de Programação I**, com o objetivo de aplicar os princípios de orientação a objetos em Java. O projeto envolve a criação e manipulação das classes `Data`, `Hora` e `ConsultaAgendada`, respeitando a estrutura de classes especificada no exercício.

## 🎯 Objetivos

- Refatorar a classe `Data` com métodos e propriedades conforme o padrão UML.
- Criar a classe `ConsultaAgendada` com múltiplos construtores, métodos `get` e `set`, além de um atributo estático para contar o número de instâncias.
- Testar as funcionalidades da classe através de um programa principal que instancia e manipula objetos.

## 🛠️ Ferramentas Utilizadas

- Java
- VS Code
- Git e GitHub

## 🗂️ Estrutura do Projeto

```
📁 consulta-agendada/
├── 📄 Data.java
├── 📄 Hora.java
├── 📄 ConsultaAgendada.java
├── 📄 Main.java
└── 📄 README.md
```

## 🚀 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/Stiven-Richardy/projeto-consulta-agenda-java.git
```

2. Acesse a pasta do projeto:
```bash
cd consulta-agendada
```

3. Compile os arquivos:
```bash
javac Data.java Hora.java ConsultaAgendada.java Main.java
```

4. Execute o programa:
```bash
java Main
```

## ✅ Funcionalidades Implementadas

- Criação de objetos da classe `ConsultaAgendada` com diferentes construtores
- Alteração de data, hora, nome do paciente e nome do médico via parâmetros ou entrada pelo usuário
- Acompanhamento da quantidade de consultas agendadas (atributo estático)
- Impressão formatada de data (`dd/mm/aa`) e hora (`hh:mm:ss`)

## 🧪 Testes Realizados (Exercício 03)

- Instanciado o objeto `p1` com dados completos via construtor com parâmetros
- Exibidas todas as propriedades de `p1`
- Instanciado o objeto `p2` com construtor padrão (sem parâmetros)
- Alteradas as propriedades de `p1` com métodos de entrada de dados
- Exibidas novamente as propriedades de `p1`
- Exibido o total de consultas agendadas

## 👨‍🏫 Autores

- **Stiven Richardy Silva Rodrigues**  
  Estudante de Análise e Desenvolvimento de Sistemas | IFSP — Campus Cubatão  
  [@Stiven-Richardy](https://github.com/Stiven-Richardy)

- **Guilherme Mendes de Sousa**  
  Estudante de Análise e Desenvolvimento de Sistemas | IFSP — Campus Cubatão  
  [@Guilh3rme-M3ndes](https://github.com/Guilh3rme-M3ndes)

## 📚 Referências

- Documentação oficial do Java: https://docs.oracle.com/en/java/
