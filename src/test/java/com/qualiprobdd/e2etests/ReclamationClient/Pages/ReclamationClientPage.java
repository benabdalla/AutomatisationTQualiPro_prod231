package com.qualiprobdd.e2etests.ReclamationClient.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ReclamationClientPage {
	
	final static String MENU_ID = "ctl00_menuModal";
   	final static String HOME_ID="ctl00_image2";
   	final static String MENU_CLIENT_XPATH ="//*[@id=\"cssmenu15\"]/div/div/ul/li[7]/a";
   	final static String SMENU_RECLAMATION_XPATH = "//*[@id=\"cssmenu15\"]/div/div/ul/li[7]/ul/li[2]/a";
	final static String SSMENU_RECLAMATION_XPATH = "//*[@id=\"cssmenu15\"]/div/div/ul/li[7]/ul/li[2]/ul/li[1]/a";
   	final static String BOUTON_AJOUT_ID = "ctl00_ContentPlaceHolder1_Ajouter";
   	final static String RECLAMATION_ID = "ctl00_ContentPlaceHolder1_tb_reclamation";
   	final static String SELECT_CLIENT_ID= "ctl00_ContentPlaceHolder1_select_clt1";
   	final static String RECH_CLIENT_XPATH= "ctl00_ContentPlaceHolder1_TextBox10";
   	final static String BTN_RECH_CLIENT_XPATH= "ctl00_ContentPlaceHolder1_LinkButton31";
   	final static String GRID_CLIENT_ID= "ctl00_ContentPlaceHolder1_GridView_clt";
   	final static String CLIENT_ID= "ctl00_ContentPlaceHolder1_txtNomClient";
   	final static String LIST_CLIENT_ID= "ctl00_ContentPlaceHolder1_tb_clt1";
   	final static String RECEPTIONNAIRE_ID="ctl00_ContentPlaceHolder1_txtEditRecep";
   	final static String NATURE_ID ="ctl00_ContentPlaceHolder1_dd_Nature";
   	final static String TYPE_ID ="ctl00_ContentPlaceHolder1_dd_typerec2";
   	final static String DATE_RECLAMATION_XPATH ="//*[@id=\"ctl00_ContentPlaceHolder1_img4\"]/span";
   	final static String DATE_LIVRAISON_XPATH ="ctl00_ContentPlaceHolder1_Text_datliv";
	final static String TODAY_DATE_ID="ctl00_ContentPlaceHolder1_CalendarExtender4_today";
	final static String CLDRIER_LIVRAISON_ID="ctl00_ContentPlaceHolder1_CalendarExtender13_today";
   	final static String NUMERO_BL_ID ="ctl00_ContentPlaceHolder1_TextBox_Facture";
   	final static String GRAVITE_ID ="ctl00_ContentPlaceHolder1_dd_grav";
   	final static String SITE_ID ="ctl00_ContentPlaceHolder1_dd_site2";
   	final static String PROCESSUS_ID ="ctl00_ContentPlaceHolder1_lBProcessus_";
   	final static String Activite_ID="ctl00_ContentPlaceHolder1_lBDomaine_";
   	final static String Direction_ID="ctl00_ContentPlaceHolder1_ListBox_Direction";
   	final static String Service_ID="ctl00_ContentPlaceHolder1_lBService_";
   	final static String RetourClient_ID="ctl00_ContentPlaceHolder1_CheckBox_RetourClient";
   	final static String State_RetourClient_ID="ctl00_ContentPlaceHolder1_Label_Attente";
   	final static String BOUTON_VL_ID ="ctl00_ContentPlaceHolder1_LinkButton99";
   	final static String NUM_RECLAMATION_ID ="ctl00_ContentPlaceHolder1_tb_numrec";
   	
   	
   	final static String RATT_PRODUI_ID="ctl00_ContentPlaceHolder1_LinkButton_selectPDT";
   	final static String RECH_PRODUI_ID="ctl00_ContentPlaceHolder1_TextBox11";
   	final static String VLD_RECH_PRODUI_ID="ctl00_ContentPlaceHolder1_LinkButton42";
   	final static String PRODUIT_AJOUTE_XPATH= "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_pdt\"]/tbody/tr[1]/td[1]";
   	final static String VALIDER_PRODUIT_ID="ctl00_ContentPlaceHolder1_LinkButton_valPDT";
   	final static String EDIT_PRODUIT_ID="ctl00_ContentPlaceHolder1_LinkButton60";
   	final static String QTE_PRODUIT_ID="ctl00_ContentPlaceHolder1_GridView_pdtrec_ctl02_TextBox12";
   	final static String UNITE_PRODUIT_ID="ctl00_ContentPlaceHolder1_GridView_pdtrec_ctl02_txtUnite";
   	final static String NLOT_PRODUIT_ID="ctl00_ContentPlaceHolder1_GridView_pdtrec_ctl02_TextBoxNLot";
   	final static String VALIDER_EDIT_ID="ctl00_ContentPlaceHolder1_LinkButton59";
   	
   	final static String RATT_TC_ID="ctl00_ContentPlaceHolder1_LinkButtonRTC";
   	final static String RECH_TC_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView771_filter\"]/label/input";
   	final static String CHX_TC_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView771\"]/tbody/tr/td[1]";
   	final static String VALIDER_TC_ID="ctl00_ContentPlaceHolder1_LinkButton_VTC";
   	
   	final static String RATT_NC_ID="ctl00_ContentPlaceHolder1_LinkButton_selectNC";
   	final static String CHX_NC_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridViewNC\"]/tbody/tr[1]/td[1]";
   	final static String VALIDER_NC_ID="ctl00_ContentPlaceHolder1_LinkButton_validNC";
   	
   	final static String NBRE_RF_ID="ctl00_ContentPlaceHolder1_num_Rec_frs";
   	final static String AJT_RF_ID="ctl00_ContentPlaceHolder1_LinkButton47";
   	final static String RATT_RF_ID="ctl00_ContentPlaceHolder1_LinkButton50";
   	final static String  CHX_RF_ID="ctl00_ContentPlaceHolder1_GridView3_ctl07_CheckBox1";
   	final static String  VLD_RF_ID="ctl00_ContentPlaceHolder1_LinkButton56";
   	final static String  QTTER_RF_ID="//*[@id=\"myModalDemandeFournisseur\"]/div/div/div[1]/button/span";
   	
    final static String  NBRE_DA_ID="ctl00_ContentPlaceHolder1_num_d_act";
    final static String  AJT_DA_ID="ctl00_ContentPlaceHolder1_LinkButton_Demandes";
    final static String  RATT_DA_ID="ctl00_ContentPlaceHolder1_LinkButton20";
    final static String  CHX_DA_xpath="//*[@id=\"ctl00_ContentPlaceHolder1_GridView770\"]/tbody/tr[1]/td[1]";
    final static String  VLD_DA_ID="ctl00_ContentPlaceHolder1_LinkButton23";
    final static String  QTTER_DA_ID="ctl00_ContentPlaceHolder1_LinkButton54";
   	
    final static String  NBRE_A_ID="ctl00_ContentPlaceHolder1_Label_nb_action";
    final static String  AJT_A_ID="ctl00_ContentPlaceHolder1_Lb_rattach_action";
    final static String  RATT_A_ID="ctl00_ContentPlaceHolder1_LinkButton2p";
    final static String  CHX_A_ID="ctl00_ContentPlaceHolder1_GridView_act_ctl02_Ch_Box_Act";
    final static String  VLD_A_ID="ctl00_ContentPlaceHolder1_LB_valider_act";
    final static String  QTTER_A_ID="ctl00_ContentPlaceHolder1_LinkButton35";
   	
    final static String  NBRE_PJ_ID="ctl00_ContentPlaceHolder1_num_pj";
    final static String  AJT_PJ_ID="ctl00_ContentPlaceHolder1_pj";
    final static String  RATT_PJ_ID="ctl00_ContentPlaceHolder1_Ajouter_pj";
    final static String  OBJET_PJ_ID="ctl00_ContentPlaceHolder1_tb_obj";
    final static String  SELECT_PJ_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Panel_ajtpj\"]/div[2]/div[2]/div/div/span/label/span[1]";
    final static String  VLD_PJ_ID="ctl00_ContentPlaceHolder1_LB_vald_ajtpiec";
    final static String  QTTER_PJ_ID="ctl00_ContentPlaceHolder1_fermer";

    final static String  AJT_PI_ID="ctl00_ContentPlaceHolder1_LinkButton_Informe";
    final static String  AJT_EMP_ID="ctl00_ContentPlaceHolder1_LinkButton11";


    final static String  CHER_PI_XPATH="ctl00_ContentPlaceHolder1_TextBox35";
    final static String  VLD_CHER_PI_XPATH="ctl00_ContentPlaceHolder1_LinkButton52";
    final static String  CHX_PI_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView8\"]/tbody/tr[1]/td[1]";
    final static String  VLD_PI_ID="ctl00_ContentPlaceHolder1_LinkButton15";
    final static String  QTTER_PI_ID="ctl00_ContentPlaceHolder1_LinkButton_Retour";
   	
    final static String  VLD_REC_ID="ctl00_ContentPlaceHolder1_LinkButton_valider";
    
    final static String AGD_REC_ID="ctl00_label_lb_rec";
    final static String MEN_AGD_XPATH="ctl00_label_lb_rec";
    
    final static String Vol_Dec_Trait="sp_DecTrait";
    
    final static String VOL_DEC_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Panel_Dec\"]/div[1]/h4/a/span";
   	final static String RECH_REC_DEC_XPATH="ctl00_ContentPlaceHolder1_GridView_dec_filter";
   	final static String TAB_DEC_REC_ID="ctl00_ContentPlaceHolder1_GridView_dec";
   	
   	final static String VOL_INV_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Panel_InvestigEffect\"]/div[1]/h4/a/span";
   	final static String RECH_INV_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridViewInvestigAReal_filter\"]/label/input";
   	final static String CHX_INV_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridViewInvestigAReal\"]/tbody/tr/td[1]";
   	
   	final static String VOL_APP_INV_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Panel_InvestigAppr\"]/div[1]/h4/a/span";
   	final static String RECH_APP_INV_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_GridViewInvestigApprov_filter\"]/label/input";
   	final static String CHX_APP_INV_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_GridViewInvestigApprov\"]/tbody/tr/td[1]";
   	
   	final static String Necessite_INV_ID="ctl00_ContentPlaceHolder1_CheckBoxInvestig";
   	final static String VOL_INV_ID="sp_Invest";
   	final static String RESP_INV_ID="ctl00_ContentPlaceHolder1_ListBox3";
   	final static String Date_INV_ID="ctl00_ContentPlaceHolder1_TextBox27";
   	final static String INV_ID="ctl00_ContentPlaceHolder1_TextBoxInv";
   	final static String RAPP_INV_ID="ctl00_ContentPlaceHolder1_TextBoxRappInv";
   	final static String RATT_DOC_INV_ID="ctl00_ContentPlaceHolder1_FileUpload1";
   	final static String APP_INV_ID="ctl00_ContentPlaceHolder1_ListBox5";
   	final static String DATE_APP_INV_ID="ctl00_ContentPlaceHolder1_TextBox28";
   	final static String INV_APPROUVE_ID="ctl00_ContentPlaceHolder1_CheckBoxApprouv";
   	final static String VALD_INV_ID="ctl00_ContentPlaceHolder1_LinkButton73";
   	
   	final static String RATT_8D_ID="ctl00_ContentPlaceHolder1_LinkButton3";
    final static String CHX_8D_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView5\"]/tbody/tr[1]/td[1]";
   	final static String VLD_8D_ID="ctl00_ContentPlaceHolder1_LinkButton7";
   	final static String COUT_PNC_ID="ctl00_ContentPlaceHolder1_TextBox_CNQ";
   	final static String COUT_TOTAL_ID="ctl00_ContentPlaceHolder1_TextBox_CoutT";
   	final static String AvecFeddback_ID="ctl00_ContentPlaceHolder1_RadioButtonList_Feedback_0";
   	final static String RFeddback="ctl00_ContentPlaceHolder1_TextBox_RFeedback";
   	
   	
   	
   	final static String VOL_ENR_REC_ID="sp_enreg";
	final static String VOL_DEC_REC_ID="sp_Dec";
	final static String TYPE_DEC_ID="ctl00_ContentPlaceHolder1_DropDownList_TypeDec";
	final static String RES_TRAIT_ID="ctl00_ContentPlaceHolder1_txtEditTrait";
	final static String TRAIT_REC_ID="ctl00_ContentPlaceHolder1_tb_trait";
	final static String RESP_CLOT_ID="ctl00_ContentPlaceHolder1_txtEditClot";
	//ctl00$ContentPlaceHolder1$txtEditClot
	final static String CLD_CLOT_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_img5\"]/span";
	final static String DATE_CLOT_ID="ctl00_ContentPlaceHolder1_CalendarExtender5_today";
	final static String VALD_DEC_ID="ctl00_ContentPlaceHolder1_LinkButton44_44";

	
	final static String REC_STATE_ID="ctl00_ContentPlaceHolder1_Label_Etat";
	final static String VOL_REC_A_TRAI_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Panel_Trait\"]/div[1]/h4/a/span";
	
	final static String VOL_TRAIT_REC_ID="sp_Trait";
	final static String TABLE_TRAIT_ID="ctl00_ContentPlaceHolder1_GridView_trait";

	final static String REC_DEC_TRAI_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_GridView_trait_filter\"]/label/input";
	
	
	final static String COUT_TRAIT_ID="ctl00_ContentPlaceHolder1_Text_cout_p";
	final static String RAPP_TRAIT_ID="ctl00_ContentPlaceHolder1_tb_raptrait";
	final static String FRAIS_TRAIT_ID="ctl00_ContentPlaceHolder1_TextBox_frais";
	final static String REC_TRAIT_ID="ctl00_ContentPlaceHolder1_CB_rec_trait";
	final static String VLD_TRAIT_ID="ctl00_ContentPlaceHolder1_LinkButton45";
	
	final static String VOL_CLOT_REC_ID="sp_Clot";
	final static String REC_CLOT_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Panel_Suiv\"]/div[1]/h4/a/span";
	final static String TABLE_SUIVI_ID="ctl00_ContentPlaceHolder1_GridView_suiv";
	final static String RAPP_SUIVI_ID="ctl00_ContentPlaceHolder1_tb_rapclot";
	final static String REC_SUIVI_ID="ctl00_ContentPlaceHolder1_CB_recclot";
	final static String VLD_SUIVI_ID="ctl00_ContentPlaceHolder1_LinkButton46";
	final static String RECH_SUIVI_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_GridView_suiv_filter\"]/label/input";
	final static String REC_APP_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Panel_Appr\"]/div[1]/h4/a/span";
	final static String RECH_APP_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_GridViewApprobFinal_filter\"]/label/input";
	
	final static String TABLE_APP_ID="ctl00_ContentPlaceHolder1_GridViewApprobFinal";
	final static String REC_APP_ID="ctl00_ContentPlaceHolder1_RadioButtonList1_1";
	final static String VLD_APP_ID="ctl00_ContentPlaceHolder1_LinkButtonValiderApprob";
	final static String COMM_APP_ID="ctl00_ContentPlaceHolder1_TextBox30";
	final static String VOL_APP_REC_ID="sp_Appr";
	
	final static String RECH_FILTRE_NUM_ID="ctl00_ContentPlaceHolder1_tb_nrecf";
	final static String RECH_FILTRE_ID="ctl00_ContentPlaceHolder1_Rechercher";
	final static String RECH_TABLE_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[2]";
	final static String APERCU_ID="ctl00_ContentPlaceHolder1_LinkButton_aperçu";
	final static String EXPORTER_ID="IconImg_CrystalReportViewer1_toptoolbar_export";
	final static String FORMAT_EXP_ID="IconImg_Txt_iconMenu_icon_bobjid_1537189061248_dialog_combo";
	final static String VLD_EXP_ID="theBttnCenterImgbobjid_1537189061248_dialog_submitBtn";
	final  static  String  resposuiv="ctl00_ContentPlaceHolder1_tb_respsuiv";
	final  static  String  respoTrait="ctl00_ContentPlaceHolder1_tb_resptrait";
	final  static  String  element="ctl00_ContentPlaceHolder1_num";

	
	final  static   String  parameterjf="ctl00_ContentPlaceHolder1_LinkButton_Parametragejoursferies";
	
	final  static  String tableJF="ctl00_ContentPlaceHolder1_ChekBoxlistjrfr";
	final static  String   dateRec="ctl00_ContentPlaceHolder1_tb_daterec";
	final  static   String   dateRecTrait="ctl00_ContentPlaceHolder1_tb_delaitrait";
	
	final static  String  parametrage="ctl00_LinkButton5";
	
	@FindBy(how = How.ID, using = parametrage)
	public static WebElement wparametrage;
	

	
   	/* @FindBy */
	@FindBy(how=How.ID ,using =element)
	public  static WebElement  welement;

	@FindBy(how=How.ID ,using =respoTrait)
	public  static WebElement  wrespoTrait;
	@FindBy(how=How.ID ,using =resposuiv)
	public  static WebElement  wresposuiv;
	@FindBy(how=How.ID ,using =dateRecTrait)
	public  static WebElement  wdatRecTrait;
	@FindBy(how = How.ID, using = tableJF)
	public static WebElement  wtableJF;
	
	@FindBy(how = How.ID, using = dateRec)
	public static WebElement  wdateRec;
	
	@FindBy(how = How.ID, using = parameterjf)
	public static WebElement  wparameterjf;

	
  
	
	
	@FindBy(how = How.ID, using = COUT_TRAIT_ID)
	public static WebElement CoutTraiID;
	
	@FindBy(how = How.ID, using = EXPORTER_ID)
	public static WebElement ExporterID;
	
	@FindBy(how = How.ID, using = FORMAT_EXP_ID)
	public static WebElement FormatExpID;
	
	@FindBy(how = How.ID, using = VLD_EXP_ID)
	public static WebElement VldExportID;
	
	@FindBy(how = How.ID, using = Vol_Dec_Trait)
	public static WebElement VolDecTrait;
	
	@FindBy(how = How.ID, using = VOL_CLOT_REC_ID)
	public static WebElement VolClotRecID;
	@FindBy(how = How.ID, using = RAPP_TRAIT_ID)
	public static WebElement RappTraiID;
	@FindBy(how = How.ID, using = RAPP_SUIVI_ID)
	public static WebElement RappSuiviID;
	@FindBy(how = How.ID, using = FRAIS_TRAIT_ID)
	public static WebElement FraisTraiID;
	@FindBy(how = How.ID, using = REC_TRAIT_ID)
	public static WebElement RecTraiID;
	@FindBy(how = How.ID, using = VLD_TRAIT_ID)
	public static WebElement VldTraiID;
	@FindBy(how = How.ID, using = APERCU_ID)
	public static WebElement ApercuID;
	
	@FindBy(how = How.XPATH, using = VOL_INV_XPATH)
	public static WebElement VOLInvID;
	@FindBy(how = How.XPATH, using = RECH_INV_ID)
	public static WebElement RECHInvID;
	@FindBy(how = How.XPATH, using = CHX_INV_ID)
	public static WebElement CHXInvID;
	@FindBy(how = How.XPATH, using = VOL_APP_INV_XPATH)
	public static WebElement VOLAppInvID;
	@FindBy(how = How.XPATH, using = RECH_APP_INV_XPATH)
	public static WebElement RECHAppInvID;
	@FindBy(how = How.XPATH, using = CHX_APP_INV_XPATH)
	public static WebElement CHXAppInvID;
	@FindBy(how = How.ID, using = Necessite_INV_ID)
	public static WebElement NeccInvID;
	@FindBy(how = How.ID, using = VOL_INV_ID)
	public static WebElement VolInvID;
	@FindBy(how = How.ID, using = RESP_INV_ID)
	public static WebElement RespInvID;
	@FindBy(how = How.ID, using = Date_INV_ID)
	public static WebElement DateInvID;
	@FindBy(how = How.ID, using = INV_ID)
	public static WebElement InvID;
	@FindBy(how = How.ID, using = RAPP_INV_ID)
	public static WebElement RappInvID;
	@FindBy(how = How.ID, using = RATT_DOC_INV_ID)
	public static WebElement RattDocInvID;
	@FindBy(how = How.ID, using = APP_INV_ID)
	public static WebElement AppInvID;
	@FindBy(how = How.ID, using =  DATE_APP_INV_ID)
	public static WebElement DateAppInvID;
	@FindBy(how = How.ID, using =  INV_APPROUVE_ID)
	public static WebElement InvAppID;
	@FindBy(how = How.ID, using =  VALD_INV_ID)
	public static WebElement ValdInvID;
	
	@FindBy(how = How.ID, using = RATT_8D_ID)
	public static WebElement Ratt8dID;
	
	@FindBy(how = How.XPATH, using = CHX_8D_ID)
	public static WebElement Chx8dID;
	
	@FindBy(how = How.ID, using = VLD_8D_ID)
	public static WebElement Vld8dID;
	
	@FindBy(how = How.ID, using = COUT_PNC_ID)
	public static WebElement CoutPncID;
	
	@FindBy(how = How.ID, using = COUT_TOTAL_ID)
	public static WebElement CoutTotalID;
	
	@FindBy(how = How.ID, using = AvecFeddback_ID)
	public static WebElement AvecFeedbackID;
	
	@FindBy(how = How.ID, using = RFeddback)
	public static WebElement RFeedbackID;
	
	
	@FindBy(how = How.XPATH, using = RECH_TABLE_ID)
	public static WebElement RechTableID;
	
	@FindBy(how = How.ID, using = RECH_FILTRE_NUM_ID)
	public static WebElement NumRechID;
	
	@FindBy(how = How.ID, using = RECH_FILTRE_ID)
	public static WebElement BRechID;
	
	@FindBy(how = How.ID, using = COMM_APP_ID)
	public static WebElement CommAppID;
	
	@FindBy(how = How.ID, using = REC_APP_ID)
	public static WebElement RecApproID;
	@FindBy(how = How.ID, using = VLD_APP_ID)
	public static WebElement VldAppID;
	
	@FindBy(how = How.ID, using = REC_SUIVI_ID)
	public static WebElement RecSuiviID;
	@FindBy(how = How.ID, using = VLD_SUIVI_ID)
	public static WebElement VldSuiviID;
	
	@FindBy(how = How.ID, using = TABLE_TRAIT_ID)
	public static WebElement TableTraiID;
	
	@FindBy(how = How.ID, using = TABLE_SUIVI_ID)
	public static WebElement TableSuiviID;
	
	@FindBy(how = How.ID, using = TABLE_APP_ID)
	public static WebElement TableAppID;
	
	@FindBy(how = How.XPATH, using = REC_CLOT_XPATH)
	public static WebElement RecClotID;
	
	@FindBy(how = How.XPATH, using = RECH_APP_XPATH)
	public static WebElement RechAppID;
	
	@FindBy(how = How.XPATH, using = RECH_SUIVI_XPATH)
	public static WebElement RechSuiviID;
	
	@FindBy(how = How.XPATH, using = VOL_REC_A_TRAI_XPATH)
	public static WebElement RecATraitID;
	
	@FindBy(how = How.XPATH, using = REC_DEC_TRAI_XPATH)
	public static WebElement RechTraitID;
	
	@FindBy(how = How.XPATH, using = REC_APP_XPATH)
	public static WebElement RecAppID;
	@FindBy(how = How.ID, using = VOL_TRAIT_REC_ID)
	public static WebElement VolTraiID;
	
	@FindBy(how = How.ID, using = VOL_ENR_REC_ID)
		public static WebElement VolEnrID;
	
	@FindBy(how = How.ID, using = VOL_APP_REC_ID)
	public static WebElement VolAppID;
	   
	@FindBy(how = How.ID, using = REC_STATE_ID)
		public static WebElement RecStateID;
	   
	@FindBy(how = How.ID, using = VOL_DEC_REC_ID)
	 		public static WebElement VolDeciID;
   	
    @FindBy(how = How.ID, using = MENU_ID)
	public static WebElement menuID;
    
    @FindBy(how = How.ID, using = AGD_REC_ID)
	public static WebElement AgdID;
    
	@FindBy(how = How.XPATH, using = VOL_DEC_XPATH)
	public static WebElement VolDecID;
	
	@FindBy(how = How.ID, using =MEN_AGD_XPATH)
	public static WebElement MagdID;
	
	@FindBy(how = How.ID, using =RECH_REC_DEC_XPATH)
	public static WebElement RechDecRecID;
	
	@FindBy(how = How.ID, using = TAB_DEC_REC_ID)
	public static WebElement TabDecRecID;
	
	@FindBy(how = How.ID, using = HOME_ID)
	public static WebElement HomeID;
	
	@FindBy(how = How.XPATH, using =MENU_CLIENT_XPATH  )
	public static WebElement MenuClientId ;
	
	/* @FindBy */
	@FindBy(how = How.XPATH, using = SMENU_RECLAMATION_XPATH)
	public static WebElement SMenuRecId;
	
   	/* @FindBy */
	@FindBy(how = How.XPATH, using = SSMENU_RECLAMATION_XPATH)
	public static WebElement SSMenuRecId;
	
   	/* @FindBy */
	@FindBy(how = How.ID, using = BOUTON_AJOUT_ID)
	public static WebElement BoutonAjoutId ;
	
   	/* @FindBy */
	@FindBy(how = How.ID, using = RECLAMATION_ID)
	public static WebElement ReclamationId;
	
   	/* @FindBy */
	@FindBy(how = How.ID, using = CLIENT_ID)
	public static WebElement ClientId;
	
	/* @FindBy */
	@FindBy(how = How.ID, using = LIST_CLIENT_ID)
	public static WebElement ListClientId;
	
   	/* @FindBy */
	@FindBy(how = How.ID, using = SELECT_CLIENT_ID)
	public static WebElement SelectClientId;
	
   	/* @FindBy */
	@FindBy(how = How.ID, using = RECH_CLIENT_XPATH)
	public static WebElement RechClientId;
 	/* @FindBy */
	@FindBy(how = How.ID, using = BTN_RECH_CLIENT_XPATH)
	public static WebElement BtnRechClientId;
   	/* @FindBy */
	@FindBy(how = How.ID, using = GRID_CLIENT_ID)
	public static WebElement GridClientId;
	
   	/* @FindBy */
	@FindBy(how = How.ID, using = RECEPTIONNAIRE_ID )
	public static WebElement ReceptionnaireId;
	
   	/* @FindBy */
	@FindBy(how = How.ID, using = NATURE_ID)
	public static WebElement Nature_Id;
	
   	/* @FindBy */
	@FindBy(how = How.ID, using = TYPE_ID)
	public static WebElement Type_Id;
	
   	/* @FindBy */
	@FindBy(how = How.XPATH, using = DATE_RECLAMATION_XPATH)
	public static WebElement DateReclamationId ;
	
   	/* @FindBy */
	@FindBy(how = How.ID, using = DATE_LIVRAISON_XPATH)
	public static WebElement DateLivraisonId;
	
	/* @FindBy */
	@FindBy(how = How.ID, using = TODAY_DATE_ID)
	public static WebElement TodayDateId;
	
	/* @FindBy */
	@FindBy(how = How.ID, using = CLDRIER_LIVRAISON_ID)
	public static WebElement CldrLivId;
	
   	/* @FindBy */
	@FindBy(how = How.ID, using = NUMERO_BL_ID)
	public static WebElement NumeroBlId;
	
   	/* @FindBy */
	@FindBy(how = How.ID, using = GRAVITE_ID)
	public static WebElement GraviteId;
	
	/* @FindBy */
	@FindBy(how = How.ID, using = SITE_ID)
	public static WebElement SiteId;
	
	/* @FindBy */
	@FindBy(how = How.ID, using = PROCESSUS_ID)
	public static WebElement ProcessusId;
	@FindBy(how = How.ID, using = Activite_ID)
	public static WebElement ActiviteId;
	@FindBy(how = How.ID, using = Direction_ID)
	public static WebElement DirectionId;
	@FindBy(how = How.ID, using = Service_ID)
	public static WebElement SreviceId;
	@FindBy(how = How.ID, using = RetourClient_ID)
	public static WebElement RetourClientId;
	@FindBy(how = How.ID, using = State_RetourClient_ID)
	public static WebElement StateRetourClientId;
	
   	/* @FindBy */
	@FindBy(how = How.ID, using = BOUTON_VL_ID)
	public static WebElement BoutonVlId;
	
  	/* @FindBy */
	@FindBy(how = How.ID, using = NUM_RECLAMATION_ID)
	public static WebElement NumReclamationId;

	/* @FindBy */
	@FindBy(how = How.ID, using = RATT_PRODUI_ID)
	public static WebElement RattProduitnId;
	/* @FindBy */
	@FindBy(how = How.ID, using = RECH_PRODUI_ID)
	public static WebElement RechProduitnId;
	/* @FindBy */
	@FindBy(how = How.ID, using = VLD_RECH_PRODUI_ID)
	public static WebElement VldRechProduitnId;
	/* @FindBy */
	@FindBy(how = How.XPATH, using = PRODUIT_AJOUTE_XPATH)
	public static WebElement ProduitAjouteId;
	/* @FindBy */
	@FindBy(how = How.ID, using = VALIDER_PRODUIT_ID)
	public static WebElement ValiderProduitId;

	/* @FindBy */
	@FindBy(how = How.ID, using = EDIT_PRODUIT_ID)
	public static WebElement EditProduitId;
	
	/* @FindBy */
	@FindBy(how = How.ID, using = QTE_PRODUIT_ID)
	public static WebElement QteProduitId;
	/* @FindBy */
	@FindBy(how = How.ID, using = UNITE_PRODUIT_ID)
	public static WebElement UniteProduitId;
	
	/* @FindBy */
	@FindBy(how = How.ID, using = NLOT_PRODUIT_ID)
	public static WebElement NlotProduitId;
	
	/* @FindBy */
	@FindBy(how = How.ID, using = VALIDER_EDIT_ID)
	public static WebElement ValiderEditId;
   	
	/* @FindBy */
	@FindBy(how = How.ID, using = RATT_TC_ID)
	public static WebElement RattTcId;
	
	/* @FindBy */
	@FindBy(how = How.XPATH, using = RECH_TC_ID)
	public static WebElement RechTcId;
	
	/* @FindBy */
	@FindBy(how = How.XPATH, using = CHX_TC_ID)
	public static WebElement ChxTcId;
	
	/* @FindBy */
	@FindBy(how = How.ID, using = VALIDER_TC_ID)
	public static WebElement ValiderTcId;
	
	/* @FindBy */
	@FindBy(how = How.ID, using =  RATT_NC_ID)
	public static WebElement RattNcId;
	
	/* @FindBy */
	@FindBy(how = How.XPATH, using =  CHX_NC_ID)
	public static WebElement ChxNcId;
	
	/* @FindBy */
	@FindBy(how = How.ID, using = VALIDER_NC_ID)
	public static WebElement ValiderNcId;
   	
	/* @FindBy */
	@FindBy(how = How.ID, using = NBRE_RF_ID)
	public static WebElement NbreRFId;
	/* @FindBy */
	@FindBy(how = How.ID, using = AJT_RF_ID)
	public static WebElement AjtRfId;
	/* @FindBy */
	@FindBy(how = How.ID, using = RATT_RF_ID)
	public static WebElement RattRfId;
	/* @FindBy */
	@FindBy(how = How.ID, using = CHX_RF_ID)
	public static WebElement ChxRfId;
	/* @FindBy */
	@FindBy(how = How.ID, using = VLD_RF_ID)
	public static WebElement VldRfId;
	/* @FindBy */
	@FindBy(how = How.XPATH, using = QTTER_RF_ID)
	public static WebElement QttRfId;
   	
	/* @FindBy */
	@FindBy(how = How.ID, using = NBRE_DA_ID)
	public static WebElement NbreDaId;
	/* @FindBy */
	@FindBy(how = How.ID, using = AJT_DA_ID)
	public static WebElement AjtDaId;
	/* @FindBy */
	@FindBy(how = How.ID, using =  RATT_DA_ID)
	public static WebElement RattDaId;
	/* @FindBy */
	@FindBy(how = How.XPATH, using = CHX_DA_xpath)
	public static WebElement ChxDaId;
	/* @FindBy */
	@FindBy(how = How.ID, using = VLD_DA_ID)
	public static WebElement VldDaId;
	/* @FindBy */
	@FindBy(how = How.ID, using =  QTTER_DA_ID)
	public static WebElement QttDaId;
   	
	/* @FindBy */
	@FindBy(how = How.ID, using = NBRE_A_ID)
	public static WebElement NbreAId;
	/* @FindBy */
	@FindBy(how = How.ID, using =  AJT_A_ID)
	public static WebElement AjtAId;
	/* @FindBy */
	@FindBy(how = How.ID, using = RATT_A_ID)
	public static WebElement RattAId;
	/* @FindBy */
	@FindBy(how = How.ID, using = CHX_A_ID)
	public static WebElement ChxAId;
	/* @FindBy */
	@FindBy(how = How.ID, using = VLD_A_ID)
	public static WebElement VldAId;
	/* @FindBy */
	@FindBy(how = How.ID, using =  QTTER_A_ID)
	public static WebElement QttAId;
   	
	/* @FindBy */
	@FindBy(how = How.ID, using =  NBRE_PJ_ID)
	public static WebElement NbrePjId;
	/* @FindBy */
	@FindBy(how = How.ID, using = AJT_PJ_ID)
	public static WebElement AjtPjId;
	/* @FindBy */
	@FindBy(how = How.ID, using = RATT_PJ_ID)
	public static WebElement RattPjId;
	/* @FindBy */
	@FindBy(how = How.ID, using = OBJET_PJ_ID)
	public static WebElement ObjetPjId;
	/* @FindBy */
	@FindBy(how = How.XPATH, using = SELECT_PJ_XPATH)
	public static WebElement SelectPjId;
	/* @FindBy */
	@FindBy(how = How.ID, using = VLD_PJ_ID)
	public static WebElement VldPjId;
	/* @FindBy */
	@FindBy(how = How.ID, using = QTTER_PJ_ID)
	public static WebElement QttPjId;
   	
	/* @FindBy */
	@FindBy(how = How.ID, using = AJT_PI_ID)
	public static WebElement AjtPiId;
	/* @FindBy */
	@FindBy(how = How.ID, using = AJT_EMP_ID)
	public static WebElement AjtEmpId;
	/* @FindBy */
	@FindBy(how = How.ID, using =  CHER_PI_XPATH)
	public static WebElement CherPiId;
	/* @FindBy */
	@FindBy(how = How.ID, using =  VLD_CHER_PI_XPATH)
	public static WebElement VldCherPiId;
	/* @FindBy */
	@FindBy(how = How.XPATH, using = CHX_PI_ID)
	public static WebElement ChxPiId;
	/* @FindBy */
	@FindBy(how = How.ID, using =  VLD_PI_ID)
	public static WebElement VldPiId;
	/* @FindBy */
	@FindBy(how = How.ID, using =  QTTER_PI_ID)
	public static WebElement QttPiId;
   	
    /* @FindBy */
	@FindBy(how = How.ID, using =  VLD_REC_ID)
	public static WebElement VldRecId;
	
 	
    /* @FindBy */
	@FindBy(how = How.ID, using = VOL_ENR_REC_ID)
	public static WebElement VolEnrRecId;
    /* @FindBy */
	@FindBy(how = How.ID, using = VOL_DEC_REC_ID)
	public static WebElement VolDecRecId;
    /* @FindBy */
	@FindBy(how = How.ID, using =TYPE_DEC_ID)
	public static WebElement TypDecId;
    /* @FindBy */
	@FindBy(how = How.ID, using =RES_TRAIT_ID)
	public static WebElement ResTraitId;
 	
    /* @FindBy */
	@FindBy(how = How.ID, using = TRAIT_REC_ID)
	public static WebElement TraitRecId;
 	
    /* @FindBy */
	@FindBy(how = How.ID, using =RESP_CLOT_ID)
	public static WebElement RespClotId;
 	
    /* @FindBy */
	@FindBy(how = How.XPATH, using = CLD_CLOT_XPATH)
	public static WebElement CldClotId;
 	
    /* @FindBy */
	@FindBy(how = How.ID, using = DATE_CLOT_ID)
	public static WebElement DateClotId;
 	
    /* @FindBy */
	@FindBy(how = How.ID, using = VALD_DEC_ID)
	public static WebElement VldDecId;
	
   	

}
