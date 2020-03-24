package calculadora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

	private static Selenium INSTANCIA = null;
	private FirefoxDriver driver;

	private Selenium() {
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		driver = new FirefoxDriver();
	}

	public static Selenium getInstancia() {
		if (INSTANCIA == null) {
			INSTANCIA = new Selenium();
		}
		return INSTANCIA;
	}

	public void irNaUrl(String url) {
		driver.get(url);
	}

	public String getValor(By name) {
		WebElement myDynamicElement = (new WebDriverWait(driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(name));
		return myDynamicElement.getAttribute("value");
	}

	public String getTitulo() {
		return driver.getTitle();
	}

	public void digite(By name, String value) {
		WebElement myDynamicElement = (new WebDriverWait(driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(name));
		myDynamicElement.sendKeys(value);

	}

	public void submeter(By name) {
		WebElement myDynamicElement = (new WebDriverWait(driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(name));
		myDynamicElement.submit();

	}

	public String getTexto(By cssSelector) {
		WebElement myDynamicElement = (new WebDriverWait(driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(cssSelector));
		return myDynamicElement.getText();
	}

}
