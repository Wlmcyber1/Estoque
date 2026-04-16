# 📦 Sistema de Gestão de Estoque e Caixa

Este projeto é um sistema desenvolvido em **Java** para gerenciar as operações básicas de uma loja, incluindo o controle de produtos, interação com fornecedores e movimentação financeira (caixa).

## 🚀 Funcionalidades

- **Gestão de Inventário:** Cadastro e consulta de produtos em um `ArrayList`.
- **Busca Otimizada:** Localização de produtos por ID dentro do estoque.
- **Fluxo Financeiro:** Controle de entradas (vendas) e saídas (pagamento de fornecedores) através de uma interface de Caixa.
- **Interação entre Objetos:** O Fornecedor realiza cobranças diretamente no caixa da Loja após a entrega de mercadorias.

## 🛠️ Tecnologias Utilizadas

* **Java JDK 17+**
* **Lógica de Programação Orientada a Objetos (POO):**
    * Interfaces (Contrato de Caixa)
    * Encapsulamento (Getters e Setters)
    * Coleções (`ArrayList`)
    * Estruturas de Repetição e Condicionais

## 🏗️ Estrutura do Projeto

O pacote `Estoque` contém as seguintes classes:

1.  **`Loja`**: Classe principal que gerencia o estoque e implementa a interface de caixa.
2.  **`Produto`**: Define os atributos do item (ID, Nome, Preço, Quantidade).
3.  **`Fornecedor`**: Responsável por entregar mercadorias e processar cobranças.
4.  **`Caixa` (Interface)**: Define as regras para pagamentos e recebimentos.

## ✒️ Autora

* **Leticia Moreira** - [Wlmcyber1](https://github.com/Wlmcyber1)

---
## ⚠️ Observações de Desenvolvimento

Este projeto foi desenvolvido exclusivamente para **fins de estudo** e prática dos conceitos de Programação Orientada a Objetos (POO). 

- **Foco Acadêmico:** O objetivo principal foi consolidar o uso de Interfaces, ArrayLists e a comunicação entre classes.
- **Estado do Código:** Como se trata de um projeto de aprendizado, ele pode conter bugs conhecidos ou não tratar todas as exceções de entrada (como tipos de dados inválidos no Scanner).
- **Evolução Contínua:** Este repositório reflete meu progresso na graduação em Análise e Desenvolvimento de Sistemas (ADS), servindo como base para futuras refatorações e implementações de boas práticas de Clean Code.
