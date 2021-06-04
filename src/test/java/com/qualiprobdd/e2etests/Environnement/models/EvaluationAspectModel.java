package com.qualiprobdd.e2etests.Environnement.models;

import com.qualiprobdd.e2etests.Environnement.pages.EvaluationAspectPage;
import com.qualiprobdd.e2etests.Formation.Pages.FormationPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.codestory.simplelenium.DomElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.LocalDateTime;

public class EvaluationAspectModel {
    static String Demandeur, utilisateurs, NumFormation;
    static boolean participe;
    private static String
            Path = "resources/testData/TestData.xlsx";


    public static void consulter_Sous_Module_Aspects(WebDriver driver) throws Throwable {
        Thread.sleep(500L);
        Common.AccéderModule(15, 0, 0, driver);
        Common.AccéderModule(15,1,0, driver);

    }


    public static void consulter_Sous_Module_Evaluation_des_aspects(WebDriver driver) throws Exception {
        Common.AccéderModule(15,1,1, driver);
    }


    public static void cliquer_sur_ajouter_Evaluation_aspect() throws Throwable {
        Thread.sleep(1000L);
        EvaluationAspectPage.wcliquer_sur_ajouter_Evaluation_aspect.click();

    }

    public static void sélectionner_Aspect_EVALUATION(int row) throws Throwable  {
        Thread.sleep(2000);

        String st = LocalDateTime.now().toString();
        System.out.println("Aspect st1 =  "+st);

        ExcelUtils.setExcelFile(Path, "EvaluationAspect");

        ExcelUtils.setCellData1(st, row, 0, Path);
        EvaluationAspectPage.wsélectionner_Aspect_EVALUATION.sendKeys(st);

    }


    public static void sélectionner_Facteur(int row)  throws Throwable  {
        Thread.sleep(2000);

        String st = LocalDateTime.now().toString();
        System.out.println("facteur st1 =  "+st);

        ExcelUtils.setExcelFile(Path, "EvaluationAspect");

        ExcelUtils.setCellData1(st, row, 1, Path);
        EvaluationAspectPage.wsélectionner_Facteur.sendKeys(st);

    }


    public static void sélectionner_Lieu() {

    }


    public static void sélectionner_condition() {

    }


    public static void cliquer_sur_valider_Evaluation_aspect() {

    }


    public static void vérifier_Evaluation_aspect_ajouté() {

    }
}
