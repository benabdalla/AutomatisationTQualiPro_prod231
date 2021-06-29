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
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.LocalDate;
import org.testng.Assert;

import javax.swing.text.BadLocationException;

public class Test {
	public static void main(String[] args) throws IOException, BadLocationException {

		String  s="0,00";
		String  s2=s.replace(",",".");
		System.out.println(s2);
		float f = Float.valueOf(s2.trim()).floatValue();

		System.out.println(f);

} }


