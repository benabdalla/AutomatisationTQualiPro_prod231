package com.qualiprobdd.e2etests.Documentation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qualiprobdd.e2etests.util.AbstractPage;

public class DocumentationPage extends AbstractPage {

	public DocumentationPage(WebDriver driver) {
		super(driver);

	}

	/* Locators */ // optimisation de maintenance par déclaration de variable
	final static String MENU_ID = "ctl00_menuModal";
	final static String HOME_ID = "ctl00_LinkButtonHome";
	final static String DOCUMENTATIONS_XPATH = "//*[@id=\"cssmenu15\"]/div/div/ul/li[1]/a";
	final static String DOCUMENTATION_XPATH = "//*[@id=\"cssmenu15\"]/div/div/ul/li[1]/ul/li[2]/a";
	final static String FORMATIONS_ACTIONS_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_panelRattachement\"]/div/div[1]/h4/a/span";

	final static String REDACTEUR_SUPERVISEUR_ID = "ctl00_ContentPlaceHolder1_buttonRedacSuper";
	final static String TYPE_DOCUMENT_ID = "ctl00_ContentPlaceHolder1_DropDownListTypeSup";
	final static String OBJET_ID = "ctl00_ContentPlaceHolder1_TextBoxObjetSup";
	final static String CHOISIR_FICHIER_ID = "//div[@id='ctl00_ContentPlaceHolder1_fichierlien']/div/span/label/span";

	final static String MESSAGE_ID = "ctl00_ContentPlaceHolder1_TextBoxMsgSup";
	final static String ENVOI_SUPERVISEUR_ID = "ctl00_ContentPlaceHolder1_buttonEnvoiSuper";
	final static String RECH_BOITE_ENVOI_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView_envoi_filter\"]/label/input";
	final static String BOITE_ENVOI_ID = "ctl00_ContentPlaceHolder1_GridView_envoi";
	final static String COMPTEUR_DOCUMENT_ID = "ctl00_label_lb_doc";
	final static String AGENDA_DOCUMENT_ID = "ctl00_lb_doc";

	final static String COMPTEUR_BOITE_DIALOGUE_ID = "ctl00_ContentPlaceHolder1_Nbr_dialog";
	final static String DOCUMENT_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Rec\"]/tbody/tr[2]/td[1]";
	final static String FICHIER_ID = "ctl00_ContentPlaceHolder1_VisualiserRecu";
	final static String CREE_DOCUMENT_ID = "ctl00_ContentPlaceHolder1_buttonCreerDoc";
	final static String SITE_ID = "ctl00_ContentPlaceHolder1_ListBox_Site";
	final static String PROCESSUS_ID = "ctl00_ContentPlaceHolder1_lBProcessus_";
	final static String MOT_CLE_ID = "ctl00_ContentPlaceHolder1_tb_motcleSpec";
	final static String VALIDER_ID = "ctl00_ContentPlaceHolder1_Valider_Doc";
	final static String VALIDER_BAS_ID = "ctl00_ContentPlaceHolder1_Envoyer";
	
