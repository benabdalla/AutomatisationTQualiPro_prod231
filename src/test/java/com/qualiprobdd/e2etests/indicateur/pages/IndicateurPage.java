package com.qualiprobdd.e2etests.indicateur.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qualiprobdd.e2etests.util.AbstractPage;

public class IndicateurPage extends AbstractPage {

	public IndicateurPage(WebDriver driver) {

		super(driver);
	}

	/* Locators */ // optimisation de maintenance par déclaration de variable

	final static String MENU_ID = "ctl00_menuModal";
	final static String HOME_ID = "ctl00_image2";
	final static String INDICATEURS_XPATH = "//*[@id=\"cssmenu15\"]/div/div/ul/li[4]/a";
	final static String INDICATEUR_XPATH = "//*[@id=\"cssmenu15\"]/div/div/ul/li[4]/ul/li[1]/a";
	//final static String SUIVI_ID = "ctl00_ContentPlaceHolder1_Span1";//*[@id="ctl00_ContentPlaceHolder1_Ajoutsuivi_div"]
	final static String SUIVI_ID = "ctl00_ContentPlaceHolder1_Ajoutsuivi_div";
	//final static String ACTION_PLUS_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_Span2\"]";
	final static String ACTION_PLUS_XPATH = "Span2";
	//final static String LISTE_RISQUES_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_Span3\"]";
	//added by rahma
	final static String LISTE_RISQUES_XPATH = "Span3";
	
