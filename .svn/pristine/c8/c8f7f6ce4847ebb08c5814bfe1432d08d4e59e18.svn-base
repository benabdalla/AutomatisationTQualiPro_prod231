package com.qualiprobdd.e2etests.PNC.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qualiprobdd.e2etests.util.AbstractPage;

public class ModulePNCPage extends AbstractPage {

	public ModulePNCPage(WebDriver driver) {

		super(driver);
	}

	/* Locators */ // optimisation de maintenance par déclaration de variable
	final static String Param_Sociaux = "ctl00_LinkButton5";
	final static String Param_PNC = "ctl00_ContentPlaceHolder1_LinkButton25";
	final static String Mono_PNC = "ctl00_ContentPlaceHolder1_RadioButtonList11_0";
	final static String Plusieurs_PNC = "ctl00_ContentPlaceHolder1_RadioButtonList11_1";
	final static String Confirmer_PNC = "ctl00_ContentPlaceHolder1_Button6";
	final static String Valider_Param = "ctl00_ContentPlaceHolder1_Label75";
	final static String Fermer_Param = "//*[@id=\"myModalParamétrage_PNC\"]/div/div/div[1]/button";

	final static String MENU_ID = "ctl00_menuModal";
	final static String Utilisateur_ID = "ctl00_nom_emp_connected";
	final static String Produits_nonconformes_XPATH = "//*[@id=\"cssmenu15\"]/div/div/ul/li[6]/a";
	final static String PNC_XPATH = "//*[@id=\"cssmenu15\"]/div/div/ul/li[6]/ul/li[1]/a";
	final static String AJOUTER_PNC_ID = "ctl00_ContentPlaceHolder1_Ajouter";

	//final static String AJOUTER_PNC_ID = "ctl00_ContentPlaceHolder1_Ajouter_Ajouter";id="ctl00_ContentPlaceHolder1_Ajouter"
	final static String Description_PNC_ID = "ctl00_ContentPlaceHolder1_NC";
	final static String ActImmediates_ID = "ctl00_ContentPlaceHolder1_TextBoxAcIm";
	final static String RefInterne_ID = "ctl00_ContentPlaceHolder1_NNCI";
	final static String Livraison_ID = "ctl00_ContentPlaceHolder1_imgLiv";
	final static String Text_Livraison_ID = "ctl00_ContentPlaceHolder1_Text_datliv";
	final static String FOURNISSEUR_RECH_ID = "ctl00_ContentPlaceHolder1_LinkButton9";
	final static String FOURNISSEUR_REF_ID = "//*[@id=\"ctl00_ContentPlaceHolder1_Panel36\"]/div[2]/div/div";
	final static String FOURNISSEUR_CHX_ID = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Frs\"]/tbody/tr/td[1]";
	final static String Choix_date_Livraison_ID = "ctl00_ContentPlaceHolder1_CalendarExtender16_today";
	final static String Detection_ID = "ctl00_ContentPlaceHolder1_img6";
	final static String Choix_date_detection_ID = "ctl00_ContentPlaceHolder1_datedet";
	final static String Detection_Personne_ID = "ctl00_ContentPlaceHolder1_Depa";
	final static String Type_NC_ID = "ctl00_ContentPlaceHolder1_Listypnc_1";
	final static String Type_NC_IDP = "ctl00_ContentPlaceHolder1_Listypnc";


	final static String Gravite_PNC_ID = "ctl00_ContentPlaceHolder1_Listgrav";
	final static String site_PNC_ID = "ctl00_ContentPlaceHolder1_Listsite";
	
	final static String processus_PNC_ID = "ctl00_ContentPlaceHolder1_lBProcessus_";
	final static String activite_PNC_ID = "ctl00_ContentPlaceHolder1_lBDomaine_";
	final static String direction_PNC_ID = "ctl00_ContentPlaceHolder1_ListBox_Direction";
	final static String numero_OF_ID = "ctl00_ContentPlaceHolder1_NOF_1";
	final static String numero_lot_ID = "ctl00_ContentPlaceHolder1_Nlo_1";
	final static String numero_OF_IDP = "ctl00_ContentPlaceHolder1_NOF";
	final static String numero_lot_IDP = "ctl00_ContentPlaceHolder1_Nlo";
	final static String choix_produit_ID = "ctl00_ContentPlaceHolder1_Button1_1";
	final static String recherche_produit_XPATH = "ctl00_ContentPlaceHolder1_TextBox28";
	final static String recherche_produitPLus = "ctl00_ContentPlaceHolder1_TextBox28";

	
	final static String tableProd="table table-striped table-bordered table-hover tab-Gv";
	final static String btn_recherche_produit_XPATH = "ctl00_ContentPlaceHolder1_LinkButton90";
	
