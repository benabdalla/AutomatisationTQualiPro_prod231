$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/specs/features/moduleAction/Action.feature");
formatter.feature({
  "name": "Qualipro- Test fiche Action",
  "description": "  En tant que utilisateur je souhaite remplir une fiche Action",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ModuleAction"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Creation fiche Action",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ParemétrageFicheActionDetaille"
    }
  ]
});
formatter.step({
  "name": "Ouvrir le site QualiProWeb",
  "keyword": "Given "
});
formatter.step({
  "name": "saisir Login et PW",
  "keyword": "And "
});
formatter.step({
  "name": "cliquer sur ouvrir une session",
  "keyword": "And "
});
formatter.step({
  "name": "saisir \u003cexemple\u003e action",
  "keyword": "And "
});
formatter.step({
  "name": "consulter  source d\u0027action",
  "keyword": "And "
});
formatter.step({
  "name": "Ajouter   source d\u0027action",
  "keyword": "And "
});
formatter.step({
  "name": "saisir   source d\u0027action",
  "keyword": "And "
});
formatter.step({
  "name": "clique    source d\u0027action",
  "keyword": "And "
});
formatter.step({
  "name": "verifier   source d\u0027action",
  "keyword": "And "
});
formatter.step({
  "name": "consulter  types d\u0027action",
  "keyword": "And "
});
formatter.step({
  "name": "Ajouter  types d\u0027action",
  "keyword": "And "
});
formatter.step({
  "name": "saisir  type d\u0027action",
  "keyword": "And "
});
formatter.step({
  "name": "clique   sur   valider",
  "keyword": "And "
});
formatter.step({
  "name": "verifier  type d\u0027action",
  "keyword": "And "
});
formatter.step({
  "name": "ajuter type de causeso",
  "keyword": "And "
});
formatter.step({
  "name": "saisir  type   de causes",
  "keyword": "And "
});
formatter.step({
  "name": "verifier type de causes",
  "keyword": "And "
});
formatter.step({
  "name": "ajouter  priorité",
  "keyword": "And "
});
formatter.step({
  "name": "saisir  priorité",
  "keyword": "And "
});
formatter.step({
  "name": "verifier priorité",
  "keyword": "And "
});
formatter.step({
  "name": "ajouter gravité",
  "keyword": "And "
});
formatter.step({
  "name": "saisir  gravité",
  "keyword": "And "
});
formatter.step({
  "name": "verifier gravité",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "exemple"
      ]
    },
    {
      "cells": [
        "1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Creation fiche Action",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ModuleAction"
    },
    {
      "name": "@ParemétrageFicheActionDetaille"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Ouvrir le site QualiProWeb",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.ouvrirQualiProWeb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir Login et PW",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.saisirLoginPW()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cliquer sur ouvrir une session",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.clickOuvrirSession()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir 1 action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_action(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "consulter  source d\u0027action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.consulter_source_d_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ajouter   source d\u0027action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.ajouter_source_d_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir   source d\u0027action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_source_d_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clique    source d\u0027action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.clique_source_d_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifier   source d\u0027action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.verifier_source_d_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "consulter  types d\u0027action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.consulter_types_d_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ajouter  types d\u0027action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.ajouter_types_d_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir  type d\u0027action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_type_d_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clique   sur   valider",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.clique_sur_valider()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"input\"}\n  (Session info: chrome\u003d91.0.4472.77)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.0\u0027, revision: \u0027924c4067df\u0027, time: \u00272017-11-30T11:20:39.408Z\u0027\nSystem info: host: \u0027DESKTOP-63DTJNU\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.77, chrome: {chromedriverVersion: 91.0.4472.19 (1bf021f248676..., userDataDir: C:\\Users\\MOOTAZ~1.BEN\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:65157}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: c1fc366d49e38c2824f4b0aba70a375b\n*** Element info: {Using\u003dtag name, value\u003dinput}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.findElement(RemoteWebElement.java:179)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.findElementByTagName(RemoteWebElement.java:271)\r\n\tat org.openqa.selenium.By$ByTagName.findElement(By.java:334)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.findElement(RemoteWebElement.java:175)\r\n\tat com.qualiprobdd.e2etests.moduleAction.models.FicheActionModele.clique_sur_valider(FicheActionModele.java:67)\r\n\tat com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.clique_sur_valider(FicheActionStepDefinition.java:68)\r\n\tat ✽.clique   sur   valider(file:///E:/qualipro/trunk/AutomatisationTQualiPro_prod231/src/specs/features/moduleAction/Action.feature:20)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verifier  type d\u0027action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.verifier_type_d_action()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "ajuter type de causeso",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.ajuter_type_de_causeso()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "saisir  type   de causes",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_type_de_causes()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verifier type de causes",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.verifier_type_de_causes()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "ajouter  priorité",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.ajouter_priorité()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "saisir  priorité",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_priorité()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verifier priorité",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.verifier_priorité()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "ajouter gravité",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.ajouter_gravité()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "saisir  gravité",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_gravité()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verifier gravité",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.verifier_gravité()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Creation fiche Action",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FicheActionDetaille"
    }
  ]
});
formatter.step({
  "name": "Ouvrir le site QualiProWeb",
  "keyword": "Given "
});
formatter.step({
  "name": "saisir Login et PW",
  "keyword": "And "
});
formatter.step({
  "name": "cliquer sur ouvrir une session",
  "keyword": "And "
});
formatter.step({
  "name": "Consulter Action",
  "keyword": "When "
});
formatter.step({
  "name": "cliquer sur ajouter Action détaillée",
  "keyword": "And "
});
formatter.step({
  "name": "saisir \u003cexemple\u003e action",
  "keyword": "And "
});
formatter.step({
  "name": "Ajouter Source",
  "keyword": "And "
});
formatter.step({
  "name": "Saisir Date Création",
  "keyword": "And "
});
formatter.step({
  "name": "Saisir A l origine de l action",
  "keyword": "And "
});
formatter.step({
  "name": "Saisir Désignation",
  "keyword": "And "
});
formatter.step({
  "name": "choisir Type Action",
  "keyword": "And "
});
formatter.step({
  "name": "Saisir Description problème/objet",
  "keyword": "And "
});
formatter.step({
  "name": "choisir Produit",
  "keyword": "And "
});
formatter.step({
  "name": "choisir Types de causes",
  "keyword": "And "
});
formatter.step({
  "name": "Saisir Causes possibles",
  "keyword": "And "
});
formatter.step({
  "name": "saisir Objectif",
  "keyword": "And "
});
formatter.step({
  "name": "saisir référence Audit",
  "keyword": "And "
});
formatter.step({
  "name": "choisir Site",
  "keyword": "And "
});
formatter.step({
  "name": "Choisir Processus",
  "keyword": "And "
});
formatter.step({
  "name": "choisir Activité",
  "keyword": "And "
});
formatter.step({
  "name": "choisir Direction",
  "keyword": "And "
});
formatter.step({
  "name": "choisir service",
  "keyword": "And "
});
formatter.step({
  "name": "choisir un responsable de clôture",
  "keyword": "And "
});
formatter.step({
  "name": "cliquer sur valider Action",
  "keyword": "When "
});
formatter.step({
  "name": "Fiche Action ajouté",
  "keyword": "Then "
});
formatter.step({
  "name": "choisir plusieurs responsables de suivi",
  "keyword": "When "
});
formatter.step({
  "name": "cliquer sur ajouter sous action",
  "keyword": "Then "
});
formatter.step({
  "name": "saisir désignation sous action",
  "keyword": "When "
});
formatter.step({
  "name": "saisir responsable de réalisation",
  "keyword": "And "
});
formatter.step({
  "name": "saisir délais de réalisation",
  "keyword": "And "
});
formatter.step({
  "name": "choisir un responsable de suivi",
  "keyword": "And "
});
formatter.step({
  "name": "choisir délais de suivi",
  "keyword": "And "
});
formatter.step({
  "name": "choisir gravité action",
  "keyword": "And "
});
formatter.step({
  "name": "choisir Priorité SA",
  "keyword": "And "
});
formatter.step({
  "name": "saisir cout previ SA",
  "keyword": "And "
});
formatter.step({
  "name": "saisir Risque SA",
  "keyword": "And "
});
formatter.step({
  "name": "cliquer sur valider sous action",
  "keyword": "When "
});
formatter.step({
  "name": "sous action ajouté a la liste des sous actions",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "exemple"
      ]
    },
    {
      "cells": [
        "1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Creation fiche Action",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ModuleAction"
    },
    {
      "name": "@FicheActionDetaille"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Ouvrir le site QualiProWeb",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.ouvrirQualiProWeb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir Login et PW",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.saisirLoginPW()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cliquer sur ouvrir une session",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.clickOuvrirSession()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Consulter Action",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.consulter_Action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cliquer sur ajouter Action détaillée",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.cliquer_sur_ajouter_Action_détaillée()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir 1 action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_action(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ajouter Source",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.ajouter_Source()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Saisir Date Création",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_Date_Création()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Saisir A l origine de l action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.Saisir_A_l_origine_de_l_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Saisir Désignation",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_Désignation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choisir Type Action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.choisir_Type_Action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Saisir Description problème/objet",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_Description_problème_objet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choisir Produit",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.choisir_Produit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choisir Types de causes",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.choisir_Types_de_causes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Saisir Causes possibles",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_Causes_possibles()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir Objectif",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_Objectif()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir référence Audit",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_référence_Audit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choisir Site",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.choisir_Site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choisir Processus",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.choisir_Processus()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choisir Activité",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.choisir_Activité()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choisir Direction",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.choisir_Direction()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choisir service",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.choisir_service()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choisir un responsable de clôture",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.choisir_un_responsable_de_clôture()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cliquer sur valider Action",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.cliquer_sur_valider_Action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fiche Action ajouté",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.fiche_Action_ajouté()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:99)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\r\n\tat org.testng.Assert.assertTrue(Assert.java:45)\r\n\tat org.testng.Assert.assertTrue(Assert.java:55)\r\n\tat com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.fiche_Action_ajouté(FicheActionStepDefinition.java:367)\r\n\tat ✽.Fiche Action ajouté(file:///E:/qualipro/trunk/AutomatisationTQualiPro_prod231/src/specs/features/moduleAction/Action.feature:61)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "choisir plusieurs responsables de suivi",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.choisir_plusieurs_responsables_de_suivi()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "cliquer sur ajouter sous action",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.cliquer_sur_ajouter_sous_action()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "saisir désignation sous action",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_désignation_sous_action()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "saisir responsable de réalisation",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_responsable_de_réalisation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "saisir délais de réalisation",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_délais_de_réalisation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "choisir un responsable de suivi",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.choisir_un_responsable_de_suivi()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "choisir délais de suivi",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.choisir_délais_de_suivi()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "choisir gravité action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.choisir_gravité_action()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "choisir Priorité SA",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.choisir_Priorité_SA()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "saisir cout previ SA",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_cout_previ_SA()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "saisir Risque SA",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_Risque_SA()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "cliquer sur valider sous action",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.cliquer_sur_valider_sous_action()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "sous action ajouté a la liste des sous actions",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.sous_action_ajouté_a_la_liste_des_sous_actions()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Qualipro- En tant que responsable, je souhaite traiter et suivre l action avec des taux différents",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RealisationetSuiviAction"
    }
  ]
});
formatter.step({
  "name": "Ouvrir le site QualiProWeb",
  "keyword": "Given "
});
formatter.step({
  "name": "saisir Login et PW",
  "keyword": "And "
});
formatter.step({
  "name": "cliquer sur ouvrir une session",
  "keyword": "And "
});
formatter.step({
  "name": "saisir \u003cexemple\u003e action",
  "keyword": "And "
});
formatter.step({
  "name": "Consulter action a traiter",
  "keyword": "When "
});
formatter.step({
  "name": "Réaliser action avec \u003cA taux realisation\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Vérifier etat action realisé",
  "keyword": "Then "
});
formatter.step({
  "name": "Consulter action a suivre",
  "keyword": "And "
});
formatter.step({
  "name": "vérifier taux réalisation",
  "keyword": "Then "
});
formatter.step({
  "name": "suivre action avec \u003cN taux realisation\u003e et \u003ctaux suivi\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Vérifier etat action suivi",
  "keyword": "Then "
});
formatter.step({
  "name": "Clôturée Action",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "exemple",
        "A taux realisation",
        "N taux realisation",
        "taux suivi"
      ]
    },
    {
      "cells": [
        "1",
        "50",
        "30",
        "70"
      ]
    },
    {
      "cells": [
        "1",
        "100",
        "100",
        "100"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Qualipro- En tant que responsable, je souhaite traiter et suivre l action avec des taux différents",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ModuleAction"
    },
    {
      "name": "@RealisationetSuiviAction"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Ouvrir le site QualiProWeb",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.ouvrirQualiProWeb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir Login et PW",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.saisirLoginPW()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cliquer sur ouvrir une session",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.clickOuvrirSession()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir 1 action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_action(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Consulter action a traiter",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.consulter_action_a_traiter()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[1]\"}\n  (Session info: chrome\u003d91.0.4472.77)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.0\u0027, revision: \u0027924c4067df\u0027, time: \u00272017-11-30T11:20:39.408Z\u0027\nSystem info: host: \u0027DESKTOP-63DTJNU\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.77, chrome: {chromedriverVersion: 91.0.4472.19 (1bf021f248676..., userDataDir: C:\\Users\\MOOTAZ~1.BEN\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:62684}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 3cdedc58120028ec97b565ee9571329a\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.findElement(Unknown Source)\r\n\tat com.qualiprobdd.e2etests.moduleAction.models.FicheActionModele.choixNumActionRealisation(FicheActionModele.java:786)\r\n\tat com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.consulter_action_a_traiter(FicheActionStepDefinition.java:626)\r\n\tat ✽.Consulter action a traiter(file:///E:/qualipro/trunk/AutomatisationTQualiPro_prod231/src/specs/features/moduleAction/Action.feature:88)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Réaliser action avec 50",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.réaliser_action_avec(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Vérifier etat action realisé",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.vérifier_etat_action_realisé()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Consulter action a suivre",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.consulter_action_a_suivre()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "vérifier taux réalisation",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.vérifier_taux_réalisation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "suivre action avec 30 et 70",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.suivre_action_avec_et(int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Vérifier etat action suivi",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.vérifier_etat_action_suivi()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Clôturée Action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.Clôturée_Action()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Qualipro- En tant que responsable, je souhaite traiter et suivre l action avec des taux différents",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ModuleAction"
    },
    {
      "name": "@RealisationetSuiviAction"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Ouvrir le site QualiProWeb",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.ouvrirQualiProWeb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir Login et PW",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.saisirLoginPW()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cliquer sur ouvrir une session",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.clickOuvrirSession()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir 1 action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_action(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Consulter action a traiter",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.consulter_action_a_traiter()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[1]\"}\n  (Session info: chrome\u003d91.0.4472.77)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.0\u0027, revision: \u0027924c4067df\u0027, time: \u00272017-11-30T11:20:39.408Z\u0027\nSystem info: host: \u0027DESKTOP-63DTJNU\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.77, chrome: {chromedriverVersion: 91.0.4472.19 (1bf021f248676..., userDataDir: C:\\Users\\MOOTAZ~1.BEN\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:65021}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 75442a2474a103f85bfe7416803cabdf\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.findElement(Unknown Source)\r\n\tat com.qualiprobdd.e2etests.moduleAction.models.FicheActionModele.choixNumActionRealisation(FicheActionModele.java:786)\r\n\tat com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.consulter_action_a_traiter(FicheActionStepDefinition.java:626)\r\n\tat ✽.Consulter action a traiter(file:///E:/qualipro/trunk/AutomatisationTQualiPro_prod231/src/specs/features/moduleAction/Action.feature:88)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Réaliser action avec 100",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.réaliser_action_avec(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Vérifier etat action realisé",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.vérifier_etat_action_realisé()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Consulter action a suivre",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.consulter_action_a_suivre()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "vérifier taux réalisation",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.vérifier_taux_réalisation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "suivre action avec 100 et 100",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.suivre_action_avec_et(int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Vérifier etat action suivi",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.vérifier_etat_action_suivi()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Clôturée Action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.Clôturée_Action()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Vérification Action Non Clôturée",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@VérificationActionNonClôturée"
    }
  ]
});
formatter.step({
  "name": "Ouvrir le site QualiProWeb",
  "keyword": "Given "
});
formatter.step({
  "name": "saisir Login et PW",
  "keyword": "And "
});
formatter.step({
  "name": "cliquer sur ouvrir une session",
  "keyword": "And "
});
formatter.step({
  "name": "Consulter Action",
  "keyword": "When "
});
formatter.step({
  "name": "saisir \u003cexemple\u003e action",
  "keyword": "And "
});
formatter.step({
  "name": "Consulter action a cloture",
  "keyword": "When "
});
formatter.step({
  "name": "cliquer  sur   action   Cloture",
  "keyword": "When "
});
formatter.step({
  "name": "cliquer   sur  non cloture",
  "keyword": "When "
});
formatter.step({
  "name": "Consulter Action",
  "keyword": "When "
});
formatter.step({
  "name": "vérfier  etat action Module",
  "keyword": "When "
});
formatter.step({
  "name": "vérfier etat   action  agenda",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "exemple"
      ]
    },
    {
      "cells": [
        "1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Vérification Action Non Clôturée",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ModuleAction"
    },
    {
      "name": "@VérificationActionNonClôturée"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Ouvrir le site QualiProWeb",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.ouvrirQualiProWeb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir Login et PW",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.saisirLoginPW()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cliquer sur ouvrir une session",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.clickOuvrirSession()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Consulter Action",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.consulter_Action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir 1 action",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.saisir_action(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Consulter action a cloture",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.consulter_action_a_cloture()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cliquer  sur   action   Cloture",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.cliquer_sur_action_Cloture()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cliquer   sur  non cloture",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.cliquer_sur_non_cloture()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Consulter Action",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.consulter_Action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "vérfier  etat action Module",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.vérfier_etat_action_Module()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "vérfier etat   action  agenda",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.vérfier_etat_action_agenda()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});