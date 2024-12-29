package org.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCaseNo2 {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("tester01@vomoto.com");
		driver.findElement(By.id("Password")).sendKeys("Abc@12345");
		driver.findElement(By.className("login-button")).click();
		String currenturl=driver.getTitle();
		String actualurl="Demo Web Shop";
		System.out.println("is login successful ?"+actualurl.equals(currenturl));
		driver.findElement(By.className("ico-logout")).click();
		driver.quit();
	}

}

/*
 * TC2: Open browser enter application url as https://demowebshop.tricentis.com/
 * click on login enter username as tester01@vomoto.com enter password as
 * Abc@12345 click on login button validate login is done or not click on logout
 * close the browser
 */