package tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import appobjects.EditaCustomerAppObject;
import frameworks.utils.WaitElementFw;

public class EditaCustomerTask {
	private WebDriver driver;
	private EditaCustomerAppObject editaCustomerAppObejct;

	public EditaCustomerTask (WebDriver driver) {
		this.driver = driver;
		this.editaCustomerAppObejct = new EditaCustomerAppObject(driver);
	}
	
	public void alteraCombobox() {
		editaCustomerAppObejct.getSelectVersionCombobox().click();
		editaCustomerAppObejct.getSelectVersionCombobox().sendKeys(Keys.ARROW_DOWN);
		editaCustomerAppObejct.getSelectVersionCombobox().sendKeys(Keys.ENTER);
	}
	
	public void entraEdit() {
		editaCustomerAppObejct.getEditButton().click();
	}
	
	public void alteraNome() {
		editaCustomerAppObejct.getFirstNameText().clear();
		editaCustomerAppObejct.getFirstNameText().sendKeys("Jeferson");
	}
	
	public void alteraSobrenome() {
		editaCustomerAppObejct.getLastNameText().clear();
		editaCustomerAppObejct.getLastNameText().sendKeys("Lopes Eugenio");
	}
	
	public void clicaSalva() {
		editaCustomerAppObejct.getSaveButton().click();
	}
	
	public void validarMensagem() {
		
		String expected = "Your data has been successfully updated. Go back to list";
		String actual = editaCustomerAppObejct.getMensagemText().getText();
		Assert.assertEquals(actual, expected);
	}
}
