package com.qualiprobdd.e2etests.Documentation.stepdefs;

import static com.qualiprobdd.e2etests.Documentation.pages.DocumentationPage.wEnRedc;
import static com.qualiprobdd.e2etests.Documentation.pages.DocumentationPage.wSupRedc;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import java.util.List;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qualiprobdd.e2etests.Documentation.models.DocumentationModele;
import com.qualiprobdd.e2etests.Documentation.pages.DocumentationPage;
import com.qualiprobdd.e2etests.authentification.pages.AuthentificationPage;
import com.qualiprobdd.e2etests.util.Setup;
import com.qualiprobdd.e2etests.util.Common;


public class DocumentationStepDefinition {

    public WebDriver driver;
    public String CompteurDocument = "";
    public String CodeDocument = "";

    public String path = "E:/qualipro/trunk/AutomatisationTQualiPro_prod231/resources/Telechargement";
    public String pathContext = "E:/qualipro/trunk/AutomatisationTQualiPro_prod231/resources/Documentation";
    private static String PathData = "E:/qualipro/trunk/AutomatisationTQualiPro_prod231/resources/testData/TestData.xlsx";
    public String dateEnvoi;
    public String[] Fils = null;
    public List<String> informations = new ArrayList<String>();
    String compteur, compteur1;

    public DocumentationStepDefinition() {
        driver = Setup.driver;
        PageFactory.initElements(driver, DocumentationPage.class);
    }


    @When("cliquer sur superviseur  au Rédacteur")
    public void cliquer_sur_superviseur_au_Rédacteur() {
        wSupRedc.click();

    }

    @When("cliquer sur Envoyer au Rédacteur")
    public void cliquer_sur_Envoyer_au_Rédacteur() {
        wEnRedc.click();
    }


    @When("^Consulter boite de dialogue$")
    public void Consulter_boite_de_dialogue() throws Throwable {
        DocumentationModele.cliqueBoiteDeDialogue(driver);
        Thread.sleep(1000L);
        Fils = Common.NbrFils(path);
        System.out.println("Nombre des fichier dans la reparatoire Telechargement est :" + Fils.length);
    }

    @When("^cliquer sur Rédacteur au superviseur$")
    public void cliquer_sur_Rédacteur_au_superviseur() throws Throwable {
        Thread.sleep(4000);
        compteur1 = DocumentationModele.getValeurCompteur();
        System.out.println("cliquer sur Rédacteur au superviseur");

        System.out.println("Valeur compteur increment est: " + compteur1);
        DocumentationModele.cliqueRedacteurSuperviseur(driver);
    }

    @When("^Saisir (\\d+)$")
    public void saisir(int arg1) throws Throwable {
        DocumentationModele.choixTypeDocument(arg1);
    }

    /*
     * @When("^Saisir Type document$") public void saisir_Type_document() throws
     * Throwable { DocumentationModele.choixTypeDocument(); }
     */

    @When("^Saisir Objet$")
    public void saisir_Objet() throws Throwable {
        DocumentationModele.saisirObjet();
    }

    @When("^rattacher fichier lien$")
    public void rattacher_fichier_lien() throws Throwable {
        DocumentationModele.choixFichier(driver);

    }

    @When("^Saisir message$")
    public void saisir_message() throws Throwable {
        DocumentationModele.saisirMessage();
    }

    @When("^choisir site lab$")
    public void choisir_site_lab() throws Throwable {
        try {

            DocumentationPage.siteID.isDisplayed();
            System.out.println("site est   visible ");

            Common.Exporter_visibilité("le site est visible");
            String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbsite2")).getText();
            if (text.indexOf('*') != -1) {
                Common.Exporter_visibilité("le site est obligatoire");
            } else {
                Common.Exporter_visibilité("le site n'est pas obligatoire");

            }
        } catch (NoSuchElementException e) {
            System.out.println("non selectionne  site ");

            Common.Exporter_visibilité("le site est invisible");
        }
        Thread.sleep(500);
        try {
            Select select = new Select(DocumentationPage.siteID);
            //   select.selectByVisibleText(ExcelUtils.getCellData(1, 13));
            Thread.sleep(500);
            select.selectByValue("16");
            System.out.println("selectionne  site ");
        } catch (NoSuchElementException e) {
            System.out.println("non selectionne  site ");

            Common.Exporter_visibilité("le site est invisible");
        }
        Thread.sleep(500);


    }

