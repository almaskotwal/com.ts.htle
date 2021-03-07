package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePage extends Base{
	
public HomePage() {
		
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//a[@title='Products']")
	private WebElement productsMenu;
	
	@FindBy(xpath = "(//ul[@class='all-categories-list']/li)[2]")
	private WebElement microControllers;
	
	@FindBy(xpath = "(//ul/li/a[text()='Peripherals'])[1]")
	private WebElement SixteenBitPeripherals;
	
	

	

}
