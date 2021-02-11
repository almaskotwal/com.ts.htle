package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ContactUsPageObject extends Base {
	public ContactUsPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='input-name']")
	private WebElement yourName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='input-email']")
	private WebElement email;
	
	@FindBy(how = How.XPATH, using = "//textarea[@id='input-enquiry']")
	private WebElement inquiry;
	
	@FindBy(how = How.XPATH, using = "//input[@class='btn btn-primary']")
	private WebElement submit;
	


public void enterName(String name) {
	yourName.sendKeys(name);
}

public void enterEmail(String emailAdd) {
	email.sendKeys(emailAdd);
}

public void enterInquiry(String yourInquiry) {
	inquiry.sendKeys(yourInquiry);
}

public void clickSubmit() {
	submit.click();
}
}