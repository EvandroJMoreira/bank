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

1. Por favor, digite o número da Agência!
2. 1234
3. Por favor, digite o número da sua conta: 
4. 56789
5. Por favor, digite o seu nome: 
6. Maria

7. Maria, bem-vindo(a). O que você deseja fazer hoje?
8. depositar, sacar ou ver extrato?
9. depositar
10. Qual valor será depositado?
11. 1000
12. Seu saldo total é de R$ 1000.00
13. Maria, obrigado por usar o nosso terminal. Sua agência 1234, conta 56789, segue disponível com o saldo de R$ 1000.00

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
