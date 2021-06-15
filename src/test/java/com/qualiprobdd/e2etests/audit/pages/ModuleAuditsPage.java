package com.qualiprobdd.e2etests.audit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qualiprobdd.e2etests.util.AbstractPage;

public class ModuleAuditsPage extends AbstractPage {

    public ModuleAuditsPage(WebDriver driver) {

        super(driver);
    }

    /* Locators */ // optimisation de maintenance par déclaration de variable
    final static String MENU_ID = "ctl00_menuModal";
    final static String COMPTE_ID = "ctl00_Imageus";
    final static String DECONN_ID = "ctl00_Lbldec";
    final static String AUDITS_XPATH = "//*[@id=\"cssmenu15\"]/div/div/ul/li[3]/a";
    final static String MODULE_AUDITS_XPATH = "//*[@id=\"cssmenu15\"]/div/div/ul/li[3]/ul/li[1]/a";
    final static String PLANIFICATION_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_panelEnregHeading\"]/h4/a/span";
    final static String BOUTTON_AJOUTER_ID = "ctl00_ContentPlaceHolder1_ajouter";
    final static String REF_INTERNE_AUDIT_ID = "ctl00_ContentPlaceHolder1_TextBox_Interne";
    final static String CALENDRIER_D_ID = "ctl00_ContentPlaceHolder1_Img28";
    final static String CHOIX_DATE_D_ID = "ctl00_ContentPlaceHolder1_CalendarExtender5_today";
    final static String CALENDRIER_F_ID = "ctl00_ContentPlaceHolder1_Img29";
    final static String CHOIX_DATE_F_ID = "ctl00_ContentPlaceHolder1_CalendarExtender6_today";
    final static String RATTACHER_CHAMP_AUDIT_ID = "ctl00_ContentPlaceHolder1_Lb_ratChampAudit";
    final static String CHAMP_AUDIT_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_champ_filter\"]/label/input";
    final static String CHOIX_CHAMP_AUDIT_ID = "ctl00_ContentPlaceHolder1_GridView_champ";
    final static String VALIDER_CHAMP_ID = "ctl00_ContentPlaceHolder1_LKB_valide_champ";
    final static String TYPE_AUDIT_ID = "ctl00_ContentPlaceHolder1_ListBox1";
    final static String CHOIX_TYPE_AUDIT_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_ListBox1\"]/option[48]";
    final static String SITE_ID = "ctl00_ContentPlaceHolder1_List_site";
    final static String CHOIX_SITE_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_List_site\"]/option[6]";
    final static String PROCESSUS_ID = "ctl00_ContentPlaceHolder1_lBProcessus_";
    final static String CHOIX_PROCESSUS_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_lBProcessus_\"]/option[65]";
    final static String ACTIVITE_ID = "ctl00_ContentPlaceHolder1_lBDomaine_";
    final static String DIRECTION_ID = "ctl00_ContentPlaceHolder1_ListBox_Direction";
    final static String SERVICE_ID = "ctl00_ContentPlaceHolder1_lBService_";
    final static String VALIDER_AUDIT_ID = "ctl00_ContentPlaceHolder1_LinkButton46";
    final static String DOCUMENTS_ASSOCIES_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_panelGlobalDoc\"]/div[1]/h4/a/span";
    final static String AJOUITER_DOCUMENT_INTERNE_ID = "ctl00_ContentPlaceHolder1_LinkButton2";
    final static String RECHERCHER_DOCUMENT_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView1h_filter\"]/label/input";
    final static String CHOIX_DOCUMENT_ID = "ctl00_ContentPlaceHolder1_GridView1h_ctl02_CheckBox1";
    final static String VALIDER_AJOUT_DOCUMENT_ID = "ctl00_ContentPlaceHolder1_LinkButton7";
    final static String LISTE_AUDITEURS_INTERNE_XPATH = "ctl00_ContentPlaceHolder1_Label77";
    final static String AJOUITER_AUDITEUR_INTERNE_ID = "ctl00_ContentPlaceHolder1_LinkButton32";
    final static String AUDITEUR_INTERNE_ID = "ctl00_ContentPlaceHolder1_Liste_auditeur";
    final static String CHOIX_AUDITEUR_INTERNE_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_Liste_auditeur\"]/option[2]";
    final static String AFFECTATION_AUDITEUR_ID = "ctl00_ContentPlaceHolder1_RadioButtonList1_1";
    final static String VALIDER_AJOUT_AUDITEUR_INTERNE_ID = "ctl00_ContentPlaceHolder1_LinkButton3d6";

