package com.qualiprobdd.e2etests.Formation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FormationPage {
	final static String HOME_ID="ctl00_LinkButtonHome";
	final static String MEN_FOR_PLAN_ID="//*[@id=\"cssmenu15\"]/div/div/ul/li[11]/ul/li[2]/ul/li[1]/a";
	final static String UTILISATEUR_ID ="ctl00_nom_emp_connected";
	final static String AJT_FOR_ID ="ctl00_ContentPlaceHolder1_Ajouter";
	
	
	final static String THEME_ID="ctl00_ContentPlaceHolder1_List_theme";
	final static String DETAILS_ID="ctl00_ContentPlaceHolder1_LinkButton_DetailF";
	final static String AJT_DETAILS_ID="ctl00_ContentPlaceHolder1_LinkButton37";
	final static String DATE_DEB_ID= "ctl00_ContentPlaceHolder1_Image9";
	final static String HEURE_DEB_ID= "ctl00_ContentPlaceHolder1_ListBox_HeureD";
	final static String DATE_DEB_SYS_ID= "ctl00_ContentPlaceHolder1_CalendarExtender10_today";
	final static String DATE_FIN_ID= "ctl00_ContentPlaceHolder1_Image10";
	final static String DATE_FIN_SYS_ID= "ctl00_ContentPlaceHolder1_CalendarExtender11_today";
	final static String HEURE_FIN_ID= "ctl00_ContentPlaceHolder1_ListBox_HeureF";
	final static String VLD_DETAILS_ID="ctl00_ContentPlaceHolder1_LinkButton39";
	final static String QTT_DETAILS_ID="ctl00_ContentPlaceHolder1_LinkButton64";
  	final static String ORGANISME_ID = "ctl00_ContentPlaceHolder1_List_Org";
    final static String TYPE_FORMATION_ID ="ctl00_ContentPlaceHolder1_List_TypeF";
	final static String TYPE_FORMATEUR_ID ="ctl00_ContentPlaceHolder1_DropDownList2";
   	final static String FORMATEUR_ID ="ctl00_ContentPlaceHolder1_txtEditResp";
   	final static String FORMATEUR2_ID ="ctl00_ContentPlaceHolder1_Text_formateur";
 	final static String OBJECTIF_ID ="ctl00_ContentPlaceHolder1_Repeater21_ctl00_Text_objof";
 	final static String AJT_OBJ_XPATH ="//*[@id=\"ctl00_ContentPlaceHolder1_Repeater21_ctl00_ibModaliteCM_Add\"]/span";
   	
   	final static String SITE_ID ="ctl00_ContentPlaceHolder1_Listsite";
   	final static String PROCESSUS_ID ="ctl00_ContentPlaceHolder1_lBProcessus_";
   	final static String ACIVITE_ID ="ctl00_ContentPlaceHolder1_lBDomaine_";
   	final static String DIRECTION_ID ="ctl00_ContentPlaceHolder1_ListBox_Direction";
   	final static String SERVICE_ID ="ctl00_ContentPlaceHolder1_lBService_";
   	
   	
	final static String COUT_ID="ctl00_ContentPlaceHolder1_Text_cout";
	final static String RESTOURNE_ID="ctl00_ContentPlaceHolder1_Text_ristourne";
	final static String LIEU_ID="ctl00_ContentPlaceHolder1_Text_lieu";
   	final static String SOCIETE_ID ="ctl00_ContentPlaceHolder1_List_Soc";
   	final static String N_INTERNE_ID ="ctl00_ContentPlaceHolder1_num";
   	
 	final static String AJT_PART_ID ="ctl00_ContentPlaceHolder1_LinkButton7";
 	final static String RECH_BTN_ID ="ctl00_ContentPlaceHolder1_LinkButton45";
   	final static String RECH_PART_XPATH ="ctl00_ContentPlaceHolder1_TextBox35";
   	final static String TABLE_PART_ID="ctl00_ContentPlaceHolder1_GridView3";
	final static String VLD_PART_ID="ctl00_ContentPlaceHolder1_LinkButton13";
   	
   	final static String AJT_GROUP_ID ="ctl00_ContentPlaceHolder1_LinkButtonGrp";
   	final static String RECH_GROUP_XPATH ="ctl00_ContentPlaceHolder1_TextBox22";
   	final static String RECH_BTN_GROUP_ID ="ctl00_ContentPlaceHolder1_LinkButton67";
   	final static String TABLE_GROUP_ID="ctl00_ContentPlaceHolder1_GridViewGrp";
	final static String VLD_GROUP_ID="ctl00_ContentPlaceHolder1_LinkButtonValider";

   	final static String VLD_FICHE_ID ="ctl00_ContentPlaceHolder1_Button6";
   	final static String RESP_ID="ctl00_ContentPlaceHolder1_CheckBox3_0";
   	final static String MULTI_RESP_ID="ctl00_ContentPlaceHolder1_CheckBox3_1";
   	final static String NOM_RESP_ID="ctl00_ContentPlaceHolder1_select_respsv";
   	final static String RECH_BTN_RESP_ID ="ctl00_ContentPlaceHolder1_LinkButton68";
   	final static String DELAI_SUIVI_ID="ctl00_ContentPlaceHolder1_Text_délaiatteinte";
   	final static String VLD_SUIVI_ID="ctl00_ContentPlaceHolder1_LinkButton405";
   	final static String RECH_RESP_SUIVI_ID="ctl00_ContentPlaceHolder1_TextBox23";
	final static String TABLE_RESp_SUIVI_ID="ctl00_ContentPlaceHolder1_GridView1yt";
	
	final static String EVAL_FOR_ID ="ctl00_ContentPlaceHolder1_DropDownListEval";
	final static String BOUTON_VL_EVAL_ID ="ctl00_ContentPlaceHolder1_Button_Valid";
	final static String DEL_EVAL_ID="ctl00_ContentPlaceHolder1_TextBox25";
	final static String AJT_EMP_EVAL_ID="ctl00_ContentPlaceHolder1_LinkButton52";
	final static String CHK_EMP_EVAL_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_GridView7_filter\"]/label/input";
	final static String TABLE_EMP_EVAL_ID="ctl00_ContentPlaceHolder1_GridView7";
	final static String VLD_EMP_EVAL_ID="ctl00_ContentPlaceHolder1_LinkButton57";
	
    final static String NUM_FORMATION_ID ="ctl00_ContentPlaceHolder1_Text_Nform";
    final static String RECH_FILTRE_ID ="ctl00_ContentPlaceHolder1_Text_Fnfp";
	final static String BTT_RECH_FILTRE_ID="ctl00_ContentPlaceHolder1_Filtre_Rechercher";
	final static String TABLE_FILTRE_ID="ctl00_ContentPlaceHolder1_GridView1p";
	
	final static String EDIT_PART_ID="ctl00_ContentPlaceHolder1_LinkButton15";
	final static String TABLE_PAR_ID="ctl00_ContentPlaceHolder1_GridView1";
	final static String VLD_EDIT_ID="ctl00_ContentPlaceHolder1_LinkButton3";
	final static String VOL_ENRGI_ID="spandetail";
	final static String VOL_REA_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Div5\"]/h4/a/span";
	final static String STAT_REA_ID="ctl00_ContentPlaceHolder1_text_etat";
	
	final static String AGD_ID="ctl00_lb_form";
	final static String VOL_EVAL_CHD_ID="Span4";
	final static String RECH_FICH_CHD_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView4_filter\"]/label/input";
	final static String POS_FICH_CHD_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView4\"]/tbody/tr/td[1]";
	final static String TABLE_EVAL_PAR_ID="ctl00_ContentPlaceHolder1_GridView7";
	final static String COMM_PAR_ID="ctl00_ContentPlaceHolder1_Tb_commentaire";
	final static String SUGG_PAR_ID="ctl00_ContentPlaceHolder1_Tb_suggestion";
	final static String VLD_EVAL_PART_ID="ctl00_ContentPlaceHolder1_LinkButton8";
	final static String JUST_REA_ID="ctl00_ContentPlaceHolder1_Text_justif";
	final static String VLD_REA_ID="ctl00_ContentPlaceHolder1_LinkButton10";
	
	final static String VOL_EVAL_FOR_ID="Span6";
	final static String RECH_FICH_FOR_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView6_filter\"]/label/input";
	final static String POS_FICH_FOR_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView6\"]/tbody/tr/td[1]";
	final static String EDIT_FICH_FOR_ID="ctl00_ContentPlaceHolder1_LinkButton59";
	final static String VOL_ENR_FOR_ID="//*[@id=\"span1\"]";
	final static String VOL_EVAL_FORMAT_ID="//*[@id=\"span3\"]";
	final static String TABLE_EVAL_FOR_ID="ctl00_ContentPlaceHolder1_GridView8";
	final static String VLD_FICH_FOR_ID="ctl00_ContentPlaceHolder1_LinkButton60";
	
	final static String VOL_EVAL_FROID_ID="Span5";
	final static String RECH_FICH_FROID_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView3_filter\"]/label/input";
	final static String POS_FICH_FROID_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView3\"]/tbody/tr/td[1]";
	final static String OBJ_FICH_FROID_ID="ctl00_ContentPlaceHolder1_Lkeditobjectif";
	final static String TABLE_FROID_ID="ctl00_ContentPlaceHolder1_GridView_Efficacite";
	final static String VLD_EDIT_FROID_ID="ctl00_ContentPlaceHolder1_LinkButton9";
	final static String VLD_EVAL_FROID_ID="ctl00_ContentPlaceHolder1_LinkButton5";
	
;

	
	 
	final static String TABLE_OBJ_FROID_ID="ctl00_ContentPlaceHolder1_GridView9";
	final static String VLD_OBJ_FROID_ID="ctl00_ContentPlaceHolder1_LinkButton61";
	final static String QTT_EVAL_FROID_ID="ctl00_ContentPlaceHolder1_LinkButton9";
	final static  String  parametrage="ctl00_LinkButton5";
	
	final static  String  parametrageFormation="ctl00_ContentPlaceHolder1_LinkButton_ParametrageFormation";
	final static  String  chaudparNote="ctl00_ContentPlaceHolder1_RBL_Eval_0";
	final static  String  chaudparNiveaux="ctl00_ContentPlaceHolder1_RBL_Eval_1";
	
	final  static   String  ajoutObjf="ctl00_ContentPlaceHolder1_Btn_addObjForm";
	final  static   String  saisirObjf="ctl00_ContentPlaceHolder1_TextBoxObj";
	final  static   String  btnObjf="ctl00_ContentPlaceHolder1_LinkButton74";
	
	final  static   String  btnValideEvaPa="ctl00_ContentPlaceHolder1_Label265";
	final  static   String  AddTopic="ctl00_ContentPlaceHolder1_Ajouter0";
	final  static   String  WriteTopic="ctl00_ContentPlaceHolder1_Text_sthem";
	
	final  static   String  ValideTopic="ctl00_ContentPlaceHolder1_LinkButton11";
	
	final  static   String  RetourTopic="ctl00_ContentPlaceHolder1_LinkButton12";
	//DEV_PAR_FATMA_CHAOUACHI

    //Type de Thème
	final static String saisir_un_Type_de_thème ="ctl00_ContentPlaceHolder1_Text_stype";
	final static String Ajouter_un_Type_de_thème ="ctl00_ContentPlaceHolder1_Ajouter_Ajouter";
	final static String Saisir_un_Type_de_thème ="ctl00_ContentPlaceHolder1_Text_stype";
	final static String cliquer_sur_valider10 = "ctl00_ContentPlaceHolder1_LinkButton11";
	final static String cliquer_sur_le_bouton_retour_Type_thème ="ctl00_ContentPlaceHolder1_LinkButton12";
	final static String remplir_le_champ ="ctl00_ContentPlaceHolder1_Text_ftype";
	final static String cliquer_sur_le_bouton_Rechercher_Type_de_Thème = "ctl00_ContentPlaceHolder1_Label49";
	final static String Tab_type_de_thème ="ctl00_ContentPlaceHolder1_GridView1";

   //Types_de_formation
	final static String ajouter_Types_de_formation ="ctl00_ContentPlaceHolder1_Ajouter_Ajouter";
	final static String saisir_un_Type_de_formation ="ctl00_ContentPlaceHolder1_Text_stype";
	final static String cliquer_sur_le_bouton_radio_Avec_évaluation_chaud ="ctl00_ContentPlaceHolder1_RadioButtonListEval_0";
	final static String cliquer_sur_valider_Types_de_formation = "ctl00_ContentPlaceHolder1_LinkButton11";
	//Société
	final static String ajouter_une_société  ="ctl00_ContentPlaceHolder1_Ajouter_Ajouter";
	final static String saisir_une_Société ="ctl00_ContentPlaceHolder1_Text_cof";
	final static String cliquer_sur_valider_Société ="ctl00_ContentPlaceHolder1_LinkButton11";
	final static String Boutton_retour_société ="ctl00_ContentPlaceHolder1_LinkButton12";
	final static String remplir_le_champ_société ="ctl00_ContentPlaceHolder1_Text_fsoc";
	final static String Rechercher_société ="ctl00_ContentPlaceHolder1_Label49";
	final static String Tab_société ="ctl00_ContentPlaceHolder1_GridView1";
	//types de critère d'évaluation
	final static String ajouter_type_de_critère_d_évaluation  ="ctl00_ContentPlaceHolder1_Ajouter";
	final static String saisir_type_de_critère_d_évaluation ="ctl00_ContentPlaceHolder1_Text_stype";
	final static String cliquer_sur_valider_type_de_critère_d_évaluation ="ctl00_ContentPlaceHolder1_LinkButton11";
	final static String Boutton_retour_type_de_critère_d_évaluation ="ctl00_ContentPlaceHolder1_LinkButton12";
	final static String remplir_le_champ_type_de_critère_d_évaluation="ctl00_ContentPlaceHolder1_Text_ftype";
	final static String Rechercher_type_de_critère_d_évaluation ="ctl00_ContentPlaceHolder1_Filtre_Rechercher";
	final static String Tab_type_de_critère_d_évaluation ="ctl00_ContentPlaceHolder1_GridView1";
	//Thème de formation
	final static String cliquer_sur_ajouter_thèmes_de_formation ="ctl00_ContentPlaceHolder1_Ajouter";
	final static String saisir_thèmes_de_formation ="ctl00_ContentPlaceHolder1_Text_sthem";
	final static String choisir_un_type_de_Thème ="ctl00_ContentPlaceHolder1_List_Typt";
	final static String cliquer_sur_valider_thèmes_de_formation ="ctl00_ContentPlaceHolder1_LinkButton11";
	final static String Boutton_retour_thèmes_de_formation ="ctl00_ContentPlaceHolder1_LinkButton12";
	final static String remplir_le_champ_thèmes_de_formation ="ctl00_ContentPlaceHolder1_Text_ftheme";
	final static String Rechercher_thèmes_de_formation ="ctl00_ContentPlaceHolder1_Label49";
	final static String Tab_thèmes_de_formation ="ctl00_ContentPlaceHolder1_GridView1";
 //organisme
	final static String cliquer_sur_ajouter_Organisme_de_Formation="ctl00_ContentPlaceHolder1_Ajouter";
	final static String saisir_Organisme_de_Formation ="ctl00_ContentPlaceHolder1_Text_cof";
	final static String cliquer_sur_valider_Organisme_de_Formation ="ctl00_ContentPlaceHolder1_LinkButton11";
	final static String Boutton_retour_Organisme_de_Formation ="ctl00_ContentPlaceHolder1_LinkButton12";
	final static String remplir_le_champ_Organisme_de_Formation ="ctl00_ContentPlaceHolder1_Text_fsoc";
	final static String Rechercher_Organisme_de_Formation ="ctl00_ContentPlaceHolder1_Label49";
	final static String Tab_Organisme_de_Formation ="ctl00_ContentPlaceHolder1_GridView1";


	

	@FindBy(how = How.ID, using =  saisir_un_Type_de_thème)
	public static WebElement wsaisir_un_Type_de_thème;
	@FindBy(how = How.ID, using =  Ajouter_un_Type_de_thème )
	public static WebElement wAjouter_un_Type_de_thème ;
	@FindBy(how = How.ID, using = cliquer_sur_valider10  )
	public static WebElement wcliquer_sur_valider10 ;

	@FindBy(how = How.ID, using = cliquer_sur_le_bouton_retour_Type_thème)
	public static WebElement wcliquer_sur_le_bouton_retour_Type_thème ;
	@FindBy(how = How.ID, using = remplir_le_champ)
	public static WebElement wremplir_le_champ ;
	@FindBy(how = How.ID, using = cliquer_sur_le_bouton_Rechercher_Type_de_Thème)
	public static WebElement wcliquer_sur_le_bouton_Rechercher_Type_de_Thème ;
	@FindBy(how = How.ID, using = Tab_type_de_thème)
	public static WebElement wTab_type_de_thème;
	

	@FindBy(how = How.ID, using =  ajouter_Types_de_formation)
	public static WebElement wajouter_Types_de_formation;
	@FindBy(how = How.ID, using = saisir_un_Type_de_formation)
	public static WebElement  wsaisir_un_Type_de_formation ;
	@FindBy(how = How.ID, using =  cliquer_sur_le_bouton_radio_Avec_évaluation_chaud)
	public static WebElement wcliquer_sur_le_bouton_radio_Avec_évaluation_chaud;
	@FindBy(how = How.ID, using = cliquer_sur_valider_Types_de_formation)
	public static WebElement wcliquer_sur_valider_Types_de_formation ;


	@FindBy(how = How.ID, using = ajouter_une_société)
	public static WebElement wajouter_une_société ;
	@FindBy(how = How.ID, using = saisir_une_Société)
	public static WebElement wsaisir_une_Société ;
	@FindBy(how = How.ID, using = cliquer_sur_valider_Société)
	public static WebElement wcliquer_sur_valider_Société ;
	@FindBy(how = How.ID, using = Boutton_retour_société)
	public static WebElement wBoutton_retour_société;
	@FindBy(how = How.ID, using =  remplir_le_champ_société)
	public static WebElement wremplir_le_champ_société ;
	@FindBy(how = How.ID, using = Rechercher_société)
	public static WebElement wRechercher_société;
	@FindBy(how = How.ID, using = Tab_société)
	public static WebElement wTab_société;

	@FindBy(how = How.ID, using = ajouter_type_de_critère_d_évaluation)
	public static WebElement wajouter_type_de_critère_d_évaluation ;
	@FindBy(how = How.ID, using = saisir_type_de_critère_d_évaluation)
	public static WebElement wsaisir_type_de_critère_d_évaluation ;
	@FindBy(how = How.ID, using = cliquer_sur_valider_type_de_critère_d_évaluation)
	public static WebElement wcliquer_sur_valider_type_de_critère_d_évaluation;
	@FindBy(how = How.ID, using =  Boutton_retour_type_de_critère_d_évaluation)
	public static WebElement wBoutton_retour_type_de_critère_d_évaluation;
	@FindBy(how = How.ID, using = remplir_le_champ_type_de_critère_d_évaluation)
	public static WebElement wremplir_le_champ_type_de_critère_d_évaluation ;
	@FindBy(how = How.ID, using =  Rechercher_type_de_critère_d_évaluation)
	public static WebElement  wRechercher_type_de_critère_d_évaluation;
	@FindBy(how = How.ID, using =  Tab_type_de_critère_d_évaluation)
	public static WebElement  wTab_type_de_critère_d_évaluation;

	@FindBy(how = How.ID, using = cliquer_sur_ajouter_thèmes_de_formation )
	public static WebElement wcliquer_sur_ajouter_thèmes_de_formation ;
	@FindBy(how = How.ID, using = saisir_thèmes_de_formation )
	public static WebElement wsaisir_thèmes_de_formation  ;
	@FindBy(how = How.ID, using = choisir_un_type_de_Thème  )
	public static WebElement wchoisir_un_type_de_Thème  ;
	@FindBy(how = How.ID, using = cliquer_sur_valider_thèmes_de_formation )
	public static WebElement wcliquer_sur_valider_thèmes_de_formation ;
	@FindBy(how = How.ID, using = Boutton_retour_thèmes_de_formation )
	public static WebElement wBoutton_retour_thèmes_de_formation ;
	@FindBy(how = How.ID, using = remplir_le_champ_thèmes_de_formation )
	public static WebElement wremplir_le_champ_thèmes_de_formation ;
	@FindBy(how = How.ID, using = Tab_thèmes_de_formation )
	public static WebElement  wTab_thèmes_de_formation;
	@FindBy(how = How.ID, using = Rechercher_thèmes_de_formation )
	public static WebElement wRechercher_thèmes_de_formation;
	
	@FindBy(how = How.ID, using = cliquer_sur_ajouter_Organisme_de_Formation )
	public static WebElement wcliquer_sur_ajouter_Organisme_de_Formation;
	@FindBy(how = How.ID, using = saisir_Organisme_de_Formation  )
	public static WebElement wsaisir_Organisme_de_Formation;
	@FindBy(how = How.ID, using = cliquer_sur_valider_Organisme_de_Formation )
	public static WebElement wcliquer_sur_valider_Organisme_de_Formation;
	@FindBy(how = How.ID, using =  Boutton_retour_Organisme_de_Formation )
	public static WebElement wBoutton_retour_Organisme_de_Formation;
	@FindBy(how = How.ID, using = remplir_le_champ_Organisme_de_Formation )
	public static WebElement wremplir_le_champ_Organisme_de_Formation;
	@FindBy(how = How.ID, using = Rechercher_Organisme_de_Formation )
	public static WebElement wRechercher_Organisme_de_Formation;
	@FindBy(how = How.ID, using = Tab_Organisme_de_Formation )
	public static WebElement wTab_Organisme_de_Formation;





	//FIN_DEV_FATMA_CHAOUACHI


	@FindBy(how = How.ID, using =  RetourTopic)
	public static WebElement wRetourTopic;
	@FindBy(how = How.ID, using =  WriteTopic)
	public static WebElement wWriteTopic;
	
	@FindBy(how = How.ID, using =  ValideTopic)
	public static WebElement wValideTopic;
	@FindBy(how = How.ID, using =  AddTopic)
	public static WebElement wAddThopic;
	
	@FindBy(how = How.ID, using = btnValideEvaPa)
	public static WebElement wbtnValideEvaPa;
	
	@FindBy(how = How.ID, using = btnObjf)
	public static WebElement wbtnObjf;
	@FindBy(how = How.ID, using = saisirObjf)
	public static WebElement wsaisirObjf;
	
	 
	

	
	@FindBy(how = How.ID, using = parametrageFormation)
	public static WebElement wparametrageFormation;
	
	@FindBy(how = How.ID, using = parametrage)
	public static WebElement wparametrage;
	
	@FindBy(how = How.ID, using = chaudparNote)
	public static WebElement wchaudparNote;
	
	@FindBy(how = How.ID, using = chaudparNiveaux)
	public static WebElement wchaudparNiveaux;
	
	@FindBy(how = How.ID, using = ajoutObjf)
	public static WebElement wajoutObjf;
	
	@FindBy(how = How.ID, using =HOME_ID)
	public static WebElement HomeID;
	@FindBy(how = How.XPATH, using =MEN_FOR_PLAN_ID)
	public static WebElement SSMForID;
	@FindBy(how = How.ID, using =UTILISATEUR_ID )
	public static WebElement UtilID;
	@FindBy(how = How.ID, using = AJT_FOR_ID )
	public static WebElement AjtForID;
	@FindBy(how = How.ID, using = THEME_ID )
	public static WebElement ThemeID;
	@FindBy(how = How.ID, using = DETAILS_ID )
	public static WebElement DetailsID;
	@FindBy(how = How.ID, using = AJT_DETAILS_ID )
	public static WebElement AjtDetailID;
	
	@FindBy(how = How.ID, using = HEURE_DEB_ID )
	public static WebElement HDebID;

	@FindBy(how = How.ID, using = HEURE_FIN_ID )
	public static WebElement HFinID;
	@FindBy(how = How.ID, using = VLD_DETAILS_ID )
	public static WebElement VldDetID;
	@FindBy(how = How.ID, using = QTT_DETAILS_ID )
	public static WebElement QttDetID;
	@FindBy(how = How.ID, using = DATE_DEB_ID)
	public static WebElement DDebID;
	@FindBy(how = How.ID, using = DATE_DEB_SYS_ID)
	public static WebElement DDebSysID;
	@FindBy(how = How.ID, using = DATE_FIN_ID)
	public static WebElement DFinID;
	@FindBy(how = How.ID, using = DATE_FIN_SYS_ID)
	public static WebElement DFinSysID;
	@FindBy(how = How.ID, using = ORGANISME_ID)
	public static WebElement OrgID;
	@FindBy(how = How.ID, using = TYPE_FORMATION_ID)
	public static WebElement TypForID;
	@FindBy(how = How.ID, using = TYPE_FORMATEUR_ID)
	public static WebElement TypFormateurID;
	@FindBy(how = How.ID, using = FORMATEUR_ID )
	public static WebElement FormateurID;
	@FindBy(how = How.ID, using = FORMATEUR2_ID )
	public static WebElement Formateur2ID;
	@FindBy(how = How.ID, using = OBJECTIF_ID)
	public static WebElement ObjID;
	@FindBy(how = How.XPATH, using = AJT_OBJ_XPATH)
	public static WebElement AjtObjID;
   	
	@FindBy(how = How.ID, using = SITE_ID)
	public static WebElement SiteID;
	@FindBy(how = How.ID, using = PROCESSUS_ID)
	public static WebElement ProcessID;
	@FindBy(how = How.ID, using = ACIVITE_ID )
	public static WebElement ActID;
	@FindBy(how = How.ID, using =  DIRECTION_ID)
	public static WebElement DirID;
	@FindBy(how = How.ID, using = SERVICE_ID)
	public static WebElement ServID;
   	
   	
	@FindBy(how = How.ID, using = COUT_ID)
	public static WebElement CoutID;
	@FindBy(how = How.ID, using = RESTOURNE_ID)
	public static WebElement RestID;
	@FindBy(how = How.ID, using = LIEU_ID)
	public static WebElement LieuID;
	@FindBy(how = How.ID, using = SOCIETE_ID)
	public static WebElement SocID;
	@FindBy(how = How.ID, using = N_INTERNE_ID)
	public static WebElement InterneID;
	
	@FindBy(how = How.ID, using =  AJT_PART_ID)
	public static WebElement AjtPartiID;
	@FindBy(how = How.ID , using = RECH_BTN_ID)
	public static WebElement rechtBtnID;
	@FindBy(how = How.ID, using =  RECH_PART_XPATH)
	public static WebElement RechPartiID;
	@FindBy(how = How.ID, using =  TABLE_PART_ID)
	public static WebElement TablePartiID;
	@FindBy(how = How.ID, using =  VLD_PART_ID)
	public static WebElement VldPartiID;
   	
	@FindBy(how = How.ID, using =  AJT_GROUP_ID)
	public static WebElement AjtGrpID;
	@FindBy(how = How.ID, using = RECH_GROUP_XPATH)
	public static WebElement RechGrpID;
	@FindBy(how = How.ID, using = RECH_BTN_GROUP_ID)
	public static WebElement RechBtnGroupID;
	@FindBy(how = How.ID, using = TABLE_GROUP_ID)
	public static WebElement TableGrpID;
	@FindBy(how = How.ID, using = VLD_GROUP_ID)
	public static WebElement VldGrpID;
	
	@FindBy(how = How.ID, using =  VLD_FICHE_ID )
	public static WebElement VldFichID;
	@FindBy(how = How.ID, using = RESP_ID)
	public static WebElement RespID;
	@FindBy(how = How.ID, using = MULTI_RESP_ID)
	public static WebElement MultirespID;
	@FindBy(how = How.ID, using = NOM_RESP_ID )
	public static WebElement NomRespSuiviID;
	@FindBy(how = How.ID, using = DELAI_SUIVI_ID )
	public static WebElement DelSuiviID;
	@FindBy(how = How.ID, using = VLD_SUIVI_ID )
	public static WebElement VldSuiviID;
	@FindBy(how = How.ID, using = RECH_RESP_SUIVI_ID )
	public static WebElement RechRespSuiviID;
	@FindBy(how= How.ID, using = RECH_BTN_RESP_ID)
	public static WebElement RechBtnRespID;
	@FindBy(how = How.ID, using = TABLE_RESp_SUIVI_ID )
	public static WebElement TableRespSuiviID;
	
	@FindBy(how = How.ID, using = EVAL_FOR_ID )
	public static WebElement EvalForID;
	@FindBy(how = How.ID, using = BOUTON_VL_EVAL_ID )
	public static WebElement ValEvalID;
	@FindBy(how = How.ID, using = DEL_EVAL_ID)
	public static WebElement DelEvalID;
	@FindBy(how = How.ID, using = AJT_EMP_EVAL_ID)
	public static WebElement AjtEmpEvalID;
	@FindBy(how = How.XPATH, using = CHK_EMP_EVAL_XPATH)
	public static WebElement ChkEmpEvalID;
	@FindBy(how = How.ID, using = VLD_EMP_EVAL_ID)
	public static WebElement VldEmpEvalID;
	@FindBy(how = How.ID, using = TABLE_EMP_EVAL_ID)
	public static WebElement TableEmpEvalID;
	
	@FindBy(how = How.ID, using = NUM_FORMATION_ID)
	public static WebElement NumFormationID;
	

	@FindBy(how = How.ID, using = RECH_FILTRE_ID  )
	public static WebElement RechFilForID;
	@FindBy(how = How.ID, using = BTT_RECH_FILTRE_ID )
	public static WebElement VldRechFilForID;
	@FindBy(how = How.ID, using = TABLE_FILTRE_ID )
	public static WebElement TableFilID;
	
	@FindBy(how = How.ID, using = EDIT_PART_ID)
	public static WebElement EditPartID;
	@FindBy(how = How.ID, using = TABLE_PAR_ID)
	public static WebElement TablePartID;
	@FindBy(how = How.ID, using = VLD_EDIT_ID)
	public static WebElement VldEditID;
	@FindBy(how = How.ID, using =VOL_ENRGI_ID)
	public static WebElement VolEnrgiID;
	@FindBy(how = How.XPATH, using = VOL_REA_XPATH)
	public static WebElement VolReaID;
	@FindBy(how = How.ID, using = STAT_REA_ID)
	public static WebElement StatReaID;
	@FindBy(how = How.ID, using = JUST_REA_ID)
	public static WebElement JustReaID;
	@FindBy(how = How.ID, using = VLD_REA_ID)
	public static WebElement VldReaID;
	
	
	@FindBy(how = How.ID, using = AGD_ID)
	public static WebElement AgdID;
	@FindBy(how = How.ID, using = VOL_EVAL_CHD_ID)
	public static WebElement VolEvalChdID;
	@FindBy(how = How.XPATH, using = RECH_FICH_CHD_ID)
	public static WebElement RechFichChdID;
	@FindBy(how = How.XPATH, using = POS_FICH_CHD_ID)
	public static WebElement PosFichChdID;
	@FindBy(how = How.ID, using = TABLE_EVAL_PAR_ID)
	public static WebElement TableEvalParID;
	@FindBy(how = How.ID, using = COMM_PAR_ID)
	public static WebElement CommParID;
	@FindBy(how = How.ID, using = SUGG_PAR_ID)
	public static WebElement SuggParID;
	@FindBy(how = How.ID, using = VLD_EVAL_PART_ID)
	public static WebElement VldEvalPartID;
	
	@FindBy(how = How.ID, using = VOL_EVAL_FOR_ID)
	public static WebElement VolEvalForID;
	@FindBy(how = How.XPATH, using = RECH_FICH_FOR_ID)
	public static WebElement RechFichForID;
	@FindBy(how = How.XPATH, using = POS_FICH_FOR_ID)
	public static WebElement PosfichForID;
	@FindBy(how = How.ID, using = EDIT_FICH_FOR_ID)
	public static WebElement EditFichForID;
	@FindBy(how = How.XPATH, using = VOL_ENR_FOR_ID)
	public static WebElement VolEnrForID;
	@FindBy(how = How.XPATH, using = VOL_EVAL_FORMAT_ID)
	public static WebElement VolEvalFormatID;
	@FindBy(how = How.ID, using = TABLE_EVAL_FOR_ID)
	public static WebElement TableEvalForID;
	@FindBy(how = How.ID, using = VLD_FICH_FOR_ID)
	public static WebElement VldVolEvalForID;
	
	@FindBy(how = How.ID, using = VOL_EVAL_FROID_ID)
	public static WebElement VolEvalFroidID;
	@FindBy(how = How.XPATH, using = RECH_FICH_FROID_ID)
	public static WebElement RechFichFroidID;
	@FindBy(how = How.XPATH, using = POS_FICH_FROID_ID)
	public static WebElement PosFichFroidID;
	@FindBy(how = How.XPATH, using = OBJ_FICH_FROID_ID)
	public static WebElement ObjFichFroidID;
	@FindBy(how = How.ID, using = TABLE_FROID_ID)
	public static WebElement TableFroidID;
	@FindBy(how = How.ID, using = VLD_EDIT_FROID_ID)
	public static WebElement ValEditFroidID;
	@FindBy(how = How.ID, using = VLD_EVAL_FROID_ID)
	public static WebElement ValEvalFroidID;
	
	@FindBy(how = How.ID, using = TABLE_OBJ_FROID_ID)
	public static WebElement TableObjFroidID;
	@FindBy(how = How.ID, using =VLD_OBJ_FROID_ID)
	public static WebElement VldObjFroidId;
	@FindBy(how = How.ID, using =QTT_EVAL_FROID_ID)
	public static WebElement QttEvalFroidId;
}
