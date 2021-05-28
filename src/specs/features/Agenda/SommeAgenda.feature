Feature: Test Workflow somme de agenda

  @SommeAgenda
  Scenario Outline: Qualipro- Test somme de agenda
    Given Ouvrir le site QualiProWeb
    When Connecter en tant que <responsable> de l <exemple> du <Agenda>
    When Somme agenda documentation
    When Somme agenda Action
    When Somme agenda Change Control
    When Somme agenda Audit
    When Somme agenda Indicateur
    When Somme agenda Risque Opportunité
    When Somme agenda Pnc
    When Somme agenda client
    When Somme agenda Fournisseur
    When Somme agenda Réunion
    When Somme agenda Métrologie
    When Somme agenda GRH
    When Somme agenda partie interesséss
    When Somme agenda Achat
    When Somme agenda Environnement
    When Somme agenda Sécurite
    When  Somme   agenda Réglementation

    Examples: 
      | responsable | exemple | Agenda        |
      |           1 |       1 | "SommeAgenda" |