    final static String VOL_AUDITEUR_EXTERNE_XPATH = "//*[@id=\"accordion11\"]/div[3]/div[1]/h4/a/span";
    final static String AJOUITER_AUDITEUR_EXTERNE_ID = "ctl00_ContentPlaceHolder1_LinkButton34";
    final static String AUDITEUR_EXTERNE_ID = "ctl00_ContentPlaceHolder1_Liste_auditeur_ext";
    final static String AFFECTATION_AUDITEUR_EXTERNE_ID = "ctl00_ContentPlaceHolder1_RadioButtonList2_0";
    final static String VALIDER_AJOUT_AUDITEUR_EXTERNE_ID = "ctl00_ContentPlaceHolder1_LinkButton38";

    final static String AJOUITER_PERSONNE_HABILITE_ID = "ctl00_ContentPlaceHolder1_LinkButton435";
    final static String PERSONNE_HABILITE_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView1lo0_filter\"]/label/input";
    final static String GRID_PERSONNE_HABILITE_ID = "ctl00_ContentPlaceHolder1_GridView1lo0";
    final static String VALIDER_AJOUT_PERSONNE_HABILITE_ID = "ctl00_ContentPlaceHolder1_LinkButton438";

    final static String AUDITE_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_p_ta2\"]/div[1]/h4/a/span";
    final static String NOM_AUDITE_ID = "ctl00_ContentPlaceHolder1_TextBox2lo";
    final static String AJOUITER_AUDITE_ID = "ctl00_ContentPlaceHolder1_LinkButton26";
    final static String RECHERCHE_AUDITE_XPATH = "ctl00_ContentPlaceHolder1_TextBox30";
    final static String VLD_RECHERCHE_AUDITE_XPATH = "ctl00_ContentPlaceHolder1_LinkButton69";
    final static String CHOIX_AUDITE_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView1lo\"]/tbody/tr[1]/td[1]";
    final static String VALIDER_CHOIX_AUDITE_ID = "ctl00_ContentPlaceHolder1_LinkButton28";

    final static String REALISATION_XPATH = "ctl00_ContentPlaceHolder1_Label44";
    final static String DATE_D_REALISATION_ID = "ctl00_ContentPlaceHolder1_datdebeff";
    final static String CHOIX_DATE_D_REALISATION_ID = "ctl00_ContentPlaceHolder1_CalendarExtender8_today";
    final static String DATE_F_REALISATION_ID = "ctl00_ContentPlaceHolder1_datefineff";
    final static String CHOIX_DATE_F_REALISATION_ID = "ctl00_ContentPlaceHolder1_CalendarExtender7_today";
    final static String ETAT_ID = "ctl00_ContentPlaceHolder1_etat";
    final static String CHOIX_ETAT_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_etat\"]/option[2]";
    final static String TAUX_ID = "ctl00_ContentPlaceHolder1_tauxatt";
    final static String VALIDER_REALISATION_ID = "ctl00_ContentPlaceHolder1_LinkButton54";
    final static String CHECKLIST_ID = "ctl00_ContentPlaceHolder1_Label53";

    final static String CHOIX_CHECKLIST_ID = "ctl00_ContentPlaceHolder1_GridView4_ctl02_LinkButton1";
    final static String GRID_CRITERE_ID = "ctl00_ContentPlaceHolder1_GridView_Eval_Details";
    final static String CRITERE1_ID = "ctl00_ContentPlaceHolder1_GridView_Eval_Details_ctl02_dp_eval";
    final static String CHOIX_CRITERE1_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Eval_Details_ctl02_dp_eval\"]/option[2]";
    final static String CRITERE2_ID = "ctl00_ContentPlaceHolder1_GridView_Eval_Details_ctl03_dp_eval";
    final static String CHOIX_CRITERE2_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Eval_Details_ctl03_dp_eval\"]/option[2]";
    final static String CRITERE3_ID = "ctl00_ContentPlaceHolder1_GridView_Eval_Details_ctl04_dp_eval";
    final static String CHOIX_CRITERE3_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Eval_Details_ctl04_dp_eval\"]/option[2]";
    final static String VALIDE_CRITERES_ID = "ctl00_ContentPlaceHolder1_LinkButton63";
    final static String RETOUR_ID = "ctl00_ContentPlaceHolder1_LinkButton64";
    final static String TAUX_CONTROLE_ID = "ctl00_ContentPlaceHolder1_tb_control_g";
    final static String TAUX_CONFORMITE_ID = "ctl00_ContentPlaceHolder1_tb_conform_g";

    final static String AJOUTER_LISTE_CONSTATS_ID = "ctl00_ContentPlaceHolder1_LinkButton12";
    final static String OBJET_CONSTATS_ID = "ctl00_ContentPlaceHolder1_objet";
    final static String DESCRIPTION_CONSTATS_ID = "ctl00_ContentPlaceHolder1_Descr";
    final static String TYPE_ACTION_ID = "ctl00_ContentPlaceHolder1_LB_TypeAct";
    final static String TYPE_CONSTAT_ID = "ctl00_ContentPlaceHolder1_LB_TypeConst";
    final static String GRAVITE_ID = "ctl00_ContentPlaceHolder1_LB_Gravite";

