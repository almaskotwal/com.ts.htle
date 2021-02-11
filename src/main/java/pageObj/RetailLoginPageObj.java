package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailLoginPageObj extends Base{
	
	public RetailLoginPageObj() {
		
		PageFactory.initElements(driver, this);
	}


	@FindBy(how = How.XPATH, using = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;

	@FindBy(how = How.ID, using = "input-email")
	private WebElement emailField;

	@FindBy(id = "input-password")
	private WebElement passwordField;

	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li[2]")
	private WebElement loginButton;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement login;
	
	
	

	// We start writting public methods to access each element with respected
	// actions to them.

	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickonLoginButton() {
		loginButton.click();
	}
	

	public void enterEmailAddress(String emailAddress) {
		emailField.sendKeys(emailAddress);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void login(String email, String password) {
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
	}

	public void clickOnLogin() {
		login.click();
	}
	
}


