@FicheEvaluationAspect
Feature: Création et validation d une fiche Evaluation aspect
    En tant qu utilisateur, je veux créer une Evaluation aspect , la valider, la traiter et la clôturer


    @EvaluationAspect
    Scenario Outline: Création d une fiche Evaluation aspect
        Given Ouvrir le site QualiProWeb
        And  saisir Login et PW
        And  cliquer sur ouvrir une session
        And Lire Données Aspect <Incident> depuis Excel
        When Consulter module Environnement
        And Consulter Sous Module Aspects
        And Consulter Sous Module Evaluation des aspects
        And Cliquer sur ajouter Evaluation aspect
        And Sélectionner Aspect EVALUATION
        And Sélectionner Facteur
        And Sélectionner Lieu
        And Sélectionner condition
        And cliquer sur valider Evaluation aspect
        Then Vérifier Evaluation aspect ajouté


#And rattacher action
        Examples:
            | Incident |
            | 1        |