
@tag
Feature: Ajouter un type de réunion

  @typeRénion
  Scenario: Title of your scenario
   Given Ouvrir le site QualiProWeb
    When saisir Login et PW
    When cliquer sur ouvrir une session
    When consulter type de réunion
    And ajouter type réunion
    And saisir type de réunion
    And saisir périodicité
    And saisir source 
    And valider type
    Then type ajouté


