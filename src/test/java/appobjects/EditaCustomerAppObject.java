package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworks.utils.WaitElementFw;

public class EditaCustomerAppObject {
	private WebDriver driver;
	
	public EditaCustomerAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSelectVersionCombobox() {
		return driver.findElement(By.id("switch-version-select"));
	}
	
	public WebElement getEditButton() {
		return driver.findElement(By.cssSelector("tr:nth-child(1) td:nth-child(2) div.only-desktops > a"));
	}
	
	public WebElement getFirstNameText() {
		return driver.findElement(By.id("field-customerName"));
	}

	public WebElement getLastNameText() {
		return driver.findElement(By.id("field-contactLastName"));
	}
	
	public WebElement getSaveButton() {
		return driver.findElement(By.id("form-button-save"));
	}
	
	public WebElement getMensagemText() {
		WaitElementFw.visibilityOfElementLocated(driver, By.cssSelector("div#report-success > p"));
		return driver.findElement(By.cssSelector("div#report-success > p"));
	}
}
