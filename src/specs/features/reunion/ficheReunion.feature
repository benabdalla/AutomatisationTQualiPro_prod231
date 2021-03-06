Feature: Qualipro- Test fiche reunion
  En tant que utilisateur je souhaite remplir une fiche réunion

  @reunion
  Scenario Outline: Qualipro-test fiche reunion
    Given Ouvrir le site QualiProWeb
    When saisir Login et PW
    When cliquer sur ouvrir une session
    And consulter reunion
    And cliquer sur ajouter
    And   saisir <exemple> reunion
    Then verifier le declencheur
    When saisir lieu
    And choisir type reunion
    And choisir date prevu
    And saisir ordre de jour
    And choisir site réunion
    And choisir processus réunion
    And choisir activité réunion
    And choisir direction réunion
    And choisir service réunion
    When cliquer sur Valider
    Then fiche reunion validé
    When cliquer sur Ajouter un participant
    When rechercher avec NomPrenom
    And selectionner participant
    And cliquer sur valider
    Then participant ajouter à Liste des participants
    When verefier compteur agenda
    Then incrementation compteur agenda reunion
    When  consulter reunion
    When saisir numero reunion
    And cliquer sur rechercher reunion
    And Ouvrir fiche reunion
    #Then redirection vers fiche réunion
    When sélectionner Etat
    And saisir Date réalisation
    And saisir Durée réalisée
    And cliquer sur valider Réalisation
    And Rattacher action
    Then Taux de réalisation actions est correctement calculer
    When saisir Commentaires
    And cliquer sur valider Commentaires
    And cliquer sur Retour
    And cliquer sur Demande action
    #And cliquer sur Pièces jointes
    And cliquer sur Personnes à informer
    And cliquer sur Selectionner Employe
    #And rechercher avec Nom Prenom Employe
    And selectionner Employe
    And cliquer sur valider selectionner Employe
    When consulter reunion
    And saisir numero reunion
    And choisir Type reunion
    And selectionner etat
    And saisir Ordre de jour
    And cliquer sur rechercher reunion
    Then Liste des reunions contient la fiche reunion à recherche
    And Ouvrir fiche reunion
    When cliquer sur PV
    #When Exporter le rapport
    #When vérifier si tous les donneés existe
    #When consulter reporting
    #When cliquer sur liste des reunions
    #Then vérifier rapport
   #	When Vérifier l'exportation Excel  ( fichier excel généré par l'application est de mauvaise format)
    Examples:
      | exemple |
      | 1       |
      | 1       |
      | 1       |



  @Verifierfiche
  Scenario Outline: verifier fiche reunion
    Given Ouvrir le site QualiProWeb
    When saisir Login et PW
    When cliquer sur ouvrir une session
    When consulter reunion
    And saisir <numero reunion>
    #And choisir Type reunion
    #And selectionner etat
    #And saisir Ordre de jour
    And cliquer sur rechercher reunion
    Then Liste des reunions contient la fiche reunion à recherche
    And Ouvrir fiche reunion
    When cliquer sur PV
    When Exporter le rapport
    When vérifier si tous les donneés existe
    When consulter reporting
    When cliquer sur liste des reunions
    Then vérifier rapport
    #And Vérifier l'exportation Excel

    Examples:
      | numero reunion |
      | "1077"         |