    final static String VALIDER_CONSTAT_ID = "ctl00_ContentPlaceHolder1_LKValider";
    final static String VALIDER_CONSTAT2_ID = "ctl00_ContentPlaceHolder1_LinkButton_OK";
    final static String DESIGNATION_ID = "ctl00_ContentPlaceHolder1_Rpt_ctl01_TxtDesig";

    final static String DATE_REALISATION_ID = "ctl00_ContentPlaceHolder1_Rpt_ctl01_Del";
    final static String CHOIX_DATE_REALISATION_ID = "ctl00_ContentPlaceHolder1_Rpt_ctl01_CalendarExtender1_today";
    final static String DATE_SUIVI_ID = "ctl00_ContentPlaceHolder1_Rpt_ctl01_delsuivie";
    final static String CHOIX_DATE_SUIVI_ID = "ctl00_ContentPlaceHolder1_Rpt_ctl01_CalendarExtender12_today";
    //final static String FERMER_CONSTAT_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_closepopup\"]/span";
    //added by rahma
    final static String FERMER_CONSTAT_XPATH = "ctl00_ContentPlaceHolder1_closepopup";
    final static String NOTIFICATION_ID = "ctl00_ContentPlaceHolder1_LinkButton_OK";
    final static String EVALUATION_CONSTATATIONS_ID = "ctl00_ContentPlaceHolder1_HtmlEditorExtender1_ExtenderContentEditable";
    final static String VALIDER_EVALUATION_CONSTATATIONS_ID = "ctl00_ContentPlaceHolder1_LinkButton61";
    final static String POINTS_CRITIQUES_ID = "ctl00_ContentPlaceHolder1_HtmlEditorExtender2_ExtenderContentEditable";
    final static String VALIDER_POINTS_CRITIQUES_ID = "ctl00_ContentPlaceHolder1_LinkButton62";
    final static String ENVOYER_RAPPORT_ID = "ctl00_ContentPlaceHolder1_Lb_env_rap";
    final static String VALIDER_RAPPORT_ID = "ctl00_ContentPlaceHolder1_Lb_valid_rap";
    final static String PLAN_AUDIT_ID = "ctl00_ContentPlaceHolder1_LinkButton49";
    final static String RAPPORT1_AUDIT_ID = "ctl00_ContentPlaceHolder1_Lifgdhfh";
    final static String RAPPORT2_AUDIT_ID = "ctl00_ContentPlaceHolder1_Lifgdhfh0";
    final static String PIECE_JOINTE_ID = "ctl00_ContentPlaceHolder1_Pieces_jointes";
    final static String PERSONNES_INFORMER_ID = "ctl00_ContentPlaceHolder1_LinkButton_Informe";
    final static String AJOUTER_PIECE_ID = "ctl00_ContentPlaceHolder1_LinkButton19";
    final static String OBJET_PIECE_ID = "ctl00_ContentPlaceHolder1_TextBox4";
    final static String CHOISIR_FICHIER_ID = "ctl00_ContentPlaceHolder1_FileUpload1";
    final static String VALIDER_AJOUT_PIECE_ID = "ctl00_ContentPlaceHolder1_LinkButton21";
    final static String FERMER_AJOUT_PIECE_ID = "ctl00_ContentPlaceHolder1_LinkButton53";
    final static String SELECT_EMP_ID = "ctl00_ContentPlaceHolder1_LinkButton31";
    final static String NOM_EMP_ID = "ctl00_ContentPlaceHolder1_TextBox15";
    final static String RECHERCHER_EMP_ID = "ctl00_ContentPlaceHolder1_LinkButton42";
    final static String CHOISIR_EMP_ID = "ctl00_ContentPlaceHolder1_GridView5_ctl02_CheckBox1";
    final static String VALIDER_CHOISIR_EMP_ID = "ctl00_ContentPlaceHolder1_LinkButton51";
    final static String RETOUR_CHOISIR_EMP_ID = "ctl00_ContentPlaceHolder1_LinkButton_Retour";
    final static String RESP_SUIVI_ID = "ctl00_ContentPlaceHolder1_Rpt_ctl01_tb_respsv";

    final static String HOME_ID = "ctl00_LinkButtonHome";
    final static String AGENDA_XPATH = "ctl00_LKB_badge_audit";
    //	id=""
    final static String COMPTEUR_ID = "ctl00_label_lb_aud";
    final static String VOL_AGD_AUDITEUR_XPATH = "ctl00_ContentPlaceHolder1_num2";
    final static String RECH_FICH_AUDITE_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView2_filter\"]/label/input";
    final static String FICH_A_AUDITE_ID = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr/td[1]";
    final static String PARTICIP_AUDITEUR_ID = "ctl00_ContentPlaceHolder1_RadioButton1";
    final static String EDIT_REAL_ID = "ctl00_ContentPlaceHolder1_editer2";
    final static String STATE_AUDIT_ID = "ctl00_ContentPlaceHolder1_LabelConforme";

