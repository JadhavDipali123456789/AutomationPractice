package org.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseNo1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		String currentTitle = driver.getTitle();
		String actualTitle = "Register";
		System.out.println("is login successful ?" + actualTitle.equals(currentTitle));
		driver.findElement(By.linkText("WebTable")).click();
		String currentTitle1 = driver.getTitle();
		String actualTitle1 = "Web Table";
		System.out.println("is login successful ?" + actualTitle1.equals(currentTitle1));
		driver.navigate().back();
		String currentTitle2 = driver.getTitle();
		String actualTitle2 = "Register";
		System.out.println("is login successful ?" + actualTitle2.equals(currentTitle2));
		driver.navigate().forward();
		String currentTitle3 = driver.getTitle();
		String actualTitle3 = "Web Table";
		System.out.println("is login successful ?" + actualTitle3.equals(currentTitle3));
		driver.quit();

	}
}
/*
 * open browser maximize window enter url
 * https://demo.automationtesting.in/Register.html validate register page click
 * on WebTable validate webtable page come back to register page validate
 * register page go to webtable page validate webtable page close browser
 */
