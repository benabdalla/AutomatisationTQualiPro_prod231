package com.qualiprobdd.e2etests.util;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

public class WordUtils {

	public static String ReadDocFile(String Filepath) {

		File file = null;
		WordExtractor extractor = null;
		String fileData = null;
		try {
			file = new File(Filepath);
			FileInputStream fis = new FileInputStream(file.getAbsolutePath());
			HWPFDocument document = new HWPFDocument(fis);
			extractor = new WordExtractor(document);
			fileData = extractor.getText();
		} catch (Exception exep) {
			exep.printStackTrace();
		}
		return fileData;
	}
}