	final static String produit_PNC_ID = "//*[@id=\"ctl00_ContentPlaceHolder1_GridPRODUIT\"]/tbody/tr[1]/td[1]";
	final static String Qt_detecte_ID = "ctl00_ContentPlaceHolder1_quandet_1";
	final static String Qt_detecte_IDP = "ctl00_ContentPlaceHolder1_quandet";
	
	
	final static String Qt_produite_ID = "ctl00_ContentPlaceHolder1_txtprod_1";
	
	
	final static String Qt_produite_IDP = "ctl00_ContentPlaceHolder1_txtprod_1";
	
	final static String unite_IDP = "ctl00_ContentPlaceHolder1_Uni";

	final static String unite_ID = "ctl00_ContentPlaceHolder1_Uni_1";
	final static String source_NC_ID = "ctl00_ContentPlaceHolder1_Listsou";
	final static String atelier_NC_ID = "ctl00_ContentPlaceHolder1_text_Atelier";
	final static String origine_NC_ID = "ctl00_ContentPlaceHolder1_orinc";
	final static String vld_enregistrement_NC_ID = "ctl00_ContentPlaceHolder1_LinkButton17";
	final static String rattacher_typesdescauses_NC_ID = "ctl00_ContentPlaceHolder1_LinkButtonRTC";
	final static String choix_typedecause_NC_ID = "ctl00_ContentPlaceHolder1_GridView9_ctl05_CheckBox1";
	final static String validation_typedecause_NC_ID = "ctl00_ContentPlaceHolder1_LinkButton_VTC";
	final static String actualisation_home_ID = "ctl00_LinkButtonHome";
	final static String compteur_PNC_ID = "ctl00_label_lb_nconf";
	final static String agenda_PNC_ID = "ctl00_lb_nconf";
	final static String PNC_VLD_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_Panel_PNCaValider\"]/div[1]/h4/a/span";

	final static String Rechecher_Num_PNC_Vld_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Valid_filter\"]/label/input";
	final static String Num_PNC_Vld_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Valid\"]/tbody/tr/td[1]";
	final static String Choix_decideur_ID = "ctl00_ContentPlaceHolder1_Depa0";
	
	final static String commentaire_ID = "ctl00_ContentPlaceHolder1_TextBox_MotifR";
	final static String bouton_refus_ID = "ctl00_ContentPlaceHolder1_LinkButton88";
	final static String bouton_correction_ID = "ctl00_ContentPlaceHolder1_LinkButton85";
	final static String bouton_valider1_ID = "ctl00_ContentPlaceHolder1_LinkButton82";
	final static String PNC_state_ID = "ctl00_ContentPlaceHolder1_listeNC";
	
	final static String PNC_CRG_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_Panel_PNCCorrect\"]/div[1]/h4/a/span";
	final static String Rechecher_Num_PNC_CRG_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Correct_filter\"]/label/input";
	final static String Num_PNC_CRG_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Correct\"]/tbody/tr/td[1]";

	final static String PNC_decision_XPATH = "ctl00_ContentPlaceHolder1_num1";
	final static String Rechercher_Num_PNC_dec_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_listeNC_filter\"]/label/input";
	final static String Num_PNC_dec_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_listeNC\"]/tbody/tr/td[1]";

	final static String CHX_INV_ID = "ctl00_ContentPlaceHolder1_CheckBoxInvestig";
	final static String VOL_DEC_ID = "sp_decision";
	final static String RESP_INV_ID = "ctl00_ContentPlaceHolder1_ListBox3";
	final static String JOINDRE_fICHIER = "ctl00_ContentPlaceHolder1_LinkButtonFichier";
	final static String DELAI_INV_ID = "ctl00_ContentPlaceHolder1_TextBox25";
	final static String APP_INV_ID = "ctl00_ContentPlaceHolder1_ListBox5";
	final static String VLD_INV_ID = "ctl00_ContentPlaceHolder1_LinkButton73";
	final static String Vol_Inv_Agd_ID = "//*[@id=\"ctl00_ContentPlaceHolder1_Panel_InvestReal\"]/div[1]/h4/a/span";
	final static String rech_num_PNC_INV_ID = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView4_filter\"]/label/input";
	final static String Num_PNC_INV_ID = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView4\"]/tbody/tr/td[1]";
	final static String Rapp_Inv_ID = "ctl00_ContentPlaceHolder1_TextBoxRappInv";
	final static String VOL_APP_INV = "//*[@id=\"ctl00_ContentPlaceHolder1_Panel_InvestApp\"]/div[1]/h4/a/span";
	final static String RECH_NUM_PNC_APP_INV = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView5_filter\"]/label/input";
	final static String NUM_PNC_APP_INV = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView5\"]/tbody/tr/td[1]";
	final static String CHX_APP_INV_PNC = "ctl00_ContentPlaceHolder1_CheckBoxApprouv";

