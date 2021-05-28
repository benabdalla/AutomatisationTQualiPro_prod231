@DocumentationPlusieurResp
Feature: Qualipro- Test demande de création document
  En tant que utilisateur je souhaite de création un document
  (circuit de validation différent, plusieurs reponsables de vérification et d’approbation)

  @DemandeCreationDoc
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
    Examples:
      | Type document |
      | 2             |

  @CreationParSuperviseur
  Scenario Outline: Qualipro- Test création document
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    And cliquer sur notification agenda boite de dialogue <document>
    And cliquer sur le fichier joint pour stocker le document au niveau de l infrastructure
    And cliquer sur Créer document
    #And saisir code document
    And cliquer sur le fichier joint pour stocker le document au niveau de l infrastructurePP
    And saisir Mot clé spécifique
    And cliquer sur valider Creation Document
    And cliquer sur Rédacteur en bas de page
    Examples:
      | document |
      | 2        |




  @AcceptationRédacteur1
  Scenario Outline: Qualipro-Test acceptation document par le rédacteur1
    Given Ouvrir le site QualiProWeb
    When saisir Login <username>
    And saisir password <password>
    And cliquer sur ouvrir une session
    And consulter agenda documentation documents à valider par le rédacteur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur vérificateur bleu
    Examples:
      | username | password |
      | "AUTO"  | "AUTO"  |

  @RefusRédacteur2
  Scenario Outline: Qualipro-Test Refus document par le rédacteur2

    Given Ouvrir le site QualiProWeb
    When saisir Login <username>
    And saisir password <password>
    And cliquer sur ouvrir une session
    When consulter agenda documentation documents à valider par le rédacteur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur envoyer le document pour correction
    And remplir le commentaire de rejection

    Examples:
      | username    | password    |
      | "TESTAUTO2" | "TESTAUTO2" |

  @RetourAuSuperviseur
  Scenario Outline: Qualipro- Test retour superviseur
    Given Ouvrir le site QualiProWeb
    When saisir Login <username>
    And saisir password <password>
    And cliquer sur ouvrir une session
    And cliquer sur agenda documentation
    And consulter boite superviseur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur valider haut de page
    And cliquer sur rédacteur

    Examples:
      | username | password |
      | "AUTO"  | "AUTO"  |

  @AcceptationRédacteurs
  Scenario Outline: Qualipro- Test acceptation document par les rédacteurs
    Given Ouvrir le site QualiProWeb
    When saisir Login <username>
    And saisir password <password>
    And cliquer sur ouvrir une session
    And consulter agenda documentation documents à valider par le rédacteur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur vérificateur bleu

    Examples:
      | username    | password    |
      | "TESTAUTO2" | "TESTAUTO2" |
      | "AUTO"     | "AUTO"     |

  @AcceptationVérificateur1
  Scenario Outline: Qualipro- Test acceptation document par le vérificateur1
    Given Ouvrir le site QualiProWeb
    When saisir Login <username>
    And saisir password <password>
    And cliquer sur ouvrir une session
    And consulter agenda documentation documents à valider par le vérificateur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur approbateur bleu

    Examples:
      | username | password |
      | "AUTO"  | "AUTO"  |


  @RefusVérificateur2
  Scenario Outline: Qualipro- Test refus document par le vérificateur2
    Given Ouvrir le site QualiProWeb
    When saisir Login <username>
    And saisir password <password>
    And cliquer sur ouvrir une session
    And Ouvrir le site QualiProWeb
    And saisir Login et PW autre compte
    And cliquer sur ouvrir une session
    And consulter agenda documentation documents à valider par le vérificateur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur envoyer le document pour correction
    And remplir le commentaire de rejection

    Examples:
      | username    | password    |
      | "TESTAUTO2" | "TESTAUTO2" |

  @RetourAuSuperviseur
  Scenario Outline: Qualipro- Test retour superviseur
    Given Ouvrir le site QualiProWeb
    When saisir Login <username>
    And saisir password <password>
    And cliquer sur ouvrir une session
    And cliquer sur agenda documentation
    And consulter boite superviseur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur valider haut de page
    And cliquer sur rédacteur

    Examples:
      | username | password |
      | "AUTO"  | "AUTO"  |

  @AcceptationRédacteurs
  Scenario Outline: Qualipro- Test acceptation document par le rédacteurs
    Given Ouvrir le site QualiProWeb
    When saisir Login <username>
    And saisir password <password>
    And cliquer sur ouvrir une session
    And consulter agenda documentation documents à valider par le rédacteur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur vérificateur bleu

    Examples:
      | username    | password    |
      | "TESTAUTO2" | "TESTAUTO2" |
      | "AUTO"     | "AUTO"     |


  @AcceptationVérificateurs
  Scenario Outline: Qualipro- Test acceptation document par le vérificateurs
    Given Ouvrir le site QualiProWeb
    When saisir Login <username>
    And saisir password <password>
    And cliquer sur ouvrir une session
    And consulter agenda documentation documents à valider par le vérificateur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur approbateur bleu

    Examples:
      | username    | password    |
      | "AUTO"     | "AUTO"     |
      | "TESTAUTO2" | "TESTAUTO2" |

  @AcceptationApprobateur
  Scenario Outline: Qualipro- Test acceptation document par approbateurs
    Given Ouvrir le site QualiProWeb
    When saisir Login <username>
    And saisir password <password>
    And cliquer sur ouvrir une session
    And consulter agenda documentation documents à valider par l approbateur
    And insérer code documents
    And cliquer sur le document en question
    And cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme
    And cliquer sur Envoi diffusion bleu

    Examples:
      | username    | password    |
      | "AUTO"     | "AUTO"     |
      | "TESTAUTO2" | "TESTAUTO2" |


  @DiffusionParSuperviseur
  Scenario Outline: Qualipro- Test diffusion document par l approbateur
    Given Ouvrir le site QualiProWeb
    When saisir Login <username>
    And saisir password <password>
    And cliquer sur ouvrir une session
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
    Examples:
      | username | password |
      | "AUTO"  | "AUTO"  |
    
 