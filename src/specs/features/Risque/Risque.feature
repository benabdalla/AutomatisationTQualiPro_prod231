Feature: Ficherisqueopportunité

  @CréationFicherRisque
  Scenario Outline: creation fiche Risque Opportunite
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    And Introduire <exemple> risque
    When cliquer sur module Risque Opportunite
    When cliquer sur sous module risque Opportunite
    When cliquer  sur ajouter Risque Opportunite
    When saisir Objet d incertitude
    When saisir  Objectif
    When saisir Source et Cause
    When saisir Evenement et Contexte
    When saisir  Enjeu et Consequence
    When saisir  Domaine de risque
    When saisir Type dimpact des risques
    When saisir  Site
    When saisir Processus
    When saisir Activite
    When saisir  Direction
    When saisir  Service
    When cliquer   valider
    Then Verifier l ajout de la fiche

    Examples: 
      | exemple |
      |       1 |




  @EvaluationBruteagenda
  Scenario Outline: Evaluation brute via agenda
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    And Introduire <exemple> risque
    When clique  sur agenda Risque
    When cliquer sur Liste des evaluation des risques
    When rechercher un fichier  risque Opportunite
    When cliquer  sur fiche risque  opportunite
    When choisir les notes  agenda
    When clique sur valider
    When Ajouter décision
    When cliquer  sur évalution brut
    Then Verifier matrice saisie a partir de l agenda

    Examples: 
      | responsable | exemple | module      |
      |           7 |       1 | "RisqueOpp" |
      
        @EvaluationBruteagendaFourmuleF
  Scenario Outline: Evaluation brute via agenda
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    And Introduire <exemple> risque
    When clique  sur agenda Risque
    When cliquer sur Liste des evaluation des risques
    When rechercher un fichier  risque Opportunite
    When cliquer  sur fiche risque  opportunite
    When choisir les notes  agenda
    When clique   sur   valider
    When Ajouter décision
    When cliquer  sur évalution brut
    Then Verifier formule saisie a partir de l agenda

    Examples: 
      | responsable | exemple | module      |
      |           7 |       1 | "RisqueOpp" |
      
      
  @EvaluationRésiduelleF
  Scenario Outline: Evaluation résiduelle module
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    And Introduire <exemple> risque
    When cliquer sur module Risque Opportunite
    When cliquer sur sous module risque Opportunite
    When rechercher un fichier  risque Opportunite module
    When cliquer Evaluation résiduelle
    When cliquer  sur evaluer
    When choisir les notes  module
    When cliquer valider residuelle
    Then Verifier matrice formule

    Examples: 
      | responsable | exemple | module      |
      |           7 |       1 | "RisqueOpp" |
      
      
      

  @EvaluationRésiduelle
  Scenario Outline: Evaluation résiduelle module
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    And Introduire <exemple> risque
    When cliquer sur module Risque Opportunite
    When cliquer sur sous module risque Opportunite
    When rechercher un fichier  risque Opportunite module
    When cliquer Evaluation résiduelle
    When cliquer  sur evaluer
    When choisir les notes  module
    When cliquer valider residuelle
    Then Verifier matrice


    Examples: 
      | responsable | exemple | module      |
      |           7 |       1 | "RisqueOpp" |