    final static String VOL_AGD_RESP_CLOT_ID = "//*[@id=\"ctl00_ContentPlaceHolder1_panel_auditClot\"]/div[1]/h4/a/span";
    final static String RECH_FICH_A_CLOTURE_XPATH = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView5_filter\"]/label/input";
    final static String FICH_A_CLOTURE_ID = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView5\"]/tbody/tr/td[1]";
    final static String VOL_CLOTURE_XPATH = "sp_Cloture";
    final static String STATE_CLOTURE_ID = "ctl00_ContentPlaceHolder1_clout_1";
    final static String DATE_CLOTURE_ID = "ctl00_ContentPlaceHolder1_dateclot";
    final static String RAPPORT_CLOTURE_ID = "ctl00_ContentPlaceHolder1_rapclot";
    final static String VALIDER_CLOTURE_ID = "ctl00_ContentPlaceHolder1_LinkButton44_suivi";

    final static String NUM_AUDIT_FILTRE_ID = "ctl00_ContentPlaceHolder1_TextBox19";
    final static String RECH_FILTRE_ID = "ctl00_ContentPlaceHolder1_Filtre_Rechercher";
    final static String GRID_RECH_ID = "ctl00_ContentPlaceHolder1_GridView1p";
    final static String AUDIT_STATE_ID = "ctl00_ContentPlaceHolder1_LabelConforme";
    final static String BOUTON_REPORTE_ID = "ctl00_ContentPlaceHolder1_Reporter";
    final static String NOUV_DATE_DEBUT_ID = "ctl00_ContentPlaceHolder1_TextBox8";
    final static String NOUV_DATE_FIN_ID = "ctl00_ContentPlaceHolder1_TextBox10";
    final static String MOTIF_REPORT_ID = "ctl00_ContentPlaceHolder1_TextBox11";
    final static String VALD_REPORT_ID = "ctl00_ContentPlaceHolder1_LinkButton6";
    final static String RECH_REPORT_AGENDA_ID = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_auditreport_filter\"]/label/input";
    final static String GRID_AGD_REPORT_ID = "ctl00_ContentPlaceHolder1_GridView_auditreport";
    final static String VOL_AUDIT_REPORTE = "//*[@id=\"ctl00_ContentPlaceHolder1_panel_auditreporte\"]/div[1]/h4/a/span";

    final static String ACTION_PLAN_ID = "ctl00_ContentPlaceHolder1_LKAjoutAction";

    final static String GRID_ACTIONS_ID = "ctl00_ContentPlaceHolder1_GridView_Action_poup";
    //final static String GRID_ACTIONS_ID="//*[@id=\"collapse_ConstatSousAction\"]/div/div/table";
    final static String VOL_AUDIT_A_VALIDER = "//*[@id=\"ctl00_ContentPlaceHolder1_panel_auditaValider\"]/div[1]/h4/a/span";
    final static String GRID_AUDIT_VALIDER = "ctl00_ContentPlaceHolder1_GridView3";
    final static String RECH_AUDIT_A_VALIDER = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView3_filter\"]/label/input";
    final static String NUM_AUDIT = "//*[@id=\"ctl00_ContentPlaceHolder1_TextBox_ID\"]";
    final static String VLD_SA_ID = "ctl00_ContentPlaceHolder1_Rpt_ctl01_BtnAjouterLigne";
    final static String nbrConstat = "ctl00_ContentPlaceHolder1_nbreecrt";
    final static String tabActionConstat = "ctl00_ContentPlaceHolder1_GridView2";
    final static String datdebtP = "ctl00_ContentPlaceHolder1_datdebpre";
    final static String Action = "ctl00_ContentPlaceHolder1_Label44";
    final static String tauxREal = "ctl00_ContentPlaceHolder1_lb_enreg_real";
    final static String TableTauxReal = "ctl00_ContentPlaceHolder1_GridView1";
    final static String tauxValidation = "ctl00_ContentPlaceHolder1_LinkButton32";
    final static String datdebtF = "ctl00_ContentPlaceHolder1_datefinpre";
    final static String tauxEnrSuivi = "ctl00_ContentPlaceHolder1_lb_enreg_suivi";
final  static   String  tabtauxSuivi="ctl00_ContentPlaceHolder1_GridView2";
    //*[@id="ctl00_ContentPlaceHolder1_GridView2"]/tbody/tr/td[11]/table/tbody/tr/td[1]
    final static String   tauxValiderSuivi="ctl00_ContentPlaceHolder1_div_LinkButton33";
final static   String  EnriAudit="ctl00_ContentPlaceHolder1_Label45";
    @FindBy(how = How.ID, using = EnriAudit)
    public static WebElement wEnriAudit;

