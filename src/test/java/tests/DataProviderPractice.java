package tests;
// comment comment 
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import core.Base;
import pageObj.RegisterPageObj;
import utilities.DriverUtility;
import utilities.ExcelUtility;

public class DataProviderPractice extends Base {
	
	RegisterPageObj registerPageObj;
	
	
	@BeforeTest
	public void beforeTest() {
		Base.initializeDriver();
		logger.info("Browser opened successfully");
	}
	
	@Test (priority = 1)
	public void clickSignIn() {
	registerPageObj = new RegisterPageObj();
	registerPageObj.clickOnSignIn();
	}
	
	@Test (priority = 2, dependsOnMethods ="clickSignIn" )
	@Parameters({ "emailAdd" })
	public void enterEmail(String email) {
		registerPageObj.enterEmail(email);
		DriverUtility.wait(3000);
		registerPageObj.clickCreate();
	}
	
	@DataProvider // this method will fetch data from excel 
	public Object[][] getRegisterData() {
	Object data [][] = ExcelUtility.getExcelData("RegisterData");
	return data;
	}
	
	@Test (dataProvider = "getRegisterData")
	public void register(String firstName, String lastName, String password) {
		DriverUtility.getImpWait();
		registerPageObj.fillOutRegisterationForm(firstName, lastName, password);
		DriverUtility.wait(3000);
	}
	
	@AfterTest
	public void afterTest() {
		Base.tearDown();
		logger.info("Browser Closed");
	}
	//comments
}
