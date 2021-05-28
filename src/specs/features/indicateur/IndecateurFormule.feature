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
      | 2       |
     #|4|



  @SUIVIIndicateurFormule
  Scenario Outline: QualiPro-Test Suivi indicateur manuel

    #And saisir Login et PW
    #And cliquer sur ouvrir une session
    #When Consulter module indicateur
    #And consulter <exemple> indicateur
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <module>
    And consulter agenda <exemple> indicateur
    Then Vérifier suivi formule est correcte selon <Etat>
    Then vérifier <Etat> indicateur
    Examples:
      | responsable | exemple | module       | Etat               |
      | 1           | 2       | "Indicateur" | "non encore suivi" |


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