    @FindBy(how = How.ID, using = tauxValiderSuivi)
    public static WebElement wtauxValiderSuivi;
    @FindBy(how = How.ID, using = tabtauxSuivi)
    public static WebElement wtabtauxSuivi;
    @FindBy(how = How.ID, using = tauxEnrSuivi)
    public static WebElement wtauxEnrSuivi;
    @FindBy(how = How.ID, using = tauxValidation)
    public static WebElement wtauxValidation;

    @FindBy(how = How.ID, using = TableTauxReal)
    public static WebElement wTableTauxReal;

    @FindBy(how = How.ID, using = tauxREal)
    public static WebElement wtauxREa;

    @FindBy(how = How.ID, using = Action)
    public static WebElement wAction;

    @FindBy(how = How.ID, using = datdebtP)
    public static WebElement wdatdebtP;
    @FindBy(how = How.ID, using = datdebtF)
    public static WebElement wdatdebtF;


    /* @FindBy */
    @FindBy(how = How.ID, using = tabActionConstat)
    public static WebElement wtabActionConstat;
    @FindBy(how = How.ID, using = nbrConstat)
    public static WebElement wnbrConstat;

    @FindBy(how = How.ID, using = MENU_ID)
    public static WebElement menuID;

    @FindBy(how = How.ID, using = COMPTE_ID)
    public static WebElement CompteID;

    @FindBy(how = How.ID, using = DECONN_ID)
    public static WebElement DeconnID;

    @FindBy(how = How.XPATH, using = AUDITS_XPATH)
    public static WebElement AUDITSXpath;

    @FindBy(how = How.XPATH, using = NUM_AUDIT)
    public static WebElement NumAudit;

    @FindBy(how = How.ID, using = RESP_SUIVI_ID)
    public static WebElement RespSuiviId;

    @FindBy(how = How.ID, using = VLD_SA_ID)
    public static WebElement VldSAId;

    @FindBy(how = How.XPATH, using = VOL_AUDIT_REPORTE)
    public static WebElement VolAuditReporte;

    @FindBy(how = How.XPATH, using = RECH_AUDIT_A_VALIDER)
    public static WebElement RechAuditAVAlider;

    @FindBy(how = How.ID, using = GRID_AUDIT_VALIDER)
    public static WebElement GridAuditAVAlider;

    @FindBy(how = How.XPATH, using = VOL_AUDIT_A_VALIDER)
    public static WebElement VolAuditAValider;

    @FindBy(how = How.XPATH, using = PLANIFICATION_XPATH)
    public static WebElement planificationXpath;

    @FindBy(how = How.XPATH, using = MODULE_AUDITS_XPATH)
    public static WebElement moduleAuditsXpath;

    @FindBy(how = How.ID, using = BOUTTON_AJOUTER_ID)
    public static WebElement btnAjouterID;

    @FindBy(how = How.ID, using = REF_INTERNE_AUDIT_ID)
    public static WebElement refInterneAuditID;

    @FindBy(how = How.ID, using = CALENDRIER_D_ID)
    public static WebElement calendrierDID;

    @FindBy(how = How.ID, using = CHOIX_DATE_D_ID)
    public static WebElement choixDateDID;

    @FindBy(how = How.ID, using = CALENDRIER_F_ID)
    public static WebElement calendrierFID;

    @FindBy(how = How.ID, using = CHOIX_DATE_F_ID)
    public static WebElement choixDateFID;

    @FindBy(how = How.ID, using = RATTACHER_CHAMP_AUDIT_ID)
    public static WebElement RattacherChampAuditID;

    @FindBy(how = How.XPATH, using = CHAMP_AUDIT_XPATH)
    public static WebElement champAuditXPATH;

    @FindBy(how = How.ID, using = CHOIX_CHAMP_AUDIT_ID)
    public static WebElement choixChampAuditID;

    @FindBy(how = How.ID, using = VALIDER_CHAMP_ID)
    public static WebElement btnValiderID;

    @FindBy(how = How.ID, using = TYPE_AUDIT_ID)
    public static WebElement typeAuditID;

    @FindBy(how = How.XPATH, using = CHOIX_TYPE_AUDIT_XPATH)
    public static WebElement choixTypeAudit;

    @FindBy(how = How.ID, using = SITE_ID)
    public static WebElement siteID;

    @FindBy(how = How.ID, using = ACTIVITE_ID)
    public static WebElement activiteID;

    @FindBy(how = How.ID, using = DIRECTION_ID)
    public static WebElement directionID;

    @FindBy(how = How.ID, using = SERVICE_ID)
    public static WebElement serviceID;

    @FindBy(how = How.XPATH, using = CHOIX_SITE_XPATH)
    public static WebElement choixSite;

    @FindBy(how = How.ID, using = PROCESSUS_ID)
    public static WebElement processusID;

    @FindBy(how = How.XPATH, using = CHOIX_PROCESSUS_XPATH)
    public static WebElement choixProcessus;

    @FindBy(how = How.ID, using = VALIDER_AUDIT_ID)
    public static WebElement btnValiderAuditID;

