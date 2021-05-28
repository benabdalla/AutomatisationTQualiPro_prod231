package com.qualiprobdd.e2etests;



import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Test {
	public static void main(String[] args) throws IOException {
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT+1"));

	

		try {
			String d = sdf.format(new Date());
			System.out.println(d);
			
		} catch (Exception e) {
			e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
		}


	}


} 


