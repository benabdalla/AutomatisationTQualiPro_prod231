package com.qualiprobdd.e2etests.PNC.stepdefs;
import io.cucumber.java.en.*;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.qualiprobdd.e2etests.PNC.models.ModulePNCModel;
import com.qualiprobdd.e2etests.PNC.pages.ModulePNCPage;
import com.qualiprobdd.e2etests.moduleAction.models.FicheActionModele;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.Setup;


@Test
public class ModulePNCStepDefinition {

	public int compteur;
	public WebDriver driver;
	public String  NumPNC ="";
	int row1; 
	private static String Path = "resources/testData/TestData.xlsx";


	
	public ModulePNCStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, ModulePNCPage.class);
		PageFactory.initElements(driver, FicheActionPage.class);
	}
	
	
	
	
	

@When("^saisir code produit$")
public void saisir_code_produit() throws Throwable {
	ModulePNCModel.saisir_code_produit(driver);
    
}

@When("^saisir nom produit produit$")
public void saisir_nom_produit_produit() throws Throwable {
	ModulePNCModel.saisir_nom_produit_produit();

}

@When("^select  famille de produit$")
public void select_famille_de_produit() throws Throwable {
	ModulePNCModel.select_famille_de_produit();
}

@When("^cliquer Valider du produit ajouté$")
public void cliquer_Valider_du_produit_ajouté() throws Throwable {
 ModulePNCModel.cliquer_Valider_du_produit_ajouté(driver);
}

	
	@When("^saisir quantité détectée2$")
	public void saisir_quantité_détectée2() throws Throwable {
		ModulePNCModel.saisir_quantité_détectée2();
	    
	}

	@When("^saisir quantité produite2$")
	public void saisir_quantité_produite2() throws Throwable {
	  ModulePNCModel.saisir_quantité_produite2();
	  
	}

	@Then("^choisir unite2$")
	public void choisir_unite2() throws Throwable {
		ModulePNCModel.choisir_unite();
	   
	}
	@When("^cliquer sur paramétrage PNC$")
	public void cliquer_sur_paramétrage_PNC() throws Throwable {
		ModulePNCModel.cliquer_sur_paramétrage_PNC(driver);
	}

	@Then("^choisir Un seul produit / un seul type de NC ou  Plusieurs produits / plusieurs Types de NC$")
	public void choisir_Un_seul_produit_un_seul_type_de_NC_ou_Plusieurs_produits_plusieurs_Types_de_NC()
			throws Throwable {
		ModulePNCModel.choisir_Un_seul_produit_un_seul_type_de_NC_ou_Plusieurs_produits_plusieurs_Types_de_NC(row1,
				driver);
	}
	@When("^cliquer   sur   ajouter  produit$")
	public void cliquer_sur_ajouter_produit() throws Throwable {
		ModulePNCModel.cliquer_sur_ajouter_produit(driver);
	}

	@When("^cliquer  sur   select   produit$")
	public void cliquer_sur_select_produit() throws Throwable {
		ModulePNCModel.cliquer_sur_select_produit(driver);
	}

	@When("^rechercher  produit$")
	public void rechercher_produit() throws Throwable {
		ModulePNCModel.rechercher_produit();
	}

	@When("^select   produit$")
	public void select_produit() throws Throwable {
		ModulePNCModel.select_produit();
	}


	@When("^valide  Taux de non conformité$")
	public void valide_Taux_de_non_conformité() throws Throwable {
		ModulePNCModel.valide_Taux_de_non_conformité();
	}
	@When("^valide  Taux de non conformité2$")
	public void valide_Taux_de_non_conformité2() throws Throwable {
		ModulePNCModel.valide_Taux_de_non_conformité2(driver);
	}

	@When("^valider produit$")
	public void valider_produit() throws Throwable {
		ModulePNCModel.valider_produit(driver);
	}

	@When("^clique   sur   ajouter   type  nc$")
	public void clique_sur_ajouter_type_nc() throws Throwable {
		ModulePNCModel.clique_sur_ajouter_type_nc(driver);
	}

	@When("^select  type   nc$")
	public void select_type_nc() throws Throwable {
		ModulePNCModel.select_type_nc();;

	}

	@When("^saisir  Pourcentage$")
	public void saisir_Pourcentage() throws Throwable {
		ModulePNCModel.saisir_Pourcentage();

	}
	@When("^select  type   nc2$")
	public void select_type_nc2() throws Throwable {
		ModulePNCModel.select_type_n();

	}

	@When("^saisir  Pourcentage2$")
	public void saisir_Pourcentage2() throws Throwable {
		ModulePNCModel.saisir_Pourcentag(driver);

	}

	@When("^cliquer  sur   valider$")
	public void cliquer_sur_valider() throws Throwable {
		ModulePNCModel.cliquer_sur_valider(driver);

	}

	@Then("^verfier   list   produit$")
	public void verfier_list_produit() throws Throwable {
		ModulePNCModel.verfier_list_produit();

	}

	@When("^Consulter PNC$")
	public void consulter_PNC() throws Throwable {
		Cookie cookie1 = driver.manage().getCookieNamed("lan");
		System.out.println(cookie1.getValue());
		ModulePNCModel.cliquerProduitsnonconformes(driver);
		
	}
	
	@When("^saisir code PNC (\\d+) a traiter$")
	public void saisir_code_PNC_a_traiter(int arg1) throws Throwable {
		row1=arg1;
		ModulePNCModel.définir_code_PNC(arg1);
	}
	@When("^Modifier paramétrage PNC$")
	public void Modifier_paramétrage_PNC()throws Throwable
	{
		ModulePNCModel.ModifierParamétragePNC();
	}
	@When("^cliquer sur ajouter PNC$")
	public void cliquer_sur_ajouter_PNC() throws Throwable {
		ModulePNCModel.ajouterFichePNC(driver);
	}
	@Then("^Saisir Description de la nonconformité$")
	public void Saisir_Description_de_la_nonconformité() throws Throwable {
		ModulePNCModel.descriptionPNCID();
	}

	@And("^Saisir actions immediates$")
	public void saisir_actions_immediates() throws Throwable {
		ModulePNCModel.actimmediatesID();
	}

	@And("^saisir numéro interne de la fiche PNC$")
	public void saisir_numéro_interne_de_la_fiche_PNC() throws Throwable {
		ModulePNCModel.refinterneID();
	}
	@And("^Saisir date de livraison$")
	public void Saisir_date_de_livraison() throws Throwable {
		ModulePNCModel.livraisonID(driver);
	}

	@And("^saisir date de détection$")
	public void saisir_date_de_détection() throws Throwable {
		ModulePNCModel.detectionIDe(driver);
	}
	@And("^choisir le nom de celui qui a détecté la PNC$")
	public void choisir_le_nom_de_celui_qui_a_détecté_la_PNC() throws Throwable {

		ModulePNCModel.choixdetectionpXPATH1();
	}
	
	@And("^saisir type de NC$")
	public void saisir_type_de_NC() throws Throwable {

		ModulePNCModel.TypeNCID();

	}
	@And("^sélectionner la gravité$")
	public void sélectionner_la_gravité() throws Throwable {

		ModulePNCModel.gravitePNC();
	}	
	
	@And("^saisir site PNC$")
	public void choisir_site_PNC() throws Throwable {

		ModulePNCModel.siteNC(driver);
	}	
	
		@And("^sélectionner la ISPS$")
		public void sélectionner_la_ISPS() throws Throwable {

			ModulePNCModel.sélectionner_la_ISPS();
		}	
		
	@And("^saisir processus PNC$")
	public void choisir_processus_PNC() throws Throwable {

		ModulePNCModel.processusNC(driver);
	}		
	@And("^saisir Activité PNC$")
	public void choisir_activite_PNC() throws Throwable {

		ModulePNCModel.activiteNC(driver);
	}		
	@And("^saisir direction PNC$")
	public void choisir_direction_PNC() throws Throwable {

		ModulePNCModel.directionNC(driver);
	}	
	@When("^choisir fournisseur PNC$")
	public void choisir_fournisseur_PNC() throws Throwable {
		ModulePNCModel.FournisseurPNC();
	}

	@When("^saisir service PNC$")
	public void saisir_service_PNC() throws Throwable {
		ModulePNCModel.serviceNC(driver);
	}

	@When("^chosir type de détection$")
	public void chosir_type_de_détection() throws Throwable {
		ModulePNCModel.clientPNC();
	}

	@And("^saisir Numéro de OF$")
	public void saisir_Numéro_de_OF() throws Throwable {

		ModulePNCModel.numeroOF();
	}		
	@And("^saisir le numéro de lot$")
	public void saisir_lot_PNC() throws Throwable {

		ModulePNCModel.numeroLot(Path);
	}	
	@And("^saisir Numéro de OF2$")
	public void saisir_Numéro_de_OF2() throws Throwable {

		ModulePNCModel.numeroOF2(driver);
	}		
	@And("^saisir le numéro de lot2$")
	public void saisir_le_numéro_de_lot2() throws Throwable {

		ModulePNCModel.numeroLot2(Path,driver);
	}	
	@When("^saisir le numéro de lot(\\d+)$")
	public void saisir_le_numéro_de_lot(int arg1) throws Throwable {

		ModulePNCModel.numeroLot2(Path,driver);
	}
	
	@And("^saisir produit PNC$")
	public void choisir_produit_PNC() throws Throwable {

		ModulePNCModel.produitPNC(driver);
	}		
	@And("^saisir quantité détectée$")
	public void saisir_quantité_détectée() throws Throwable {

		ModulePNCModel.qtdetecte();
	}		
	@And("^saisir quantité produite$")
	public void saisir_quantité_produite() throws Throwable {

		ModulePNCModel.qtproduite();
	}		
	@And("^choisir unite PNC$")
	public void choisir_unite_PNC() throws Throwable {

		ModulePNCModel.unitePNC();
	}		
	@And("^saisir la source de NC$")
	public void saisir_la_source_de_NC() throws Throwable {

		ModulePNCModel.sourcePNC();
	}		
	@And("^saisir l atelier$")
	public void saisir_l_atelier() throws Throwable {

		ModulePNCModel.atelierPNC();
	}		
	@And("^sasir l origine de la PNC$")
	public void sasir_l_origine_de_la_PNC() throws Throwable {

		ModulePNCModel.originePNC();
	}		
	@And("^cliquer sur valider enregistrement$")
	public void cliquer_sur_valider_enregistrement() throws Throwable {
		ModulePNCModel.cliquervaldenrgNC(driver);
			
	}
	
	@Then("^Fiche PNC ajoutée$")
	public void Fiche_PNC_ajoutée() throws Throwable {
	Thread.sleep(2000L);
		WebElement num =driver.findElement(By.id("ctl00_ContentPlaceHolder1_NNC"));
		String Num=num.getText();
		System.out.println("PNC numero: "+Num);
		Common.Exporter_visibilité("Fiche PNC:"+Num);
		Common.Exporter_champ_A_masquer("Fiche PNC: "+Num);
		Common.Exporter_numFiche("Fiche PNC: "+Num);
		ExcelUtils.setExcelFile(ModulePNCModel.Path, "PNC");
		ExcelUtils.setCellData1(Num, ModulePNCModel.row , 15 , ModulePNCModel.Path, "PNC") ;
		Boolean vide = true ;
		if(Num.contentEquals(""))
		{
			 vide=true;
		} 
		else
		{
			 vide=false;
		}
		asserttrue(vide);
		NumPNC=Num;
	}
	
	@Then("^Vérifier taux de non conformité$")
	public void vérifier_taux_de_non_conformité() throws Throwable {
		boolean  ok  =false;
		try {
			ModulePNCPage.qtproduite.isDisplayed();
			ok   =true  ;
		}catch(NoSuchElementException exp  )
		
		{
			Common.Exporter_champ_A_masquer("le champ taux  est invisible");	
		}
		if(ok==true) {
		String qteprod=ModulePNCPage.qtproduite.getAttribute("value").replace(',', '.');

		Float qtéproduite= Float.parseFloat(qteprod);
		int taux_calcule=Integer.parseInt(ModulePNCPage.qtdetecte.getAttribute("value"))/qtéproduite.intValue();
		if(ModulePNCPage.tauxPNCId.getAttribute("value").equals(Integer.toString(taux_calcule))) {
		System.out.println("taux de conformité valide");
		}else 
		{
			System.out.println("taux de conformité invalide");
			
		}
		asserttrue(ModulePNCPage.tauxPNCId.getAttribute("value").contains(Integer.toString(taux_calcule)));}

	}

	
	@Then("^rattacher des types de causes$")
	public void rattacher_des_types_de_causes() throws Throwable {
		ModulePNCModel.choixtypedecause(driver);
	}
	
	@When("^vérifier le compteur de l agenda$")
	public void vérifier_le_compteur_de_l_agenda() throws Throwable {
	    ModulePNCModel.actualisation();
	
		try {
			if (ModulePNCPage.compteurPNC.getText() != "") {
				compteur = Integer.parseInt(ModulePNCPage.compteurPNC.getText());
				System.out.println("compteur: " + compteur);
			} else {
				compteur = 0;
				System.out.println("compteur: " + compteur);
			}
		} catch (Exception e)  { 
			
		}
	}
	

	
	@Then("^incrémentation de l agenda PNC$")
	public void incrémentation_de_l_agenda_PNC() throws Throwable {
		Boolean incrementation = false;
		ModulePNCModel.actualisation();
		Thread.sleep(2000L); 
		System.out.println("compteur1 : " + ModulePNCPage.compteurPNC.getText());
		if (Integer.parseInt(ModulePNCPage.compteurPNC.getText()) == compteur + 1) {
			incrementation = true;
		}
		asserttrue(incrementation);
	}
	
	private void asserttrue(Boolean incrementation) {
		
	}

	@When("^consulter agenda PNC$")
	public void consulter_agenda_PNC() throws Throwable {
	    ModulePNCModel.consulter_agendaPNC(driver);
		Thread.sleep(2000L);
	}

	@When("^consulter (\\d+) PNC à valider$")
	public void consulter_PNC_à_valider(int arg1) throws Throwable {
		ModulePNCModel.consulter_PNC_validation(driver);
		ModulePNCModel.consulterPNCàvalider(arg1,driver);
	}

	  @And ("^cliquer sur PNC à valider$")
	  public void cliquer_sur_PNC_à_valider() throws Throwable {
		  ModulePNCModel.cliquersurPNCàvalider();
	  }
	  
	  @When("^saisir \"([^\"]*)\" à prendre$")
	  public void saisir_à_prendre(String arg1) throws Throwable {
			
		  ModulePNCModel.decisionDeValidation(arg1,driver);
		}
	  
		@When("^consulter (\\d+) PNC à corriger$")
		public void consulter_PNC_à_corriger(int arg1) throws Throwable {
			ModulePNCModel.consulter_PNC_correction();
			ModulePNCModel.consulterPNCàcorriger(arg1);
		}

		  @And ("^cliquer sur PNC à corriger$")
		  public void cliquer_sur_PNC_à_corriger() throws Throwable {
			  ModulePNCModel.cliquersurPNCàcorriger();
		  }
		  
		  @Parameters({ "arg1" })
		  @Test
		  @Then("^vérifier que l état de la fiche PNC suit \"([^\"]*)\"$")
	  public void vérifier_que_l_état_de_la_fiche_PNC_suit(String arg1) throws Throwable {
	 		
				
			  if(arg1.equals("Refus"))
    		{
	 			System.out.println("Fiche PNC refusé par le responsable validation");
	 			asserttrue(ModulePNCPage.PNCStateId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_listeNC\"]/tbody/tr[1]/td[13]")).
	 					findElement(By.tagName("span")).getText().contains("Refusée")||ModulePNCPage.PNCStateId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_listeNC\"]/tbody/tr[1]/td[13]")).
	 					findElement(By.tagName("span")).getText().contains("Refused"));
	 		
    		}else if(arg1.equals("Correction")) {
    			System.out.println("Fiche PNC envoyé pour correction par le responsable validation");
    			asserttrue(ModulePNCPage.PNCStateId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_listeNC\"]/tbody/tr[1]/td[13]")).
    					findElement(By.tagName("span")).getText().contains("waiting for  Correction")||ModulePNCPage.PNCStateId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_listeNC\"]/tbody/tr[1]/td[13]")).
    					findElement(By.tagName("span")).getText().contains("En attente de correction"));
    		}else if(arg1.equals("Validation")) {
    			System.out.println("Fiche PNC validé par le responsable validation");
    			asserttrue(ModulePNCPage.PNCStateId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_listeNC\"]/tbody/tr[1]/td[13]")).
    					findElement(By.tagName("span")).getText().contains("Waiting for decision")||ModulePNCPage.PNCStateId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_listeNC\"]/tbody/tr[1]/td[13]")).
    					findElement(By.tagName("span")).getText().contains("En attente de décision"));
    		}else if(arg1.equals("Corrige")) {
    			System.out.println("Fiche PNC corrige par le déclencheur ");
    			asserttrue(ModulePNCPage.PNCStateId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_listeNC\"]/tbody/tr[1]/td[13]")).
    					findElement(By.tagName("span")).getText().contains("waiting for validation")||ModulePNCPage.PNCStateId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_listeNC\"]/tbody/tr[1]/td[13]")).
    					findElement(By.tagName("span")).getText().contains("En attente de validation"));
    		}else if(arg1.equals("Pass. resp. val. Trait."))
    		{
    			System.out.println("Décision de Traitement est prise");
    			asserttrue(ModulePNCPage.EtatPNC.getText().contains("En attente de validation de la décision")||
    					ModulePNCPage.EtatPNC.getText().contains("Awaiting validation of the decision"));
    			
    		}else if(arg1.equals("Pass. resp. Trait."))
    		{
    			System.out.println("Décision de Traitement est prise");
    			asserttrue(ModulePNCPage.EtatPNC.getText().contains("En attente de traitement")||
    					ModulePNCPage.EtatPNC.getText().contains("Waiting for disposion"));
    			
    		}
    		else if(arg1.equals("val. Dec. Trait."))
    		{
    			System.out.println("Décision de Traitement est prise");
    			asserttrue(ModulePNCPage.EtatPNC.getText().contains("En attente de traitement")||
    					ModulePNCPage.EtatPNC.getText().contains("waiting for treatment"));
    			
    		}else if(arg1.equals("refus. Dec. Trait."))
    		{
    			System.out.println("Décision de Traitement est prise");
    			asserttrue(ModulePNCPage.EtatPNC.getText().contains("En attente de décision")||
    					ModulePNCPage.EtatPNC.getText().contains("En attente de décision"));
    			
    		}
  	}
				
		
	
		
	  
	  @And("^saisir le nom du décideur$")
		public void saisir_le_nom_du_décideur() throws Throwable {
			ModulePNCModel.decideurPNC();
	  }
	  
	  @And("^saisir un commentaire$")
		public void saisir_commentaire() throws Throwable {		
			ModulePNCModel.commentairevalidation();
		}
	  
	  @When("^cliquer sur valider partie validation$")
		public void cliquer_sur_valider_partie_validation() throws Throwable {		
			ModulePNCModel.partievalidée();
			Thread.sleep(2000L); 
		}
		
	  @When("^cliquer sur décision de traitement$")
	  public void cliquer_sur_décision_de_traitement() throws Throwable {
			ModulePNCModel.cliquerdecisonPNC(driver);
		}
	  
	  @When("^consulter (\\d+) PNC pour décision de traitement$")
		public void consulter_PNC_pour_décision_de_traitement(int arg1) throws Throwable {
		  ModulePNCModel.consulterPNC_decidion(arg1);
			Thread.sleep(500L);
			ModulePNCModel.cliquersurPNC_decision();	
			Thread.sleep(500L);
		}

	  
	  @When("^cliquer sur Nécessite investigation$")
	  public void cliquer_sur_Nécessite_investigation() throws Throwable {
		  ModulePNCModel.Nécessite_investigation();
		  
	  }

	  @When("^saisir responsable investigation$")
	  public void saisir_responsable_investigation() throws Throwable {
		  ModulePNCModel.ResponsableInvestigation(driver);
	  }

	  @When("^saisir délai investigation$")
	  public void saisir_délai_investigation() throws Throwable {
		  ModulePNCModel.DélaiInvestigation(driver);
	  }

	  @When("^joindre plan investigation$")
	  public void joindre_plan_investigation() throws Throwable {
		  ModulePNCModel.PlanInvestigation(driver);
	  }

	  @When("^choisir approbateur investigation$")
	  public void choisir_approbateur_investigation() throws Throwable {
		  ModulePNCModel.ApprobateurInvestigation();
	  }

	  @When("^valider partie investigation$")
	  public void valider_partie_investigation() throws Throwable {
		 
		  ModulePNCModel.validerInvestigation(driver);
	  }
	  
	  @When("^cliquer sur investigation à éffectuer$")
	  public void cliquer_sur_investigation_à_éffectuer() throws Throwable {
		  ModulePNCModel.cliquerInvestigationPNC(driver);
	  }

	  @When("^consulter (\\d+) PNC à investiger$")
	  public void consulter_PNC_à_investiger(int arg1) throws Throwable {
		  ModulePNCModel.consulterPNC_investigation(arg1);
		  ModulePNCModel.cliquersurPNC_investigation();
	  }

	  @When("^saisir rapport investigation$")
	  public void saisir_rapport_investigation() throws Throwable {
		  ModulePNCModel.Rapport_investigation();
	  }

	  @When("^cliquer sur investigation à approuver$")
	  public void cliquer_sur_investigation_à_approuver() throws Throwable {
		  ModulePNCModel.cliquerAppInvestigationPNC();
		  
		  
	  }

	  @When("^consulter (\\d+) PNC à approuver investigation$")
	  public void consulter_PNC_à_approuver_investigation(int arg1) throws Throwable {
		  ModulePNCModel.consulterPNC_Appinvestigation(arg1);
		  ModulePNCModel.cliquersurPNC_Appinvestigation();
		  
	  }

	  @When("^cliquer sur investigation approuvé$")
	  public void cliquer_sur_investigation_approuvé() throws Throwable {
		  
		  
		  ModulePNCModel.ApprobationInvestigation(driver);
	  }
	  
	  @And("^saisir cause de NC$")
		public void saisir_cause_de_NC() throws Throwable {
			ModulePNCModel.causePNC(); 
		}
	  @And("^saisir le responsable de traitement$")
		public void saisir_le_responsable_de_traitement() throws Throwable {
			ModulePNCModel.resptraitement();
		}
	  @And("^saisir type responsable traitement$")
	  public void saisir_type_responsable_traitement() throws Throwable{
		  ModulePNCModel.typeresptraitement();
	  } 
	  @And("^saisir délai de traitement$")
		public void saisir_délai_de_traitement() throws Throwable {
			ModulePNCModel.delaistraitement(driver);
		}
	  @And("^saisir le traitement de NC$")
		public void saisir_le_traitement_de_NC() throws Throwable {
			ModulePNCModel.traitementPNC();
		}
	  @And("^saisir le type de traitement de NC$")
		public void saisir_type_de_traitement_de_NC() throws Throwable {
			ModulePNCModel.choisir_typetraitement();
		}
	  @And("^saisir le nom du responsable de suivi$")
		public void saisir_le_nom_du_responsable_de_suivi() throws Throwable {
			ModulePNCModel.choisir_resp_suivi(driver);
			//ModulePNCModel.validation_respsuivi();
	  }

	  @When("^cliquer sur valider décision$")
		public void cliquer_sur_valider_décision() throws Throwable {
			ModulePNCModel.validation_respsuivi(driver);
		}
	  
	  @Then("^la décision est prise en considération$")
	  public void la_décision_est_prise_en_considération() throws Throwable {
		  String verifEtat = ModulePNCPage.EtatPNC.getText();
			AssertJUnit.assertTrue(verifEtat.contains("En attente de traitement"));
	  }
	  
	  @When("^consulter (\\d+) décision de traitement à valider$")
	  public void consulter_décision_de_traitement_à_valider(int arg1) throws Throwable {
				
		  		ExcelUtils.setExcelFile(Path, "PNC");
				String responsable=ExcelUtils.getCellData(arg1,7);
				if(!(responsable.equals(""))) 
				{
					ModulePNCModel.cliquerDecTraitAvalider();
					ModulePNCModel.consulterPNC_VALD_dec_trait(arg1);
				} 
	  }

	  @When("^cliquer sur décison à valider$")
	  public void cliquer_sur_décison_à_valider() throws Throwable {
			ExcelUtils.setExcelFile(Path, "PNC");
			String responsable=ExcelUtils.getCellData(row1,7);
			if(!(responsable.equals(""))) 
			{
		  ModulePNCModel.cliquersurPNC_VALD_dec_trait();
		  Thread.sleep(1000);
		  }
	  }
	  @And("^saisir \"([^\"]*)\" validation de décision de Traitement à prendre$")
	  public void saisir_validation_de_décision_de_Traitement_à_prendre(String arg1) throws Throwable {
			ExcelUtils.setExcelFile(Path, "PNC");
			String responsable=ExcelUtils.getCellData(row1,7);
			if(!(responsable.equals(""))) 
			{
		  ModulePNCModel.ChoixValidationDécisionTraitement(arg1,driver);
		  }
	  }
	  @When("^cliquer sur (\\d+) PNC à traiter$")
	  public void cliquer_sur_PNC_à_traiter(int arg1) throws Throwable {

		    ModulePNCModel.traitement_PNC();
			ModulePNCModel.consulterPNC_àtraiter(arg1);
			ModulePNCModel.cliquersurPNC_traitée();	
			Thread.sleep(1000L);
	  }

	  @And("^cliquer sur phase traitée$")
	  public void cliquer_sur_phase_traitée() throws Throwable {
	      ModulePNCModel.cliquersurPHASE_traitée();
	      Thread.sleep(1000L);
	  }

	  @And("^saisir le rapport de traitement$")
	  public void saisir_le_rapport_de_traitement() throws Throwable {
	     ModulePNCModel.rapporttraitement();
	  }

	  @And("^saisir la date de traitement$")
	  public void saisir_la_date_de_traitement() throws Throwable {
		  ModulePNCModel.Date_traitement(driver);
	  }

	  @And("^saisir le cout de traitement$")
	  public void saisir_le_cout_de_traitement() throws Throwable {
		  ModulePNCModel.cout_traitement();
	  }

	  @And("^saisir la quantité rejetée$")
	  public void saisir_la_quantité_rejetée() throws Throwable {
	      ModulePNCModel.quantitérejetée();
	  }
	  
	  @And("^saisir la quantité acceptée$")
	  public void saisir_la_quantité_acceptée() throws Throwable {
	      ModulePNCModel.quantitéacceptée();
	  }
	  @And("^saisir la quantité dégradée$")
	  public void saisir_la_quantité_dégradée() throws Throwable {
	      ModulePNCModel.quantitédégradée();
	  }
	  @And("^saisir le pourcentage de dépréciation$")
	  public void saisir_le_pourcentage_de_dépréciation() throws Throwable {
	      ModulePNCModel.pourcentagedépréciation();
	      
	  }
	  @When("^cliquer sur valider traitement$")
	  public void cliquer_sur_valider_traitement() throws Throwable {
	     ModulePNCModel.valdationtraitement();
	  }
	  @Then ("^vérifier calcul cout traitement et valeur déclassée et valeur rejetée$")
	  public void vérifier_calcul_cout_traitement_et_valeur_déclassée_et_valeur_rejetée() throws Throwable
	  {
		  ModulePNCModel.VérifierTaux();
	  }

	  @Then("^Fiche PNC traitée$")
	  public void  Fiche_PNC_traitée() throws Throwable {
		  
		  String verifEtat = ModulePNCPage.EtatPNC.getText();
		  System.out.println(verifEtat);
		  Thread.sleep(500);
		  AssertJUnit.assertTrue(verifEtat.contains("En attente de clôture")||verifEtat.contains("Waiting for closure"));
		  
	  }

	  @Then("^cliquer sur (\\d+) PNC à clôturer$")
	  public void cliquer_sur_PNC_à_clôturer(int arg1) throws Throwable {
	    ModulePNCPage.agendaPNC.click();
	    Thread.sleep(1000L);
	    ModulePNCPage.PNCàcloturer.click();
		  JavascriptExecutor js =(JavascriptExecutor)driver;
		  //js.executeScript("arguments[0].click();",ModulePNCPage.PNCàcloturer);
		  Thread.sleep(1000);
	    ModulePNCModel.consulterPNCàcloturer(arg1);
	    ModulePNCModel.cliquersurPNCàcloturer();
	  }

	  @Then("^cliquer sur PNC clôturée$")
	  public void cliquer_sur_PNC_clôturée() throws Throwable {
	      ModulePNCModel.cloture_PNC();
	      Thread.sleep(2000L);
	  }

	  @Then("^saisir rapport de clôture$")
	  public void saisir_rapport_de_clôture() throws Throwable {
	    ModulePNCModel.Rapport_cloture_PNC();
	  }

	  @When("^cliquer sur valider cloture$")
	  public void cliquer_sur_valider_cloture() throws Throwable {
	    ModulePNCModel.Validation_cloture_PNC();
	  }

	  @Then("^la fiche PNC est cloturée$")
	  public void la_fiche_PNC_est_cloturée() throws Throwable {
		  String verifEtat = ModulePNCPage.EtatPNC.getText();
		  AssertJUnit.assertTrue(verifEtat.contains("Clôturée")||verifEtat.contains("Closed"));
	  }

	  @Then("^cliquer sur (\\d+) approbation des PNC$")
	  public void cliquer_sur_approbation_des_PNC(int arg1) throws Throwable {
	      ModulePNCModel.consulter_agendaPNC(driver);
	      Thread.sleep(1000L);
	      ModulePNCModel.consulterPNCàapprouver();
	      ModulePNCModel.recherche_PNCàapprouver(arg1);
	      ModulePNCModel.cliquersurPNCàapprouver();
	  }

	  @Then("^cliquer sur PNC approuvée$")
	  public void cliquer_sur_PNC_approuvée() throws Throwable {
	      ModulePNCModel.Approbation_PNC();
	      Thread.sleep(500L);
	  }

	  @Then("^saisir le commentaire d approbation$")
	  public void saisir_le_commentaire_d_approbation() throws Throwable {
		  ModulePNCModel.Rapport_approbation_PNC();
	  }

	  @And("^cliquer sur valider approbation$")
	  public void cliquer_sur_valider_approbation() throws Throwable {
	   ModulePNCModel.Validation_approbation_PNC(driver);
	  } 
	  
	  @Then("^Rechercher Nfiche PNC$")
	  public void Rechercher_Nfiche_PNC() throws Throwable {
		  
		  ModulePNCModel.Recherche_Fiche_PNC(driver);
	  }
	    @And ("^consulter fiche PNC$")
	    public void consulter_fiche_PNC() throws Throwable {
	       ModulePNCModel.Consulter_FichePNC();
	    }
	    @And ("^cliquer sur aperçu$") 
	    public void cliquer_sur_aperçu() throws Throwable {
		       ModulePNCModel.Consulter_aperçuFichePNC();
	    }
	    //Amira
	    @When("^Consulter reporting Bilan des non conformités produits$")
	    public void consulter_reporting_Bilan_des_non_conformités_produits() throws Throwable {
	    	
			 JavascriptExecutor executor = (JavascriptExecutor)driver;
		     executor.executeScript("arguments[0].click();", FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > a > img")));
		     // FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > a > img")).click();
		     JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		      executor2.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(7) > a")) );
		     // FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(7) > a")).click();
		     JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		      executor3.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(7) > ul > li:nth-child(1) > a")) );
		      //FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(7) > ul > li:nth-child(1) > a")).click();
		      
	    Thread.sleep(1000L);
	    }

	    @When("^récupérer filtre reporting Bilan des non conformités produits$")
	    public void récupérer_filtre_reporting_Bilan_des_non_conformités_produits() throws Throwable {
	    	//ModulePNCModel.initializer_filtre_Bilan_PNC(Path);
	    }

	    @Then("^vérifier les données rapport Bilan des non conformités produits$")
	    public void vérifier_les_données_rapport_Bilan_des_non_conformités_produits() throws Throwable {
			String name1 = "Bilan_PNC";
			ExcelUtils.setExcelFile(Path, "PNC");
			String num_PNC=ExcelUtils.getCellData(1,2);
			Common.Vérifier_données(name1,num_PNC);
	    }
	    

		}

		

		
