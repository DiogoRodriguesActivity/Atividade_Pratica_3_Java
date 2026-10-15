# ☕ Prática 3 — Java: Herança e Polimorfismo

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![POO](https://img.shields.io/badge/POO-Herança%20%26%20Polimorfismo-6C63FF?style=for-the-badge)

Repositório dedicado à Atividade Prática 3 de Java, com foco nos conceitos fundamentais da Programação Orientada a Objetos (POO).

## 📚 Sobre o projeto

A atividade é composta por dois exercícios que simulam situações do mundo real, aplicando herança, polimorfismo, encapsulamento, classes abstratas e coleções.

## 🎯 Objetivos de aprendizagem

- Aplicar encapsulamento com atributos privados, getters e setters.
- Utilizar herança para reutilizar e especializar código.
- Implementar polimorfismo e sobrescrita de métodos.
- Trabalhar com listas de objetos utilizando `ArrayList`.
- Desenvolver menus interativos em Java.

---

# 📱 Exercício 1 — Agenda Telefônica

## 📝 Descrição

Desenvolvimento de uma agenda eletrônica capaz de cadastrar e gerenciar diferentes tipos de contatos, permitindo adicionar, remover, buscar e consultar os contatos armazenados.

### 🧩 Estrutura de classes

| Classe | Responsabilidade |
|---|---|
| `Contato` | Classe-base com nome, e-mail e telefone. |
| `ContatoPessoal` | Contato pessoal com data de aniversário e parentesco. |
| `ContatoProfissional` | Contato profissional com empresa e cargo. |
| `ContatoEmergencia` | Contato de emergência com prioridade e observações. |
| `Agenda` | Gerencia a lista e a quantidade de contatos. |
| `Main` | Apresenta o menu e interage com o usuário. |

### ⚙️ Funcionalidades

- ➕ Adicionar contatos de diferentes tipos.
- 🗑️ Remover contatos e informar o resultado.
- 🔎 Buscar contatos por nome, e-mail ou telefone.
- 📋 Exibir os dados dos contatos.
- 🔢 Consultar a quantidade de contatos cadastrados.
- 🚪 Encerrar o programa quando o usuário selecionar a opção correspondente.

### 🧠 Conceitos aplicados

`Herança` · `Encapsulamento` · `Polimorfismo` · `ArrayList` · `Manipulação de objetos`

---

# 🎟️ Exercício 2 — Sistema de Venda de Ingressos

## 📝 Descrição

Desenvolvimento de um sistema de bilheteria para cadastrar diferentes tipos de ingressos e calcular seus valores finais de acordo com regras específicas.

### 🧩 Estrutura de classes

| Classe | Responsabilidade |
|---|---|
| `Ingresso` | Classe abstrata com informações básicas e métodos de cálculo e benefícios. |
| `IngressoComum` | Ingresso tradicional, sem desconto ou acréscimo. |
| `IngressoEstudante` | Ingresso com 50% de desconto e direito à meia-entrada. |
| `IngressoVIP` | Ingresso com acréscimo de 80% e benefícios exclusivos. |
| `Bilheteria` | Gerencia os ingressos e a arrecadação total. |
| `Main` | Apresenta o menu interativo. |

### 💰 Regras de cálculo

| Tipo | Regra | Valor final |
|---|---|---|
| 🎫 Comum | Sem alteração | Valor base |
| 🎓 Estudante | 50% de desconto | Valor base × 0,5 |
| ⭐ VIP | Acréscimo de 80% | Valor base × 1,8 |

### ⚙️ Funcionalidades

- ➕ Cadastrar ingressos de diferentes categorias.
- 🗑️ Remover ingressos pelo código.
- 🔎 Buscar ingressos pelo código.
- 📋 Listar ingressos com informações específicas de cada tipo.
- 💵 Calcular a arrecadação total usando `calcularValorFinal()`.
- 🎁 Listar benefícios utilizando `obterBeneficios()`.

### 🧠 Conceitos aplicados

`Classes abstratas` · `Herança` · `Polimorfismo` · `Sobrescrita de métodos` · `ArrayList`

---

## 🗂️ Organização sugerida do projeto

```text
Atividade_Pratica_3_Java/
├── AgendaTelefonica/
│   └── src/Pacote/
│       ├── Contato.java
│       ├── ContatoPessoal.java
│       ├── ContatoProfissional.java
│       ├── ContatoEmergencia.java
│       ├── Agenda.java
│       └── Main.java
├── SistemaIngressos/
│   └── src/Pacote/
│       ├── Ingresso.java
│       ├── IngressoComum.java
│       ├── IngressoEstudante.java
│       ├── IngressoVIP.java
│       ├── Bilheteria.java
│       └── Main.java
└── README.md
```

*Estrutura sugerida, adaptável à organização utilizada na IDE.*

## 🛠️ Tecnologias utilizadas

- **Java** — linguagem de programação.
- **Programação Orientada a Objetos** — organização das classes e regras de negócio.
- **ArrayList** — armazenamento dinâmico de objetos.
- **Git e GitHub** — versionamento e publicação do projeto.

## ▶️ Como executar

1. Clone ou baixe este repositório.
2. Abra o projeto em uma IDE compatível com Java, como Eclipse, IntelliJ IDEA ou VS Code.
3. Configure o JDK.
4. Execute a classe `Main` do exercício desejado.
5. Utilize as opções apresentadas no menu.

## 👨‍💻 Aprendizados

Esta atividade permite consolidar os fundamentos da orientação a objetos em Java, demonstrando como classes, herança e polimorfismo podem ser utilizados para representar entidades e regras de negócio de maneira organizada.

---

📌 **Projeto acadêmico — Prática 3: Herança e Polimorfismo em Java.**