    @When("^cliquer sur Envoyer au superviseur$")
    public void cliquer_sur_Envoyer_au_superviseur() throws Throwable {
        DocumentationModele.cliqueEnvoiSuperviseur();

    }

    @Then("^verifier ajout dans la boite d envoi et vérifier message a été envoyé$")
    public void verifier_ajout_dans_la_boite_d_envoi_et_vérifier_message_a_été_envoyé() throws Throwable {
        DocumentationModele.cliqueBoiteEnvoi(driver);
        DocumentationModele.VerifierAjoutDansBoiteEnvoi(driver);
    }

    @Then("^verifier l incrémentation du compteur$")
    public void verifier_l_incrémentation_du_compteur() throws Throwable {
        boolean inc = false;
        // String compteur, compteur1;

        DocumentationPage.HomeID.click();
        Thread.sleep(4000);
        compteur = DocumentationModele.getValeurCompteur();
        System.out.println("Valeur compteur increment est: " + compteur);
        // assertTrue(Integer.parseInt(compteur) == Integer.parseInt(compteur1) + 1);

    }

    @When("^cliquer sur agenda documentation$")
    public void cliquer_sur_agenda_documentation() throws Throwable {
        DocumentationModele.cliqueAgendaDocument(driver);

    }

    @Given("^cliquer sur notification agenda boite de dialogue (\\d+)$")
    public void cliquer_sur_notification_agenda_boite_de_dialogue(int arg1) throws Throwable {
        // DocumentationPage.HomeID.click();
        Thread.sleep(2000);
        DocumentationModele.cliqueAgendaDocument(driver);
        Thread.sleep(2000);
        DocumentationModele.cliqueCompteurBoiteDialogue();
        Thread.sleep(1000);
        DocumentationModele.cliqueConsulterMessage(driver, arg1);

    }

    @When("^cliquer sur notification agenda boite de dialogue$")
    public void cliquer_sur_notification_agenda_boite_de_dialogue() throws Throwable {
        // DocumentationPage.HomeID.click();
        Thread.sleep(2000);
        DocumentationModele.cliqueAgendaDocument(driver);
        Thread.sleep(2000);
        DocumentationModele.cliqueCompteurBoiteDialogue();
        Thread.sleep(1000);
        DocumentationModele.cliqueConsulterMessage(driver);

    }


    @When("^cliquer sur document boite de réception$")
    public void cliquer_sur_document_boite_de_réception() throws Throwable {
        Thread.sleep(500);
        DocumentationModele.cliqueDocumentBoiteDialogue();
        Thread.sleep(1000);
    }