	final static String PNC_Cause_ID = "ctl00_ContentPlaceHolder1_TextBoxCauseNC";
	final static String Ajout_resp_traitement_ID = "ctl00_ContentPlaceHolder1_LinkButtonAjoutRespT";
	final static String Nom_resp_traitement_ID = "ctl00_ContentPlaceHolder1_listBoxRespTrait";
	final static String Type_Resp_trait_ID = "ctl00_ContentPlaceHolder1_checkboxPResp";
	final static String Delais_traitement_ID = "ctl00_ContentPlaceHolder1_Img10";
	final static String Choix_delais_traitement_ID = "ctl00_ContentPlaceHolder1_CalendarExtender12_today";
	final static String Traitement_PNC_ID = "ctl00_ContentPlaceHolder1_textboxTraitement";
	final static String Validation_traitement_ID = "ctl00_ContentPlaceHolder1_LinkButton86";
	final static String Type_traitement_ID = "ctl00_ContentPlaceHolder1_Listtyptrai";
	final static String Resp_suivi_ID = "ctl00_ContentPlaceHolder1_respsuiv";
	final static String Validation_resp_suivi_ID = "ctl00_ContentPlaceHolder1_LinkButton46";
	final static String Panel_décision_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_Label_Decision_copie\"]/div[1]/h4/a/span";
	final static String Etat_PNC_ID = "ctl00_ContentPlaceHolder1_Label_Etat";
	final static String Panel_enregistrement_ID = "sp_enreg";

	final static String VOL_VAL_DEC_TRAIT = "//*[@id=\"ctl00_ContentPlaceHolder1_Panel_DecisValid\"]/div[1]/h4/a/span";
	final static String RECH_NUM_VAL_DEC_TRAIT = "ctl00_ContentPlaceHolder1_GridView3_filter";
	final static String NUM_VAL_DEC_TRAIT = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView3\"]/tbody/tr/td[1]";
	final static String VALD_DEC_TRAIT = "ctl00_ContentPlaceHolder1_LinkButton63";
	final static String REFUS_DEC_TRAIT = "ctl00_ContentPlaceHolder1_LinkButton64";
	final static String MOTIF_REFUS_DEC_TRAIT = "ctl00_ContentPlaceHolder1_TextBox11";

	final static String PNC_à_traiter_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_Panel_NconfTrait\"]/div[1]/h4/a/span";
	final static String Rechercher_Num_PNC_trait_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView1_filter\"]/label/input";
	final static String Num_PNC_traitée_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[1]";
	final static String Phase_traitée_ID = "ctl00_ContentPlaceHolder1_radioButtonListTraite_1";
	final static String PaneltraitementPNC_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_Panel5_visibilite\"]/div[1]/h4/a";
	final static String Rapporttraitement_ID = "ctl00_ContentPlaceHolder1_raptra";
	final static String Date_traitement_ID = "img9";
	final static String Choix_datetraitement_ID = "ctl00_ContentPlaceHolder1_datetrai";
	final static String Cout_de_traitement_ID = "ctl00_ContentPlaceHolder1_couttri";
	final static String Quantité_rejetée_ID = "ctl00_ContentPlaceHolder1_quanrej";
	final static String Quantité_acceptée_ID = "ctl00_ContentPlaceHolder1_TextBox_QteAcc";
	final static String Quantité_dégradée_ID = "ctl00_ContentPlaceHolder1_TextBox_QteDec";
	final static String Pourcentage_de_dépréciation_ID = "ctl00_ContentPlaceHolder1_TextBox_Depreciation";
	final static String ValeurRejetée = "ctl00_ContentPlaceHolder1_valrej";
	final static String ValeurDéclassée = "ctl00_ContentPlaceHolder1_TextBox_ValDec";
	final static String CoutTotal = "ctl00_ContentPlaceHolder1_couttrai";
	final static String validation_traitement_PNC_ID = "ctl00_ContentPlaceHolder1_LinkButton45";

	final static String PNC_à_cloturer_XPATH = "ctl00_ContentPlaceHolder1_num3";
	final static String Rechercher_Num_PNC_cloturée_XPATH = "ctl00_ContentPlaceHolder1_GridView2_filter";
	final static String Num_PNC_cloturée_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr/td[1]";
	final static String PNC_cloturée_ID = "ctl00_ContentPlaceHolder1_clout_1";
	final static String PanelcloturePNC_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_Div6\"]/h4/a";
	final static String Rapportcloture_ID = "ctl00_ContentPlaceHolder1_rapclot";
	final static String validation_cloture_ID = "ctl00_ContentPlaceHolder1_LinkButton44_suivi";

	final static String PNC_à_approuver_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_Panel_pncAppFinal\"]/div[1]/h4/a/span";
	final static String Rechercher_Num_PNC_à_approuver_XPATH = "ctl00_ContentPlaceHolder1_GridView6_filter";
	final static String Num_PNC_approuvée_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView6\"]/tbody/tr/td[1]";
	final static String PNC_approuvée_ID = "ctl00_ContentPlaceHolder1_RadioButtonList1_1";
	final static String PanelapprobationPNC_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_Div7\"]/h4/a";
	final static String Rapportapprobation_ID = "ctl00_ContentPlaceHolder1_TextBox29";
	final static String validation_approbation_ID = "ctl00_ContentPlaceHolder1_LinkButton12";

