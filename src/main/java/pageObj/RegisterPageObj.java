package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RegisterPageObj extends Base{
	public RegisterPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Sign in')]")
	private WebElement SignIn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='email_create']")
	private WebElement emailField;
	
	@FindBy(how = How.XPATH, using = "//button[@id='SubmitCreate']")
	private WebElement createAcctButton;
	
	@FindBy(how = How.XPATH, using = "//input[@id='customer_firstname']")
	private WebElement firstName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='customer_lastname']")
	private WebElement lastName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']")
	private WebElement password;
	
	
	
	
	//methods
	
	public void clickOnSignIn() {
		SignIn.click();
	}
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void clickCreate() {
		createAcctButton.click();
	}
	
	public void fillOutRegisterationForm(String first, String last, String pass) {
		firstName.sendKeys(first);
		lastName.sendKeys(last);
		password.sendKeys(pass);
	}
	
}
