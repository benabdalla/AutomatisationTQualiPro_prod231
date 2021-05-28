$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/specs/features/Administration/GestionAccés.feature");
formatter.feature({
  "line": 2,
  "name": "Gestion des accès sur Qualipro",
  "description": "",
  "id": "gestion-des-accès-sur-qualipro",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@GestionAcces"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Qualipro- Test créer un nouveau employé",
  "description": "",
  "id": "gestion-des-accès-sur-qualipro;qualipro--test-créer-un-nouveau-employé",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@AjoutEmployé"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Ouvrir le site QualiProWeb",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Connecter en tant que \u003cresponsable\u003e de l \u003cexemple\u003e du \u003cmodule\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "consulter sous module Employés",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "cliquer sur ajouter fiche employé",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "saisir matricule \u003cemploye\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "saisir NomPrenom Employé",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "cliquer sur valider matricule",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "saisir date de naissance",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "saisir N°CIN",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "# And  saisir date dexpiration"
    }
  ],
  "line": 16,
  "name": "saisir date de recrutement",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "choisir Site employe",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "choisir Processus employe",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Choisir Activite employe",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Choisir Direction employe",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Choisir saisir Service employe",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "saisir telephone",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Choisir Etat civil",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Choisir sexe",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "saisir Adresse Mail",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "saisir Formation initiale",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "saisir Grade",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Saisir titre",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Choisir type de travail",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Ajouter une fonction",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Valider fiche Employé",
  "keyword": "And "
});
formatter.examples({
  "line": 34,
  "name": "",
  "description": "",
  "id": "gestion-des-accès-sur-qualipro;qualipro--test-créer-un-nouveau-employé;",
  "rows": [
    {
      "cells": [
        "responsable",
        "exemple",
        "module",
        "employe"
      ],
      "line": 35,
      "id": "gestion-des-accès-sur-qualipro;qualipro--test-créer-un-nouveau-employé;;1"
    },
    {
      "cells": [
        "1",
        "14",
        "\"Input\"",
        "1"
      ],
      "line": 36,
      "id": "gestion-des-accès-sur-qualipro;qualipro--test-créer-un-nouveau-employé;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2989316600,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Qualipro- Test créer un nouveau employé",
  "description": "",
  "id": "gestion-des-accès-sur-qualipro;qualipro--test-créer-un-nouveau-employé;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@GestionAcces"
    },
    {
      "line": 4,
      "name": "@AjoutEmployé"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Ouvrir le site QualiProWeb",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Connecter en tant que 1 de l 14 du \"Input\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "consulter sous module Employés",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "cliquer sur ajouter fiche employé",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "saisir matricule 1",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "saisir NomPrenom Employé",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "cliquer sur valider matricule",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "saisir date de naissance",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "saisir N°CIN",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "# And  saisir date dexpiration"
    }
  ],
  "line": 16,
  "name": "saisir date de recrutement",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "choisir Site employe",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "choisir Processus employe",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Choisir Activite employe",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Choisir Direction employe",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Choisir saisir Service employe",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "saisir telephone",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Choisir Etat civil",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Choisir sexe",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "saisir Adresse Mail",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "saisir Formation initiale",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "saisir Grade",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Saisir titre",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Choisir type de travail",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Ajouter une fonction",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Valider fiche Employé",
  "keyword": "And "
});
formatter.match({
  "location": "AuthentificationStepDefinition.ouvrirQualiProWeb()"
});
formatter.result({
  "duration": 6600252100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 22
    },
    {
      "val": "14",
      "offset": 29
    },
    {
      "val": "Input",
      "offset": 36
    }
  ],
  "location": "AuthentificationStepDefinition.connecter_en_tant_que_de_l_du(int,int,String)"
});
formatter.result({
  "duration": 22272239900,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.consulter_sous_module_Employés()"
});
formatter.result({
  "duration": 25188589000,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.cliquer_sur_ajouter_fiche_employé()"
});
formatter.result({
  "duration": 159943200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 17
    }
  ],
  "location": "GestionAccesStepDef.saisir_matricule(int)"
});
formatter.result({
  "duration": 849026400,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_NomPrenom_Employé()"
});
formatter.result({
  "duration": 669958000,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.cliquer_sur_valider_matricule()"
});
formatter.result({
  "duration": 1042525400,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_date_de_naissance()"
});
formatter.result({
  "duration": 1038649700,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_N_CIN()"
});
formatter.result({
  "duration": 325561000,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_date_de_recrutement()"
});
formatter.result({
  "duration": 543867900,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_Site_employe()"
});
formatter.result({
  "duration": 28200,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_Processus_employe()"
});
formatter.result({
  "duration": 34500,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_Activite_employe()"
});
formatter.result({
  "duration": 24200,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_Direction_employe()"
});
formatter.result({
  "duration": 52700,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_saisir_Service_employe()"
});
formatter.result({
  "duration": 34100,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_telephone()"
});
formatter.result({
  "duration": 317486000,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_Etat_civil()"
});
formatter.result({
  "duration": 217281600,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_sexe()"
});
formatter.result({
  "duration": 148315100,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_Adresse_Mail()"
});
formatter.result({
  "duration": 105800,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_Formation_initiale()"
});
formatter.result({
  "duration": 524802500,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_Grade()"
});
formatter.result({
  "duration": 407809100,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_titre()"
});
formatter.result({
  "duration": 394658400,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_type_de_travail()"
});
formatter.result({
  "duration": 42500,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.ajouter_une_fonction()"
});
formatter.result({
  "duration": 22100,
  "status": "passed"
});
formatter.match({
  "location": "GestionAccesStepDef.valider_fiche_Employé()"
});
formatter.result({
  "duration": 14900,
  "status": "passed"
});
formatter.after({
  "duration": 59600,
  "status": "passed"
});
});