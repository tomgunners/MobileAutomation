
Feature: Criar um Pacote de Rastreio
  Como usuário
  Eu quero criar um pacote de rastreio
  E listar ele na aba Entregues

  Scenario: Criar pacote de rastreio
    Given que estou na tela Novo Pacote
    And insiro o codigo
    And o nome do pacote
    And insiro uma tag
    When clicar no botao de confirmar
    Then valido que o pacote esta listado na aba entregues