	final static String NFichePNC_ID = "ctl00_ContentPlaceHolder1_nncF";
	final static String Recherche_ModulePNC_ID = "ctl00_ContentPlaceHolder1_Filtre_Rechercher";
	final static String NumeroFichePNC_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_listeNC\"]/tbody/tr[1]/td[2]";
	final static String Aperçu_PNC_ID = "ctl00_ContentPlaceHolder1_Lifgdhfh";
	final static String ExportAperçu_PNC_ID = "IconImg_CrystalReportViewer1_toptoolbar_export";
	final static String Service_PNC_ID = "ctl00_ContentPlaceHolder1_lBService_";
	final static String Detection_Client_ID = "ctl00_ContentPlaceHolder1_RadioButtonList_Det_1";
	final static String Client_Select_ID = "ctl00_ContentPlaceHolder1_select_clt1";
	final static String Client_Rech_ID = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_clt1_filter\"]/label/input";
	final static String client_choisi_ID = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_clt1\"]/tbody/tr/td[1]";
	final static String taux_PNC_ID = "ctl00_ContentPlaceHolder1_txttaux_1";
	
	final static String taux_PNC_IDP= "ctl00_ContentPlaceHolder1_txttaux";

	
	// Amira
	public final static String btn_Produit_Bilan_PNC_id = "ctl00_Body1";
	public final static String btn_Lot_Bilan_PNC_id = "ctl00_ContentPlaceHolder1_TextBox2";
	public final static String selec_Type_NonConformité_Bilan_PNC_id = "ctl00_ContentPlaceHolder1_ListBox1";
	public final static String selec_Atelier_Bilan_PNC_id = "ctl00_ContentPlaceHolder1_list_Atelier0";
	public final static String selec_Type_traitement_Bilan_PNC_id = "ctl00_ContentPlaceHolder1_ListBox5";
	public final static String selec_Resp_traitement_Bilan_PNC_id = "ctl00_ContentPlaceHolder1_listBoxRespTrait";
	public final static String selec_Source_Bilan_PNC_id = "id=\"ctl00_ContentPlaceHolder1_ListBox4\"";
	public final static String selec_Famille_produit_Bilan_PNC_id = "ctl00_ContentPlaceHolder1_ListBox3";
	public final static String selec_Gravité_Bilan_PNC_id = "ctl00_ContentPlaceHolder1_respv";
	public final static String selec_Site_Bilan_PNC_id = "ctl00_ContentPlaceHolder1_ListBox2";
	public final static String selec_Processus_Bilan_PNC_id = "ctl00_ContentPlaceHolder1_lBProcessus_";
	public final static String selec_Activité_Bilan_PNC_id = "ctl00_ContentPlaceHolder1_lBDomaine_";
	public final static String selec_Direction_Bilan_PNC_id = "ctl00_ContentPlaceHolder1_ListBox_Direction";
	public final static String del_DateDétection1_Bilan_PNC_id = "ctl00_ContentPlaceHolder1_TextBox3";
	public final static String del_DateDétection2_Bilan_PNC_id = "ctl00_ContentPlaceHolder1_TextBox4";
	public final static String selctProdid = "ctl00_ContentPlaceHolder1_Button1";
	public final static String paramtPnc = "ctl00_ContentPlaceHolder1_LinkButton25";
	public final static String seul = "ctl00_ContentPlaceHolder1_RadioButtonList11_0";
	public final static String plus = "ctl00_ContentPlaceHolder1_RadioButtonList11_1";
	public static final String validerparam = "ctl00_ContentPlaceHolder1_Label75";
	public static final String ajoutProd = "ctl00_ContentPlaceHolder1_LinkButton54";
	public static final String validerProd ="ctl00_ContentPlaceHolder1_LinkButton75";
	public static final String ajouNC ="ctl00_ContentPlaceHolder1_LinkButton78";
	public static final String pourcentage ="ctl00_ContentPlaceHolder1_TextBox_Pourcentage";
	public static  final  String   Validetypepnc="ctl00_ContentPlaceHolder1_LinkButton80";
	public  static final String validParam="ctl00_ContentPlaceHolder1_Label75";

	public   static   final String   quntitedecteProd="ctl00_ContentPlaceHolder1_txtprod";
	public   static   final String   ISPS="ctl00_ContentPlaceHolder1_LbISPS";
	public static final String Clique="ctl00_ContentPlaceHolder1_Label62";
	public static final String validProd="ctl00_ContentPlaceHolder1_LinkButton16";
	public static final String codeProd="ctl00_ContentPlaceHolder1_CodePdt";
	public static final String NomProd="ctl00_ContentPlaceHolder1_NomProduit";
	public static final String FamProd="ctl00_ContentPlaceHolder1_ListeProduit";
public static final String   AjoutProd="ctl00_ContentPlaceHolder1_ajoutpdt"; 
public static  final  String tableProdd ="ctl00_ContentPlaceHolder1_GridView_Produits";
	
