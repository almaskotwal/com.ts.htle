package tests;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFiles {
		
		@Test 
		public void downloadFile() throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			String downloadFilePath = "C:\\rtlWS\\com.ts.htle\\MyDownloads";
			
			Map<String,Object> hmap = new HashMap<String, Object>();
			hmap.put("download.default_directory", downloadFilePath);
			hmap.put("download.prompt_for_download", false);
			hmap.put("plugins.plugins.disabled", new String[] {"Chrome PDF Viewer"});
			options.setExperimentalOption("prefs", hmap);
			
			WebDriver driver = new ChromeDriver(options);
			
			driver.get("https://file-examples.com/index.php/sample-documents-download/sample-xls-download/");
			WebElement downloadExcelFile = driver.findElement(By.xpath("//a[@download='file_example_XLS_10.xls']"));
			
			downloadExcelFile.click();
			
			File downloadedFile = new File(downloadFilePath+"\\file_example_XLS_10.xls");
			Thread.sleep(5000);
			Assert.assertTrue(downloadedFile.exists());
			downloadedFile.delete();
		}
		
		
	}

	
	
	

