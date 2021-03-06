
@SatisfactionClient
Feature: Création et réponse à une enquête satisfaction client
  En tant qu utilisateur, je veux créer un questionnaire et créer une enquête à partir de ce questionnaire
  
  Background: utilisateur connecte
  Given Ouvrir le site QualiProWeb
  And  saisir Login et PW
  And  cliquer sur ouvrir une session
 	Then Consulter module clients
 	And Consulter Sous Module Satisfaction client

  @CréationQuestionnaire
  Scenario Outline: Création d un questionnaire satisfaction client 

  When Consulter Sous Module Questionnaire
  And Cliquer sur ajouter questionnaire
  And Lire <Questionnaire> depuis Excel
  And Saisir code questionnaire
  And Saisir titre questionnaire
  And Cliquer valider questionnaire
  Then vérifier ajout de la fiche questionnaire
  And Ajouter introduction
  And Ajouter sections
  And Ajouter questions
  And Ajouter fin 
  And Valider Questionnaire
  And Cliquer aperçu questionnaire
  Then Exporter tracabilite
  Then Vérifier la cohérence des données questionnaire
    Then delete file
 		

    Examples: 
     |Questionnaire|
     |1|
   

  
@CréationEnquête
  Scenario Outline: Création d une enquête client

  
  When Consulter Sous Module Enquête client
  And Cliquer sur ajouter enquête client
  And Lire données <Enquête> depuis Excel
  And Saisir référence enquête
  And Choisir questionnaire
  And Choisir date début enquête
  And Choisir date fin enquête
  And choisir mode enquête
  And Cliquer valider enquête
  Then vérifier ajout de la fiche enquête
  When Ajouter coefficients des questions jauges
  And Rattacher les clients concernés
  And Rattacher des actions 
  And Ajouter action
  And Valider enquête
  And Ajouter pièce jointe
  And Envoyer enquête aux clients
  Then vérifier réception mail
  And Exporter enquête
  And Afficher aperçu enquête
   Then Exporter tracabilite
  Then Vérifier la cohérence des données questionnaire
  Then delete file

    Examples: 
      |Enquête|
      |1|
      
      
      @RéponseEnquête
      Scenario Outline: enregistrement des réponse d un client
  		When Consulter Sous Module Enregistrement Réponse
  		When Lire données <Enquête> depuis Excel
  		When Saisir référence enquête à traiter
  		When rechercher enquête à traiter
  		When consulter fiche enquête à traiter
			When la liste des clients suivante
			|FIAT|
		 	|COMETE|
			|SOFRECOM| 
			Then Enregistrer réponses client
        Then delete file
			
    Examples: 
      |Enquête|
      |1|
      
