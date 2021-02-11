package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RegisterUserPageObj extends Base{

	public RegisterUserPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Register')]")
	private WebElement register;
	
	@FindBy(how = How.XPATH, using = " //input[@id='input-firstname']")
	private WebElement firstName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='input-lastname']")
	private WebElement lastName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='input-email']")
	private WebElement email;
	
	@FindBy(how = How.XPATH, using = "//input[@id='input-telephone']")
	private WebElement telephone;
	
	@FindBy(how = How.XPATH, using = "//input[@id='input-password']")
	private WebElement password;
	
	@FindBy(how = How.XPATH, using = "//input[@id='input-confirm']")
	private WebElement confirmPassword;
	
	@FindBy(how = How.XPATH, using = "//input[@class='btn btn-primary']")
	private WebElement continueButton;
	
	//methods
	
	public void clickMyAccount() {
		myAccount.click();
	}
	
	public void clickRegister() {
		register.click();
	}
	
	public void enterFullName(String first, String last) {
		firstName.sendKeys(first);
		lastName.sendKeys(last);
	}
	
	public void enterEmail(String emailAdd) {
		email.sendKeys(emailAdd);
	}
	
	public void enterTelephone(String tel) {
		telephone.sendKeys(tel);
	}
	
	public void enterPassword(String pass, String confirmPass) {
		password.sendKeys(pass);
		confirmPassword.sendKeys(confirmPass);
	}
	
	
	public void clickContinue() {
		continueButton.click();
	}
}