	public   static   final  String  tyeTraitPlusProduit="ctl00_ContentPlaceHolder1_GridView_TypeTrait";		
	/* @FindBy */
	@FindBy(how = How.ID, using = tyeTraitPlusProduit )
	public static WebElement wtyeTraitPlusProduit;

@FindBy(how = How.ID, using =tableProdd )
public static WebElement wtableProdd;

	@FindBy(how = How.ID, using =validProd )
	public static WebElement WvalidProd ;
	@FindBy(how = How.ID, using =AjoutProd )
	public static WebElement WAjoutProd;
	
	@FindBy(how = How.ID, using =NomProd )
	public static WebElement WnomProd ;
	
	
	@FindBy(how = How.ID, using =FamProd )
	public static WebElement WFamProd ;
	
	@FindBy(how = How.ID, using =codeProd )
	public static WebElement WcodeProd ;
	
	@FindBy(how = How.ID, using =Clique )
	public static WebElement WClique ;
	@FindBy(how = How.ID, using =Validetypepnc)
	public static WebElement WValidetypepnc ;
	
	@FindBy(how = How.ID, using =ISPS )
	public static WebElement wISPS ;
	@FindBy(how = How.ID, using =quntitedecteProd )
	public static WebElement wquntitedecteProd ;
	@FindBy(how = How.ID, using =validParam )
	public static WebElement wvalideParam ;
	@FindBy(how = How.ID, using =pourcentage )
	public static WebElement wpourcentage ;

	@FindBy(how = How.ID, using =ajouNC )
	public static WebElement wajouNC ;
	@FindBy(how = How.ID, using =validerProd)
	public static WebElement wvaliderProd; 
	
	@FindBy(how = How.ID, using = recherche_produitPLus)
	public static WebElement wrecherche_produitPLus;
	@FindBy(how = How.ID, using = validerparam)
	public static WebElement wvaliderparam;
	@FindBy(how = How.ID, using = ajoutProd)
	public static WebElement wajoutProd;

	@FindBy(how = How.ID, using = seul)
	public static WebElement wseul;
	@FindBy(how = How.ID, using = plus)
	public static WebElement wplus;
	@FindBy(how = How.ID, using = paramtPnc)
	public static WebElement wparamtPnc;

	@FindBy(how = How.ID, using = selctProdid)
	public static WebElement wselctProdid;
	@FindBy(how = How.ID, using = Param_Sociaux)
	public static WebElement ParamSociaux;

	@FindBy(how = How.ID, using = Param_PNC)
	public static WebElement ParamPNC;
	@FindBy(how = How.ID, using = Mono_PNC)
	public static WebElement MonoPnc;
	@FindBy(how = How.ID, using = Plusieurs_PNC)
	public static WebElement PlusieursPNC;
	@FindBy(how = How.ID, using = Confirmer_PNC)
	public static WebElement Confirm_Param;
	@FindBy(how = How.ID, using = Valider_Param)
	public static WebElement Vld_Param;
	@FindBy(how = How.XPATH, using = Fermer_Param)
	public static WebElement FermerParam;
	@FindBy(how = How.ID, using = taux_PNC_IDP)
	public static WebElement tauxPNCIdP;
	@FindBy(how = How.ID, using = taux_PNC_ID)
	public static WebElement tauxPNCId;

