@tagDemadeFormation
Feature: Qualipro-Test fiche Demande Formation
  En tant qu utulisateur je souhaite enchainer le workflow du demande de formation

  @DemandeFormation
  Scenario Outline: Qualipro- Test remplir et valider fiche demande de formation
    Given Ouvrir le site QualiProWeb
    And  saisir Login et PW
    And  cliquer sur ouvrir une session
    When Consulter module GRH
    And  consulter sous module formations
    And  consulter filtre demande de formation
    And  cliquer sur ajouter fiche demande de formation
    Then  vérifier que le déclencheur est celui qui a connecté
    When  saisir <Numero example> a traiter
    And  Saisir date de prévue de la formation
    And  choisir theme
    And  Choisir organisme
    And  choisir la societe
    And  choisir le site
    And  choisir le processus
    And  choisir l’activité
    And  choisir la direction
    And  choisir le service
    And  Choisir type de formation
    And  Saisir nbre de jours estimé
    And  Choisir Formateur
    And  saisir le cout
    And  saisir le lieu
    And  saisir les objectifs de formation
    And  cliquer ajouter participant
    And  ajouter participants
    #And  ajouter des pièces jointes
    And  cliquer sur valider fiche demande
    Then vérifier demande de formation ajoutée
    And Vérifier Responsable Validation
    Then valider fiche demande de formation par les responsables de validation
    And  vérifier l’ajout de la fiche formation au niveau du planning des demandes de formations
    And  Insérer Numéro fiche formation En Excel
    And  consulter aperçu fiche demande de formation
    And  exporter l’aperçu
    Examples:
      | Numero example |
     | 1              |
     | 2              |
      #| 3              |
     # | 4              |
      #| 5              |

      