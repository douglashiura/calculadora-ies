package calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JUnitTest {

	@Test
	public void ok() throws Exception {
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("3+1");
		driver.findElement(By.name("btnK")).submit();
		WebElement myDynamicElement = (new WebDriverWait(driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#cwos")));
		String valor = myDynamicElement.getText();
		assertEquals(Integer.valueOf(4), Integer.valueOf(valor));
		assertEquals("3+1 - Pesquisa Google", driver.getTitle());
	}

}