	@FindBy(how = How.ID, using = Utilisateur_ID)
	public static WebElement UtilisateurID;
	@FindBy(how = How.ID, using = Detection_Client_ID)
	public static WebElement DetectCltId;
	@FindBy(how = How.ID, using = Client_Select_ID)
	public static WebElement CltSelectId;
	@FindBy(how = How.XPATH, using = Client_Rech_ID)
	public static WebElement CltRechId;
	@FindBy(how = How.XPATH, using = client_choisi_ID)
	public static WebElement CltChxId;
	@FindBy(how = How.ID, using = FOURNISSEUR_RECH_ID)
	public static WebElement FrnRechId;
	@FindBy(how = How.XPATH, using = FOURNISSEUR_REF_ID)
	public static WebElement FrnRefId;
	@FindBy(how = How.XPATH, using = FOURNISSEUR_CHX_ID)
	public static WebElement FrnChxId;
	@FindBy(how = How.ID, using = MENU_ID)
	public static WebElement menuID;
	@FindBy(how = How.XPATH, using = Produits_nonconformes_XPATH)
	public static WebElement ProduitsnonconformesXPATH;
	@FindBy(how = How.XPATH, using = PNC_XPATH)
	public static WebElement PNCXPATH;
	@FindBy(how = How.ID, using = AJOUTER_PNC_ID)
	public static WebElement ajouterPNCID;
	@FindBy(how = How.ID, using = Type_Resp_trait_ID)
	public static WebElement TypeRespTraitId;
	@FindBy(how = How.ID, using = Description_PNC_ID)
	public static WebElement descriptionPNCID;
	@FindBy(how = How.ID, using = ActImmediates_ID)
	public static WebElement actimmediatesID;
	@FindBy(how = How.ID, using = RefInterne_ID)
	public static WebElement refinterneID;
	@FindBy(how = How.ID, using = Livraison_ID)
	public static WebElement livraisonID;
	@FindBy(how = How.ID, using = Text_Livraison_ID)
	public static WebElement TextlivraisonID;
	@FindBy(how = How.ID, using = Choix_date_Livraison_ID)
	public static WebElement choixdateLivraison_ID;
	@FindBy(how = How.ID, using = Detection_ID)
	public static WebElement detectionID;
	@FindBy(how = How.ID, using = Choix_date_detection_ID)
	public static WebElement Choixdatedetection_ID;
	@FindBy(how = How.ID, using = Detection_Personne_ID)
	public static WebElement detectionpersonID;
	@FindBy(how = How.ID, using = Type_NC_IDP)
	public static WebElement typencIDP;
	@FindBy(how = How.ID, using = Type_NC_ID)
	public static WebElement typencID;
	@FindBy(how = How.ID, using = Gravite_PNC_ID)
	public static WebElement graviteID;
	@FindBy(how = How.ID, using = site_PNC_ID)
	public static WebElement siteNC;
	@FindBy(how = How.ID, using = processus_PNC_ID)
	public static WebElement processusNC;
	@FindBy(how = How.ID, using = activite_PNC_ID)
	public static WebElement activiteNC;
	@FindBy(how = How.ID, using = direction_PNC_ID)
	public static WebElement directionNC;
	@FindBy(how = How.ID, using = Service_PNC_ID)
	public static WebElement serviceNC;
	@FindBy(how = How.ID, using = numero_OF_ID)
	public static WebElement numeroOF;
	@FindBy(how = How.ID, using = numero_lot_ID)
	public static WebElement numerolot;
	@FindBy(how = How.ID, using = numero_OF_IDP)
	public static WebElement numeroOFP;
	@FindBy(how = How.ID, using = numero_lot_IDP)
	public static WebElement numerolotP;
	@FindBy(how = How.ID, using = choix_produit_ID)
	public static WebElement choixproduit;
	@FindBy(how = How.ID, using = recherche_produit_XPATH)
	public static WebElement rechercheproduit;
	@FindBy(how = How.ID, using = btn_recherche_produit_XPATH)
	public static WebElement btnrechercheproduit;
	@FindBy(how = How.XPATH, using = produit_PNC_ID)
	public static WebElement produitPNC;
	@FindBy(how = How.ID, using = Qt_detecte_IDP)
	public static WebElement qtdetecteP;
	@FindBy(how = How.ID, using = Qt_detecte_ID)
	public static WebElement qtdetecte;
	@FindBy(how = How.ID, using = Qt_produite_IDP)
	public static WebElement qtproduiteP;
	@FindBy(how = How.ID, using = Qt_produite_ID)
	public static WebElement qtproduite;
	@FindBy(how = How.ID, using = unite_IDP)
	public static WebElement unitePNCP;
	@FindBy(how = How.ID, using = unite_ID)
	public static WebElement unitePNC;
	@FindBy(how = How.ID, using = source_NC_ID)
	public static WebElement sourcePNC;
	@FindBy(how = How.ID, using = atelier_NC_ID)
	public static WebElement atelierPNC;
	@FindBy(how = How.ID, using = origine_NC_ID)
	public static WebElement originePNC;
	@FindBy(how = How.ID, using = vld_enregistrement_NC_ID)
	public static WebElement valdenrgNC;
	@FindBy(how = How.ID, using = rattacher_typesdescauses_NC_ID)
	public static WebElement rattachertycause;
	@FindBy(how = How.ID, using = choix_typedecause_NC_ID)
	public static WebElement choixtycause;
	@FindBy(how = How.ID, using = validation_typedecause_NC_ID)
	public static WebElement vldtypecause;
	@FindBy(how = How.ID, using = actualisation_home_ID)
	public static WebElement actualisationhome;
	@FindBy(how = How.ID, using = compteur_PNC_ID)
	public static WebElement compteurPNC;