	final static String REDACTEUR_BAS_ID = "ctl00_ContentPlaceHolder1_Circuit_duplic";
	final static String AGENDA_REDACTEUR_ID = "ctl00_ContentPlaceHolder1_Nbr_DocRedac";
	final static String CODE_DOCUMENT_ENCOURS_ID = "ctl00_ContentPlaceHolder1_Text_CodeD";
	final static String CODE_DOCUMENT_ID = "ctl00_ContentPlaceHolder1_TextBox10";
	final static String VISUALISER_DOCUMENT_ID = "ctl00_ContentPlaceHolder1_Button1";
	final static String VERIFICATEUR_ID = "ctl00_ContentPlaceHolder1_Circuit";
	final static String AGENDA_VERIFICATEUR_ID = "ctl00_ContentPlaceHolder1_Nbr_Verif";
	final static String APPROBATEUR_BLEU_ID = "ctl00_ContentPlaceHolder1_Circuit";
	final static String AGENDA_APPROBATEUR_ID = "ctl00_ContentPlaceHolder1_Nbr_Approb";
	final static String DIFFUSION_ID = "ctl00_ContentPlaceHolder1_Circuit";
	final static String EN_COURS_ID = "ctl00_ContentPlaceHolder1_LbAttenteDiff";
	final static String A_CONSULTER_ID = "ctl00_ContentPlaceHolder1_LinkButton5";
	final static String VISUALISER_BLEU_ID = "ctl00_ContentPlaceHolder1_VisDoccons";
	final static String JAI_CONSULTE_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_CheckBox2\"]";
	final static String ICONE_DOCUMENTS_INTERNES_ID = "ctl00_ImageButtonDoc";
	final static String CODE_DOCUMENTS_INTERNES_ID = "ctl00_ContentPlaceHolder1_Text_CDE"; //"ctl00_ContentPlaceHolder1_Text_CDE";
	final static String RECHERCHE_DOCUMENTS_INTERNES_ID = "ctl00_ContentPlaceHolder1_Filtre_Rechercher";
	final static String CHOIX_DOCUMENTS_INTERNES_XPATH = "ctl00_ContentPlaceHolder1_GridView1"; //*[@id="ctl00_ContentPlaceHolder1_GridView1_ctl02_LinkButton1"]/font
	//*[@id="ctl00_ContentPlaceHolder1_GridView1"]/tbody/tr/td[2]
	
	final static String COMMENTAIRE_ID = "ctl00_ContentPlaceHolder1_LinkButtonCommentRecep";
	final static String AJOUTER_COMMANTAIRE_ID = "ctl00_ContentPlaceHolder1_LinkButton7";
	final static String MESSAGE_SUPERVISEUR_ID = "ctl00_ContentPlaceHolder1_TextBoxMsg";
	final static String ENVOYER_SUPERVISEUR_ID = "ctl00_ContentPlaceHolder1_linkButtonEnvoiSuperviseur";
	final static String RECHERCHE_DOCUMENTS_ID = "ctl00_ContentPlaceHolder1_LinkButton11";
	final static String CODE_DOCUMENT_A_CONSULTER_ID = "ctl00_ContentPlaceHolder1_TextBox12";//ctl00_ContentPlaceHolder1_TextBox12
	final static String Taux_Cons_XPATH="//*[@id=\"gg2\"]/svg/text[2]/tspan";
	final static String Nbre_Cons_XPATH="//*[@id=\"gg1\"]/svg/text[2]/tspan";//*[@id="gg1"]/svg/text[2]
	final static String GRID_ACC_ID="ctl00_ContentPlaceHolder1_GridView3";

	final static String CORRECTION_ID = "ctl00_ContentPlaceHolder1_Correction";
	final static String MESS_ID = "ctl00_ContentPlaceHolder1_Text_Mess";

	final static String VALIDER_MESS_ID = "ctl00_ContentPlaceHolder1_Button_ValidComment";
	final static String FERMER_MESS_ID = "ctl00_ContentPlaceHolder1_LinkButton52";
	final static String SUPERVISEUR_ID = "ctl00_ContentPlaceHolder1_LinkButton14";
	final static String RATTACHER_ACTION_ID = "ctl00_ContentPlaceHolder1_LinkButton2p";
	final static String CHOISIR_ACTION = "//*[@id=\"ctl00_ContentPlaceHolder1_GridViewListAct\"]/tbody/tr[1]/td[1]/input";
	final static String VALIDER_CHOIX_ACTION = "ctl00_ContentPlaceHolder1_LinkButton67";
	final static String RATTACHER_FORMATIO_ID = "ctl00_ContentPlaceHolder1_LinkButtonRattDFrm";
	final static String CHOISIR_FORMATION = "//*[@id=\"ctl00_ContentPlaceHolder1_GridViewListDFrm\"]/tbody/tr[1]/td[1]/input";
	final static String VALIDER_CHOIX_FORMATION = "ctl00_ContentPlaceHolder1_LinkButtonValidDFrm";
	final  static  String  Redc ="ctl00_ContentPlaceHolder1_buttonSuperRedac";
	final static String EnRedc= "ctl00_ContentPlaceHolder1_buttonEnvoiRedac";
	final  static  String  visuleDoc ="ctl00_ContentPlaceHolder1_VsDoc";
	final  static  String fichierRedac ="ctl00_ContentPlaceHolder1_FichierRedac";
	final  static   String  DocPdf="maskedImage";


