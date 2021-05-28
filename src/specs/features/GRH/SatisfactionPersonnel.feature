@SatisfactionPersonnel
Feature: Création et réponse à une enquête satisfaction personnel
  En tant qu utilisateur, je veux créer un questionnaire et créer une enquête à partir de ce questionnaire


  @CréationQuestionnairePersonnel
  Scenario Outline: Création d un questionnaire satisfaction personnel
    Given Ouvrir le site QualiProWeb
    And  saisir Login et PW
    And  cliquer sur ouvrir une session
    Then Consulter module GRH
    And Consulter Sous Module Satisfaction Personnel
    When Consulter Sous Module Questionnaire GRH
    And Cliquer sur ajouter questionnaire
    And Lire <Questionnaire> depuis Excel
    And Saisir code questionnaire personnel
    And Saisir titre questionnaire personnel
    And Cliquer valider questionnaire
    Then vérifier ajout de la fiche questionnaire personnel
    And Ajouter introduction
    And Ajouter sections
    And Ajouter questions
    And Ajouter fin
    And Valider Questionnaire
    And Cliquer aperçu questionnaire
    Then Exporter tracabilite
    Then Vérifier la cohérence des données questionnaire

    Examples:
      | Questionnaire |
      | 1             |
      | 1             |
      | 1             |



  @CréationEnquêtePersonnel
  Scenario Outline: Création d une enquête personnel

    Given Ouvrir le site QualiProWeb
    And  saisir Login et PW
    And  cliquer sur ouvrir une session
    Then Consulter module GRH
    And Consulter Sous Module Satisfaction Personnel
    When Consulter Sous Module Enquête GRH
    And Cliquer sur ajouter enquête client
    And Lire données <Enquête> depuis Excel
    And Saisir référence enquête personnel
    And Choisir questionnaire personnel
    And Choisir date début enquête
    And Choisir date fin enquête
    And choisir type enquête
    And choisir site satisfaction personnel
    And choisir processus satisfaction personnel
    And choisir direction satisfaction personnel
    And choisir Activité satisfaction personnel
    And choisir service satisfaction personnel
    And Cliquer valider enquête personnel
    Then vérifier ajout de la fiche enquête personnel
    When Ajouter coefficients des questions jauges personnel
    And Rattacher les personnels concernés
    And Rattacher les personnes habilités à enregistrer les réponses
    And Ajouter pièce jointe personnel
    And Afficher aperçu enquête

    Examples:
      | Enquête |
      | 1       |


  @RéponseEnquêtePersonnel
  Scenario Outline: enregistrement des réponse à partir de l agenda

    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <Personnel>
    When Consulter agenda GRH
    When Lire données <Enquête> depuis Excel
    When Saisir référence enquête à répondre
    Then Saisir réponse personnel

    Examples:
      | Personnel   | Enquête |
      | "TESTAUTO2" | 1       |

  @EnregistrerRéponseEnquête
  Scenario Outline: enregistrement des réponse d un client
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <ResponsableEnregistrement>
    When Consulter agenda GRH
    When Lire données <Enquête> depuis Excel
    Then Enregistrer les réponses des employés concernés


    Examples:
      | ResponsableEnregistrement | Enquête |
      | "AUTO1"                   | 1       |
     

