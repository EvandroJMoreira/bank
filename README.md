# Conta Terminal 💰

Este é um projeto simples em Java que simula uma conta bancária via terminal. O usuário informa os dados da conta e pode realizar operações como **depósito**, **saque** ou **consulta de saldo**.

---

## 📋 Funcionalidades

- Entrada de dados bancários:
  - Nome do cliente
  - Número da agência
  - Número da conta
- Execução de comandos via terminal:
  - `depositar`: adiciona um valor ao saldo
  - `sacar`: subtrai um valor do saldo
  -   Qualquer outro comando exibe o saldo atual

---

## 🚀 Como executar o projeto

1. Clone o repositório:
   git clone https://github.com/seu-usuario/conta-terminal.git

2. Acesse a pasta:
    cd conta-terminal
   
3. Compile o programa:
    javac ContaTerminal.java
   
4. Execute:
    java ContaTerminal

---

## 💻 Exemplo de uso

#### Por favor, digite o número da Agência!
 1234
#### Por favor, digite o número da sua conta: 
 56789
##### Por favor, digite o seu nome: 
 Maria
##### Maria, bem-vindo(a). O que você deseja fazer hoje?
##### depositar, sacar ou ver extrato?
 depositar
##### Qual valor será depositado?
 1000
##### Seu saldo total é de R$ 1000.00
##### Maria, obrigado por usar o nosso terminal. Sua agência 1234, conta 56789, segue disponível com o saldo de R$ 1000.00

---

## 🛠 Tecnologias utilizadas
1. Java (JDK 8)
2. Terminal (linha de comando)

---

## 🎯 Melhorias futuras 
#### Adicionar suporte a múltiplas operações com while
#### Validação de entrada (evitar valores negativos)
#### Implementar persistência de dados (salvar saldos em arquivo)
#### Criar interface gráfica com JavaFX ou Swing
