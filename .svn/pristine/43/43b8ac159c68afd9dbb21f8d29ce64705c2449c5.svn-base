Feature: Qualipro- Test fiche Action
  En tant que utilisateur je souhaite remplir une fiche Action Simplifiée 

  @FicheActionsimplifiée
  Scenario Outline: Qualipro- Test fiche Action Simplifiée
     Given Ouvrir le site QualiProWeb
     And   saisir Login et PW
     And   cliquer sur ouvrir une session
     #And   changer la langue en anglais
     When  Consulter Action
     And   cliquer sur action simplifiée 
     And   saisir <exemple> action
     And   Saisir Date Création
     And   Ajouter Source
     And   choisir Type Action
     And   Saisir Désignation
     And   choisir Site
     And   Choisir Processus
     And   choisir Activité
     And   choisir Direction
     And   choisir service
     And   choisir un responsable de clôture simplifie
     Then  cliquer sur valider Action simplifiée 
     Then  Fiche Action ajouté
     When  saisir un seul responsable de suivi
     And   saisir la date de suivi
     Then  cliquer sur ajouter sous action simplifiee
		 When saisir désignation sous action
		 And saisir responsable de réalisation
		 And saisir délais de réalisation
		 And Vérifier responsable de suivi
		 And Vérifier délais de suivi
		 When  cliquer sur valider sous action
		 Then  sous action ajouté a la liste des sous actions simplifiee
  	 When  Consulter agenda Action
  	 And   Réaliser Action  
  	 When  Consulter agenda Action
  	 And   Suivi Action
  	 And   Clôturée Action
  	    Examples:
  |exemple|
  |2|
  