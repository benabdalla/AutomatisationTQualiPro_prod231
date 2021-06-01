$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/specs/features/Administration/GestionAcc%C3%A9s.feature");
formatter.feature({
  "name": "Gestion des accès sur Qualipro",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@GestionAcces"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Qualipro- Test créer un nouveau employé",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AjoutEmployé"
    }
  ]
});
formatter.step({
  "name": "Ouvrir le site QualiProWeb",
  "keyword": "Given "
});
formatter.step({
  "name": "Connecter en tant que \u003cresponsable\u003e de l \u003cexemple\u003e du \u003cmodule\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "consulter sous module Employés",
  "keyword": "And "
});
formatter.step({
  "name": "cliquer sur ajouter fiche employé",
  "keyword": "And "
});
formatter.step({
  "name": "saisir matricule \u003cemploye\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "saisir NomPrenom Employé",
  "keyword": "And "
});
formatter.step({
  "name": "cliquer sur valider matricule",
  "keyword": "And "
});
formatter.step({
  "name": "saisir date de naissance",
  "keyword": "When "
});
formatter.step({
  "name": "saisir N°CIN",
  "keyword": "And "
});
formatter.step({
  "name": "saisir date de recrutement",
  "keyword": "And "
});
formatter.step({
  "name": "choisir Site employe",
  "keyword": "And "
});
formatter.step({
  "name": "choisir Processus employe",
  "keyword": "And "
});
formatter.step({
  "name": "Choisir Activite employe",
  "keyword": "And "
});
formatter.step({
  "name": "Choisir Direction employe",
  "keyword": "And "
});
formatter.step({
  "name": "Choisir saisir Service employe",
  "keyword": "And "
});
formatter.step({
  "name": "saisir telephone",
  "keyword": "And "
});
formatter.step({
  "name": "Choisir Etat civil",
  "keyword": "And "
});
formatter.step({
  "name": "Choisir sexe",
  "keyword": "And "
});
formatter.step({
  "name": "saisir Adresse Mail",
  "keyword": "And "
});
formatter.step({
  "name": "saisir Formation initiale",
  "keyword": "And "
});
formatter.step({
  "name": "saisir Grade",
  "keyword": "And "
});
formatter.step({
  "name": "Saisir titre",
  "keyword": "And "
});
formatter.step({
  "name": "Choisir type de travail",
  "keyword": "And "
});
formatter.step({
  "name": "Ajouter une fonction",
  "keyword": "And "
});
formatter.step({
  "name": "Valider fiche Employé",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "responsable",
        "exemple",
        "module",
        "employe"
      ]
    },
    {
      "cells": [
        "1",
        "14",
        "\"Input\"",
        "1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Qualipro- Test créer un nouveau employé",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@GestionAcces"
    },
    {
      "name": "@AjoutEmployé"
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
  "name": "Connecter en tant que 1 de l 14 du \"Input\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.connecter_en_tant_que_de_l_du(int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "consulter sous module Employés",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.consulter_sous_module_Employés()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cliquer sur ajouter fiche employé",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.cliquer_sur_ajouter_fiche_employé()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir matricule 1",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.saisir_matricule(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir NomPrenom Employé",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.saisir_NomPrenom_Employé()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cliquer sur valider matricule",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.cliquer_sur_valider_matricule()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saisir date de naissance",
  "keyword": "When "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.saisir_date_de_naissance()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#ctl00_ContentPlaceHolder1_datenais\"}\n  (Session info: chrome\u003d90.0.4430.212)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.0\u0027, revision: \u0027924c4067df\u0027, time: \u00272017-11-30T11:20:39.408Z\u0027\nSystem info: host: \u0027DESKTOP-E6OO20B\u0027, ip: \u0027192.168.75.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002716.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.212, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\FATMA~1.CHA\\AppDat...}, goog:chromeOptions: {debuggerAddress: localhost:52454}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 03aa397e7a6ff3d3643de66db2b3326e\n*** Element info: {Using\u003did, value\u003dctl00_ContentPlaceHolder1_datenais}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:78)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:417)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy24.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:51)\r\n\tat com.google.common.collect.Iterators$6.transform(Iterators.java:783)\r\n\tat com.google.common.collect.TransformedIterator.next(TransformedIterator.java:47)\r\n\tat com.google.common.collect.Iterators.addAll(Iterators.java:356)\r\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:143)\r\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:130)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:535)\r\n\tat com.qualiprobdd.e2etests.Administration.Models.GestionAccesModel.saisir_date_de_naissance(GestionAccesModel.java:82)\r\n\tat com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.saisir_date_de_naissance(GestionAccesStepDef.java:75)\r\n\tat ✽.saisir date de naissance(file:///E:/qualipro/trunk/AutomatisationTQualiPro_prod231/src/specs/features/Administration/GestionAccés.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "saisir N°CIN",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.saisir_N_CIN()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "saisir date de recrutement",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.saisir_date_de_recrutement()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "choisir Site employe",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.choisir_Site_employe()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "choisir Processus employe",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.choisir_Processus_employe()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Choisir Activite employe",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.choisir_Activite_employe()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Choisir Direction employe",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.choisir_Direction_employe()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Choisir saisir Service employe",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.choisir_saisir_Service_employe()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "saisir telephone",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.saisir_telephone()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Choisir Etat civil",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.choisir_Etat_civil()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Choisir sexe",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.choisir_sexe()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "saisir Adresse Mail",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.saisir_Adresse_Mail()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "saisir Formation initiale",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.saisir_Formation_initiale()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "saisir Grade",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.saisir_Grade()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Saisir titre",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.saisir_titre()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Choisir type de travail",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.choisir_type_de_travail()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Ajouter une fonction",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.ajouter_une_fonction()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Valider fiche Employé",
  "keyword": "And "
});
formatter.match({
  "location": "com.qualiprobdd.e2etests.Administration.SteDefs.GestionAccesStepDef.valider_fiche_Employé()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});