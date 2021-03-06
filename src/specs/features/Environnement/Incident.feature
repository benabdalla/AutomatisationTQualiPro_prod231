@FicheIncident
Feature: Création et validation d une fiche incident environnemental
  En tant qu utilisateur, je veux créer une fiche incident, la valider, la traiter et la clôturer


  @CréationFicheIncident
  Scenario Outline: Création d une fiche incident environnemental
    Given Ouvrir le site QualiProWeb
    And  saisir Login et PW
    And  cliquer sur ouvrir une session
    When Consulter module Environnement
    And Consulter Sous Module Incident environnemental
    And Consulter Sous Module Liste des incidents
    And Cliquer sur ajouter incident
    And Lire Données <Incident> depuis Excel
    And Saisir désignation Incident
    And Choisir type Incident
    And Choisir Catégorie Incident
    And Choisir Date Incident
    And Saisir Heure Incident
    And Saisir N interne
    And Saisir Détecter par
    And Saisir à l origine
    And Saisir quantité rejeté
    And Choisir Lieu
    And Choisir site incident
    And Choisir processus incident
    And Choisir activité incident
    And Choisir direction incident
    And Choisir service incident
    And Choisir secteur
    And Saisir poste de travail
    And Saisir description Incident
    And Saisir description de cause
    And Saisir des conséquences
    And Rattacher type de conséquence
    And Rattacher type de cause
    And Choisir Gravité
    And Choisir Cout estimé
    And Choisir ISPS
    And Choisir source
    And Saisir Actions immédiates
    And Valider fiche incident
    Then vérifier fiche incident crée
    And Rattacher conformité réglementaire
    And Rattacher aspect
    And Rattacher situation d’urgence
    And rattacher règle de sécurité
    And rattacher pièce jointe
    And rattacher personne à informer
#And rattacher action
    Examples:
      | Incident |
      | 1        |




  @ValidationFicheIncident
  Scenario Outline: en tant que responsable validation paramétré au niveau du type d’incident je souhaite valider la fiche incident
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    When consulter agenda Environnement
    And consulter <exemple> Incident à valider
    And saisir <décision> incident securite à prendre
    Then vérifier que l état de la fiche incident suit <décision>
    Examples:
      | responsable | exemple | module        | décision     |
      | 4           | 1       | "IncidentEnv" | "Validation" |
    #|4|1|"IncidentEnv"|"Correction"|
    #|4|1|"IncidentEnv"|"Refus"|

  @CorrectionFicheIncident
  Scenario Outline:  Qualipro-test:En tant que déclencheur, je veux corriger la fiche incident

    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When  consulter agenda Environnement
    And consulter <Example> Incident à corriger
    And Valider fiche incident
    Then vérifier que l état de la fiche incident suit <décision>
    Examples:
      | Example | décision  |
      | 1       | "Corrige" |


  @DécisionFicheIncident
  Scenario Outline: en tant que responsable décision paramétré par site et processus, je souhaite prendre la décision de la fiche incident

    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    When consulter agenda Environnement
    And consulter <exemple> décision de traitement des incidents
    And choisir responsable traitement
    And choisir responsable clôture
    And choisir délai de traitement
    And saisir cause incident
    And saisir traitement incident
    And choisir type décision
    And valider décision
    Then vérifier que l état de la fiche incident suit <décision>
    Examples:
      | responsable | exemple | module        | décision             |
      | 4           | 1       | "IncidentEnv" | "Pass. resp. Trait." |

  @TraitementFicheIncident
  Scenario Outline: en tant que responsable traitement désigné au niveau de la décision, je souhaite traiter la fiche incident
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    When consulter agenda Environnement
    And consulter <exemple> traitement des incidents
    And Cocher incident traité
    And Saisir cout
    And saisir rapport traitement
    And valider le traitement
    Then vérifier que l état de la fiche incident suit <décision>
    Examples:
      | responsable | exemple | module        | décision            |
      | 8           | 1       | "IncidentEnv" | "Pass. resp. Clot." |


  @ClotureFicheIncident
  Scenario Outline: en tant que responsable clôture paramétré par site et processus, je souhaite cloturer la fiche incident
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    When consulter agenda Environnement
    And consulter <exemple> cloture des incidents
    And Cocher incident cloture
    And Saisir rapport cloture incident sécurite
    And valider la cloture incident sécurite
    Then vérifier que l état de la fiche incident suit <décision>


    Examples:
      | responsable | exemple | module        | décision   |
      | 6           | 1       | "IncidentEnv" | "Cloturée" |

