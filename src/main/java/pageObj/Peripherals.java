package pageObj;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.DriverUtility;

public class Peripherals extends Base {

	
public Peripherals() {
		
		PageFactory.initElements(driver, this);
	}

		@FindBy(xpath = "//a[text()='Desktops']")
		private WebElement desktopsDropdown;

		@FindBy(id = "viewer")
		private WebElement root1;
		
	
		
		
		public void getShadowElement() {
			WebElement shadowRoot1 = DriverUtility.expandRootElement(root1);
			WebElement root2 = shadowRoot1.findElement(By.cssSelector("#toolbar"));
			WebElement shadowRoot2 = DriverUtility.expandRootElement(root2);
			WebElement root3 = shadowRoot2.findElement(By.cssSelector("#downloads"));
			WebElement shadowRoot3 = DriverUtility.expandRootElement(root3);
			WebElement root4 = shadowRoot3.findElement(By.cssSelector("#download"));
			WebElement shadowRoot4 = DriverUtility.expandRootElement(root4);
			WebElement root5 = shadowRoot4.findElement(By.tagName("iron-icon"));
			WebElement shadowRoot5 = DriverUtility.expandRootElement(root5);
			WebElement downloadButton = shadowRoot5.findElement(By.cssSelector("#ink"));
			downloadButton.click();

		}
}