	//final static String ENREGISTREMENT_XPATH = "ctl00_ContentPlaceHolder1_circle";//*[@id="circle"]
	final static String ENREGISTREMENT_XPATH = "circle";
	final static String BOUTTON_AJOUTER_ID = "ctl00_ContentPlaceHolder1_Ajouter";
	final static String LIBELLE_INDICATEUR_ID = "ctl00_ContentPlaceHolder1_TextBox3";
	final static String FORMULE_DE_CALCUL_ID = "ctl00_ContentPlaceHolder1_TextBox8";
	final static String TYPE_INDICATEUR_ID = "ctl00_ContentPlaceHolder1_TYPEOBJECTT";
	final static String CALENDRIER_ID = "ctl00_ContentPlaceHolder1_TextBox6";
	final static String CHOIX_DATE_ID = "ctl00_ContentPlaceHolder1_CalendarExtender5_today";
	final static String RESPONSABLE_INDICATEUR_PLUS_ID = "ctl00_ContentPlaceHolder1_Lb_RatResp";
	final static String RESPONSABLE_INDI_RECHERCHER_XPATH = "ctl00_ContentPlaceHolder1_TextBox20";
	final static String RESPONSABLE_INDI_VLD_RECHERCHER_XPATH = "ctl00_ContentPlaceHolder1_LinkButton60";
	final static String RESPONSABLE_INDI_CHOIX_ID = "//*[@id=\"ctl00_ContentPlaceHolder1_GridRespIndic\"]/tbody/tr[1]/td[1]";	
	final static String RESPONSABLE_INDI_VALIDER_ID = "ctl00_ContentPlaceHolder1_LinkButtonValidRespIndic";		
	final static String PERIODICITY_SUIVI_ID = "ctl00_ContentPlaceHolder1_PERIODESUIVI";
	final static String TYPE_SUIVI_ID = "ctl00_ContentPlaceHolder1_ListBoxTypeSuivi";
	final static String TYPE_RESULTAT_ID = "ctl00_ContentPlaceHolder1_ListBox1";
	final static String VALEUR_CIBLE_OPERATEUR_ID = "ctl00_ContentPlaceHolder1_ListBox2";
	final static String VALEUR_CIBLE_OPERATEUR_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_ListBox2\"]/option[4]";
	final static String VALEUR_CIBLE_ID = "ctl00_ContentPlaceHolder1_TextBox4";
	final static String UNITE_ID = "ctl00_ContentPlaceHolder1_TextBox_Unite";
	final static String LIMITE_CRITIQUE_ID = "ctl00_ContentPlaceHolder1_TextBox12";
	final static String COEFFICIENT_ID = "ctl00_ContentPlaceHolder1_TextBoxCoef";
	final static String SITE_ID = "ctl00_ContentPlaceHolder1_site";
	final static String PROCESSUS_ID = "ctl00_ContentPlaceHolder1_lBProcessus_";
	final static String DIRECTION_ID = "ctl00_ContentPlaceHolder1_ListBox_Direction";
	final static String ACTIVITE_ID = "ctl00_ContentPlaceHolder1_lBDomaine_";
	final static String SERVICE_ID = "ctl00_ContentPlaceHolder1_lBService_";
	final static String BOUTON_VALIDER_INDICATEUR = "ctl00_ContentPlaceHolder1_LinkButton10";
	final static String BOUTON_VALIDER_politique = "ctl00_ContentPlaceHolder1_LinkButton14";
	final static String AGENDA_INDICATEUR = "ctl00_obj";
	final static String CPT_AGENDA_INDICATEUR = "ctl00_obj";
	final static String RATTACHER_AXES_POLOTIQUES = "ctl00_ContentPlaceHolder1_LinkButton5";
	final static String CHOIX_AXES_POLOTIQUES = "//*[@id=\"ctl00_ContentPlaceHolder1_AXEPOLITIQUE\"]/option[2]";
	final static String VALIDER_AXES_POLOTIQUES = "ctl00_ContentPlaceHolder1_LinkButton14";
	final static String AJOUTER_DETAIL_ID = "ctl00_ContentPlaceHolder1_Ajoutsuivi";
	final static String HEBDOMADAIRE_XPATH = "ctl00_ContentPlaceHolder1_listeP";
	final static String ANNEE_ID = "ctl00_ContentPlaceHolder1_listeAN";
	final static String VALEUR_ID = "ctl00_ContentPlaceHolder1_ValeurSuivi";
	final static String RAPPORT_ID = "ctl00_ContentPlaceHolder1_Comm";
	final static String FICHIER_LIEN_ID = "ctl00_ContentPlaceHolder1_FichierL";
	final static String VALIDER_DETAIL_ID = "ctl00_ContentPlaceHolder1_Button7";
	final static String RATTACHER_ACTION_ID = "ctl00_ContentPlaceHolder1_LinkButton21";
	//final static String RECH_BTN_ACTION_ID ="ctl00_ContentPlaceHolder1_Panel35\"]/div[2]/div/div/div";
	//added by rahma
	final static String RECH_BTN_ACTION_ID ="ctl00_ContentPlaceHolder1_Panel35";
	final static String ACTION_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_act\"]/tbody/tr/td[1]";
	final static String VALIDER_RATTACHER_ACTION_ID = "ctl00_ContentPlaceHolder1_LinkButton19";
	final static String RATTACHER_RISQUES_ID = "ctl00_ContentPlaceHolder1_LinkButton42";
	final static String RISQUES_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView6\"]/tbody/tr[1]/td[1]";
	final static String VALIDER_CHOIX_RISQUE_ID = "ctl00_ContentPlaceHolder1_LinkButton53";
	final static String N_INDICATEUR_FILTRE_ID = "ctl00_ContentPlaceHolder1_TextBox2";
	final static String TYPE_INDICATEUR_FILTRE_ID = "ctl00_ContentPlaceHolder1_LISTOBJ1";
	final static String PERIODICITE_INDICATEUR_FILTRE_ID = "ctl00_ContentPlaceHolder1_Periode1";
	final static String RECHERCHER_INDICATEUR_FILTRE_ID = "ctl00_ContentPlaceHolder1_Button1";
	//final static String RECHERCHER_ACTION = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_act_filter\"]/label/input";
	final static String RECHERCHER_ACTION = "ctl00_ContentPlaceHolder1_TextBox33";
	final static String VLD_RECHERCHER_ACTION = "ctl00_ContentPlaceHolder1_LinkButton34";
	final static String DATEREMISEAZERO="ctl00_ContentPlaceHolder1_Tb_date_remise";
	final static String PERIODICITEREMISEAZERO="ctl00_ContentPlaceHolder1_list_periodicite";
	
