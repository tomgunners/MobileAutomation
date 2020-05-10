
Feature: Criar Conta
  Como usuário
  Eu quero criar uma conta de acesso
  Para cadastrar meus números de rastreio do correio

  Scenario: Deve criar uma conta com sucesso
    Given que estou na tela Nova Conta
    When preencher todos os campos corretamente
    And clicar no botao Criar Conta
    Then deve redirecionar para a tela principal do app




