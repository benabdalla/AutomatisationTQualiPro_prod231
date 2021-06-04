package com.qualiprobdd.e2etests.Environnement.models;


import com.qualiprobdd.e2etests.Environnement.pages.ReportingEnvironnementPage;
import com.qualiprobdd.e2etests.Formation.Pages.FormationPage;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.LocalDateTime;

import static java.lang.Thread.sleep;

public class ReportingEnvironnementModel {
    static String Demandeur, utilisateurs, Reporting;
    static boolean participe;
    private static String
            Path = "resources/testData/TestData.xlsx";


    public static void consulter_Reporting_Environnement(WebDriver driver) throws Throwable  {

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > a > img")) );
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(21) > a")) );
        JavascriptExecutor executor2 = (JavascriptExecutor)driver;
        executor2.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(21) > ul > li:nth-child(1) > a")) );
        Thread.sleep(2000L);

    }


    public static void cliquer_sur_Etat_Aspect() {
      //  ReportingEnvironnementPage.wcliquer_sur_Environnement_xpath.click();

    }


    public static void sélectionner_Aspect(int row) throws Exception {
        String st = "Aspect" + LocalDateTime.now().toString();
        System.out.println("Aspect st15 =  "+st);

        ExcelUtils.setExcelFile(Path, "Reporting-env");
        ExcelUtils.setCellData1(st, row, 4, Path);
        ReportingEnvironnementPage.wsélectionner_Aspect.sendKeys(st);

    }





    public static void sélectionner_site() {


    }

    public static void sélectionner_facteur() {

    }


    public static void saisir_date() {

    }


    public static void sélectionner_score() {

    }


    public static void cliquer_sur_le_bouton_radio_tous() {

    }


    public static void cliquer_sur_le_bouton_valider() {

    }


    public static void vérifier_le_filtre_tous() {

    }


}
