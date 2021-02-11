package tests;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import core.Base;
import pageObj.AddAddressPageObj;
import pageObj.HotelLoginPageObj;
import utilities.DriverUtility;
import utilities.ExcelUtility;

public class LoginTest extends Base {

	HotelLoginPageObj hotelLoginPageObj;

	@BeforeTest 
	public void beforeTest() {
		System.out.println("this will be run once");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Base.initializeDriver();
		logger.info("Browser opened successfully");

	}

	@Test
	@Parameters({ "userName", "password" })
	public void loginToHotel(String userName, String password) {
		hotelLoginPageObj = new HotelLoginPageObj();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(hotelLoginPageObj.SignInIsPresent());
		hotelLoginPageObj.clickOnSignIn();
		softAssert.assertTrue(hotelLoginPageObj.emailAddressIsPresent());
		softAssert.assertTrue(hotelLoginPageObj.passwordIsPresent());
		softAssert.assertTrue(hotelLoginPageObj.signInButtonIsPresent());
		hotelLoginPageObj.enterUserAndPassword(userName, password);
		softAssert.assertAll();
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		Base.tearDown();
		logger.info("Browser Closed");

	}

}
