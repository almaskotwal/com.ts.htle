package tests;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import core.Base;

public class SelectProductTest extends Base{
	
	//This comment should up in a new branch only
	
	@BeforeMethod
	public void beforeMethod() {
		Base.initializeDriver();
		logger.info("Browser opened successfully");
	}
	
	@Test 
	public void readPDF() throws IOException {
		
		String currentURL = driver.getCurrentUrl();
		URL url = new URL(currentURL);
		
		InputStream is = url.openStream();
		BufferedInputStream fileParse = new BufferedInputStream(is);
		PDDocument document = null;
		document = PDDocument.load(fileParse);
		String pdfContent = new PDFTextStripper().getText(document);
		System.out.println(pdfContent);
		Assert.assertTrue(pdfContent.contains("Microchip"));
	}
	
	
	@AfterMethod
	public void afterMethod() {
		Base.tearDown();
		logger.info("Browser Closed");
	}
	
}
