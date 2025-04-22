# Pratica de Java 1
Este projeto foi feito com o intuito de praticar programação em Java, com foco em aprimorar minhas habilidades com Java

## Contexto do Projeto
**Desenvolva um sistema de Gestão de Veículos** <br>


## 1. Interface ``Alugavel`` 

- **Função:** definir um contrato que obrigue qualquer classe que a implemente a fornecer os métodos relacionados ao **aluguel do veículo**.<br>

- **Métodos Obrigatórios** 
    - ``alugar()``: Método para alugar veículo.
    - ``devolver()``: Método para a devolução do veículo.


## 2. Classe Abstrata ``Veículo``

- **Função:** representar um veículo genérico com atributos e comportamentos comuns a **qualquer tipo de veículo**. Implementar a interface ``alugavel``.<br>

- **Atributos**
    - ``modelo`` (String): nome ou modelo do veículo
    - ``ano`` (int): ano de fabricação do veículo
    - ``disponivel`` (enum): indica a disponibilidade para aluguel *(DISPONIVEL / ALUGADO)*

- **Métodos**
    - Construtor
    - ``exibirInfo()``: método abstrato para exibição das informações dos veículos
    - ``alugar()``: verifica se o veículo está disponível e marca como alugado
    - ``devolver()``: torna o veículo disponível novamente


## 3. Subclasses ``Veículo``

- ``Carro``: representar um carro com atributo adicional
    - Atributo adicional: ``portas`` (int): número de portas do carro


- ``Moto``: representar uma moto com atributo adicional
    - Atributo adicional: ``cilindradas`` (int): potência da moto <br>

Ambas as subclasses devem conter um construtor e a implementação do ``exibirInfo()``

## 4. Getters & Setters
- As classes devem conter ``get()`` e ``set()`` para proteger os atributos e garantir o acesso