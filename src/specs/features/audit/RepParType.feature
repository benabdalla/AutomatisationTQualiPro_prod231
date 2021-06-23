@CreationAudit
Feature: Qualipro- Test reporting audit
  En tant que utilisateur je souhaite remplir une fiche audit et décrire les details de réalisation

  @RecupperatinDeDonne
  Scenario Outline: Qualipro-En tant qu utilisateur je veux recupere les  donnee  un audit existant par type
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    And consulter audit
    When saisir <example> Audit a traiter par type
    And saisir Champ d'audit de filter
    And saisir type d'audit de filter
    And  clique  sur rechercher audit
    And recuperer stattistique
    And saisir etat <etatr> d'audit de filter
    And  clique  sur rechercher audit
    And recuperer stattistique
    And saisir etat <etatn> d'audit de filter
    And  clique  sur rechercher audit
    And recuperer stattistique
    Examples:
      | example | etatr     | etatn                |
      | 1       | "REALISE" | "non encore realisé" |


  @EtatDesAuditsParTypeTousFich
  Scenario Outline: Qualipro-En tant qu utilisateur je veux reporter un audit existant par type  avec   tous   les  fiches   audit
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    And consulter reporting Audit par type
    When saisir <example> Audit a traiter par type
    When saisir Type Audit
    When saisir Champ d'audit
    And  clique sur valider rep
    #When saisir Site
   # When Date prévue entre
    Then Exporter tracabilite
    Then vérifier est reporté
    Then delete file
    Examples:
      | example |
      | 1       |

  @TauxDeChargesParAuditeur
  Scenario Outline: Qualipro-En tant qu utilisateur je veux reporter taux d'un audit existant
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When saisir <example> Audit a traiter par type
    And consulter reporting de Taux De Charges Par Auditeur
    When saisir Type Audit de taux
    When Date prévue entre
    And  clique sur valider rep taux
    Then Exporter tracabilite
    Then vérifier est reporté de  taux
    Then delete file
    Examples:
      | example |
      | 1       |
  @ProgramDAudit
  Scenario Outline: Qualipro-En tant qu utilisateur je veux reporter programme d'un audit existant
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When saisir <example> Audit a traiter par type
    And consulter reporting de Programme d'Audit
    When saisir Type de programme d'audit
    When saisir Champ  de programme d'audit
    When Date prévue entre et  programme d'audit
    And  clique sur valider rep
    Then Exporter tracabilite
    Then vérifier est reporté de programme d'audit
    Then delete file
    Examples:
      | example |
      | 1       |




  @EtatDesDauditsParChamp
  Scenario Outline: Qualipro-En tant qu utilisateur je veux reporter l'etat des audits par champ existant
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When saisir <example> Audit a traiter par type
    And consulter reporting de l'etat des audits par champ
    When saisir Champ  de l'etat des audits par champ
    When Date prévue entre
    And  clique sur valider rep
    Then Exporter tracabilite
    Then vérifier est reporté de l'etat des audits par champ
    Then delete file
    Examples:
      | example |
      | 1       |

  @EtatParAudit
  Scenario Outline: Qualipro-En tant qu utilisateur je veux reporter l'etat des audits par champ existant
    Given Ouvrir le site QualiProWeb
    And saisir Login et PW
    And cliquer sur ouvrir une session
    When saisir <example> Audit a traiter par type
    And consulter reporting de audit par état
    When saisir Type Audit
    When  saisir  type  Audit  par etat
    When Date prévue entre
    And  clique sur valider rep
    Then Exporter tracabilite
   # Then vérifier est reporté de audit par état
    Then vérifier est reporté de l'etat des audits par champ
    Then delete file
    Examples:
      | example |
      | 1       |