	@FindBy(how = How.ID, using =DocPdf)
	public static WebElement wDocPdf;
	@FindBy(how = How.ID, using = fichierRedac)
	public static WebElement wfichierRedac;


	@FindBy(how = How.ID, using = Redc)
	public static WebElement wSupRedc;
	/* @FindBy */
	@FindBy(how = How.ID, using =EnRedc)
	public static WebElement wEnRedc;

	@FindBy(how = How.ID, using = visuleDoc)
	public static WebElement wvisuleDoc;
	/* @FindBy */
	@FindBy(how = How.ID, using = VALIDER_CHOIX_FORMATION)
	public static WebElement validerChoixFormationID;
	@FindBy(how = How.XPATH, using = CHOISIR_FORMATION)
	public static WebElement choisirFormation;
	@FindBy(how = How.ID, using = RATTACHER_FORMATIO_ID)
	public static WebElement rattacherFormationID;
	@FindBy(how = How.ID, using = VALIDER_CHOIX_ACTION)
	public static WebElement validerChoixActionID;
	@FindBy(how = How.XPATH, using = CHOISIR_ACTION)
	public static WebElement choisirAction;
	@FindBy(how = How.ID, using = RATTACHER_ACTION_ID)
	public static WebElement rattacherActionID;
	@FindBy(how = How.XPATH, using = FORMATIONS_ACTIONS_XPATH)
	public static WebElement formatiosActions;
	@FindBy(how = How.ID, using = SUPERVISEUR_ID)
	public static WebElement superviseurID;
	@FindBy(how = How.ID, using = CORRECTION_ID)
	public static WebElement correctionID;
	@FindBy(how = How.ID, using = MESS_ID)
	public static WebElement messID;
	@FindBy(how = How.ID, using = VALIDER_MESS_ID)
	public static WebElement validermessID;
	@FindBy(how = How.ID, using = FERMER_MESS_ID)
	public static WebElement fermermessID;

