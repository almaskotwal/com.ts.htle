package pageObj;

import core.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPageObj extends Base {
public MyAccountPageObj() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[@id='user_info_acc']")
	private WebElement dropdownButton;
	@FindBy(how = How.XPATH, using= "//ul[@class='dropdown-menu']/li//a[contains(text(),'Accounts')]")
	private WebElement account;
	@FindBy(how = How.XPATH, using = "//ul[@class='myaccount-link-list']/li//a[@title='Add my first address']")
	private WebElement addmyAdress;
	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@id='company']")
	private WebElement company;
	@FindBy(xpath = "//input[@id='address1']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id='city']")
	private WebElement city;
	
	@FindBy(xpath = "//select[@id='id_state']")
	private WebElement stateDropdown;
	@FindBy(xpath = "//input[@id='postcode']")
	private WebElement zipCode;
	
	@FindBy(xpath = "//input[@id='phone_mobile']")
	private WebElement phoneNumber;
	@FindBy(xpath = "//input[@id='alias']")
	private WebElement assignAddress;
	
	@FindBy(xpath = "//button[@id='submitAddress']/span")
	private WebElement savebutton;
	public boolean dropdownButton() {
		return dropdownButton.isDisplayed();
	}
	
	public void dropdownButton1() {
		dropdownButton.click();
	}
	public boolean accountIsPresent() {
		return account.isDisplayed();
	}
	
	public void account() {
		account.click();
	}
	public void addmyAdress() {
		addmyAdress.click();
	}
	
	public void enterFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	
	public void enterLastName(String lName) {
		lastName.sendKeys(lName);
	}
	
	public void enterCompanyName(String nameOfcompany) {
		company.sendKeys(nameOfcompany);
	}
	public void enterAddress(String firstAddres) {
		address.sendKeys(firstAddres);
	}
	
	public void enterCityName(String nameofCity) {
		city.sendKeys(nameofCity);
	}
	
	public void stateDropDown(String stateName) {
		stateDropdown.sendKeys(stateName);
	}
	
	public void zipCode(String zipcode) {
		zipCode.sendKeys(zipcode);
	}
	
	public void mobilePhone(String number) {
		phoneNumber.sendKeys(number);
	}
	
	public void assignAddress() {
		assignAddress.click();
	}
	public void savebutton() {
		savebutton.click();
	}
}

