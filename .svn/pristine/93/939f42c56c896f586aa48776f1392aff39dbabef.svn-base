@tag
Feature: Test Workflow Réclamation Client
  
   En tant qu’utilisateur je souhaite ajouter une fiche réclamation client

  @Paramétrage
  Scenario: Qualipro- Paramétrages des jours fériés
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When cliquer sur paramétrage globale
    When Paramétrages des jours fériés
    Then récupérer des jours fériés

  @AjoutReclamationClient
  Scenario Outline: Qualipro- Test Ajouter fiche Réclamation client
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When Consulter module clients
    And consulter sous module réclamations clients
    And consulter filtre réclamations clients
    And ajouter <example> fiche réclamation client
    And Saisir la réclamation
    And Saisir date de réclamation
    And choisir client
    And Choisir réceptionnaire
    And choisir la nature de la réclamation
    And choisir le type de la réclamation
    And choisir la date de la livraison
    And saisir le numéro de BL
    And choisir la gravité de la réclamation
    And choisir site de la réclamation
    And choisir processus de la réclamation
    And choisir Direction de la réclamation
    And choisir Activité de la réclamation
    And choisir service de la réclamation
    And choisir Avec retour client
    When cliquer sur valider enregistrement réclamation
    Then Fiche réclamation client est ajoutée
    And rattacher un produit
    And ajouter quantité et l’unité et numéro de BL
    And rattacher des personnes à informer
    And rattacher des types de causes réclamation
    And rattacher des fiches de nonconformités
    And rattacher des réclamations fournisseurs
    And rattacher des demandes actions
    And rattacher des pièces jointes

    And rattacher des actions

    #And Récupérer Responsable Décision
    #When vérifier compteur agenda
    #Then incrémentation compteur agenda réclamations clients
    Examples: 
      | example |
      |       1 |




  @DecisionInvestigation
  Scenario Outline: En tant que decideur je souhaite definir les traitements a faire ainsi que les responsables affectées
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    When Consulter agenda réclamations qui nécessitent des décisions
    And Cliquer <exemple> décision de traitement
    And cliquer sur réclamation qui Nécessite investigation
    And saisir responsable investigation réclamation
    And saisir délai investigation réclamation
    And joindre plan investigation réclamation
    And choisir approbateur investigation réclamation
    And valider partie investigation réclamation

    Examples: 
      | responsable | exemple | module              |
      |           2 |       1 | "ReclamationClient" |

  @Decision
  Scenario Outline: En tant que decideur je souhaite definir les traitements a faire ainsi que les responsables affectées
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    When Consulter agenda réclamations qui nécessitent des décisions
    And Cliquer <exemple> décision de traitement
    And saisir le type de la décision
    And saisir le responsable de traitement Reclamation
    And saisir le traitement de la réclamation
    #And  saisir le délai de traitement
    And saisir le responsable de suivi
    When cliquer sur valider décision de la réclamation
    Then vérifier l’état de la réclamation et son passage vers le traitement

    #And rattacher fiche huit D
    #And  rattacher des réclamations fournisseurs
    #And  rattacher des demandes actions
    #And  rattacher des pièces jointes
    #And  rattacher des personnes à informer
    #And  rattacher des actions
    #And Récupérer Responsable Traitement
    Examples: 
      | responsable | exemple | module              |
      |           2 |       1 | "ReclamationClient" |

  @InvestigationRéclamation
  Scenario Outline: Qualipro-test:En tant que responsable investigation, je souhaite traiter l investigation de la non conformité
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    And consulter agenda réclamation qui nécessitent investigation
    And consulter <exemple> réclamation à investiger
    And saisir rapport investigation réclamation
    And valider partie investigation réclamation

    Examples: 
      Examples:

      | responsable | exemple | module              |
      |          12 |       1 | "ReclamationClient" |

  @ApprobationInvestigationRéclamation
  Scenario Outline: Qualipro-test:En tant que approbateur inestigation, je souhaite approuver l investigation de la non conformité
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    And consulter agenda investigation réclamation à approuver
    And consulter <exemple> investigation réclamation à approuver
    And cliquer sur approuvé investigation réclamation
    And valider partie investigation réclamation

    Examples: 
      | responsable | exemple | module              |
      |          13 |       1 | "ReclamationClient" |

  @Traitement
  Scenario Outline: En tant que responsable traitement je souhaite decrire les details de traitement
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    When cliquer sur <exemple> réclamation pour traitement
    And saisir le cout de pénalité
    And saisir les autres frais
    And saisir le rapport de traitement Reclamation
    And cliquer sur valider partie traitement de la réclamation
    #And rattacher des réclamations fournisseurs
    #And rattacher des demandes actions
    #And rattacher des pièces jointes
    #And rattacher des personnes à informer
    #And rattacher des actions
    Then vérifier le passage vers le clôture
    And Vérifier les couts

    #And Récupérer Responsable Suivi
    Examples: 
      | responsable | exemple | module              |
      |           3 |       1 | "ReclamationClient" |

  @Suivi
  Scenario Outline: En tant que responsable suivi je souhaite decider le passage vers l approbation
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    When cliquer sur <exemple> réclamation à clôturer
    And saisir le rapport de clôture
    And cliquer sur valider le clôture de la réclamation
    #And  rattacher des réclamations fournisseurs
    #And  rattacher des demandes actions
    #And  rattacher des pièces jointes
    #And  rattacher des personnes à informer
    #And  rattacher des actions
    Then vérifier le passage de la fiche vers l’approbation finale
    And Récupérer Responsable Approbation

    Examples: 
      | responsable | exemple | module              |
      |           4 |       1 | "ReclamationClient" |

  @Approbation
  Scenario Outline: En tant que responsable approbation je souhaite cloturer la reclamation
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    When Passage de la fiche <exemple> vers l’approbation finale
    #When cliquer sur réclamation à clôturer
    When cliquer sur réclamation pour approbation
    And saisir le commentaire de l’approbateur final
    And cliquer sur réclamation approuvée

    Examples: 
      | responsable | exemple | module              |
      |           5 |       1 | "ReclamationClient" |

  @VerifReclamation
  Scenario: En tant que declencheur je souhaite verifier l etat de la reclamation
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When Consulter module clients
    And consulter sous module réclamations clients
    And consulter filtre réclamations clients
    And saisir Numéro fiche réclamation filtre
    And cliquer sur aperçu fiche réclamation client
    And exporter le rapport reclamation
    Then vérifier si toutes les données existent

  @VerifOutline
  Scenario Outline: 
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When Consulter module clients
    And consulter sous module réclamations clients
    And consulter filtre réclamations clients
    And saisir <Numéro fiche> réclamation filtre
    And cliquer sur aperçu fiche réclamation client
    And exporter le rapport reclamation
    Then vérifier <Numéro fiche>  existent

    Examples: 
      | Numéro fiche |
      | "387"        |
