
Feature: Interagir entre as Abas do APP
  Como usuário
  Eu quero clicar nas abas existentes
  E criar um novo pacote, caso não exista

  Scenario: Clicar nas abas
    Given que clico na aba Pendentes
    And valido aba Pendentes
    And clico na aba Entregues
    And valido aba Entregues
    And clico na aba Arquivados
    And valido aba Arquivados
    And clico na aba Tributados
    And valido aba Tributados
    When clicar na aba Pendentes
    Then clico no botao Novo Pacote



