package frameworks.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsExecutorFw {
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');", element);
	}

	public static void scrollToElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void scrollTop(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(250,0);");
	}

	public static void zoomStyle(WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("document.body.style.zoom='100%'");
	}

	/**
	 * @param driver
	 * @param cssSelector
	 * @param dateValue -> O formato da data é: dd/mm/yyyy
	 */
	public static void datepicker(WebDriver driver, String cssSelector, String dateValue) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('" + cssSelector + "').value='" + dateValue + "'");
	}

	public static void changeStyle(WebDriver driver, String id) {
		try {
			driver.findElement(By.id(id)).isDisplayed();
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("document.getElementById('" + id + "').style.display = 'none';");
		} catch(Exception ex) {
			System.out.println("Warning: não foi encontrado o elemento para troca de estilo!");
		}
	}
	
	public static void changeStyle(WebDriver driver, WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'display: none;')", element);
		} catch(Exception ex) {
			System.out.println("Warning: não foi encontrado o elemento para troca de estilo!");
		}
	}

}
