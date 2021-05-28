@GestionAcces
Feature: Gestion des accès sur Qualipro

  @AjoutEmployé
  Scenario Outline: Qualipro- Test créer un nouveau employé
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    And  consulter sous module Employés
    And  cliquer sur ajouter fiche employé
    When saisir matricule <employe>
    And  saisir NomPrenom Employé
    And  cliquer sur valider matricule
    When saisir date de naissance
    And  saisir N°CIN
   # And  saisir date dexpiration
    And  saisir date de recrutement
    And  choisir Site employe
    And  choisir Processus employe
    And  Choisir Activite employe
    And  Choisir Direction employe
    And  Choisir saisir Service employe
    And  saisir telephone
    And  Choisir Etat civil
    And  Choisir sexe
    And  saisir Adresse Mail
    And  saisir Formation initiale
    And  saisir Grade
    And  Saisir titre
    And  Choisir type de travail
    And  Ajouter une fonction
    And  Valider fiche Employé


    Examples:
      | responsable | exemple | module  | employe |
      | 1          | 14     | "Input" | 1       |

  @AppliquerDroitsAccesParModule
  Scenario Outline: Qualipro- Test créer un nouveau employé
    Given Ouvrir le site QualiProWeb
    And  saisir Login et PW
    And  cliquer sur ouvrir une session
    When Consulter menu Administration
    And  consulter sous menu Gestion des droits d'accés
    And  cliquer sur Employé
    When saisir matricule <employe>
    And cliquer sur rechercher employe
    And selectionner employe
    And choisir <module>
    And ajouter <type acces>
    And valider affectation acces
    When connecter en tant que <employe>
    And consulter <module>
    And consulter <menu>
    Then vérifier droits acces affecte

    Examples:
      | employe | type acces | module | menu              |
      | 1       | ajout      | action | Demandes dactions |

  @AppliquerDroitsAccesParMenu
  Scenario Outline: Qualipro- Test créer un nouveau employé
    Given Ouvrir le site QualiProWeb
    And  saisir Login et PW
    And  cliquer sur ouvrir une session
    When Consulter menu Administration
    And  consulter sous menu Gestion des droits d'accés
    And  cliquer sur Employé
    When saisir matricule <employe>
    And cliquer sur rechercher employe
    And selectionner employe
    And choisir <module>
    And choisir <menu>
    And ajouter <type acces>
    And valider affectation acces
    When connecter en tant que <employe>
    And consulter <module>
    And consulter <menu>
    Then vérifier droits acces affecte

    Examples:
      | employe | type acces | module | menu              |
      | 1       | ajout      | action | Demandes dactions |


  @SupprimerDroitsAccesParMenu
  Scenario Outline: Qualipro- Test créer un nouveau employé
    Given Ouvrir le site QualiProWeb
    And  saisir Login et PW
    And  cliquer sur ouvrir une session
    When Consulter menu Administration
    And  consulter sous menu Gestion des droits d'accés
    And  cliquer sur Employé
    When saisir matricule <employe>
    And cliquer sur rechercher employe
    And selectionner employe
    And choisir <module>
    And choisir <menu>
    And supprimer <type acces>
    And valider affectation acces
    When connecter en tant que <employe>
    And consulter <module>
    And consulter <menu>
    Then vérifier droits acces supprime

    Examples:
      | employe | type acces | module | menu              |
      | 1       | ajout      | action | Demandes dactions |