    @FindBy(how = How.XPATH, using = DOCUMENTS_ASSOCIES_XPATH)
    public static WebElement documentAssociesID;

    @FindBy(how = How.ID, using = AJOUITER_DOCUMENT_INTERNE_ID)
    public static WebElement ajouterDocumentInterneID;


    @FindBy(how = How.XPATH, using = RECHERCHER_DOCUMENT_XPATH)
    public static WebElement rechercheDocumentID;
    @FindBy(how = How.ID, using = CHOIX_DOCUMENT_ID)
    public static WebElement choixDocumentID;

    @FindBy(how = How.ID, using = VALIDER_AJOUT_DOCUMENT_ID)
    public static WebElement validerAjoutDocumentID;

    @FindBy(how = How.ID, using = LISTE_AUDITEURS_INTERNE_XPATH)
    public static WebElement listeAuditeursInternesXPATH;

    @FindBy(how = How.ID, using = AJOUITER_AUDITEUR_INTERNE_ID)
    public static WebElement ajouterAuditeurInterneID;

    @FindBy(how = How.ID, using = AUDITEUR_INTERNE_ID)
    public static WebElement auditeurInterneID;

    @FindBy(how = How.XPATH, using = CHOIX_AUDITEUR_INTERNE_XPATH)
    public static WebElement choixAuditeurInterneID;

    @FindBy(how = How.ID, using = AFFECTATION_AUDITEUR_ID)
    public static WebElement affectationAuditeurID;

    @FindBy(how = How.ID, using = VALIDER_AJOUT_AUDITEUR_INTERNE_ID)
    public static WebElement validerAjoutauditeurID;

    @FindBy(how = How.XPATH, using = VOL_AUDITEUR_EXTERNE_XPATH)
    public static WebElement VolAuditeursExternesXPATH;

    @FindBy(how = How.ID, using = AJOUITER_AUDITEUR_EXTERNE_ID)
    public static WebElement ajouterAuditeurExterneID;

    @FindBy(how = How.ID, using = AUDITEUR_EXTERNE_ID)
    public static WebElement auditeurExterneID;

    @FindBy(how = How.ID, using = AFFECTATION_AUDITEUR_EXTERNE_ID)
    public static WebElement affectationAuditeurExterneID;

    @FindBy(how = How.ID, using = VALIDER_AJOUT_AUDITEUR_EXTERNE_ID)
    public static WebElement ValiderAjoutAuditeurExterneID;

    @FindBy(how = How.ID, using = AJOUITER_PERSONNE_HABILITE_ID)
    public static WebElement AjouterPersonneHabilitesID;

    @FindBy(how = How.XPATH, using = PERSONNE_HABILITE_XPATH)
    public static WebElement PersonneHabilitesID;

    @FindBy(how = How.ID, using = VALIDER_AJOUT_PERSONNE_HABILITE_ID)
    public static WebElement ValiderPersonneHabilitesID;

    @FindBy(how = How.ID, using = GRID_PERSONNE_HABILITE_ID)
    public static WebElement GridPersonneHabilitesID;


    @FindBy(how = How.XPATH, using = AUDITE_XPATH)
    public static WebElement auditeXPATH;

    @FindBy(how = How.ID, using = AJOUITER_AUDITE_ID)
    public static WebElement ajouterAuditeID;

    @FindBy(how = How.ID, using = RECHERCHE_AUDITE_XPATH)
    public static WebElement rechercheAuditeXPATH;
    @FindBy(how = How.ID, using = VLD_RECHERCHE_AUDITE_XPATH)
    public static WebElement VldrechercheAuditeXPATH;

    @FindBy(how = How.XPATH, using = CHOIX_AUDITE_XPATH)
    public static WebElement choixAuditeXPATH;

    @FindBy(how = How.ID, using = VALIDER_CHOIX_AUDITE_ID)
    public static WebElement validerChoixAuditeID;

    @FindBy(how = How.ID, using = DATE_D_REALISATION_ID)
    public static WebElement dateDRealisationID;

    @FindBy(how = How.ID, using = CHOIX_DATE_D_REALISATION_ID)
    public static WebElement choixDateDRealisationID;

    @FindBy(how = How.ID, using = DATE_F_REALISATION_ID)
    public static WebElement dateFRealisationID;

    @FindBy(how = How.ID, using = CHOIX_DATE_F_REALISATION_ID)
    public static WebElement choixDateFRealisationID;

    @FindBy(how = How.ID, using = ETAT_ID)
    public static WebElement etatID;

    @FindBy(how = How.XPATH, using = CHOIX_ETAT_XPATH)
    public static WebElement choixEtatID;

    @FindBy(how = How.ID, using = TAUX_ID)
    public static WebElement tauxID;

    @FindBy(how = How.ID, using = VALIDER_REALISATION_ID)
    public static WebElement validerRealisationID;

    @FindBy(how = How.ID, using = CHECKLIST_ID)
    public static WebElement checklistID;

