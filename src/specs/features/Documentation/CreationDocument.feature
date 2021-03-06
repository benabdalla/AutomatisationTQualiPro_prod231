Feature: Qualipro- Test demande de création document
  En tant que utilisateur je souhaite de création un document

  @BoîteDialogueSuperviseurRédacteur
  Scenario Outline: Qualipro- Test de  création document dans boite dailogue
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When Consulter boite de dialogue
    And cliquer sur superviseur  au Rédacteur
    And siaisir Destinataire
    And Saisir <Type documiiofent>  pour  le rédacteur
    And saisir Objet
    And saisir message
    And saisir fichier lien
    And cliquer sur Envoyer au Rédacteur
    When Connecter en tant que <responsable> de l <exemple> du <module>
    And consulter boite rédacteur
    When  Vérifiez le document reçu

    Examples:
      | Type document | responsable | exemple | module          |
      | 1             | 5           | 1       | "Docummentaion" |


  @Documentaion
  Scenario Outline: Qualipro- Test demande de création document
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When   cliquer  sur  ceration  modification   doc
   When Consulter boite de dialogue
    #And cliquer sur Rédacteur au superviseur
    #And Saisir <Type document>

   # And Saisir Objet
   # And rattacher fichier lien
   # And Saisir message
    #And cliquer sur Envoyer au superviseur
  #  Then verifier ajout dans la boite d envoi et vérifier message a été envoyé
 #   And verifier l incrémentation du compteur
#    When cliquer sur notification agenda boite de dialogue
   # And cliquer sur le fichier joint pour stocker le document au niveau de l infrastructure
    #And cliquer sur Créer document
    #And saisir  code document
    And rattacher fichier lien
    And saisir Mot clé spécifique
    And choisir site lab
    And cliquer sur valider Creation Document
    #And cliquer sur valider en bas de page
    And cliquer sur Rédacteur en bas de page
    And consulter agenda documentation documents à valider par le rédacteur
    And insérer code documents
    And cliquer sur le document en question
#    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur vérificateur bleu
    And consulter agenda documentation documents à valider par le vérificateur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur approbateur bleu
    And consulter agenda documentation documents à valider par l approbateur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur Envoi diffusion bleu
    And consulter agenda documentation documents en attente de diffusion
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document à diffuser et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur Mise en vigueur bleu
    And consulter agenda documentation documents à consulter
    And insérer code documents à consulter
    And cliquer sur le document à consulter
    And cliquer sur Visualiser  document en bleu vérifier son téléchargement et stockage sur plateforme
    And cliquer sur J ai consulté ce document
    And cliquer sur raccourci consulter doc interne
    And rechercher code documents niveau filtre
    And cliquer sur le document interne en question
    And Vérifier nombre et taux de consultation
    And cliquer sur commentaire
    And cliquer sur Ajouter
    And cliquer saisir message au superviseur
    And Envoyer au superviseur
    And Supprimer les fichiers temporaires de l infrastructure

    Examples:
      | Type document |
      | 1             |




  @DocumentaionAvecReporting
  Scenario Outline: Qualipro- Test demande de création document
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When Consulter boite de dialogue
    And cliquer sur Rédacteur au superviseur
    And Saisir <Type document>
    And Saisir Objet
    And rattacher fichier lien
    And Saisir message
    And cliquer sur Envoyer au superviseur
    Then verifier ajout dans la boite d envoi et vérifier message a été envoyé
    And verifier l incrémentation du compteur
    When cliquer sur notification agenda boite de dialogue
    And cliquer sur le fichier joint pour stocker le document au niveau de l infrastructure
    And cliquer sur Créer document
    #And saisir  code document
    And saisir Mot clé spécifique
    And cliquer sur valider Creation Document
    #And cliquer sur valider en bas de page
    And cliquer sur Rédacteur en bas de page
    And consulter agenda documentation documents à valider par le rédacteur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur vérificateur bleu
    And vérifier que les données existent au niveau des reportings document en cours
    And consulter agenda documentation documents à valider par le vérificateur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur approbateur bleu
    And vérifier que les données existent au niveau des reportings document en cours
    And consulter agenda documentation documents à valider par l approbateur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur Envoi diffusion bleu
    And consulter agenda documentation documents en attente de diffusion
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document à diffuser et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur Mise en vigueur bleu
    And consulter agenda documentation documents à consulter
    And insérer code documents à consulter
    And cliquer sur le document à consulter
   And cliquer sur Visualiser  document en bleu vérifier son téléchargement et stockage sur plateforme
    And cliquer sur J ai consulté ce document
    And cliquer sur raccourci consulter doc interne
    And rechercher code documents niveau filtre
    And cliquer sur le document interne en question
    And cliquer sur commentaire
    And cliquer sur Ajouter
    And cliquer saisir message au superviseur
    And Envoyer au superviseur
    And Supprimer les fichiers temporaires de l infrastructure

    #Type document
    @Type_document
    Scenario Outline: Qualipro- type document
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When Consulter Type document
    And cliquer sur boutton ajouter
    And Saisir Type_document_paramétrage
    And sélectionner nature
    And Saisir une périodicité
    And cliquer sur la case à cocher PDF
    And cliquer sur valider type document
    Then Vérifier que le type document ajouté
    Examples:
      | Type document |
      | 1             |

