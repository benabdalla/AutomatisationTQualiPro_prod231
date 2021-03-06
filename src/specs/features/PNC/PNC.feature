Feature: Qualipro- Test fiche PNC En tant que utilisateur je souhaite remplir une fiche PNC

  @Paramétrage
  Scenario: Qualipro- Paramétrage formation pour l évaluation à chaud
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When cliquer sur paramétrage globale
    When cliquer sur paramétrage PNC
    Then choisir Un seul produit / un seul type de NC ou  Plusieurs produits / plusieurs Types de NC

  @CréerFichePNCPlusieursProduitsPlusieursTypesNC
  Scenario Outline: Qualipro-test:En tant qu utilisateur, je veux créer une fiche PNC avec plusieurs produits et plusieurs Types de NC
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When Consulter PNC
    And cliquer sur ajouter PNC
    And saisir code PNC <Example> a traiter
    And Saisir Description de la nonconformité
    And Saisir actions immediates
    And saisir numéro interne de la fiche PNC
    And Saisir date de livraison
    And saisir date de détection
    And choisir le nom de celui qui a détecté la PNC
    And choisir fournisseur PNC
    And sélectionner la gravité
    And sélectionner la ISPS
    And saisir site PNC
    And saisir processus PNC
    And saisir Activité PNC
    And saisir direction PNC
    And saisir service PNC
    And chosir type de détection
    And saisir la source de NC
    And saisir l atelier
    And sasir l origine de la PNC
    And cliquer   sur   ajouter  produit
    And saisir Numéro de OF2
    And saisir le numéro de lot22
    And cliquer  sur   select   produit
    And rechercher  produit
    And select   produit
    And saisir quantité détectée2
    And saisir quantité produite2
    And choisir unite2
    And valider produit
    And valide  Taux de non conformité2
    And clique   sur   ajouter   type  nc
    And select  type   nc2
    And saisir  Pourcentage2
    And select  type   nc2
    And saisir  Pourcentage2
    And cliquer  sur   valider
    And verfier   list   produit
    And cliquer   sur   ajouter  produit
    And saisir Numéro de OF2
    And saisir le numéro de lot22
    And saisir code produit
    And saisir nom produit produit
    And select  famille de produit
    And cliquer Valider du produit ajouté
    And saisir quantité détectée2
    And saisir quantité produite2
    And choisir unite2
    And valider produit
    And valide  Taux de non conformité2
    And clique   sur   ajouter   type  nc
    And select  type   nc2
    And saisir  Pourcentage2
    And select  type   nc2
    And saisir  Pourcentage2
    And verfier   list   produit
    When cliquer sur valider enregistrement
    Then Fiche PNC ajoutée
    And rattacher des types de causes

    Examples: 
      | Example |
      |       1 |



  @CréerFichePNC
  Scenario Outline: Qualipro-test:En tant qu utilisateur, je veux créer une fiche PNC
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When Consulter PNC
    And cliquer sur ajouter PNC
    And saisir code PNC <Example> a traiter
    And Saisir Description de la nonconformité
    And Saisir actions immediates
    And saisir numéro interne de la fiche PNC
    And Saisir date de livraison
    And saisir date de détection
    And choisir le nom de celui qui a détecté la PNC
    And choisir fournisseur PNC
    And sélectionner la gravité
    And saisir site PNC
    And saisir processus PNC
    And saisir Activité PNC
    And saisir direction PNC
    And saisir service PNC
   # And cliquer   sur   ajouter  produit
    And saisir Numéro de OF
    And saisir le numéro de lot
    And saisir produit PNC
    And saisir quantité détectée
    And saisir quantité produite
    And choisir unite PNC
    And saisir la source de NC
    And saisir l atelier
    And sasir l origine de la PNC
    And chosir type de détection
    And saisir type de NC
    When cliquer sur valider enregistrement
    Then Fiche PNC ajoutée
    Then Vérifier taux de non conformité
    And rattacher des types de causes

    Examples: 
      | Example |
      |       1 |

  @ValiderFichePNC
  Scenario Outline: Qualipro-test:En tant que responsable validation paramétré au niveau du type PNC, je veux valider la fiche PNC
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    When consulter agenda PNC
    And consulter <exemple> PNC à valider
    And cliquer sur PNC à valider
    And saisir <décision> à prendre
    When Consulter PNC
    Then Rechercher Nfiche PNC
    Then vérifier que l état de la fiche PNC suit <décision>

    Examples: 
      | responsable | exemple | module | décision     |
      |           5 |       1 | "PNC"  | "Validation" |

  @DécisionInvestigation
  Scenario Outline: Qualipro-test:En tant que décideur de traitement, je souhaite remplir la partie décison de traitement en considérant la nécessité d investigation
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    When consulter agenda PNC
    And cliquer sur décision de traitement
    And consulter <exemple> PNC pour décision de traitement
    And cliquer sur Nécessite investigation
    And saisir responsable investigation
    And saisir délai investigation
    And joindre plan investigation
    And choisir approbateur investigation
    And valider partie investigation
    When consulter agenda PNC
    And cliquer sur investigation à éffectuer
    And consulter <exemple> PNC à investiger
    And saisir rapport investigation
    And valider partie investigation

    Examples: 
      | responsable | exemple | module |
      |           6 |       1 | "PNC"  |
      
       @ApprobationInvestigationPNC
  Scenario Outline: Qualipro-test:En tant que approbateur inestigation, je souhaite approuver l investigation de la non conformité
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    When consulter agenda PNC
    And cliquer sur investigation à approuver
    And consulter <exemple> PNC à approuver investigation
    And cliquer sur investigation approuvé
    And valider partie investigation

    Examples: 
      | responsable | exemple | module |
      |          12 |       1 | "PNC"  |

  @DécisionDeTraitement
  Scenario Outline: Qualipro-test:En tant que décideur de traitement, je souhaite remplir la partie décison de traitement
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    When consulter agenda PNC
    And cliquer sur décision de traitement
    And consulter <exemple> PNC pour décision de traitement
    And saisir cause de NC
    And saisir le responsable de traitement
    And saisir délai de traitement
    And saisir type responsable traitement
    And saisir le traitement de NC
    And saisir le type de traitement de NC
    And saisir le nom du responsable de suivi
    #And rattacher des réclamations fournisseurs
    #And rattacher des demandes actions
    #And rattacher des pièces jointes
    #And rattacher des personnes à informer
    #And rattacher des actions
    When cliquer sur valider décision
    Then vérifier que l état de la fiche PNC suit <décision>
    Examples:
      | responsable | exemple | module | décision                  |
      |           6 |       1 | "PNC"  | "Pass. resp. val. Trait." |

  #|5|1|"PNC"|"Correction"|
  #|5|1|"PNC"|"Refus"|
  @ValiderDécisionTraitement
  Scenario Outline: Qualipro-test:En tant que responsable validation traitement paramétré au niveau du (type traitement, site, processus), je veux valider la décision de traitement
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    And consulter <exemple> décision de traitement à valider
    And saisir <décision> validation de décision de Traitement à prendre

    #Then vérifier que l état de la fiche PNC suit <décision>
    Examples:
      | responsable | exemple | module | décision          |
      |           6 |       1 | "PNC"  | "val. Dec. Trait" |

  @TraitementPNC
  Scenario Outline: Qualipro-test:En tant que responsable traitement, je souhaite traiter la non conformité
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    And cliquer sur <exemple> PNC à traiter
    And cliquer sur phase traitée
    And saisir le rapport de traitement
    And saisir la date de traitement
    When saisir le cout de traitement
    And saisir la quantité rejetée
    And saisir la quantité acceptée
    And saisir la quantité dégradée
    And saisir le pourcentage de dépréciation
    When cliquer sur valider traitement
    Then vérifier calcul cout traitement et valeur déclassée et valeur rejetée
    Then Fiche PNC traitée

    Examples: 
      | responsable | exemple | module |
      |          16 |       1 | "PNC"  |

  #|16|1|"PNC"|
  @SuiviPNC
  Scenario Outline: Qualipro-test:En tant que responsable suivi, je souhaite cloture la non conformité
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    Then cliquer sur <exemple> PNC à clôturer
    And cliquer sur PNC clôturée
    And saisir rapport de clôture
    When cliquer sur valider cloture
    Then la fiche PNC est cloturée

    Examples: 
      | responsable | exemple | module |
      |          19 |       1 | "PNC"  |

  #|7|1|"PNC"|"refus. Dec. Trait"|
 

  #|6|1|"PNC"|"Pass. resp. Trait."|
  @approbationFinale
  Scenario Outline: Qualipro-test:En tant que responsable suivi je souhaite approuver la non conformité
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    Then cliquer sur <exemple> approbation des PNC
    And cliquer sur PNC approuvée
    And saisir le commentaire d approbation
    And cliquer sur valider approbation
    When Consulter PNC
    Then Rechercher Nfiche PNC
    And consulter fiche PNC
    And cliquer sur aperçu

    Examples: 
      | responsable | exemple | module |
      |           8 |       1 | "PNC"  |

  #Amira
  @ReportingBilanDesNonConformitesProduits
  Scenario: reporting Bilan des non conformites produits
    Given Ouvrir le site QualiProWeb
    When saisir Login et PW
    When cliquer sur ouvrir une session
    When Consulter reporting Bilan des non conformités produits
    When récupérer filtre reporting Bilan des non conformités produits
    And saisir filtre reporting
    #Then Exporter les données
    Then Exporter tracabilite
    And vérifier les données rapport Bilan des non conformités produits
      Then delete file 

  @CorrectionFichePNC
  Scenario Outline: Qualipro-test:En tant que déclencheur, je veux corriger la fiche PNC
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When consulter agenda PNC
    And consulter <Example> PNC à corriger
    And cliquer sur PNC à corriger
    When cliquer sur valider enregistrement
    When Consulter PNC
    Then Rechercher Nfiche PNC
    Then vérifier que l état de la fiche PNC suit <décision>

    Examples: 
      | Example | décision  |
      |       1 | "Corrige" |