	@FindBy(how = How.ID, using = agenda_PNC_ID)
	public static WebElement agendaPNC;
	@FindBy(how = How.XPATH, using = PNC_VLD_XPATH)
	public static WebElement PNCVLD;
	@FindBy(how = How.XPATH, using = Rechecher_Num_PNC_Vld_XPATH)
	public static WebElement recherchernumPNC;
	@FindBy(how = How.XPATH, using = Num_PNC_Vld_XPATH)
	public static WebElement NumPNC_VLD;
	@FindBy(how = How.ID, using = Choix_decideur_ID)
	public static WebElement choixdecideur;
	@FindBy(how = How.ID, using = commentaire_ID)
	public static WebElement commentaireVLD;
	@FindBy(how = How.ID, using = bouton_valider1_ID)
	public static WebElement boutonvalider1;
	@FindBy(how = How.ID, using = bouton_refus_ID)
	public static WebElement boutonrefuser;
	@FindBy(how = How.ID, using = bouton_correction_ID)
	public static WebElement boutoncorrection;
	@FindBy(how = How.ID, using = PNC_state_ID)
	public static WebElement PNCStateId;

	@FindBy(how = How.XPATH, using = PNC_CRG_XPATH)
	public static WebElement PNCCRG;
	@FindBy(how = How.XPATH, using = Rechecher_Num_PNC_CRG_XPATH)
	public static WebElement recherchernumPNCCRG;
	@FindBy(how = How.XPATH, using = Num_PNC_CRG_XPATH)
	public static WebElement NumPNC_CRG;

	@FindBy(how = How.ID, using = CHX_INV_ID)
	public static WebElement ChxInvID;
	@FindBy(how = How.ID, using = VOL_DEC_ID)
	public static WebElement VolDECID;
	@FindBy(how = How.ID, using = RESP_INV_ID)
	public static WebElement RespInvId;
	@FindBy(how = How.ID, using = DELAI_INV_ID)
	public static WebElement DelaiInvId;
	@FindBy(how = How.ID, using = JOINDRE_fICHIER)
	public static WebElement JdreFichierId;
	@FindBy(how = How.ID, using = APP_INV_ID)
	public static WebElement AppInvID;
	@FindBy(how = How.ID, using = VLD_INV_ID)
	public static WebElement VldInvID;
	@FindBy(how = How.XPATH, using = Vol_Inv_Agd_ID)
	public static WebElement VolInvID;
	@FindBy(how = How.XPATH, using = rech_num_PNC_INV_ID)
	public static WebElement rechNumPNCInvID;
	@FindBy(how = How.XPATH, using = Num_PNC_INV_ID)
	public static WebElement NumPNCInvID;
	@FindBy(how = How.ID, using = Rapp_Inv_ID)
	public static WebElement RappInvID;
	@FindBy(how = How.XPATH, using = VOL_APP_INV)
	public static WebElement VolAppInv;
	@FindBy(how = How.XPATH, using = RECH_NUM_PNC_APP_INV)
	public static WebElement RechNumPNCAppInv;
	@FindBy(how = How.XPATH, using = NUM_PNC_APP_INV)
	public static WebElement NumPNCAppInv;
	@FindBy(how = How.ID, using = CHX_APP_INV_PNC)
	public static WebElement ChxAppInvPNC;

	@FindBy(how = How.ID, using = PNC_decision_XPATH)
	public static WebElement PNCdecision;
	@FindBy(how = How.XPATH, using = Rechercher_Num_PNC_dec_XPATH)
	public static WebElement recherchernumdec;
	@FindBy(how = How.XPATH, using = Num_PNC_dec_XPATH)
	public static WebElement numpncdec;
	@FindBy(how = How.ID, using = PNC_Cause_ID)
	public static WebElement pnc_cause;
	@FindBy(how = How.ID, using = Ajout_resp_traitement_ID)
	public static WebElement ajout_resp_trait;
	@FindBy(how = How.ID, using = Nom_resp_traitement_ID)
	public static WebElement nom_resptraitement;
	@FindBy(how = How.ID, using = Delais_traitement_ID)
	public static WebElement delaistraitement;
	@FindBy(how = How.ID, using = Choix_delais_traitement_ID)
	public static WebElement choix_delaistraitement;
	@FindBy(how = How.ID, using = Traitement_PNC_ID)
	public static WebElement traitementpnc;
	@FindBy(how = How.ID, using = Validation_traitement_ID)
	public static WebElement validationtraitement;
	@FindBy(how = How.ID, using = Type_traitement_ID)
	public static WebElement typetraitement;
	@FindBy(how = How.ID, using = Resp_suivi_ID)
	public static WebElement respsuivi;
	@FindBy(how = How.ID, using = Validation_resp_suivi_ID)
	public static WebElement valdrespsuivi;

	@FindBy(how = How.XPATH, using = VOL_VAL_DEC_TRAIT)
	public static WebElement volValDecTrait;
	@FindBy(how = How.ID, using = RECH_NUM_VAL_DEC_TRAIT)
	public static WebElement RechNumValDecTrait;
	@FindBy(how = How.XPATH, using = NUM_VAL_DEC_TRAIT)
	public static WebElement NumValdecTrait;
	@FindBy(how = How.ID, using = VALD_DEC_TRAIT)
	public static WebElement valdDecTrait;
	@FindBy(how = How.ID, using = REFUS_DEC_TRAIT)
	public static WebElement RefusDecTrait;

