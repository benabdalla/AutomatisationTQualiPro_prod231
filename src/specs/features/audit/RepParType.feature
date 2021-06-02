@CreationAudit
Feature: Qualipro- Test reporting audit
  En tant que utilisateur je souhaite remplir une fiche audit et décrire les details de réalisation

  @EtatDesAuditsParType
  Scenario Outline: Qualipro-En tant qu utilisateur je veux reporter un audit existant par type
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    And consulter reporting Audit par type
    When saisir <example> Audit a traiter
    When saisir Type Audit
    When saisir Champ d'audit
    When saisir Site
    When saisir Processus
    When saisir Activité
    When saisir Direction
     When Date prévue entre
    And Cliquer sur bouton rechercher
    And consulter la fiche Audit
    And cliquer sur reporter Audit
    And saisir nouveaux dates
    And valider reporter audit
    Then vérifier <Numero Audit> est reporté

    Examples:
      | example |
      | 1       |
