package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class AddAddressPageObj extends Base {
	public AddAddressPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//button[@id='user_info_acc']/span[2]")
	private WebElement accountDropDown;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='dropdown-menu']/li[1]")
	private WebElement myAccountsButton;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add my first address')]")
	private WebElement myFirstAddressButton;
	
	@FindBy(how = How.XPATH, using = "//input[@id='company']")
	private WebElement company;
	
	@FindBy(how = How.XPATH, using = "//input[@id='address1']")
	private WebElement address;
	
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	private WebElement city;
	
	@FindBy(how = How.XPATH, using = "//select[@id='id_state']")
	private WebElement state;
	
	
	
	