	final static String EDIT_FORMULE = "ctl00_ContentPlaceHolder1_linkButtonEditFormule";
	final static String VAL_FORMULE = "ctl00_ContentPlaceHolder1_TextBox17";
	final static String OP_FORMULE = "ctl00_ContentPlaceHolder1_listeoperat";
	final static String IND_FORMULE = "ctl00_ContentPlaceHolder1_listeIndic";
	final static String PARENTH_FORMULE = "ctl00_ContentPlaceHolder1_listeparent";
	final static String VALD_PARENTH_FORMULE = "ctl00_ContentPlaceHolder1_LinkButton24";
	final static String VALD_CONT_FORMULE = "ctl00_ContentPlaceHolder1_LinkButton31";
	final static String ENRG_FORMULE = "ctl00_ContentPlaceHolder1_valid_src";
	
	final static String Chx_Data="ctl00_ContentPlaceHolder1_lnkparamimport2";//
	final static String Rech_Data="//*[@id=\"ctl00_ContentPlaceHolder1_grdefind_filter\"]/label/input";
	final static String select_Data="//*[@id=\"ctl00_ContentPlaceHolder1_grdefind\"]/tbody/tr[1]/td[1]";
	final static String Vld_Data="ctl00_ContentPlaceHolder1_lnkval";
	final static String Grid_Suivi="ctl00_ContentPlaceHolder1_G2";
	final static String Rech_Annee_Suivi="//*[@id=\"ctl00_ContentPlaceHolder1_G2_filter\"]/label/input";
	
	final static String FILTRE_RECH_ID="ctl00_ContentPlaceHolder1_TextBox2";
	final static String RECH_ID="ctl00_ContentPlaceHolder1_Button1";
	final static String Grid_Ind_ID="ctl00_ContentPlaceHolder1_GridView1";
	//final static String Suivi_Xpath="ctl00_ContentPlaceHolder1_Span1";//*[@id="Span1"]
	final static String Suivi_Xpath="Span1";
	final static String Moyen_Gene_ID="ctl00_ContentPlaceHolder1_TextBox16";
	
	@FindBy(how = How.ID, using = Moyen_Gene_ID)
	public static WebElement MoyenGeneID;
	@FindBy(how = How.ID, using = Grid_Suivi)
	public static WebElement GridSuivi;
	@FindBy(how = How.XPATH, using = Rech_Annee_Suivi)
	public static WebElement RechAnneeSuivi;
	@FindBy(how = How.ID, using = HOME_ID)
	public static WebElement homeID;
	@FindBy(how = How.ID, using = MENU_ID)
	public static WebElement menuID;
	@FindBy(how = How.XPATH, using = INDICATEURS_XPATH)
	public static WebElement indicateurs;
	@FindBy(how = How.XPATH, using = INDICATEUR_XPATH)
	public static WebElement indicateur;
	@FindBy(how = How.ID, using = SUIVI_ID)
	public static WebElement suivi;
	//@FindBy(how = How.XPATH, using = ACTION_PLUS_XPATH)
	@FindBy(how = How.ID, using = ACTION_PLUS_XPATH)
	public static WebElement plusAction;
	//@FindBy(how = How.XPATH, using = LISTE_RISQUES_XPATH)
	@FindBy(how = How.ID, using = LISTE_RISQUES_XPATH)
	public static WebElement listeRisques;
	@FindBy(how = How.ID, using = ENREGISTREMENT_XPATH)
	public static WebElement enregistrement;
	@FindBy(how = How.ID, using = Suivi_Xpath)
	public static WebElement suivi_panel;
	@FindBy(how = How.ID, using = BOUTTON_AJOUTER_ID)
	public static WebElement btajouterIndID;
	@FindBy(how = How.ID, using = DATEREMISEAZERO)
	public static WebElement dateremisezéro;
	@FindBy(how = How.ID, using = PERIODICITEREMISEAZERO)
	public static WebElement perioderemiseàzéro;
	
	
	@FindBy(how = How.ID, using = FILTRE_RECH_ID)
	public static WebElement filtre_rech_ind;
	@FindBy(how = How.ID, using = RECH_ID)
	public static WebElement btnrechind;
	@FindBy(how = How.ID, using = Grid_Ind_ID)
	public static WebElement GridInd;

	
	
