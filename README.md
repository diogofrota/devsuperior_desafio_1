# 🛒 Projeto Loja - Java (DevSuperior)

Este projeto foi desenvolvido como parte dos estudos iniciais de **Java e Programação Orientada a Objetos**, seguindo o conteúdo do curso **DevSuperior**, com foco em **componentes e injeção de dependência**.

O objetivo principal é aplicar conceitos fundamentais de **POO**, **separação de responsabilidades** e **boas práticas de organização de código**, simulando o processamento de pedidos de uma loja.

---

## 📌 Objetivos do Projeto

- Compreender a estrutura de um projeto Java
- Aplicar conceitos de:
    - Classes e objetos
    - Encapsulamento
    - Serviços (Service Layer)
    - Injeção de dependência via construtor
- Evitar repetição de código (DRY)
- Simular um fluxo simples de negócio

---

## 🧱 Estrutura do Projeto

src/main/java
└── com.lojaalfa.loja
├── entidades
│ └── Order.java
├── service
│ ├── OrderService.java
│ └── ShippingService.java
└── LojaApplication.java


### 📦 Entidades
- **Order**
    - Representa um pedido da loja
    - Contém código, valor básico e desconto

### ⚙️ Services
- **OrderService**
    - Responsável pelo cálculo do valor total do pedido
- **ShippingService**
    - Responsável pelo cálculo do frete

### ▶️ Aplicação
- **LojaApplication**
    - Classe principal
    - Executa exemplos de pedidos e exibe os resultados no console

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Injeção de dependência por construtor
- Separação de responsabilidades
- Organização em camadas (entidade e serviço)
- Código limpo e reutilizável

---

## 🖥️ Exemplo de Saída no Console

--------- Resultado - Exemplo 1 ---------
Pedido código: 1034
Valor Total: R$ 130.00
--------- Resultado - Exemplo 2 ---------
Pedido código: 2282
Valor Total: R$ 810.00
--------- Resultado - Exemplo 3 ---------
Pedido código: 1039
Valor Total: R$ 95.90


---

## 🚀 Tecnologias Utilizadas

- Java
- Maven
- IntelliJ IDEA
- Git e GitHub

---

## 📚 Curso / Referência

Projeto desenvolvido com base no curso:

**DevSuperior – Java e Programação Orientada a Objetos**

---

## ✍️ Autor

**Diogo Frota**  
Estudante de Engenharia de Software e Cibersegurança  
Projeto desenvolvido para fins educacionais e evolução profissional.
