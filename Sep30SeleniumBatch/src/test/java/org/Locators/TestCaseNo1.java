package org.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseNo1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		String actualurl=driver.getCurrentUrl();
		System.out.println("is login successful ?"+actualurl.endsWith("dashboard/index"));
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}
	
}
/*
 * TC1: Open browser enter application url as
 * https://opensource-demo.orangehrmlive.com/web/index.php/auth/login enter
 * username as Admin enter password as admin123 click login button validate
 * login is successful or not click on profile icon click logout link close the
 * browser
 */