	@FindBy(how = How.ID, using = BOUTON_VALIDER_politique)
	public static WebElement btajouterpoli;
	@FindBy(how = How.ID, using = LIBELLE_INDICATEUR_ID)
	public static WebElement btlibellindicateurID;

	@FindBy(how = How.ID, using = FORMULE_DE_CALCUL_ID)
	public static WebElement btFormulecalcul;

	@FindBy(how = How.ID, using = TYPE_INDICATEUR_ID)
	public static WebElement btTypeindictaeurID;

	@FindBy(how = How.ID, using = CALENDRIER_ID)
	public static WebElement btCalendrierID;

	@FindBy(how = How.ID, using = CHOIX_DATE_ID)
	public static WebElement btChoixdateID;

	@FindBy(how = How.ID, using = RESPONSABLE_INDICATEUR_PLUS_ID)
	public static WebElement responsableindicateurplus_ID;
	@FindBy(how = How.ID, using = RESPONSABLE_INDI_RECHERCHER_XPATH)
	public static WebElement rechercherresponsableindicateur_XPATH;
	@FindBy(how = How.ID, using = RESPONSABLE_INDI_VLD_RECHERCHER_XPATH)
	public static WebElement vldrechercherresponsableindicateur_XPATH;
	@FindBy(how = How.XPATH, using = RESPONSABLE_INDI_CHOIX_ID)
	public static WebElement choixresponsableindicateur_ID;
	@FindBy(how = How.ID, using = RESPONSABLE_INDI_VALIDER_ID)
	public static WebElement btnvaliderresponsableindicateur_ID;

	@FindBy(how = How.ID, using = PERIODICITY_SUIVI_ID)
	public static WebElement btnperiodiciteSuivi_ID;

	@FindBy(how = How.ID, using = TYPE_SUIVI_ID)
	public static WebElement btnTypesuiviID;

	@FindBy(how = How.ID, using = TYPE_RESULTAT_ID)
	public static WebElement btntyperesultat_ID;

	@FindBy(how = How.ID, using = VALEUR_CIBLE_OPERATEUR_ID)
	public static WebElement btnOperateurValeurcible_ID;

	@FindBy(how = How.XPATH, using = VALEUR_CIBLE_OPERATEUR_XPATH)
	public static WebElement btnOperateurValeurcible_XPATH;

	@FindBy(how = How.ID, using = VALEUR_CIBLE_ID)
	public static WebElement Valeurcible_ID;

	@FindBy(how = How.ID, using = UNITE_ID)
	public static WebElement Unite_ID;

	@FindBy(how = How.ID, using = COEFFICIENT_ID)
	public static WebElement calendrierRealisationID;

	@FindBy(how = How.ID, using = SITE_ID)
	public static WebElement choixSite_ID;

	@FindBy(how = How.ID, using =PROCESSUS_ID)
	public static WebElement choixPROCESSUS_ID;
	
	@FindBy(how = How.ID, using = DIRECTION_ID)
	public static WebElement choixDIRECTION_ID;
	
	@FindBy(how = How.ID, using = ACTIVITE_ID)
	public static WebElement choixACTIVITE_ID;
	
	@FindBy(how = How.ID, using = SERVICE_ID)
	public static WebElement choixSERVICE_ID;
	
	@FindBy(how = How.ID, using = BOUTON_VALIDER_INDICATEUR)
	public static WebElement BtnValidationIndicateur_ID;
	@FindBy(how = How.ID, using = AGENDA_INDICATEUR)
	public static WebElement agendaIndicateur_ID;
	
	@FindBy(how = How.ID, using = CPT_AGENDA_INDICATEUR)
	public static WebElement CptagendaIndicateur_ID;

	@FindBy(how = How.XPATH, using = CHOIX_AXES_POLOTIQUES)
	public static WebElement choixAxePolitique_XPATH;

	@FindBy(how = How.ID, using = BOUTON_VALIDER_INDICATEUR)
	public static WebElement BtnValidationAxePolitique_ID;
	
	@FindBy(how = How.ID, using = RATTACHER_AXES_POLOTIQUES)
	public static WebElement rattacherAxePolitique_ID;

