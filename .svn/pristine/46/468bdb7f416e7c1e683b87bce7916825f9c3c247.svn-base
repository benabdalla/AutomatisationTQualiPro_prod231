Feature: Qualipro- Test fiche Equipement
  En tant que utilisateur je souhaite remplir une fiche Equipement

  @Paramétrage
  Scenario Outline: Création  fiche   Equipement
    Given Ouvrir le site QualiProWeb
    When saisir Login et PW
    When cliquer sur ouvrir une session
    And saisir ligne  <Example> a excel
    When cliquer sur module Métrologie
    When cliquer sur sous module équipement de mesure
    When cliquer sur sous module machine
    When clique   sur ajouter machine
    When  saisir  nom  de   machine
    When cliquer sur module Métrologie
    When cliquer sur sous module etat  des    équipements
    When clique   sur ajouter etat  des    équipements
    When  saisir  etat  des    équipement
    When saisir Prise en charge au niveau de l'agenda
    When saisir Affiché au niveau de l'état du planning
    When cliquer sur module Métrologie
    When cliquer sur sous module Type intervention
    When  Saisir  Type intervention
    When  saisir Prévention d'alerte
    When saisir  Responsable  type   intervention
   # And rattacher des personnes à informer
    And  verefier Type intervention
    When cliquer sur module Métrologie
    When cliquer sur sous module organiseme
    When  cliquer   sur   ajouter   organiseme
    When  saisir  organiseme
    When cliquer sur module Métrologie
    When cliquer sur sous module Type d'équipement
    When   cliquer  sur   ajouter   Type d'équipement
    When  saisir   Type d'équipement
    Examples:
      | Example |
      | 1       |


  @CreationFicher
  Scenario Outline: Création  fiche   Equipement
    Given Ouvrir le site QualiProWeb
    When saisir Login et PW
    When cliquer sur ouvrir une session
    And saisir ligne  <Example> a excel
    When cliquer sur module Métrologie
    When cliquer sur sous module équipement de mesure
    When cliquer sur ajouter fiche
    When saisir Code équipement
    When saisir Désignation équipement
    When saisir Date mise en service
    When choisir Etat
    When saisir N° de série
    When saisir Précision/Résolution
    When saisir Etendue de mesure
    When saisir Ecart maximal toléré
    When saisir Consigne
    When saisir Consigne Commentaire type équipement
  #  When Sélectionner Fournisseur
    When choisir Appareil critique
    When choisir Type équipement
    When choisir Processus
    When choisir Activité
    When choisir Direction
    When choisir Service
    When cliquer sur Historique des affectations
    When choisir une date historique
    When choisir un site historique
    When choisir dotation historique
    When choisir Emplacement intervention historique
    When cliquer sur validerh
    When cliquer sur valider historique
    When cliquer sur machine list
    When cliquer sur link
    When cliquer sur add
    When cliquer sur delete
    When ajouter liste type d operation
    When valider fiche operation
    # When cliquer sur validerh
    When cliquer sur module Métrologie
    When cliquer sur sous module équipement de mesure
    When rechecher equipement
    Then vérifier l’ajout de la fiche

    #When ajouter operation report
    Examples:
      | Example |
      | 1       |



  @ConsulterAgenda
  Scenario Outline: Consultation de lagenda
    Given Ouvrir le site QualiProWeb
    When saisir Login et PW
    When cliquer sur ouvrir une session
    And saisir ligne  <Example> a excel
    When consulter agenda metrologie
    When cliquer sur operation report
    #When rattacher pièces jointes
    Then cliquer sur R&R

    Examples:
      | Example |
      | 1       |

  @Tracabilite
  Scenario Outline: voir la tracabilite de la fiche
    Given Ouvrir le site QualiProWeb
    When saisir Login et PW
    When cliquer sur ouvrir une session
    And saisir ligne  <Example> a excel
    When cliquer sur module Métrologie
    When cliquer sur sous module équipement de mesure
    Then Rechercher le code de la fiche

    Examples:
      | Example |
      | 1       |
