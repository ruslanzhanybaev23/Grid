package com.fourstay.utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtility {
	public static void waitForPageLoad() {
		WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 50);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.se-pre-con")));
		// we put 1 sec because of until red thing from the page disapers
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void switchTabs(String url) {
		String defaultTab = Driver.getInstance().getWindowHandle();
		for (String windowHandle : Driver.getInstance().getWindowHandles()) {
			Driver.getInstance().switchTo().window(windowHandle);
			if (Driver.getInstance().getCurrentUrl().contains(url)) {
				return;
			}
		}
		Driver.getInstance().switchTo().window(defaultTab);
	}

	public static void loadAllStates() {
		// waits all elements od states to load
		WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".col-md-12>p")));

	}

	public static void waitEnterCredentials() {
		// WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 10);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void frame() throws Exception {
		List<WebElement> iframes = Driver.getInstance().findElements(By.xpath("//iframe"));
		Driver.getInstance().switchTo().frame(iframes.size() - 1);

		Thread.sleep(4000);

		Driver.getInstance().findElement(By.cssSelector(".intercom-borderless-dismiss-button")).click();
		Driver.getInstance().switchTo().defaultContent();

		Thread.sleep(4000);
	}

	public static void generalSettings() {
		WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 30);
		wait.until(ExpectedConditions.visibilityOf(
				Driver.getInstance().findElement(By.xpath("//input[@ng-model='$parent.other.FirstName']"))));

	}

}