	@FindBy(how = How.ID, using = MENU_ID)
	public static WebElement menuID;
	@FindBy(how = How.ID, using = HOME_ID)
	public static WebElement HomeID;
	@FindBy(how = How.XPATH, using = DOCUMENTATIONS_XPATH)
	public static WebElement documentationsXpath;
	@FindBy(how = How.XPATH, using = DOCUMENTATION_XPATH)
	public static WebElement documentationXpath;
	@FindBy(how = How.ID, using = REDACTEUR_SUPERVISEUR_ID)
	public static WebElement redacteurSuperviseurID;
	@FindBy(how = How.ID, using = TYPE_DOCUMENT_ID)
	public static WebElement typeDocumentID;
	@FindBy(how = How.ID, using = OBJET_ID)
	public static WebElement objetID;
	@FindBy(how = How.XPATH, using = CHOISIR_FICHIER_ID)
	public static WebElement btnChoisirFichierID;
	@FindBy(how = How.ID, using = MESSAGE_ID)
	public static WebElement messageID;
	@FindBy(how = How.ID, using = ENVOI_SUPERVISEUR_ID)
	public static WebElement envoiSuperviseurID;
	@FindBy(how = How.XPATH, using = RECH_BOITE_ENVOI_ID)
	public static WebElement RechBoiteEnvoiID;
	@FindBy(how = How.ID, using = BOITE_ENVOI_ID)
	public static WebElement boiteEnvoiID;
	@FindBy(how = How.ID, using = COMPTEUR_DOCUMENT_ID)
	public static WebElement compteurDocumentID;
	@FindBy(how = How.ID, using = AGENDA_DOCUMENT_ID)
	public static WebElement agendaDocumentID;
	@FindBy(how = How.ID, using = COMPTEUR_BOITE_DIALOGUE_ID)
	public static WebElement compteurBoiteDialogueID;
	@FindBy(how = How.XPATH, using = DOCUMENT_XPATH)
	public static WebElement documentBoiteDialogueID;
	@FindBy(how = How.ID, using = FICHIER_ID)
	public static WebElement fichierID;
	@FindBy(how = How.ID, using = CREE_DOCUMENT_ID)
	public static WebElement creeDocumentID;
	@FindBy(how = How.ID, using = SITE_ID)
	public static WebElement siteID;
	@FindBy(how = How.ID, using = PROCESSUS_ID)
	public static WebElement processusID;
	@FindBy(how = How.ID, using = MOT_CLE_ID)
	public static WebElement motCleD;
	@FindBy(how = How.ID, using = VALIDER_ID)
	public static WebElement validerID;
	@FindBy(how = How.ID, using = VALIDER_ID)
	public static WebElement validerBasID;
	@FindBy(how = How.ID, using = REDACTEUR_BAS_ID)
	public static WebElement redacteurBasD;
	@FindBy(how = How.ID, using = AGENDA_REDACTEUR_ID)
	public static WebElement agendaRedacteurID;
	@FindBy(how = How.ID, using = CODE_DOCUMENT_ID)
	public static WebElement codeDocumentID;
	@FindBy(how = How.ID, using = VISUALISER_DOCUMENT_ID)
	public static WebElement visualiserDocumentID;
	@FindBy(how = How.ID, using = VERIFICATEUR_ID)
	public static WebElement verificateurID;
	@FindBy(how = How.ID, using = AGENDA_VERIFICATEUR_ID)
	public static WebElement agendaVerificteurID;
	@FindBy(how = How.ID, using = APPROBATEUR_BLEU_ID)
	public static WebElement approbateurBleuID;
	@FindBy(how = How.ID, using = AGENDA_APPROBATEUR_ID)
	public static WebElement agendApprobateurID;
	@FindBy(how = How.ID, using = DIFFUSION_ID)
	public static WebElement diffusionID;
	@FindBy(how = How.ID, using = EN_COURS_ID)
	public static WebElement enCoursId;
	@FindBy(how = How.ID, using = A_CONSULTER_ID)
	public static WebElement aConsulterId;
	@FindBy(how = How.ID, using = VISUALISER_BLEU_ID)
	public static WebElement visualiserBleuID;
	@FindBy(how = How.XPATH, using = JAI_CONSULTE_XPATH)
	public static WebElement jaiConsulteID;
	@FindBy(how = How.ID, using = ICONE_DOCUMENTS_INTERNES_ID)
	public static WebElement iconeDocumentsInternesID;
	@FindBy(how = How.ID, using = CODE_DOCUMENTS_INTERNES_ID)
	public static WebElement codeDocumentsInternesID;
	@FindBy(how = How.ID, using = RECHERCHE_DOCUMENTS_INTERNES_ID)
	public static WebElement rechercheDocumentsInternesID;
	@FindBy(how = How.ID, using = CHOIX_DOCUMENTS_INTERNES_XPATH)
	public static WebElement choixDocumentsInternesID;
	@FindBy(how = How.ID, using = COMMENTAIRE_ID)
	public static WebElement commentaireID;
	@FindBy(how = How.ID, using = AJOUTER_COMMANTAIRE_ID)
	public static WebElement ajouiterCommentaireID;
	@FindBy(how = How.ID, using = MESSAGE_SUPERVISEUR_ID)
	public static WebElement messageSuperviseurID;
	@FindBy(how = How.ID, using = ENVOYER_SUPERVISEUR_ID)
	public static WebElement envoyerSuperviseurID;
	@FindBy(how = How.ID, using = RECHERCHE_DOCUMENTS_ID)
	public static WebElement rechercheDocumentsID;
	@FindBy(how = How.ID, using = CODE_DOCUMENT_A_CONSULTER_ID)
	public static WebElement codeDocumentsAConsulterID;
	@FindBy(how = How.ID, using = CODE_DOCUMENT_ENCOURS_ID)
	public static WebElement codeDocumentsEncoursID;
	@FindBy(how = How.XPATH, using = Taux_Cons_XPATH)
	public static WebElement TauxConsID;
	@FindBy(how = How.XPATH, using = Nbre_Cons_XPATH)
	public static WebElement NbreConsID;
	@FindBy(how = How.ID, using = GRID_ACC_ID)
	public static WebElement GridAccID;
}
