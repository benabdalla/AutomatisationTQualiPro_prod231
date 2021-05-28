package com.qualiprobdd.e2etests.moduleReunion.models;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.qualiprobdd.e2etests.moduleReunion.pages.ModuleReunionPage;
import com.qualiprobdd.e2etests.moduleReunion.pages.typeréunionpage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.RandomValue;

public class typeréunionmodel {
	public static String recuptr;

	public static void Consulter_typ_réunion() throws InterruptedException {
		// Thread.sleep(1000);
		typeréunionpage.MenuID.click();
		Thread.sleep(2000);
		typeréunionpage.MRéunion.click();
		Thread.sleep(500);
		typeréunionpage.MTypeRéunion.click();
		Thread.sleep(500);

	}

	public static void ajouter_type_réunion() throws Throwable {
		typeréunionpage.ajouter.click();

	}

	public static void saisir_type_réunion() throws Throwable {
		recuptr ="test" + RandomValue.randomString(15);
		typeréunionpage.TypeRéunion.sendKeys(recuptr);
		//recuptr = typeréunionpage.TypeRéunion.getText();
		Thread.sleep(100);

	}

	public static void saisir_périodicité() throws Throwable {
		typeréunionpage.Périodicité.sendKeys(" 25");
		Thread.sleep(100);

	}

	public static void saisir_Source() throws Throwable {
		Select select = new Select(typeréunionpage.Source);
		select.selectByVisibleText("AUDIT");

	}

	public static void valider_typeréunion() throws Throwable {
		typeréunionpage.valider.click();
		Thread.sleep(100);

	}

	public static void retour_typeréunion() throws Throwable {
		typeréunionpage.retourID.click();
		Thread.sleep(100);

	}

	public static void filtre_typeréunion() throws Throwable {
		typeréunionpage.filtre.sendKeys(recuptr);

	}

	public static void recherche_typeréunion() throws Throwable {
		typeréunionpage.rechercher.click();

	}

	public static void resultat_typeréunion() throws Throwable {

		String a = typeréunionpage.gridview.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[3]")).findElement(By.tagName("span")).getText();
		assertTrue(recuptr.equals(a));


	}

}