    @FindBy(how = How.ID, using = GRID_CRITERE_ID)
    public static WebElement GridCritereID;

    @FindBy(how = How.ID, using = CHOIX_CHECKLIST_ID)
    public static WebElement choixchecklistID;

    @FindBy(how = How.ID, using = CRITERE1_ID)
    public static WebElement criter1ID;

    @FindBy(how = How.XPATH, using = CHOIX_CRITERE1_XPATH)
    public static WebElement choixCriter1ID;

    @FindBy(how = How.ID, using = CRITERE2_ID)
    public static WebElement criter2ID;

    @FindBy(how = How.XPATH, using = CHOIX_CRITERE2_XPATH)
    public static WebElement choixCriter2ID;

    @FindBy(how = How.ID, using = CRITERE3_ID)
    public static WebElement criter3ID;

    @FindBy(how = How.XPATH, using = CHOIX_CRITERE3_XPATH)
    public static WebElement choixCriter3ID;

    @FindBy(how = How.ID, using = VALIDE_CRITERES_ID)
    public static WebElement validerCritersID;

    @FindBy(how = How.ID, using = RETOUR_ID)
    public static WebElement retourID;

    @FindBy(how = How.ID, using = TAUX_CONTROLE_ID)
    public static WebElement tauxControlID;

    @FindBy(how = How.ID, using = TAUX_CONFORMITE_ID)
    public static WebElement tauxConformiteID;

    @FindBy(how = How.ID, using = AJOUTER_LISTE_CONSTATS_ID)
    public static WebElement ajouterConstatID;

    @FindBy(how = How.ID, using = OBJET_CONSTATS_ID)
    public static WebElement objetConstatsID;

    @FindBy(how = How.ID, using = DESCRIPTION_CONSTATS_ID)
    public static WebElement descriptionConstatsID;

    @FindBy(how = How.ID, using = TYPE_ACTION_ID)
    public static WebElement typeActionID;

    @FindBy(how = How.ID, using = TYPE_CONSTAT_ID)
    public static WebElement typeConstatID;

    @FindBy(how = How.ID, using = GRAVITE_ID)
    public static WebElement graviterID;

    @FindBy(how = How.ID, using = VALIDER_CONSTAT_ID)
    public static WebElement validerConstatID;

    @FindBy(how = How.ID, using = VALIDER_CONSTAT2_ID)
    public static WebElement validerConstat2ID;

    @FindBy(how = How.ID, using = DESIGNATION_ID)
    public static WebElement designationID;

    @FindBy(how = How.ID, using = REALISATION_XPATH)
    public static WebElement RealisationXPATH;

    @FindBy(how = How.ID, using = DATE_REALISATION_ID)
    public static WebElement dateRealisationID;

    @FindBy(how = How.ID, using = CHOIX_DATE_REALISATION_ID)
    public static WebElement choixDateRealisationID;

    @FindBy(how = How.ID, using = DATE_SUIVI_ID)
    public static WebElement dateSuiviID;

    @FindBy(how = How.ID, using = CHOIX_DATE_SUIVI_ID)
    public static WebElement choixDateSuiviID;

    @FindBy(how = How.ID, using = FERMER_CONSTAT_XPATH)
    public static WebElement fermerConstatID;

    @FindBy(how = How.ID, using = NOTIFICATION_ID)
    public static WebElement notification;

    @FindBy(how = How.ID, using = EVALUATION_CONSTATATIONS_ID)
    public static WebElement evaluationID;

    @FindBy(how = How.ID, using = VALIDER_EVALUATION_CONSTATATIONS_ID)
    public static WebElement btnValiderEvaluationID;

    @FindBy(how = How.ID, using = POINTS_CRITIQUES_ID)
    public static WebElement pointsCritiquesID;

    @FindBy(how = How.ID, using = VALIDER_POINTS_CRITIQUES_ID)
    public static WebElement btnValiderPointstID;

    @FindBy(how = How.ID, using = ENVOYER_RAPPORT_ID)
    public static WebElement btnEnvoyerRapportID;

    @FindBy(how = How.ID, using = VALIDER_RAPPORT_ID)
    public static WebElement btnValiderRapportID;

    @FindBy(how = How.ID, using = PLAN_AUDIT_ID)
    public static WebElement planAuditID;

    @FindBy(how = How.ID, using = RAPPORT1_AUDIT_ID)
    public static WebElement rapport1AuditID;

    @FindBy(how = How.ID, using = RAPPORT2_AUDIT_ID)
    public static WebElement rapport2AuditID;

    @FindBy(how = How.ID, using = PIECE_JOINTE_ID)
    public static WebElement pieceJointeID;

    @FindBy(how = How.ID, using = PERSONNES_INFORMER_ID)
    public static WebElement personnesInformerID;

    @FindBy(how = How.ID, using = AJOUTER_PIECE_ID)
    public static WebElement ajouterPieceID;

