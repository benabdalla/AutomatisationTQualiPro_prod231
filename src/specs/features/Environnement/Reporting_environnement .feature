
Feature: Reporting-Environnement

    @Reporting-Environnement_Tous
    Scenario Outline: Reporting_Environnement
        Given Ouvrir le site QualiProWeb
        When saisir Login et PW
        When cliquer sur ouvrir une session
        When Consulter Reporting Environnement
        And Cliquer sur Etat Aspect
        And Sélectionner Aspect
        And sélectionner site
        And saisir date
        And cliquer sur le bouton radio tous
        And cliquer sur le bouton valider
        Then vérifier le filtre tous
        Examples:
            | Aspect |
            | 1      |

    @Reporting-Environnement_DES_ASPECTS
    Scenario Outline: Reporting_Environnement
        Given Ouvrir le site QualiProWeb
        When saisir Login et PW
        When cliquer sur ouvrir une session
        When Consulter Reporting Environnement
        And Cliquer sur Etat Aspect
        And Sélectionner Aspect
        And sélectionner site
        And sélectionner facteur
        And saisir date
        And Sélectionner score
        And cliquer sur le bouton radio tous
        And cliquer sur le bouton valider
        Then vérifier le filtre tous
        Examples:
            | Aspect |
            | 1      |

    @Reporting-Environnement_Tous
    Scenario Outline: Reporting_Environnement
        Given Ouvrir le site QualiProWeb
        When saisir Login et PW
        When cliquer sur ouvrir une session
        When Consulter Reporting Environnement
        And Cliquer sur Etat Aspect
        And Sélectionner Aspect
        And sélectionner site
        And saisir date
        And cliquer sur le bouton radio tous
        And cliquer sur le bouton valider
        Then vérifier le filtre tous
        Examples:
            | Aspect |
            | 1      |