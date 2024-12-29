package org.SeleniumUtil;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil {
	public	static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions action;
	public WebDriver setUp(String browsername,String appUrl) {
		if(browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		// to open browser on full screen use
		driver.manage().window().maximize();
		// to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// after implicit wait, driver will have 0-30 sec to wait before throwing
		driver.get(appUrl);
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		action=new Actions(driver);
		return driver;
	}
	public void getUrlMatch (String expectedUrl) {
		wait.until(ExpectedConditions.urlContains(expectedUrl));
	}
	
	public void typeRequiredText(WebElement element,String text) {
		waitUntilElementClickable(element);
		element.clear();
		element.sendKeys(text);
	}
	
	public void clickOnElement(WebElement element) {
		waitUntilElementClickable(element);
		element.click();
	}
	
	public String getApplicationTitle() {
		return driver.getTitle();
	}
	public String getApplicationTitle(String expectedTitle) {
		wait.until(ExpectedConditions.titleContains(expectedTitle));
		return driver.getTitle();
	}
	
	public void waitUntilElementClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitUntilElementVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitUntilRequiredTextToBeDisplayed(WebElement element,String text) {
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}
	
	public void copyPaste(WebElement src, WebElement des) {
		action.moveToElement(src).doubleClick().build().perform();
		src.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		des.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}
	
	public void dragAndDropElements(WebElement src, WebElement des) {
		action.dragAndDrop(src, des).build().perform();
	}
}