	@FindBy(how = How.ID, using = MOTIF_REFUS_DEC_TRAIT)
	public static WebElement MotifRefusDecTrait;

	@FindBy(how = How.XPATH, using = Panel_décision_XPATH)
	public static WebElement Paneldécision;
	@FindBy(how = How.ID, using = Etat_PNC_ID)
	public static WebElement EtatPNC;
	@FindBy(how = How.ID, using = Panel_enregistrement_ID)
	public static WebElement Panelenregistrement;
	@FindBy(how = How.XPATH, using = PNC_à_traiter_XPATH)
	public static WebElement PNCàtraiter;
	@FindBy(how = How.XPATH, using = Rechercher_Num_PNC_trait_XPATH)
	public static WebElement rechercherNumPNCtrait;
	@FindBy(how = How.XPATH, using = Num_PNC_traitée_XPATH)
	public static WebElement NumPNCtraitée;
	@FindBy(how = How.ID, using = Phase_traitée_ID)
	public static WebElement Phasetraitée;
	@FindBy(how = How.XPATH, using = PaneltraitementPNC_XPATH)
	public static WebElement PaneltraitementPNC;
	@FindBy(how = How.ID, using = Rapporttraitement_ID)
	public static WebElement Rapporttraitement;
	@FindBy(how = How.ID, using = Date_traitement_ID)
	public static WebElement Datetraitement;
	@FindBy(how = How.ID, using = Choix_datetraitement_ID)
	public static WebElement Choixdatetraitement;
	@FindBy(how = How.ID, using = Cout_de_traitement_ID)
	public static WebElement Coutdetraitement;
	@FindBy(how = How.ID, using = Quantité_rejetée_ID)
	public static WebElement Quantitérejetée;
	@FindBy(how = How.ID, using = Quantité_acceptée_ID)
	public static WebElement Quantitéacceptée;
	@FindBy(how = How.ID, using = Quantité_dégradée_ID)
	public static WebElement Quantitédégradée;
	@FindBy(how = How.ID, using = Pourcentage_de_dépréciation_ID)
	public static WebElement Pourcentagedépréciation;
	@FindBy(how = How.ID, using = ValeurRejetée)
	public static WebElement ValeurRejetéeId;
	@FindBy(how = How.ID, using = ValeurDéclassée)
	public static WebElement ValeurDéclasséeId;
	@FindBy(how = How.ID, using = CoutTotal)
	public static WebElement CoutTotalId;
	@FindBy(how = How.ID, using = validation_traitement_PNC_ID)
	public static WebElement validationtraitementPNC;
	@FindBy(how = How.ID, using = PNC_à_cloturer_XPATH)
	public static WebElement PNCàcloturer;
	@FindBy(how = How.ID, using = Rechercher_Num_PNC_cloturée_XPATH)
	public static WebElement Rechercher_NumPNCcloturée;
	@FindBy(how = How.XPATH, using = Num_PNC_cloturée_XPATH)
	public static WebElement Num_PNCcloturée;
	@FindBy(how = How.ID, using = PNC_cloturée_ID)
	public static WebElement PNCcloturée;
	@FindBy(how = How.XPATH, using = PanelcloturePNC_XPATH)
	public static WebElement PanelcloturePNC;
	@FindBy(how = How.ID, using = Rapportcloture_ID)
	public static WebElement Rapportcloture;
	@FindBy(how = How.ID, using = validation_cloture_ID)
	public static WebElement validationcloture;

	@FindBy(how = How.XPATH, using = PNC_à_approuver_XPATH)
	public static WebElement PNCà_approuver;
	@FindBy(how = How.ID, using = Rechercher_Num_PNC_à_approuver_XPATH)
	public static WebElement Rechercher_NumPNCà_approuver;
	@FindBy(how = How.XPATH, using = Num_PNC_approuvée_XPATH)
	public static WebElement Num_PNCapprouvée;
	@FindBy(how = How.ID, using = PNC_approuvée_ID)
	public static WebElement PNCapprouvée;
	@FindBy(how = How.XPATH, using = PanelapprobationPNC_XPATH)
	public static WebElement PanelapprobationPNC;
	@FindBy(how = How.ID, using = Rapportapprobation_ID)
	public static WebElement Rapportapprobation;
	@FindBy(how = How.ID, using = validation_approbation_ID)
	public static WebElement validationapprobation;

	@FindBy(how = How.ID, using = NFichePNC_ID)
	public static WebElement NFichePNC;
	@FindBy(how = How.ID, using = Recherche_ModulePNC_ID)
	public static WebElement rechercheModulePNC;
	@FindBy(how = How.XPATH, using = NumeroFichePNC_XPATH)
	public static WebElement numerofichePNC;
	@FindBy(how = How.ID, using = Aperçu_PNC_ID)
	public static WebElement aperçuPNC;
	@FindBy(how = How.ID, using = ExportAperçu_PNC_ID)
	public static WebElement ExportaperçuPNC;
}
