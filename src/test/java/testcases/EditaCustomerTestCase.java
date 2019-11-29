package testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import frameworks.utils.BaseTestFw;
import tasks.EditaCustomerTask;

public class EditaCustomerTestCase extends BaseTestFw {
	
	private WebDriver driver = getDriver();
	private EditaCustomerTask editarCustomerTask = new EditaCustomerTask(driver);
	
	@Test
	public void test() {
		driver.get("https://www.grocerycrud.com/demo/bootstrap_theme");
		editarCustomerTask.alteraCombobox();
		editarCustomerTask.entraEdit();
		editarCustomerTask.alteraNome();
		editarCustomerTask.alteraSobrenome();
		editarCustomerTask.clicaSalva();
		editarCustomerTask.validarMensagem();
	}
}
