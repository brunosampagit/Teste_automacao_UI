#Author: projetomercadolivrel@brunoverissimo.com

@TesteVendaML
Feature: Teste de compra mercado livre
Eu como usuario quero fazer a busca de produtos

  
  Scenario: Acessando site do mercado livre
    Given que eu esteja no site
    When pesquisar por duas produtos
    Then validar o teste
    