	@FindBy(how = How.ID, using = AJOUTER_DETAIL_ID)
	public static WebElement ajouterDetailID;

	@FindBy(how = How.ID, using = HEBDOMADAIRE_XPATH)
	public static WebElement hebdomadaire_XPATH;

	@FindBy(how = How.ID, using = ANNEE_ID)
	public static WebElement annee_ID;
	@FindBy(how = How.ID, using = VALEUR_ID)
	public static WebElement valeur_ID;

	@FindBy(how = How.ID, using = RAPPORT_ID)
	public static WebElement rapport_ID;

	@FindBy(how = How.ID, using = FICHIER_LIEN_ID)
	public static WebElement fichierLien_ID;
	@FindBy(how = How.ID, using = VALIDER_DETAIL_ID)
	public static WebElement btnValiderDetail_ID;

	@FindBy(how = How.ID, using = RATTACHER_ACTION_ID)
	public static WebElement rattacherAction_ID;
	@FindBy(how = How.XPATH, using = ACTION_XPATH)
	public static WebElement action_XPATH;
	@FindBy(how = How.ID, using = VALIDER_RATTACHER_ACTION_ID)
	public static WebElement btnValiderRattacherAction_ID;
	
	@FindBy(how = How.ID, using = RATTACHER_RISQUES_ID)
	public static WebElement rattacherRisque_ID;
	@FindBy(how = How.XPATH, using = RISQUES_XPATH)
	public static WebElement risque_XPATH;
	@FindBy(how = How.ID, using = VALIDER_CHOIX_RISQUE_ID)
	public static WebElement btnValiderChoixRisque_ID;
	
	@FindBy(how = How.ID, using = N_INDICATEUR_FILTRE_ID)
	public static WebElement NIndicateurFiltre_ID;
	
	@FindBy(how = How.ID, using = TYPE_INDICATEUR_FILTRE_ID)
	public static WebElement typeIdicateurFiltre_ID;
	@FindBy(how = How.XPATH, using = PERIODICITE_INDICATEUR_FILTRE_ID)
	public static WebElement periodiciteFilte_ID;
	@FindBy(how = How.ID, using =  RECHERCHER_INDICATEUR_FILTRE_ID)
	public static WebElement btnRechercherIdicateur_ID;
	//@FindBy(how = How.XPATH, using =  RECHERCHER_ACTION)
	@FindBy(how = How.ID, using =  RECHERCHER_ACTION)
	public static WebElement RechercherAction_ID;
	@FindBy(how = How.ID, using =  VLD_RECHERCHER_ACTION)
	public static WebElement VldRechercherAction_ID;
	@FindBy(how=How.ID, using = RECH_BTN_ACTION_ID)
	public static WebElement rechBtnAcitonID;
	@FindBy(how = How.ID, using =  EDIT_FORMULE )
	public static WebElement EditFormule_ID;
	@FindBy(how = How.ID, using =   VAL_FORMULE )
	public static WebElement ValFormule_ID;
	@FindBy(how = How.ID, using =   OP_FORMULE)
	public static WebElement OpFormule_ID;
	@FindBy(how = How.ID, using =  IND_FORMULE )
	public static WebElement IndFormule_ID;
	@FindBy(how = How.ID, using =  PARENTH_FORMULE )
	public static WebElement parenthFormule_ID;
	@FindBy(how = How.ID, using =  VALD_PARENTH_FORMULE)
	public static WebElement VldParenthFormule_ID;
	@FindBy(how = How.ID, using =   VALD_CONT_FORMULE)
	public static WebElement ValdContFormule_ID;
	@FindBy(how = How.ID, using =  ENRG_FORMULE )
	public static WebElement EnregFormule_ID;
	
	@FindBy(how = How.ID, using =  Chx_Data)
	public static WebElement ChxData_ID;
	@FindBy(how = How.XPATH, using =   Rech_Data)
	public static WebElement RechData_ID;
	@FindBy(how = How.XPATH, using =   select_Data)
	public static WebElement SelectData_ID;
	@FindBy(how = How.ID, using =   Vld_Data)
	public static WebElement VldData_ID;
	
}
