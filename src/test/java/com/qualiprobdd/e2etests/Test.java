package com.qualiprobdd.e2etests;



import java.io.*;
import java.text.SimpleDateFormat;

import java.util.*;

import com.qualiprobdd.e2etests.util.Common;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.LocalDate;
import org.testng.Assert;

import javax.swing.text.BadLocationException;

public class Test {
	public static void main(String[] args) throws IOException, BadLocationException {
	    /*Workbook workbook = new XSSFWorkbook();
	    Sheet sheet = workbook.createSheet("sheet1");
	    CellStyle cellStyle = workbook.createCellStyle();
	    CreationHelper createHelper = workbook.getCreationHelper();
	    short dateFormat = createHelper.createDataFormat().getFormat("yyyy-dd-MM");
	    cellStyle.setDataFormat(dateFormat);
	    
	    Row row = sheet.createRow(0);
	    Cell cell = row.createCell(0);
	    cell.setCellValue(Calendar.getInstance());
	    cell.setCellStyle(cellStyle);

	    FileOutputStream fos =new FileOutputStream(new File("resources/Test.xlsx"));
	    workbook.write(fos);
	    fos.close();
	    System.out.println("Done");*/
		LocalDate date =new LocalDate();
		int year=date.getYear();
		int day =date.getDayOfMonth();
		System.out.println("day "+date.getYear());
		System.out.println("day "+date.getDayOfMonth());
		System.out.println("day "+date.getMonthOfYear());

		String path = "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Telechargement\\CrystalReportViewer1.rtf";

		// int   nbw=Common.nbExiste(path,"Champ Audit Auto");
		// System.out.println(" occurence  est  "+nbw);
		int count = 0;
		Assert.assertTrue(Common.ExisteWord(path,String.valueOf(day)));
		Assert.assertTrue(Common.ExisteWord(path,String.valueOf(year)));

		String word ="Champ Audit Auto";
		File file = new File(path);
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);
		while(reader.readLine() != null){
			String words= reader.readLine();
			//System.out.println("words = "+words);
			if(words.contains(word)){
				count++;
				String newword=words.substring(words.indexOf(word)+word.length(),words.length());
				System.out.println("words 2 ========================================================================================================================== "+newword);
				if(newword.contains(word)){
					count++;

				}
			}

		}

		//End While
		System.out.println("   --> count  = + "+count);


} }


