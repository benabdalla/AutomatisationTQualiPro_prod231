Feature: Qualipro- Test demande de création document
  En tant que utilisateur je souhaite de création un document
  (Documentation spirale de validation et de correction, un seul responsable)

  @DocumentaionSpirale
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
    And verifier ajout dans la boite d envoi et vérifier message a été envoyé
    And verifier l incrémentation du compteur
    And cliquer sur notification agenda boite de dialogue
    And cliquer sur le fichier joint pour stocker le document au niveau de l infrastructure
    And cliquer sur Créer document
    #And saisir  code document
    And saisir Mot clé spécifique
    And cliquer sur valider Creation Document
    And cliquer sur Rédacteur en bas de page
    And consulter agenda documentation documents à valider par le rédacteur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur envoyer le document pour correction
    And remplir le commentaire de rejection
    And consulter agenda documentation boite superviseur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur valider haut de page
    And cliquer sur rédacteur
    And consulter agenda documentation documents à valider par le rédacteur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur vérificateur bleu
    And consulter agenda documentation documents à valider par le vérificateur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur envoyer le document pour correction
    And remplir le commentaire de rejection
    And consulter agenda documentation boite superviseur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur valider haut de page
    And cliquer sur rédacteur
    And consulter agenda documentation documents à valider par le rédacteur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
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
    And cliquer sur envoyer le document pour correction
    And remplir le commentaire de rejection
    And consulter agenda documentation boite superviseur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur valider haut de page
    And cliquer sur rédacteur
    And consulter agenda documentation documents à valider par le rédacteur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
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
    And rattacher action
    #And Rattacher formation
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

    Examples: 
      | Type document |
      |             1 |

  @DocumentaionSpiraleAvecReporting
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
    And verifier ajout dans la boite d envoi et vérifier message a été envoyé
    And verifier l incrémentation du compteur
    And cliquer sur notification agenda boite de dialogue
    And cliquer sur le fichier joint pour stocker le document au niveau de l infrastructure
    And cliquer sur Créer document
    #And saisir  code document
    And saisir Mot clé spécifique
    And cliquer sur valider Creation Document
    And cliquer sur Rédacteur en bas de page
    And consulter agenda documentation documents à valider par le rédacteur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur envoyer le document pour correction
    And remplir le commentaire de rejection
    And consulter agenda documentation boite superviseur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur valider haut de page
    And cliquer sur rédacteur
    And consulter agenda documentation documents à valider par le rédacteur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur vérificateur bleu
    And consulter agenda documentation documents à valider par le vérificateur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur envoyer le document pour correction
    And remplir le commentaire de rejection
    And consulter agenda documentation boite superviseur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur valider haut de page
    And cliquer sur rédacteur
    And consulter agenda documentation documents à valider par le rédacteur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
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
    And cliquer sur envoyer le document pour correction
    And remplir le commentaire de rejection
    And consulter agenda documentation boite superviseur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur valider haut de page
    And cliquer sur rédacteur
    And consulter agenda documentation documents à valider par le rédacteur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur vérificateur bleu
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
    And rattacher action
    And Rattacher formation
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
    And Vérifier le calcul des taux de consultation
    And vérifier que les données existent au niveau des listes des documents internes
    And vérifier que les données existent au niveau de l Excel
    And vérifier la maj de l’historique du document motif et indice
    And Supprimer les fichiers temporaires de l infrastructure

    Examples: 
      | Type document |
      |             1 |

  @verificationConsultation
  Scenario Outline: Qualipro- Test demande de création document
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    And cliquer sur raccourci consulter doc interne
    And rechercher <code document> niveau filtre
    And cliquer sur le document interne en question
    And cliquer sur commentaire
    And cliquer sur Ajouter
    And cliquer saisir message au superviseur
    And Envoyer au superviseur
    And Vérifier le calcul des taux de consultation
    And vérifier que les données existent au niveau des listes des documents internes

    #And vérifier que les données existent au niveau des reportings document en cours
    #And vérifier que les données existent au niveau de l Excel
    #And vérifier la maj de l’historique du document motif et indice
    #And Supprimer les fichiers temporaires de l infrastructure
    Examples: 
      | code document |
      | "Auto0052"    |
