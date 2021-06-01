package com.qualiprobdd.e2etests.audit.stepdefs;

import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;


import com.qualiprobdd.e2etests.moduleAction.models.FicheActionModele;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.util.*;

import io.cucumber.java.en.*;

import org.apache.tools.ant.taskdefs.Java;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qualiprobdd.e2etests.Documentation.pages.DocumentationPage;
import com.qualiprobdd.e2etests.audit.models.ModuleAuditsModel;
import com.qualiprobdd.e2etests.audit.pages.ModuleAuditsPage;


@Test
public class ModuleAuditsStepDefinition {

    public WebDriver driver;
    public String numAudit;
    private static Common common = new Common();
    public static String etat = "";
    int row;
    private static String Path = "resources/testData/TestData.xlsx";

    public ModuleAuditsStepDefinition() {
        driver = Setup.driver;
        PageFactory.initElements(driver, ModuleAuditsPage.class);
        PageFactory.initElements(driver, FicheActionPage.class);

    }

    int numbAct = 0;
    int tauxReal = 0;
    int tauxSuivi = 0;
    int constat = 0;


    @When("^clique sur Realisation et resultat de l audit$")
    public void clique_sur_Realisation_et_resultat_de_l_audit() throws Throwable {
        JavascriptExecutor excutor = (JavascriptExecutor) driver;
        excutor.executeScript("arguments[0].click()", ModuleAuditsPage.RealisationXPATH);
List<WebElement> rows=ModuleAuditsPage.wtabActionConstat.findElements(By.tagName("tr"));
constat= rows.size()-1;
        System.out.println("Number constat = " +  constat);


        for (int i = 1; i < 4; i++) {
            Thread.sleep(2000);

            if (ModuleAuditsPage.wtabActionConstat.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr[" + i + "]/td[8]")).getText() != "") {

                numbAct++;
                System.out.println("Number Action = " + numbAct);
            }
            Thread.sleep(2000);

            tauxReal += Integer.parseInt(ModuleAuditsPage.wtabActionConstat.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr[" + i + "]/td[9]")).getText());
            System.out.println("taux Real = " + tauxReal);
            Thread.sleep(2000);

            tauxSuivi += Integer.parseInt(ModuleAuditsPage.wtabActionConstat.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr[" + i + "]/td[10]")).getText());
            System.out.println("taux Suivi = " + tauxSuivi);
            Thread.sleep(2000);

        }

        int findings=Integer.parseInt(ModuleAuditsPage.wnbrConstat.getAttribute("value"));
        Assert.assertTrue(findings==constat);
    }

    @Then("^verfication les taux$")
    public void verfication_les_taux() throws Throwable {
        Thread.sleep(1000);

        ModuleAuditsPage.wEnriAudit.click();

        Thread.sleep(500);
        String str1 = driver.findElement(By.cssSelector("#gg1 > svg > text:nth-child(6) > tspan")).getText();
        Thread.sleep(1000);

        Assert.assertTrue(Integer.parseInt(str1)==constat);

        System.out.println(" str1 " + str1);
        String Str2 = driver.findElement(By.cssSelector("#gg2 > svg > text:nth-child(6) > tspan")).getText();
        Thread.sleep(1000);
        int ratOfAction=(int)(numbAct/Integer.parseInt(str1))*100;
        Assert.assertTrue(Integer.parseInt(Str2)==ratOfAction);

        System.out.println(" str2 " + Str2);

        String str3 = driver.findElement(By.cssSelector("#gg3 > svg > text:nth-child(6) > tspan")).getText();
        Thread.sleep(1000);
        int taurat=(int)(tauxReal/constat);
        Assert.assertTrue(Integer.parseInt(str3)==taurat);

        System.out.println(" str3 " + str3);

        String str4 = driver.findElement(By.cssSelector("#gg4 > svg > text:nth-child(6) > tspan")).getText();
        int tausuiv=(int)(tauxSuivi/constat);
        Assert.assertTrue(Integer.parseInt(str4)==tausuiv);
        System.out.println(" str4 " + str4);


    }

    @When("^verification  nomber   de   constat  et  l'action$")
    public void verification_nomber_de_constat_et_l_action() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^taux  effcacite   et taux   de  realisation$")
    public void taux_effcacite_et_taux_de_realisation() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^saisir (\\d+) Audit a traiter$")
    public void saisir_Audit_a_traiter(int arg1) throws Throwable {
        row = arg1;
        Cookie cookie1 = driver.manage().getCookieNamed("lan");
        System.out.println(cookie1.getValue());

    }


    @And("^recherecher audit (\\d+)$")
    public void recherecher_audit(int arg1) throws Throwable {
        row = arg1;
        Cookie cookie1 = driver.manage().getCookieNamed("lan");
        System.out.println(cookie1.getValue());

    }

    @When("^saisir \"([^\"]*)\" Action a traiter$")
    public void saisir_Action_a_traiter(String arg1) throws Throwable {
        etat = arg1;


    }

    @When("^Realise action a audite$")
    public void Realise_action_a_audite() throws Throwable {
        int k = 21;
        int i = 0;
        ExcelUtils.setExcelFile(Path, "Audit");
        String NumAc = ExcelUtils.getCellData(row, 22);
        System.out.println("Action 22 " + NumAc);

        if (etat.equals("Real")) {
            FicheActionModele.cliqueAgenda(driver);
            Thread.sleep(3000);

            FicheActionPage.ActionRealisationXpath.click();

            while (i < 3) {


                Thread.sleep(3000);
                String NumAction = ExcelUtils.getCellData(row, 20 + i);
                System.out.println("Action" + NumAction);
                Thread.sleep(3000);
                FicheActionModele.saisirNumActionRealisation(NumAction, driver);
                Thread.sleep(3000);
                FicheActionModele.rechercherNumActionRealisation(driver);
                Thread.sleep(3000);

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click()",ModuleAuditsPage.wtauxREa);
                //ModuleAuditsPage.wtauxREa.click();
                Thread.sleep(3000);
                Boolean ok=true;
              try{
                  driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView1"));
                  ok=true;
              }catch (NoSuchElementException exception){
                  ok=false;

              }
if(ok) {
    try {
        ModuleAuditsPage.wTableTauxReal.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1_wrapper\"]/div[2]/div/table/tbody/tr[1]/td[9]/table/tbody/tr/td[1]")).findElement(By.tagName("input")).clear();
    } catch (NoSuchElementException exp) {
        System.err.println("Action   without Sub-Action");
    }
    try {
        ModuleAuditsPage.wTableTauxReal.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1_wrapper\"]/div[2]/div/table/tbody/tr[1]/td[9]/table/tbody/tr/td[1]")).findElement(By.tagName("input")).sendKeys("100");
    } catch (NoSuchElementException exp) {
        System.err.println("Action   without Sub-Action");
    }
    try {
        ModuleAuditsPage.wTableTauxReal.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[10]")).
                findElement(By.tagName("textarea")).sendKeys(RandomValue.randomString(15));
    } catch (NoSuchElementException exp) {
        System.err.println("Action   without Sub-Action");
    }
    try {
        ModuleAuditsPage.wtauxValidation.click();
    } catch (NoSuchElementException exp) {
        System.err.println("Action   without Sub-Action");
    }
    Thread.sleep(3000);


//ModuleAuditsPage.wtauxValidation.click();

    //FicheActionPage.wbtnClosAct.findElement(By.tagName("a")).click();
    //	FicheActionModele.choixNumActionRealisation();
//*[@id="ctl00_ContentPlaceHolder1_GridView1_wrapper"]/div[2]/div/table/tbody/tr[1]/td[9]/table/tbody/tr/td[1]
    // ctl00_ContentPlaceHolder1_GridView1
}
                i++;
                Thread.sleep(2000L);
            }
        }
    }

    @When("^suivi action a audite$")
    public void suivi_action_a_audite() throws Throwable {
        int i = 0;
        if (etat.equals("suiv")) {
            FicheActionModele.cliqueAgenda(driver);
            ExcelUtils.setExcelFile(Path, "Audit");
            FicheActionPage.ActionSuivreXpath.click();

            while (i < 3) {

                Thread.sleep(2000);

                String NumAction = ExcelUtils.getCellData(row, 20 + i);
                System.out.println("Action" + NumAction);
                Thread.sleep(3000);
                FicheActionModele.saisirNumActionSuivre(NumAction);
                Thread.sleep(3000);
                FicheActionModele.rechercherNumActionSuivre(driver);
                Thread.sleep(1000L);
                //  FicheActionModele.choixNumActionSuivren();

                Thread.sleep(2000);
                JavascriptExecutor excoteur = (JavascriptExecutor) driver;
                excoteur.executeScript("arguments[0].click()", ModuleAuditsPage.wtauxEnrSuivi);
                //ModuleAuditsPage.wtauxEnrSuivi.click();
                Thread.sleep(2000);
                Boolean ok=true;
                try{
                    driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView2"));
                    ok=true;
                }catch (NoSuchElementException exception){
                    ok=false;

                }
                if(ok) {


                    try {
                        ModuleAuditsPage.wtabtauxSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr[1]/td[15]")).findElement(By.tagName("input")).clear();
                        Thread.sleep(2000);
                    } catch (NoSuchElementException exp) {
                        System.err.println("Action   without Sub-Action");
                    }
                    try {
                        String rand = String.valueOf(RandomValue.getRandomNumberInRange(20, 100));
                        ModuleAuditsPage.wtabtauxSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr[1]/td[15]")).findElement(By.tagName("input")).sendKeys(rand);
                        Thread.sleep(1000);
                    } catch (NoSuchElementException exp) {
                        System.err.println("Action   without Sub-Action");
                    }
                    try {
                        ModuleAuditsPage.wtabtauxSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr[1]/td[16]")).
                                findElement(By.tagName("textarea")).sendKeys(RandomValue.randomString(15));
                    } catch (NoSuchElementException exp) {
                        System.err.println("Action   without Sub-Action");
                    }
                    Thread.sleep(2000);
                    try {
                        JavascriptExecutor excoteur2 = (JavascriptExecutor) driver;
                        excoteur2.executeScript("arguments[0].click()", driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_LinkButton33")));
                        //  ModuleAuditsPage.wtauxValiderSuivi.click();

                    } catch (NoSuchElementException exp) {
                        System.err.println("Action   without Sub-Action");
                    }
//ModuleAuditsPage.wtauxValidation.click();

                    //FicheActionPage.wbtnClosAct.findElement(By.tagName("a")).click();
                    //	FicheActionModele.choixNumActionRealisation();
//*[@id="ctl00_ContentPlaceHolder1_GridView1_wrapper"]/div[2]/div/table/tbody/tr[1]/td[9]/table/tbody/tr/td[1]
                    // ctl00_ContentPlaceHolder1_GridView1
                }
                i++;
                Thread.sleep(1000L);
            }
        }
    }

    @When("^consulter audit$")
    public void consulter_audit() throws Throwable {
        ModuleAuditsModel.cliquerAudits(driver);
    }

    @When("^cliquer sur ajouter audit$")
    public void cliquer_sur_ajouter_audit() throws Throwable {
        ModuleAuditsModel.ajouterFicheAudit(driver);
    }

    @Then("^saisir Ref interne$")
    public void saisir_Ref_interne() throws Throwable {
        ModuleAuditsModel.saisirRefInterne();
    }

    @And("^saisir Date Début Prévue$")
    public void saisir_Date_Début_Prévue() throws Throwable {
        ModuleAuditsModel.choixDateDebutPrevue(driver);
    }

    @And("^saisir Date Fin Prévue$")
    public void saisir_Date_Fin_Prévue() throws Throwable {
        ModuleAuditsModel.choixDateFinPrevue(driver);
    }

    @And("^saisir Champ audit$")
    public void saisir_Champ_audit() throws Throwable {

        ModuleAuditsModel.saisirChampAudit(row);

    }

    @And("^choisir type audit$")
    public void choisir_type_audit() throws Throwable {

        ModuleAuditsModel.choisirTypeAudit(row);
    }

    @And("^choisir site$")
    public void choisir_site() throws Throwable {

        ModuleAuditsModel.choisirSite(driver, row);
    }

    @And("^choisir Processus$")
    public void choisir_Processus() throws Throwable {

        ModuleAuditsModel.choisirProcessus(driver, row);
    }

    @And("^choisir activite$")
    public void choisir_activite() throws Throwable {

        ModuleAuditsModel.choisirActivite(driver);
    }

    @And("^choisir direction$")
    public void choisir_direction() throws Throwable {

        ModuleAuditsModel.choisirDirection(driver);
    }

    @And("^choisir Service$")
    public void choisir_Service() throws Throwable {

        ModuleAuditsModel.choisirService(driver);
    }


    @And("^cliquer sur valider audit$")
    public void cliquer_sur_valider_audit() throws Throwable {
        ModuleAuditsModel.cliquerValiderAudit(driver, row);

        WebElement Num_Audit = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_TextBox_ID\"]"));
        numAudit = Num_Audit.getText();
        System.out.println("Num audit :" + numAudit);
        Common.Exporter_visibilité("Fiche Audit:" + numAudit);
        Common.Exporter_champ_A_masquer("Fiche Audit: " + numAudit);
        Thread.sleep(1000);
        Common.Exporter_numFiche(" num  fiche  Audit"+numAudit);


    }

    @And("^Ajouter Documents Associes$")
    public void ajouter_Documents_Associes() throws Throwable {
        ModuleAuditsModel.AjouterDocumentsAssocies();
    }

    @And("^Ajouter Auditeur Interne$")
    public void Ajouter_Auditeur_Interne() throws Throwable {
        ModuleAuditsModel.AjouterAuditeurInterne(row, driver);
    }

    @And("^Ajouter Audite$")
    public void Ajouter_Audite() throws Throwable {
        ModuleAuditsModel.AjouterAudite(row, driver);
    }

    @Then("^Vérifier incrémentation agenda audit$")
    public void vérifier_incrémentation_agenda_audit() throws Throwable {
        int cpt = Integer.parseInt(ModuleAuditsPage.CompteurID.getText()) + 2;
        System.out.println(cpt);
        ModuleAuditsPage.HomeID.click();
        Thread.sleep(1000L);
        String Scpt = Integer.toString(cpt);
        System.out.println(ModuleAuditsPage.CompteurID.getText());
        assertTrue(ModuleAuditsPage.CompteurID.getText().contains(Scpt));
    }

    @When("^changer compte Auditeur$")
    public void changer_compte_Auditeur() throws Throwable {
        ModuleAuditsModel.ChangerCompteAuditeur(row, driver);
    }

    @When("^consulter agenda auditeur$")
    public void consulter_agenda_auditeur() throws Throwable {
        ModuleAuditsPage.AgendaId.click();
        Thread.sleep(1000L);
        ModuleAuditsPage.VolAgdAuditeurID.click();
        Thread.sleep(1000L);
        ModuleAuditsPage.RechFichAuditeId.sendKeys(numAudit);
        Thread.sleep(1000L);
        ModuleAuditsPage.FichAauditeID.findElement(By.tagName("a")).click();
        Thread.sleep(1000L);
        ModuleAuditsPage.ParticipAuditeurID.click();
        Thread.sleep(1000L);
        ModuleAuditsPage.EditRealID.click();
        Thread.sleep(1000L);
    }


    @And("^Realiser Audit$")
    public void Realiser_Audit() throws Throwable {
        Actions action = new Actions(driver);
        action.moveToElement(ModuleAuditsPage.RealisationXPATH).perform();
        Thread.sleep(1000L);
        ModuleAuditsModel.RealiserAudit(driver);
    }

    @And("^Appliquer Checklist Audit$")
    public void Appliquer_Checklist_Audit() throws Throwable {
        ModuleAuditsModel.AppliquerChecklistAudit(driver);
    }

    @Then("^verifier Taux de contrôle et Taux de conformité$")
    public void verifier_Taux_de_contrôle_et_Taux_de_conformité() throws Throwable {


        System.out.println("Etat de vérification de taux de Controle est:" + ModuleAuditsModel.VerifierTauxControl(row));
        System.out.println("Etat de vérification de taux de Conformite est:" + ModuleAuditsModel.VerifierTauxConformite());

    }

    @And("^Ajouter Constats$")
    public void Ajouter_Constats() throws Throwable {
        ModuleAuditsModel.AjouterConstats(driver, row);
    }

    @And("^Ajouter Evaluation$")
    public void Ajouter_Evaluation() throws Throwable {
        ModuleAuditsModel.AjouterEvaluation();
    }

    @And("^Ajouter Points critiques ou importants$")
    public void Ajouter_Points_critiques_ou_mportants() throws Throwable {
        ModuleAuditsModel.AjouterPoints();
    }

    @Then("^Ajouter une piece jointe$")
    public void ajouitr_une_piece_jointe() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(250, 0)");
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_Pieces_jointes\"]")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton19")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox4")).sendKeys("Test Auto");
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_Panel20\"]/div/div[2]/div/div[2]/div/span/label/span[2]")).click();
        Thread.sleep(1000);
        Runtime.getRuntime().exec("C:\\joindreFichier.exe");
        Thread.sleep(1000);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton21")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"myModalPJ\"]/div/div/div[1]/button/span")).click();
        Thread.sleep(1000);
    }

    @Then("^Ajouter personne informer$")
    public void ajouitr_personne_informer() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton_Informe")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton31")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView5_filter\"]/label/input")).sendKeys("BANI ISSAM");
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView5\"]/tbody/tr[1]/td[1]")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton51")).click();
        driver.findElement(By.xpath("//*[@id=\"myModalPI\"]/div/div/div[1]/button")).click();
    }

    @Then("^Vérifier Etat Audit$")
    public void vérifier_Etat_Audit() throws Throwable {
        assertTrue(ModuleAuditsPage.StateAuditID.getText().contains("REALISE"));

    }

    @When("^changer compte responsable cloture$")
    public void changer_compte_responsable_cloture() throws Throwable {
        ModuleAuditsModel.ChangerCompteRC(row, driver);
    }

    @When("^consulter agenda responsable cloture$")
    public void consulter_agenda_responsable_cloture() throws Throwable {
        ModuleAuditsModel.ConsulterAgendaRC(driver, row);
    }

    @When("^cloturer Audit$")
    public void cloturer_Audit() throws Throwable {
        ModuleAuditsModel.CloturerAudit(driver, row);
    }

    @Then("^consulter rapports$")
    public void consulter_rapports() throws Throwable {
        Actions action = new Actions(driver);
        action.moveToElement(ModuleAuditsPage.NumAudit).perform();
        Thread.sleep(1000);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_Lifgdhfh")).click();
        driver.findElement(By.xpath("//*[@id=\"IconImg_CrystalReportViewer1_toptoolbar_export\"]")).click();
        Screen s1 = new Screen();
        Screen s2 = new Screen();
        Screen s3 = new Screen();
        try {
            Pattern pattern1 = new Pattern("resources/imgs/combo_exporter_pv_reunion.PNG");
            Pattern pattern2 = new Pattern("resources/imgs/Choix_combo_PV_reunion.PNG");
            Pattern pattern3 = new Pattern("resources/imgs/Btn_exporter_PV_reunion.PNG");
            s1.click(pattern1);
            s2.click(pattern2);
            s3.click(pattern3);
            Thread.sleep(8000);
        } catch (FindFailed e) {
            e.printStackTrace();
        }
        Runtime.getRuntime().exec("C:\\Qualipro_Auto\\AutomatisationTQualiPro_23\\AutomatisationTQualiPro_23\\resources\\Scripts\\EnregistrerFichier.exe");
        Thread.sleep(1000);

    }

    @Then("^verifier rapports$")
    public void verifier_rapports() throws Throwable {
        Thread.sleep(1000);

        String path = "resources/Telechargement/CrystalReportViewer1.rtf";
        String fileData = null;
        fileData = RTFUtil.ReadRTFFile(path);
        System.out.println(
                "**************************************Rapport************************************************" + fileData);

        System.out.println("l'information :" + numAudit);
        System.out.println("Existe: " + common.ExisteWord(path, numAudit));
        assertTrue(common.ExisteWord(path, numAudit));
        driver.navigate().back();
    }

    @When("^saisir \"([^\"]*)\" dans le filtre$")
    public void saisir_dans_le_filtre(String arg1) throws Throwable {
        ModuleAuditsPage.NumAuditFiltreID.sendKeys(arg1);
        numAudit = arg1;
        Thread.sleep(1000L);
    }

    @When("^Cliquer sur bouton rechercher$")
    public void cliquer_sur_bouton_rechercher() throws Throwable {
        ExcelUtils.setExcelFile(Path, "Audit");
        String numAudit = ExcelUtils.getCellData1(row, 15);
        System.out.println(" num Audite est   " + numAudit);
        ModuleAuditsPage.NumAuditFiltreID.sendKeys(numAudit);
        Thread.sleep(1000L);
        ModuleAuditsPage.RechFiltreID.click();
        Thread.sleep(1000L);
    }

    @When("^consulter la fiche Audit$")
    public void consulter_la_fiche_Audit() throws Throwable {
        ModuleAuditsPage.GridRechID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1p\"]/tbody/tr/td[2]")).findElement(By.tagName("a")).click();
        Thread.sleep(1000L);
    }

    @When("^cliquer sur reporter Audit$")
    public void cliquer_sur_reporter_Audit() throws Throwable {
        if (ModuleAuditsModel.State_report_Audit() == true) {
            ModuleAuditsPage.BoutonReporteID.click();
            Thread.sleep(1000L);
        } else {
            System.out.println("L'audit a été réalisé");
        }

    }

    @When("^saisir nouveaux dates$")
    public void saisir_nouveaux_dates() throws Throwable {
        final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        if (ModuleAuditsModel.State_report_Audit() == true) {
            Date dt = new Date();
            Calendar c = Calendar.getInstance();
            c.setTime(dt);
            c.add(Calendar.DATE, 1);
            dt = c.getTime();
            String Sdate = dateFormat.format(dt);
            WebElement wb = ModuleAuditsPage.NouvDateDebutID;
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[1].value = arguments[0];", Sdate, wb);
            Thread.sleep(1000L);
            c.setTime(dt);
            c.add(Calendar.DATE, 3);
            dt = c.getTime();
            String Sdate1 = dateFormat.format(dt);
            wb = ModuleAuditsPage.NouvDateFinID;
            jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[1].value = arguments[0];", Sdate1, wb);
            Thread.sleep(1000L);
            ModuleAuditsPage.MotifReportID.sendKeys("motif");
            Thread.sleep(1000L);

        }
    }

    @When("^valider reporter audit$")
    public void valider_reporter_audit() throws Throwable {
        if (ModuleAuditsModel.State_report_Audit() == true) {
            ModuleAuditsPage.ValidReportID.click();
            Thread.sleep(1000L);
        }
    }

    @Then("^vérifier \"([^\"]*)\" est reporté$")
    public void vérifier_est_reporté(String arg1) throws Throwable {
        if (ModuleAuditsModel.State_report_Audit() == true) {
            ModuleAuditsPage.HomeID.click();
            Thread.sleep(1000L);
            ModuleAuditsPage.AgendaId.click();
            Thread.sleep(1000L);
            ModuleAuditsPage.VolAuditReporte.click();
            Thread.sleep(1000L);
            ModuleAuditsPage.RechReportAgendaID.sendKeys(arg1);
            Thread.sleep(1000L);
            String value1 = ModuleAuditsPage.GridAgendaReportID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_auditreport\"]/tbody/tr/td")).getText();
            if (!(value1.equals(arg1))) {
                value1 = ModuleAuditsPage.GridAgendaReportID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_auditreport\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).getText();
                System.out.println(value1);
                assertTrue(value1.contains(arg1));
            } else {
                System.out.println(value1);
                assertTrue(value1.contains(arg1));
            }
        }
    }


    @When("^Ajouter Auditeur Externe$")
    public void ajouter_Auditeur_Externe() throws Throwable {
        ModuleAuditsModel.AjouterAuditeurExterne(row);
    }

    @When("^Evaluer Checklist Audit$")
    public void evaluer_Checklist_Audit() throws Throwable {
        ModuleAuditsModel.ChecklistAuditAleatoire(driver, row);
    }

    @When("^changer compte responsable validation$")
    public void changer_compte_responsable_validation() throws Throwable {
        ModuleAuditsModel.ChangerCompteRV(row, driver);
    }

    @When("^valider constats$")
    public void valider_constats() throws Throwable {
        ModuleAuditsModel.Valider_Constat(driver, row);
    }


    @When("^recuperer numero action$")
    public void recuperer_numero_action() throws Throwable {
        ModuleAuditsModel.numeroAction(driver, row);
    }

    @Then("^valider consultation rapport audit$")
    public void valider_consultation_rapport_audit() throws Throwable {

    }

    @Then("^vérifier Audit cloturé$")
    public void vérifier_Audit_cloturé() throws Throwable {

    }

}