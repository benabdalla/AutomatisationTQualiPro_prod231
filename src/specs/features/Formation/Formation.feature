Feature: Qualipro- Test fiche formation
  En tant que utilisateur je souhaite ajouter une fiche formation
  #dev_par_Fatma_CHAOUACHI
  @Paramétrage_module_formation
  Scenario Outline: Qualipro_Paramétrage_module_formation
    Given Ouvrir le site QualiProWeb
    And  saisir Login et PW
    And cliquer sur ouvrir une session
    #Type de thèmes
    When Consulter module GRH
   # And  consulter sous module formations
    When saisir code <Numero example> a traiter
    And  consulter sous module Types de thèmes
    And  cliquer sur ajouter Types de thèmes
    And  saisir un Type de thème
    And cliquer sur valider10
    Then vérifier Type de thème ajouté
    #Types de formation Avec évaluation à chaud
    When Consulter module GRH
    And  consulter sous module formations
    And  consulter sous module Types de formation
    And  cliquer sur ajouter Types de formation
    And  saisir un Type de formation
    And  cliquer sur le bouton radio Avec évaluation à chaud
    Then cliquer sur valider Types de formation
    #Société
    When Consulter module GRH
    And  consulter sous module formations
    And  consulter sous module Sociétés
    And  cliquer sur ajouter une Société
    And  saisir une Société
    And cliquer sur valider Société
    Then vérifier une Société ajoutée
    #types de critère d'évaluation
    When Consulter module GRH
    And  consulter sous module formations
    And  consulter sous module type de critère d'évaluation
    And  cliquer sur ajouter  type de critère d'évaluation
    And  saisir type de critère d'évaluation
    And cliquer sur valider type de critère d'évaluation
    Then vérifier type de critère d'évaluation ajoutée
    #Thèmes
    When Consulter module GRH
    And  consulter sous module formations
    And  consulter sous module thèmes de formation
    And  cliquer sur ajouter  thèmes de formation
    And  saisir thèmes de formation
    And choisir un type de Thème
    And cliquer sur valider thèmes de formation
    Then vérifier thèmes de formation ajoutée
    #organisme
    When Consulter module GRH
    And  consulter sous module formations
    And  consulter sous module Organisme
    And  cliquer sur ajouter  Organisme de Formation
    And  saisir Organisme de Formation
    And cliquer sur valider Organisme de Formation
    Then vérifier Organisme de Formation ajoutée
    Examples:
      | Numero example |
      | 1              |


  @Paramétrage
  Scenario: Qualipro- Paramétrage formation pour l évaluation à chaud
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When cliquer sur paramétrage globale
    When cliquer sur paramétrage formation
    Then choisir type évaluation à chaud

  @FicheFormation
  Scenario Outline: Qualipro- Test remplir fiche formation
    Given Ouvrir le site QualiProWeb
    And  saisir Login et PW
    And  cliquer sur ouvrir une session
    When Consulter module GRH
    And  consulter sous module formations
    And  consulter filtre formation
    And  cliquer sur ajouter fiche formation
    When saisir code <Numero example> a traiter
    #And choisir theme formation aleatoire
    And  choisir theme formation
    And  Saisir detail
    And  Choisir organisme formation
    And  saisir objectif de formation
    And  Choisir le type de formation
    And  choisir type formateur
    And  Choisir le Formateur
    And  saisir le cout formation
    And  saisir le restourne formation
    And  saisir le lieu formation
    And  choisir societé formation
    And  choisir le site formation
    And  choisir le processus formation
    And  choisir l’activité formation
    And  choisir la direction formation
    And  choisir le service formation
    And  saisir N formation interne
    And sélectionner evaluation par formateur
    And valider fiche formation
    And ajouter participant
    And ajouter group de travail
    And Choisir le responsable de suivi efficacité
    Then vérifier fiche formation ajoutée


    Examples:
      | Numero example |
      | 1              |

     #|2|
     #|6|


  @RéalisationFormation
  Scenario Outline: En tant que déclencheur ou ayant accès en modification sur la fiche formation,
  je souhaite confirmer la réalisation  de la formation afin d’informer les participants,
  les responsables d’évaluation à chaud  et à froid et ou le formateur
    Given Ouvrir le site QualiProWeb
    And  saisir Login et PW
    And  cliquer sur ouvrir une session
    When Consulter module GRH
    And  consulter sous module formations
    And  consulter filtre formation
    And  consulter la <fiche formation> souhaitée
    And  cliquer sur editer les participants
    And  confirmer l’assistance des participants
    And  valider la confirmation
   #When cliquer sur partie réalisation 
   #And  saisir la justification 
   #And  saisir le détail de réalisation de la formation 
   #And  saisir la date début de réalisation et l’heure 
   #And  saisir la date de fin de réalisation et l’heure
    Then Vérifier la partie réalisation de la fiche formation est validée

    Examples:
      | fiche formation |
      | 1               |
     #|2|
     #|6|


  @EvaluationAchaud
  Scenario Outline: En tant que participant, je souhaite évaluer la formation
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <Participant>
    And accéder agenda formation à chaud
    And choisir <fiche formation> a évaluer
    And saisir les notes d’evaluation
    And saisir un commentaire évaluation
    And saisir suggestion si besoin
    Then valider evaluation à chaud

    Examples:
      | Participant | fiche formation |
      | "AUTO1"     | 1               |

  @EvaluationFormateur
  Scenario Outline: En tant que formateur ou personne habilité à introduire évaluation formateur,
  je souhaite evaluer les différents participants
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que formateur de <example>
    When accéder agenda evaluation en tant que formateur de <example>
    And  cliquer editer pour intégrer les notes
    And  saisir les notes
    Then valider partie evaluation par le formateur

    Examples:
      | example |
      | 1       |
     #|2|
     #|6|


  @EvaluationAfroidMono
  Scenario Outline: En tant que responsable d’évaluation a froid, je souhaite évaluer les participants
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que responsable suivi de <example>
    And consulter agenda evaluation à froid  de <example>
    And evaluer participants a froid
    Then verifier evaluation traite de <example>

    Examples:
      | example |
      | 1       |
     #|2|
     #|6|
