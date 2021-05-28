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
  "duration": 605336200,
  "error_message": "java.lang.NoClassDefFoundError: org/apache/commons/logging/LogFactory\r\n\tat org.apache.http.conn.ssl.AbstractVerifier.\u003cinit\u003e(AbstractVerifier.java:61)\r\n\tat org.apache.http.conn.ssl.AllowAllHostnameVerifier.\u003cinit\u003e(AllowAllHostnameVerifier.java:44)\r\n\tat org.apache.http.conn.ssl.AllowAllHostnameVerifier.\u003cclinit\u003e(AllowAllHostnameVerifier.java:46)\r\n\tat org.apache.http.conn.ssl.SSLConnectionSocketFactory.\u003cclinit\u003e(SSLConnectionSocketFactory.java:146)\r\n\tat org.openqa.selenium.remote.internal.HttpClientFactory.getClientConnectionManager(HttpClientFactory.java:71)\r\n\tat org.openqa.selenium.remote.internal.HttpClientFactory.\u003cinit\u003e(HttpClientFactory.java:57)\r\n\tat org.openqa.selenium.remote.internal.HttpClientFactory.\u003cinit\u003e(HttpClientFactory.java:60)\r\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient$Factory.getDefaultHttpClientFactory(ApacheHttpClient.java:242)\r\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient$Factory.\u003cinit\u003e(ApacheHttpClient.java:219)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.getDefaultClientFactory(HttpCommandExecutor.java:93)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.\u003cinit\u003e(HttpCommandExecutor.java:72)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.\u003cinit\u003e(DriverCommandExecutor.java:63)\r\n\tat org.openqa.selenium.chrome.ChromeDriverCommandExecutor.\u003cinit\u003e(ChromeDriverCommandExecutor.java:40)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:174)\r\n\tat com.qualiprobdd.e2etests.util.ChromeDriverManager.createDriver(ChromeDriverManager.java:79)\r\n\tat com.qualiprobdd.e2etests.util.DriverManager.getDriver(DriverManager.java:26)\r\n\tat com.qualiprobdd.e2etests.util.Setup.setup(Setup.java:50)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:599)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.util.ArrayList.forEach(ArrayList.java:1259)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:764)\r\n\tat org.testng.TestRunner.run(TestRunner.java:585)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:384)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:286)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1140)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1069)\r\n\tat org.testng.TestNG.run(TestNG.java:1037)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)\r\nCaused by: java.lang.ClassNotFoundException: org.apache.commons.logging.LogFactory\r\n\tat java.net.URLClassLoader.findClass(URLClassLoader.java:382)\r\n\tat java.lang.ClassLoader.loadClass(ClassLoader.java:418)\r\n\tat sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:355)\r\n\tat java.lang.ClassLoader.loadClass(ClassLoader.java:351)\r\n\t... 60 more\r\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.consulter_sous_module_Employés()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.cliquer_sur_ajouter_fiche_employé()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_NomPrenom_Employé()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.cliquer_sur_valider_matricule()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_date_de_naissance()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_N_CIN()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_date_de_recrutement()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_Site_employe()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_Processus_employe()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_Activite_employe()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_Direction_employe()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_saisir_Service_employe()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_telephone()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_Etat_civil()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_sexe()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_Adresse_Mail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_Formation_initiale()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_Grade()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.saisir_titre()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.choisir_type_de_travail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.ajouter_une_fonction()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GestionAccesStepDef.valider_fiche_Employé()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2177200,
  "error_message": "java.lang.NullPointerException\r\n\tat com.qualiprobdd.e2etests.util.Setup.afterScenario(Setup.java:75)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:599)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.util.ArrayList.forEach(ArrayList.java:1259)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:764)\r\n\tat org.testng.TestRunner.run(TestRunner.java:585)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:384)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:286)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1140)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1069)\r\n\tat org.testng.TestNG.run(TestNG.java:1037)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)\r\n",
  "status": "failed"
});
});