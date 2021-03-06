Feature: Création et validation d une fiche incident environnemental
  En tant qu utilisateur, je veux créer une fiche incident, la valider, la traiter et la clôturer

  @CréationFicheIncidentSec
  Scenario Outline: Création d une fiche incident environnemental
    Given Ouvrir le site QualiProWeb
    And  saisir Login et PW
    And  cliquer sur ouvrir une session
    When Consulter module securité
    And Consulter Sous Module Incident sécurité
    And Consulter Sous Module Liste des incidents sécurité
    And Cliquer sur ajouter incident sécurité
    And Lire Données incident sécurité <Incident> depuis Excel
    And Saisir désignation Incident sécurité
    And Choisir type Incident sécurité
    And Choisir Catégorie Incident sécurité
    And Choisir Date Incident sécurité
    And Saisir Heure Incident sécurité
    And Saisir N interne sécurité
    And Saisir Détecter par sécurité
    And choisir semaine
    And Saisir nombre jour arreté
    And Choisir site incident sécurité
    And Choisir processus incident sécurité
    And Choisir activité incident sécurité
    And Choisir direction incident sécurité
    And Choisir service incident sécurité
    And Choisir secteur sécurité
    And Saisir poste de travail sécurité
    And Saisir description Incident sécurité
    And Saisir description de cause sécurité
    And Saisir des conséquences sécurité
    And Rattacher type de conséquence sécurité
    And Rattacher type de cause sécurité
    And Rattacher cause typique sécurité
    And Rattacher site lésion sécurité
    And Choisir Gravité sécurité
    And Choisir Cout estimé sécurité
    And Choisir ISPS sécurité
    And Choisir evenement déclencheur
    And Saisir Actions immédiates sécurité
    And Valider fiche incident sécurité
    Then vérifier fiche incident sécurité crée
    When Rattacher personne concernée incident sécurité
    And Rattacher des témoins incident sécurité
    And Rattacher conformité réglementaire incident sécurité
#    And Rattacher risque incident sécurité
    And Rattacher situation d’urgence incident sécurité
   # And rattacher règle de sécurité incident sécurité
    And rattacher pièce jointe incident sécurité
    And rattacher personne à informer incident sécurité
    #And rattacher action
    Examples:
      | Incident |
      | 1        |




  @ValidationFicheIncidentSec
  Scenario Outline: en tant que responsable validation paramétré au niveau du type d’incident je souhaite valider la fiche incident
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <username>
    When consulter agenda sécurité
    And consulter <Example> Incident  à valider
    And saisir <décision> incident securite à prendre
    Then vérifier que l état de la fiche incident suit <décision>
    Examples:
      | username | Example | décision     |
      | "AUTO1"  | 1       | "Validation" |
    #|"AUTO"|1|"Correction"|
    #|"AUTO"|1|"Refus"|

  @DécisionFicheIncidentSec
  Scenario Outline: en tant que responsable décision paramétré par site et processus, je souhaite prendre la décision de la fiche incident

    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <username>
    When consulter agenda sécurité
    And consulter <Example> décision de traitement des incidents sécurite
    And choisir responsable traitement incident sécurite
    And choisir responsable clôture incident sécurite
    And choisir délai de traitement incident sécurite
    And saisir cause incident sécurite
    And saisir traitement incident sécurite
    And choisir type décision
    And valider décision incident sécurite
    Then vérifier que l état de la fiche incident suit <décision>
    Examples:
      | username | Example | décision             |
      | "AUTO1"  | 1       | "Pass. resp. Trait." |

  @TraitementFicheIncidentSec
  Scenario Outline: en tant que responsable traitement désigné au niveau de la décision, je souhaite traiter la fiche incident
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <username>
    When consulter agenda sécurité
    And consulter <Example> traitement des incidents sécurite
    And Cocher incident sécurite traité
    And Saisir cout incident sécurite
    And saisir rapport traitement incident sécurite
    And valider le traitement incident sécurite
    Then vérifier que l état de la fiche incident suit <décision>
    Examples:
      | username | Example | décision            |
      | "AUTO1"  | 1       | "Pass. resp. Clot." |

  @ClotureFicheIncidentSec
  Scenario Outline: en tant que responsable clôture paramétré par site et processus, je souhaite cloturer la fiche incident
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <username>
    When consulter agenda sécurité
    And consulter <Example> cloture des incidents sécurite
    And Cocher incident sécurite cloture
    And Saisir rapport cloture incident sécurite
    And valider la cloture incident sécurite
    Then vérifier que l état de la fiche incident suit <décision>


    Examples:
      | username | Example | décision   |
      | "AUTO1"  | 1       | "Cloturée" |

  @CorrectionFicheIncidentSec
  Scenario Outline:  Qualipro-test:En tant que déclencheur, je veux corriger la fiche incident

    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When  consulter agenda sécurité
    And consulter <Example> Incident à corriger
    And Valider fiche incident
    Then vérifier que l état de la fiche incident suit <décision>
    Examples:
      | Example | décision  |
      | 1       | "Corrige" |
      
