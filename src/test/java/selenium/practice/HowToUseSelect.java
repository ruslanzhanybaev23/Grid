package selenium.practice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.fourstay.utilities.Driver;

public class HowToUseSelect {
	// @Test
	public void selectTest() {
		WebDriver driver;
		driver = Driver.getInstance();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropDown = driver.findElement(By.cssSelector("#dropdown"));
		Select select = new Select(dropDown);
		List<WebElement> d = driver.findElements(By.tagName("select"));

		for (WebElement all : d) {
			System.out.println(all.getText());

		}

		// WebElement chosenOne = select.getAllSelectedOptions().get(0);

		select.selectByIndex(1);

		// driver.close();

	}

	// @Test

	public void radioButton() {

		WebDriver driver;
		driver = Driver.getInstance();

		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium" + Keys.ENTER);
		driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		String title = "Selenium - Web Browser Automation";

		for (String windowhandle : driver.getWindowHandles()) {
			if (driver.getTitle().equals(title)) {
				break;
			}

		}
	}

	// @Test
	public void alertTest() {
		WebDriver driver;
		driver = Driver.getInstance();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	@Test
	public void frameTest() {
		WebDriver driver;
		driver = Driver.getInstance();
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.id("tinymce")).sendKeys("I found iframe");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Elemental Selenium")).click();

	}
	@Test
	public void waitsTest() {
		
	}

}
