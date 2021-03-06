@EvaluationFournisseur
Feature: Evaluation fournisseur


  @CreationFicheEvaluation
  Scenario Outline: En tant qu utilisateur qualipro, je souhaite créer une fiche evaluation fournisseur

    Given Ouvrir le site QualiProWeb
    And  saisir Login et PW
    And  cliquer sur ouvrir une session
    When Consulter Fournisseur
    And Consulter Evaluation Fournisseur
    And Cliquer sur ajouter evaluation
    And lire <evaluation> depuis Excel
    And Selectionner fournisseur
    And Selectionner type produit
    And Selectionner date création
    And Choisir site
    And Choisir processus
    And Choisir activité
    And Choisir direction
    And Choisir service
    And Cliquer sur valider
    Then Vérifier la création de la fiche evaluation fournisseur
    And Vérifier laffichage du message que la somme de coefficient des critères de type de produit est correcte
    And Vérifier historique des évaluations
    And Rattacher des non conformités
    And Rattacher des réclamations fournisseur
    And Rattacher une piece jointe

    Examples:
      | evaluation |
      | 1          |
      | 1          |
      | 1          |


  @Evaluationfournisseur
  Scenario Outline: en tant que responsable critère par type produit, je souhaite Evaluer un Fournisseur
    Given Ouvrir le site QualiProWeb
    And Connecter en tant que responsable <critère>
    When Consulter agenda evaluation fournisseur
    And Consulter type produit <evaluation>
    And Evaluer <critère> de la fiche <evaluation> et <col>
    When Consulter Fournisseur
    And Consulter Evaluation Fournisseur
    And Consulter fiche <evaluation>
    Then Vérifier les notes saisies et la saise du note globale et <indice>
    And Vérifier historique des évaluations
    And Consulter Aperçu
    And Vérifier la cohérence des données
    And Verifier le reporting moyenne des fournisseurs
    And Verifier le reporting historique des moyennes
    And Verifier la rubrique exportation évaluation des fournisseurs
    Examples:
      | critère | evaluation | col | indice |
      | 2       | 1          | 6   | 2      |
      | 1       | 1          | 7   | 1      |

  @CréationFicheAutomatique
  Scenario Outline: en tant que responsable critère par type produit, je souhaite Evaluer un Fournisseur
    Given Ouvrir le site QualiProWeb
    And  saisir Login et PW
    And  cliquer sur ouvrir une session
    When Consulter Fournisseur
 			 #And Consulter type produit
 			 #And Cliquer Ajouter type produit
    And lire <evaluation> depuis Excel
 			 #And Saisir nom type produit
 			 #And Saisir la periodicité
 			 #And Saisir la date de début
 			 #And Cliquer valider type produit
 			 #When Consulter Fournisseur
 			 #And Consulter critèrespar type
 			 #And Selection type de produit 
 			 #And Ajouter criteres
    When Consulter Fournisseur
    And Consulter Module fournisseur
    And consulter fiche fournisseur
    And ajouter type de produit agrée
    When Consulter Fournisseur
    And Consulter Evaluation Fournisseur
    Then Vérifier existence d une fiche evaluation
    When Consulter Fournisseur
    And Consulter Module fournisseur
    And consulter fiche fournisseur
    Then supprimer type de produit agrée
    When Consulter Fournisseur
    And Consulter type produit
    And Cliquer Ajouter type produit
    And lire <evaluation> depuis Excel
    And Saisir nom type produit
    And Saisir la periodicité null
    And Cliquer valider type produit
    Examples:
      | evaluation |
      | 3          |
		
		