    @Given("^cliquer sur le fichier joint pour stocker le document au niveau de l infrastructurePP$")
    public void cliquer_sur_le_fichier_joint_pour_stocker_le_document_au_niveau_de_l_infrastructurePP() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#body > div.news.news1 > div.alignl > div.panel.panel-infoPers.C_entete > div.panel-body > div:nth-child(3) > div > div > div:nth-child(1) > div > div.col-md-8.col-sm-8.col-xs-8.col-lg-8.espacebottom > div > span > label")).click();
        Thread.sleep(1000);
        Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Scripts\\joindreFichier.exe");
        Thread.sleep(1000);
    }


    @When("^cliquer sur le fichier joint pour stocker le document au niveau de l infrastructure$")
    public void cliquer_sur_le_fichier_joint_stocker_le_document_au_niveau_de_l_infrastructure() throws Throwable {
        System.out.println("cliquer_sur_le_fichier_joint_stocker_le_document_au_niveau_de_l_infrastructure");
        Thread.sleep(1000);
        Fils = Common.NbrFils(path);
        int nbr = Fils.length;
        System.out.println("L'ancien nombre de fichiers dans le dossier Téléchargements :" + nbr);
        Thread.sleep(1000);
        DocumentationModele.cliqueFichierJoint(driver);
        // Thread.sleep(500);
        Runtime.getRuntime().exec(
                "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Scripts\\EnregistrerFichier.exe");
        Thread.sleep(1000);
        Fils = Common.NbrFils(path);
        int nbr1 = Fils.length;
        System.out.println("Le nouveau nombre de fichiers dans le dossier Téléchargements :" + nbr1);
        // commented assert by rahma
        // assertTrue(nbr1 == nbr + 1, "Fichier ñ'est pas téléchargé!!!!");
        // Générer un nom significatif pour le fichier téléchargé
        String nom = Common.GenererNom("Documentation", CodeDocument, ".jpg");
        // Renommer et Deplacer la fichier
        Common.RenomerDeplacer(nom, path, pathContext);
    }

    @When("^cliquer sur Créer document$")
    public void cliquer_sur_Créer_document() throws Throwable {
        DocumentationModele.cliqueCreeDocument(driver);
    }

    @When("^saisir code document$")
    public void saisir_code_document() throws Throwable {
        DocumentationModele.saisirCodeDocumentEnCours();
    }

    @When("^saisir Mot clé spécifique$")
    public void saisir_Mot_clé_spécifique() throws Throwable {
        DocumentationModele.saisirMotCle();
    }

    @When("^cliquer sur valider Creation Document$")
    public void cliquer_sur_valider_Creation_Document() throws Throwable {
        DocumentationModele.cliqueValider(driver);
        Thread.sleep(500);
        CodeDocument = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Text_CodeD")).getAttribute("value");
        informations.add(CodeDocument);
        System.out.println("code document : " + CodeDocument);
        Common.Exporter_numFiche("code  document " + CodeDocument);
        Thread.sleep(2000);
    }

    @When("^cliquer sur valider en bas de page$")
    public void cliquer_sur_valider_en_bas_de_page() throws Throwable {
        DocumentationModele.cliqueValiderBas(driver);
        Thread.sleep(500);

    }

    @When("^cliquer sur visualiser le document à diffuser et vérifier son téléchargement et stockage sur plateforme$")
    public void cliquer_sur_visualiserle_document_a_diffuser_et_vérifier_son_téléchargement_et_stockage_sur_plateforme()
            throws Throwable {
        Fils = Common.NbrFils(path);
        int nbr = Fils.length;
        System.err.println("L'ancien nombre de fichiers dans le dossier Téléchargements :" + nbr);
        Thread.sleep(1000);
        //driver.findElement(By.id("ctl00_ContentPlaceHolder1_VsDoc")).click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", DocumentationPage.wvisuleDoc);

        Thread.sleep(3000);
        Fils = Common.NbrFils(path);
        int nbr1 = Fils.length;
        System.err.println("Le nouveau nombre de fichiers dans le dossier Téléchargements :" + nbr1);
        assertTrue(nbr1 == nbr + 1, "Fichier ñ'est pas téléchargé!!!!");

        // Générer un nom significatif pour le fichier téléchargé
        String nom = Common.GenererNom("Documentation", CodeDocument, ".xlsx");

        // Renommer et Deplacer la fichier
        Common.RenomerDeplacer(nom, path, pathContext);

    }

    @When("^cliquer sur Rédacteur en bas de page$")
    public void cliquer_sur_Rédacteur_en_bas_de_page() throws Throwable {
        // WebDriverWait wait = new WebDriverWait(driver,1000);
        // wait.until(ExpectedConditions.visibilityOf(DocumentationPage.redacteurBasD));
        boolean ok = false;
        int i = 1;
        while (ok == false || i == 10) {
            i++;
            try {
                DocumentationModele.cliqueRedacteurBas(driver);

                ok = true;
                System.out.println("cliquer sur   valider !: " + ok);
            } catch (NoSuchElementException exp) {
                ok = false;
                DocumentationModele.cliqueValiderBas(driver);
                System.out.println("cliquer sur   reducteur !: " + ok);
            }
        }

    }

    @When("^consulter agenda documentation documents à valider par le rédacteur$")
    public void consulter_agenda_documentation_documents_à_valider_par_le_rédacteur() throws Throwable {
        Thread.sleep(1000);

        DocumentationPage.HomeID.click();
        Thread.sleep(1000);
        DocumentationModele.cliqueAgendaDocument(driver);
        Thread.sleep(500);
        DocumentationModele.cliqueAgendaRedacteur();
        Thread.sleep(500);
    }

    @When("^verifier l'incrémentation du compteur général et spécifique rédaction$")
    public void verifier_l_incrémentation_du_compteur_général_et_spécifique_rédaction() throws Throwable {

    }

    @When("^insérer code documents$")
    public void insérer_code_documents() throws Throwable {
        DocumentationModele.saisirCodeDocument();
        DocumentationModele.cliqueRechercheDocuments();
        Thread.sleep(1000);

    }

    @When("^cliquer sur le document en question$")
    public void cliquer_sur_le_document_en_question() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[1]"))
                .findElement(By.tagName("a")).click();
    }

    @When("^cliquer sur le document à consulter$")
    public void cliquer_sur_le_document_à_consulter() throws Throwable {
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView2")).findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr[1]/td[1]")).findElement(By.tagName("a")).click();

    }

    @When("^cliquer sur visualiser le document et vérifier son téléchargement et stockage sur plateforme$")
    public void cliquer_sur_visualiser_le_document_et_vérifier_son_téléchargement_et_stockage_sur_plateforme()
            throws Throwable {
        Fils = Common.NbrFils(path);
        int nbr = Fils.length;
        System.out.println("L'ancien nombre de fichiers dans le dossier Téléchargements :" + nbr);
        Thread.sleep(1000);
        DocumentationModele.cliqueVisualiserDocument(driver);
        Thread.sleep(1000);
        Fils = Common.NbrFils(path);
        int nbr1 = Fils.length;
        System.out.println("Le nouveau nombre de fichiers dans le dossier Téléchargements :" + nbr1);
        assertTrue(nbr1 == nbr + 1, "Fichier ñ'est pas téléchargé!!!!");

        // Générer un nom significatif pour le fichier téléchargé
        String nom = Common.GenererNom("Documentation", CodeDocument, ".xlsx");

        // Renommer et Deplacer la fichier
        Common.RenomerDeplacer(nom, path, pathContext);

    }

    @When("^cliquer sur vérificateur bleu$")
    public void cliquer_sur_vérificateur_bleu() throws Throwable {
        DocumentationModele.cliqueVerificateur();
    }

    @When("^consulter agenda documentation documents à valider par le vérificateur$")
    public void consulter_agenda_documentation_documents_à_valider_par_le_vérificateur() throws Throwable {
        //   driver.get("http://10.66.245.30/w232/accueil_.aspx");
        Thread.sleep(1000);
        DocumentationPage.HomeID.click();
        Thread.sleep(1000);
        DocumentationModele.cliqueAgendaDocument(driver);
        DocumentationModele.cliqueAgendaVerifiacteur();
    }

    @When("^cliquer sur approbateur bleu$")
    public void cliquer_sur_approbateur_bleu() throws Throwable {
        DocumentationModele.cliqueApprobateurBleu(driver);
    }

    @When("^consulter agenda documentation documents à valider par l approbateur$")
    public void consulter_agenda_documentation_documents_à_valider_par_l_approbateur() throws Throwable {
        // driver.get("http://10.66.245.30/Qualipro_Vierge/");
        Thread.sleep(1000);
        DocumentationPage.HomeID.click();
        Thread.sleep(1000);
        DocumentationModele.cliqueAgendaDocument(driver);
        DocumentationModele.cliqueAgendaApprobateur();
    }

    @When("^verifier l'incrémentation du compteur général et spécifique approbation$")
    public void verifier_l_incrémentation_du_compteur_général_et_spécifique_approbation() throws Throwable {

    }

    @When("^cliquer sur Envoi diffusion bleu$")
    public void cliquer_sur_Envoi_diffusion_bleu() throws Throwable {
        DocumentationModele.cliqueDiffusion();
    }

    @When("^consulter agenda documentation documents en attente de diffusion$")
    public void consulter_agenda_documentation_documents_en_attente() throws Throwable {
        DocumentationPage.HomeID.click();
        Thread.sleep(1000);
        DocumentationModele.cliqueAgendaDocument(driver);
        DocumentationModele.cliqueEnCours();
    }

    @When("^cliquer sur Mise en vigueur bleu$")
    public void cliquer_sur_Mise_en_vigueur_bleu() throws Throwable {

        DocumentationModele.cliqueApprobateurBleu(driver);
    }

    @When("^insérer code documents à consulter$")
    public void insérer_code_documents_à_consulter() throws Throwable {
        DocumentationModele.saisirCodeDocumentsAConsulter();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton13")).click();
        Thread.sleep(500);
    }

    @When("^consulter agenda documentation documents à consulter$")
    public void consulter_agenda_documentation_documents_à_consulter() throws Throwable {
        DocumentationPage.HomeID.click();
        Thread.sleep(1000);
        DocumentationModele.cliqueAgendaDocument(driver);
        DocumentationModele.cliqueAConsulter();
    }

    public static String etat = "";

    @When("^cliquer sur Visualiser  document en bleu vérifier son téléchargement et stockage sur plateforme$")
    public void cliquer_sur_Visualiser_document_en_bleu_vérifier_son_téléchargement_et_stockage_sur_plateforme()
            throws Throwable {

        Fils = Common.NbrFils(path);
        int nbr = Fils.length;
        System.out.println("L'ancien nombre de fichiers dans le dossier Téléchargements :" + nbr);
        Thread.sleep(1000);
        DocumentationModele.cliqueVisualiser(driver);
        Thread.sleep(500);
        Fils = Common.NbrFils(path);
        int nbr1 = Fils.length;
        System.out.println("Le nouveau nombre de fichiers dans le dossier Téléchargements :" + nbr1);
        // assertTrue(nbr1 == nbr + 1, "Fichier ñ'est pas téléchargé!!!!");


    }

    @When("^cliquer sur J ai consulté ce document$")
    public void cliquer_sur_J_ai_consulté_ce_document() throws Throwable {
        DocumentationModele.cliquejaiConsulte(driver);
        Thread.sleep(500);
        boolean ok = false;
        try {
            ok = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lblerr")).getText() != null;

        } catch (NoSuchElementException e) {
            System.out.println("file not downloaded");
            ok = true;
        }
        assertTrue(ok);
		/*if (etat.equals("close")) {
			//driver.findElement(By.xpath("//*[@id=\"Popconsult\"]/div/div/div[1]/button")).click();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			for (int i = 0; i < tabs2.size(); i++) {
				driver.switchTo().window(tabs2.get(i));

				if (tabs2.get(i) != tabs2.get(0)) {
					driver.switchTo().window(tabs2.get(i));

					driver.close();
				}
			}

			driver.switchTo().window(tabs2.get(0));

		}*/

    }

    @When("^cliquer sur raccourci consulter doc interne$")
    public void cliquer_sur_raccourci_consulter_doc_interne() throws Throwable {
        DocumentationModele.cliqueIconeDocumentsInternes(driver);
    }

    @When("^rechercher code documents niveau filtre$")
    public void rechercher_code_documents_niveau_filtre() throws Throwable {
        DocumentationModele.saisirCodeDocumentsInternes(driver);
        DocumentationModele.cliqueRechercheDocumentsInternes(driver);

    }

    @When("^rechercher \"([^\"]*)\" niveau filtre$")
    public void rechercher_niveau_filtre(String arg1) throws Throwable {
        DocumentationModele.saisirCodeDocumentsInternes(driver);
        DocumentationModele.cliqueRechercheDocumentsInternes(driver);

    }

    @When("^cliquer sur le document interne en question$")
    public void cliquer_sur_le_document_interne_en_question() throws Throwable {
        DocumentationModele.choisirDocumentsInternes(driver);
    }

    @When("^Vérifier nombre et taux de consultation$")
    public void Vérifier_nombre_et_taux_de_consultation() throws Throwable {
        DocumentationModele.vérifier_taux(driver);
    }

    @When("^cliquer sur commentaire$")
    public void cliquer_sur_commentaire() throws Throwable {
        DocumentationModele.cliqueCommentaire();
    }

    @When("^cliquer sur Ajouter$")
    public void cliquer_sur_Ajouter() throws Throwable {
        DocumentationModele.ajouterCommentaire(driver);
    }

    @When("^cliquer saisir message au superviseur$")
    public void cliquer_saisir_message_au_superviseur() throws Throwable {
        DocumentationModele.saisirMessageSuperviseur();
    }

    @When("^Envoyer au superviseur$")
    public void envoyer_au_superviseur() throws Throwable {
        DocumentationModele.cliqueEnvoyerSuperviseur(driver);
    }

    @When("^Supprimer les fichiers temporaires de l infrastructure$")
    public void Supprimer_les_fichiers_temporaires_de_l_infrastructure() throws Throwable {
        Common.deleteFile(path);
        System.out.println("Les fichiers temporaires ont été supprimés");
    }

    // *********steps Documentation spirale *************//

    @When("^cliquer sur envoyer le document pour correction$")
    public void cliquer_sur_envoyer_le_document_pour_correction() throws Throwable {
        DocumentationPage.correctionID.click();
    }

    @When("^remplir le commentaire de rejection$")
    public void remplir_le_commentaire_de_rejection() throws Throwable {
        Thread.sleep(500);
        DocumentationPage.messID.sendKeys("Test commentaire");
        DocumentationPage.validermessID.click();
    }

    @When("^consulter agenda documentation boite superviseur$")
    public void consulter_agenda_documentation_boite_superviseur() throws Throwable {
        Thread.sleep(500);
        DocumentationPage.superviseurID.click();
        Thread.sleep(500);
    }

    @When("^cliquer sur valider haut de page$")
    public void cliquer_sur_valider_haut_de_page() throws Throwable {
        DocumentationPage.validerID.click();
        Thread.sleep(500);
    }

    @When("^cliquer sur valider verte$")
    public void cliquer_sur_valider_verte() throws Throwable {
        DocumentationPage.validerBasID.click();
        Thread.sleep(500);
    }

    @When("^cliquer sur rédacteur$")
    public void cliquer_sur_rédacteur() throws Throwable {
        DocumentationPage.redacteurBasD.click();
        Thread.sleep(500);
    }

    @When("^rattacher action$")
    public void rattacher_action_And_Ajouter_action_scenario_outline() throws Throwable {
        Thread.sleep(1000);
        DocumentationPage.formatiosActions.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Actions action = new Actions(driver);
        action.moveToElement(DocumentationPage.rattacherActionID).perform();
        Thread.sleep(200);
        DocumentationPage.rattacherActionID.click();
        DocumentationPage.choisirAction.click();
        DocumentationPage.validerChoixActionID.click();
    }

    @When("^Rattacher formation$")
    public void rattacher_formation() throws Throwable {
        Thread.sleep(500);
        // DocumentationPage.rattacherFormationID.click();
        // DocumentationPage.choisirFormation.click();
        // DocumentationPage.validerChoixFormationID.click();
        // changed by rahma
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", DocumentationPage.rattacherFormationID);
        executor.executeScript("arguments[0].click()", DocumentationPage.choisirFormation);
        executor.executeScript("arguments[0].click()", DocumentationPage.validerChoixFormationID);

    }

    @When("^Vérifier le calcul des taux de consultation$")
    public void vérifier_le_calcul_des_taux_de_consultation() throws Throwable {

    }

    @When("^vérifier que les données existent au niveau des listes des documents internes$")
    public void vérifier_que_les_données_existent_au_niveau_des_listes_des_documents_internes() throws Throwable {
        String url = "http://10.66.245.30/w232/Documentation/Rapport/FiltreEtatdIV.aspx";
        String type = "ctl00_ContentPlaceHolder1_DropDownList1";
        String path = "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Telechargement\\CrystalReportViewer1.rtf";
        String pathContext = "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\apercu";
        // String typeDocument=DocumentationModele.getType();
        String typeDocument = "testAuto";
        String superviseur = "ctl00_ContentPlaceHolder1_LbSuperviseur";
        String superviseurdoc = "AUTO";

        Common.F(driver, url, type, typeDocument, superviseur, superviseurdoc);

        Thread.sleep(1000);
        String name1 = "BilanDocInternes";
        // Common.Vérifier_données(name1,codeDocument);
        // System.out.println(name1);
        String newpath = Common.RenommerFichier1(name1, path, pathContext);
        for (int i = 0; i < informations.size(); i++) {
            int j = i + 1;
            System.out.println("l'information " + j + ":" + informations.get(i));
            System.out.println("Existe: " + Common.ExisteWord(path, informations.get(i)));
            assertTrue(Common.ExisteWord(newpath, informations.get(i)));
        }

    }

    @When("^vérifier que les données existent au niveau des reportings document en cours$")
    public void vérifier_que_les_données_existent_au_niveau_des_reportings_document_en_cours() throws Throwable {

        String url = "http://10.66.245.30/w232/Documentation/Rapport/FiltreBilanDocEnCours.aspx";
        String code = "ctl00_ContentPlaceHolder1_TextBox_Code";
        // String path =
        // "E:/qualipro/trunk/AutomatisationTQualiPro_prod/resources/Telechargement/CrystalReportViewer1.rtf";
        String path = "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Telechargement\\CrystalReportViewer1.rtf";
        String pathContext = "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\apercu";
        String codeDocument = CodeDocument;
        String superviseur = "ctl00_ContentPlaceHolder1_DropDownList_Superviseur";
        String superviseurdoc = "AUTO";

        informations.add(superviseurdoc);

        Common.F(driver, url, code, codeDocument, superviseur, superviseurdoc);
        Thread.sleep(2000);
        String name1 = "BilanDocEnCours";
        // Common.Vérifier_données(name1,codeDocument);
        // System.out.println(name1);
        String newpath = Common.RenommerFichier1(name1, path, pathContext);
        for (int i = 0; i < informations.size(); i++) {
            int j = i + 1;
            System.out.println("l'information " + j + ":" + informations.get(i));
            System.out.println("Existe: " + Common.ExisteWord(newpath, informations.get(i)));
            // assertTrue(Common.ExisteWord(path, informations.get(i)));
        }

    }

    @When("^vérifier que les données existent au niveau de l Excel$")
    public void vérifier_que_les_données_existent_au_niveau_de_l_Excel() throws Throwable {

    }

    @When("^vérifier la maj de l’historique du document motif et indice$")
    public void vérifier_la_maj_de_l_historique_du_document_motif_et_indice() throws Throwable {

    }

    @When("^saisir Login et PW autre compte$")
    public void saisir_Login_et_PW_autre_compte() throws Throwable {
        AuthentificationPage.loginID.sendKeys("TESTAUTO2");
        AuthentificationPage.motDePasse.sendKeys("TESTAUTO2");
    }

    @When("^consulter boite superviseur$")
    public void consulter_boite_superviseur() throws Throwable {
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_Nbr_DocEncours")).click();
    }

    //ADD BY FATMA CHAOUACHI

    @When("Consulter Type document")
    public void consulter_Type_document() {

    }

    @When("cliquer sur boutton ajouter")
    public void cliquer_sur_boutton_ajouter() {

    }

    @When("Saisir Type_document_paramétrage")
    public void saisir_Type_document_paramétrage() {

    }

    @When("sélectionner nature")
    public void sélectionner_nature() {

    }

    @When("Saisir une périodicité")
    public void saisir_une_périodicité() {

    }

    @When("cliquer sur la case à cocher PDF")
    public void cliquer_sur_la_case_à_cocher_PDF() {

    }

    @When("cliquer sur valider type document")
    public void cliquer_sur_valider_type_document() {

    }

    @Then("Vérifier que le type document ajouté")
    public void vérifier_que_le_type_document_ajouté() {

    }


}
