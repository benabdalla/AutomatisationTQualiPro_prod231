@CreationAudit
Feature: Qualipro- Test fiche audit
  En tant que utilisateur je souhaite remplir une fiche audit et décrire les details de réalisation


  @AuditAvecValidationConstat
  Scenario Outline: Qualipro-En tant qu utilisateur je veux créer une fiche audit avec constat
    Given Ouvrir le site QualiProWeb
    When saisir Login et PW
    When cliquer sur ouvrir une session
    And consulter audit
    And cliquer sur ajouter audit
    When saisir <example> Audit a traiter
    When saisir Ref interne
    And saisir Date Début Prévue
    And saisir Date Fin Prévue
    And saisir Champ audit
    And choisir type audit
    And choisir site
    And choisir Processus
    And choisir activite
    And choisir direction
    And choisir Service
    And cliquer sur valider audit
    And Ajouter Auditeur Interne
    And Ajouter Auditeur Externe
    And Ajouter Audite
    And changer compte Auditeur
    And Realiser Audit
    And Evaluer Checklist Audit
    Then verifier Taux de contrôle et Taux de conformité
    And Ajouter Constats
    When changer compte responsable validation
    When valider constats
    And recuperer numero action
    Then Vérifier Etat Audit
    And changer compte responsable cloture
    When consulter agenda responsable cloture
    And cloturer Audit
    And recuperer numero action
   	#And consulter rapports
   	#Then verifier rapports
   	#Then vérifier Audit cloturé

    Examples:
      | example |
      | 1       |
   	 #|3|

  @TraitementAction
  Scenario Outline: Qualipro-En tant qu utilisateur je veux réaliser et suivre l'action d'un audit
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <example> du <module>
    When saisir <etat> Action a traiter
    When saisir <example> Audit a traiter
    When Realise action a audite
    When suivi action a audite
    Examples:
      | responsable | example | module  | etat   |
      | 13          | 1       | "Audit" | "Real" |
      | 12          | 1       | "Audit" | "suiv" |


  @VerficationTauxAudit
  Scenario Outline: Qualipro-En tant qu utilisateur je veux verfier 4 indicateur
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    And consulter audit
    When saisir <example> Audit a traiter
    And Cliquer sur bouton rechercher
    And  consulter la fiche Audit
    And clique sur Realisation et resultat de l audit
    Then verfication les taux

    Examples:
      | example |
      | 1       |



  @ReporterAudit
  Scenario Outline: Qualipro-En tant qu utilisateur je veux reporter un audit existant
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    And consulter audit
    When saisir <Numero Audit> dans le filtre
    And Cliquer sur bouton rechercher
    And consulter la fiche Audit
    And cliquer sur reporter Audit
    And saisir nouveaux dates
    And valider reporter audit
    Then vérifier <Numero Audit> est reporté

    Examples:
      | Numero Audit |
      | "611"        |


   	

     


  