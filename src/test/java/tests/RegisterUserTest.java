package tests;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.Base;
import pageObj.RegisterUserPageObj;
import pageObj.RetailLoginPageObj;
import utilities.DriverUtility;
import utilities.ExcelUtility;

public class RegisterUserTest extends Base {

	RegisterUserPageObj registerUser;
	RetailLoginPageObj login;

	
	

	@BeforeMethod
	public void beforeMethod() {
		Base.initializeDriver();
		logger.info("Browser opened successfully");
	}
	
	@DataProvider // this method will fetch data from excel 
	public Object[][] getRegisterData() {
	Object data [][] = ExcelUtility.getExcelData("Register");
	return data;
	}
	
	
	@Test (dataProvider = "getRegisterData")
	public void registerUsers(String firstName, String lastName, String emailAddress, String telephone, String password, String confirmPassword ){
		registerUser = new RegisterUserPageObj();
		
		registerUser.clickMyAccount();
		registerUser.clickRegister();
		
		DriverUtility.screenShot(); 
		DriverUtility.wait(3000);
		
		registerUser.enterFullName(firstName, lastName);
		registerUser.enterEmail(emailAddress);
		registerUser.enterTelephone(telephone);
		registerUser.enterPassword(password, confirmPassword);
		DriverUtility.wait(3000);
	}
	
	@AfterMethod
	public void afterMethod() {
		Base.tearDown();
		logger.info("Browser Closed");
	}
	
	
	
	
}
