Feature: QualiPro-TestModuleIndicateur
  En tant que utilisateur je souhaite créer une fiche indicateur et faire le suivi via mon agenda

  @EnregistrmentIndicateur
  Scenario Outline: QualiPro-Test Ajout indicateur
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When Consulter module indicateur
    And cliquer sur ajouter un indicateur <example>
    #prévoir une génération aléatoire du libellé
    And Saisir libellé
    And Saisir formule de calcul
    And sélectionner type d indicateur
    #prévoir une date inférieure de 3 mois
    And saisir date début
    #responsable indicateur =possesseur de la session
    And Sélectionner responsable indicateur
    And sélectionner périodicité de suivi
    #saisi manuel de type de suivi
    And sélectionner type de suivi
    #type de résultat derniere valeur
    And sélectionner type de résultat
    And saisir valeur cible
    And saisir unité
    And saisir Limite critique
    #coefficient =2
    And saisir coefficient
    And saisir Site Ind
    And saisir Processus Ind
    And saisir Direction Ind
    And saisir activite Ind
    And saisir Service Ind
    And saisir date remise à zéro
    And saisir périodicité de remise à zéro
    And cliquer sur valider indicateur
    And sélectionner axe politique
    Examples:
      | example |
      | 3       |
     #|4|

  @SUIVIIndicateurQualipro
  Scenario Outline: QualiPro-Test Suivi indicateur manuel
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    And consulter agenda <exemple> indicateur
    And cliquer sur numero indicateur et vérifier l état de suivi
    And cliquer sur ajouter détail de suivi de l indicateur
    And saisir <annee> année
    And sélectionner <periodicite> choisi
    And cliquer bouton importer
    And Vérifier la <valeur> indicateur
    And saisir rapport
    And cliquer sur valider Detail
    Then Vérifier valeur résultante dépendamment du <valeur> et <annee> et <periodicite>
    Then vérifier <Etat> indicateur
    And rattacher une action
    And rattacher fiche risque opportunité
    #And rattacher pièces jointes
    #And vérifier l apercu
    #And cocher indicateur non cloturé en fin de fiche
    Examples:
      | responsable | exemple | module       | periodicite | annee  | valeur | Etat          |
      | 1           | 3       | "Indicateur" | "01"        | "2020" | "121"  | "non atteint" |
     #|3|"02"|"2019"|67|"atteint"|




  @VerifIndicateur
  Scenario Outline: QualiPro-Test vérifier indicateur suivi par formule ou données qualipro
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    And rechercher fiche indicateur déjà créer
    #Then vérifier calcul <valeur> du <periodicite> est correcte
    Then vérifier <Etat> indicateur
    And rattacher une action
    And rattacher fiche risque opportunité
    #And rattacher pièces jointes
    #And vérifier l apercu
    #And cocher indicateur non cloturé en fin de fiche
    Examples:
      | numero | periodicite | valeur | Etat          |
      | 2      | "01"        | "100"  | "non atteint" |
      | 2      | "02"        | "160"  | "atteint"     |