# Algoritmo Guloso - Mochila Fracionada

> Este repositório contém a implementação do algoritmo guloso para o problema da mochila fracionada, conforme descrito no livro *Entendendo Algoritmos*. O projeto tem como objetivo servir de base para estudo e referência, podendo ser expandido para outros algoritmos descritos no livro. O algoritmo guloso visa maximizar o valor total dos itens que podem ser carregados em uma mochila com capacidade limitada.

## 💻 Pré-requisitos

Para executar este projeto, certifique-se de ter as seguintes ferramentas configuradas no seu ambiente:

- **Java 21** ou superior;
- **Apache Maven** para gerenciamento de dependências e build do projeto;
- Editor ou IDE de sua escolha (IntelliJ IDEA, Eclipse, VS Code, etc.).

## 🚀 Sobre o projeto

O projeto utiliza uma abordagem simples com Java para implementar o algoritmo guloso no contexto do problema da mochila fracionada. Ele foi criado com o propósito de aplicar, estudar e compreender algoritmos fundamentais descritos no livro *Entendendo Algoritmos*. Além disso, foi estruturado de forma modular para facilitar a reutilização e adaptação do código para diferentes cenários.

### ✨ Funcionalidades

- Implementação do algoritmo guloso para o problema da mochila fracionada;
- Testes simples para validar a lógica do algoritmo;
- Entrada customizável para itens com peso e valor, e capacidade da mochila.

### 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto;
- **Apache Maven**: Ferramenta de build e gerenciamento de dependências;
- **Java Simple**: Estilo direto e simplificado para a implementação dos algoritmos.

## 📚 Como Funciona o Algoritmo

O algoritmo guloso da mochila fracionada funciona selecionando os itens com a maior razão entre valor e peso para maximizar o valor total da mochila:

1. **Ordenação dos itens**: A lista de itens é ordenada com base na razão valor/peso de forma decrescente.
2. **Seleção dos itens**:
   - Começa-se pelos itens com maior valor/peso.
   - Se o item cabe completamente na mochila, ele é adicionado inteiramente.
   - Se o item não cabe completamente, é adicionada uma fração dele para preencher o restante da capacidade da mochila.
3. **Resultado final**: O algoritmo retorna o valor total máximo que pode ser transportado pela mochila com a capacidade fornecida.

A complexidade do algoritmo é **O(n log n)** devido à ordenação dos itens.

## 🛠️ Configuração e Execução

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/algoritmo-guloso-mochila.git
