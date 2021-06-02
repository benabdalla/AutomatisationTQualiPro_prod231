package com.qualiprobdd.e2etests.audit.models;

import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RepAuParTypeModel {


    public static void consulter_reporting_Audit_par_type(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000L);

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",
                FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > a > img")) );
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(2) > a")) );
        JavascriptExecutor executor2 = (JavascriptExecutor)driver;
        executor2.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector(" #menu_rep > div > div > ul > li > ul > li:nth-child(2) > ul > li:nth-child(2) > a")) );


    }


    public static void saisir_Type_Audit() {

    }


    public static void saisir_Champ_d_audit() {

    }


    public static void saisir_Site() {

    }

    public static void saisir_Activité() {

    }

    public static void saisir_Direction() {

    }


    public static void date_prévue_entre() {

    }


    public static void vérifier_Numero_Audit_est_reporté() {

    }



}