    @FindBy(how = How.ID, using = OBJET_PIECE_ID)
    public static WebElement objetPieceID;

    @FindBy(how = How.ID, using = CHOISIR_FICHIER_ID)
    public static WebElement choisirPieceID;

    @FindBy(how = How.ID, using = VALIDER_AJOUT_PIECE_ID)
    public static WebElement btnValiderAjoutPieceID;

    @FindBy(how = How.ID, using = FERMER_AJOUT_PIECE_ID)
    public static WebElement fermerAjoutPieceID;

    @FindBy(how = How.ID, using = SELECT_EMP_ID)
    public static WebElement selectEmpID;

    @FindBy(how = How.ID, using = NOM_EMP_ID)
    public static WebElement nomEmpID;

    @FindBy(how = How.ID, using = RECHERCHER_EMP_ID)
    public static WebElement rechercherEmpID;

    @FindBy(how = How.ID, using = CHOISIR_EMP_ID)
    public static WebElement choisirEmpID;

    @FindBy(how = How.ID, using = VALIDER_CHOISIR_EMP_ID)
    public static WebElement btnValiderchoisirempID;

    @FindBy(how = How.ID, using = RETOUR_CHOISIR_EMP_ID)
    public static WebElement btnRetourchoisirempID;

    @FindBy(how = How.ID, using = HOME_ID)
    public static WebElement HomeID;

    @FindBy(how = How.ID, using = AGENDA_XPATH)
    public static WebElement AgendaId;

    @FindBy(how = How.ID, using = COMPTEUR_ID)
    public static WebElement CompteurID;

    @FindBy(how = How.ID, using = VOL_AGD_AUDITEUR_XPATH)
    public static WebElement VolAgdAuditeurID;

    @FindBy(how = How.XPATH, using = RECH_FICH_AUDITE_XPATH)
    public static WebElement RechFichAuditeId;

    @FindBy(how = How.XPATH, using = FICH_A_AUDITE_ID)
    public static WebElement FichAauditeID;

    @FindBy(how = How.ID, using = PARTICIP_AUDITEUR_ID)
    public static WebElement ParticipAuditeurID;

    @FindBy(how = How.ID, using = STATE_AUDIT_ID)
    public static WebElement StateAuditID;

    @FindBy(how = How.ID, using = EDIT_REAL_ID)
    public static WebElement EditRealID;

    @FindBy(how = How.XPATH, using = VOL_AGD_RESP_CLOT_ID)
    public static WebElement VolAgdRespClotID;

    @FindBy(how = How.XPATH, using = RECH_FICH_A_CLOTURE_XPATH)
    public static WebElement RechFichACloturerID;

    @FindBy(how = How.XPATH, using = FICH_A_CLOTURE_ID)
    public static WebElement FichACloturerID;

    @FindBy(how = How.ID, using = VOL_CLOTURE_XPATH)
    public static WebElement VolClotureID;

    @FindBy(how = How.ID, using = STATE_CLOTURE_ID)
    public static WebElement StateClotureID;

    @FindBy(how = How.ID, using = DATE_CLOTURE_ID)
    public static WebElement DateClotureID;

    @FindBy(how = How.ID, using = RAPPORT_CLOTURE_ID)
    public static WebElement RapportClotureID;

    @FindBy(how = How.ID, using = VALIDER_CLOTURE_ID)
    public static WebElement VldClotureID;

    @FindBy(how = How.ID, using = NUM_AUDIT_FILTRE_ID)
    public static WebElement NumAuditFiltreID;

    @FindBy(how = How.ID, using = RECH_FILTRE_ID)
    public static WebElement RechFiltreID;

    @FindBy(how = How.ID, using = GRID_RECH_ID)
    public static WebElement GridRechID;

    @FindBy(how = How.ID, using = AUDIT_STATE_ID)
    public static WebElement AuditStateID;

    @FindBy(how = How.ID, using = BOUTON_REPORTE_ID)
    public static WebElement BoutonReporteID;

    @FindBy(how = How.ID, using = NOUV_DATE_DEBUT_ID)
    public static WebElement NouvDateDebutID;

    @FindBy(how = How.ID, using = NOUV_DATE_FIN_ID)
    public static WebElement NouvDateFinID;

    @FindBy(how = How.ID, using = MOTIF_REPORT_ID)
    public static WebElement MotifReportID;

    @FindBy(how = How.ID, using = VALD_REPORT_ID)
    public static WebElement ValidReportID;

    @FindBy(how = How.XPATH, using = RECH_REPORT_AGENDA_ID)
    public static WebElement RechReportAgendaID;

    @FindBy(how = How.ID, using = GRID_AGD_REPORT_ID)
    public static WebElement GridAgendaReportID;

    @FindBy(how = How.ID, using = ACTION_PLAN_ID)
    public static WebElement ActionPlanID;
    @FindBy(how = How.ID, using = GRID_ACTIONS_ID)
    public static WebElement GridActionID;

}
