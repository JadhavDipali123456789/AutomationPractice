package org.ComponentValidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseNo1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.className("login-button")).click();
		WebElement errormessage=driver.findElement(By.className("validation-summary-errors"));
		System.out.println("Error message displayed or not"+errormessage.isDisplayed());
		Point errormessagelocation=errormessage.getLocation();
		int errorX=errormessagelocation.getX();
		int errorY=errormessagelocation.getY();
		WebElement inputfield=driver.findElement(By.id("Email"));
		Point inputfiledlocation=inputfield.getLocation();
		int inputfiledX=inputfiledlocation.getX();
		int inputfiledY=inputfiledlocation.getY();
		System.out.println(inputfiledY>errorY);
		System.out.println("errormessageColour"+errormessage.getCssValue("color"));
		System.out.println("errormessagesize"+errormessage.getCssValue("font-size"));
		System.out.println("errormessagefamily"+errormessage.getCssValue("font-family"));
		driver.quit();
	}
	

}
/*TC1:
open browser and url https://demowebshop.tricentis.com/login
click on login button
validate:
	error msg is getting displayed above email id input field
	error msg color
	error msg font-size
	error msg font-family
*/
