package org.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseNO3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.opencart.com/index.php?route=account/login");
		String currenturl = driver.getCurrentUrl();
		String expectedurl = "https://www.opencart.com/index.php?route=account/login";
		System.out.println("is login successful ?" + expectedurl.equals(currenturl));
		driver.quit();
	}
}

/*
 * TC3: Open browser enter application url as
 * https://www.opencart.com/index.php?route=account/login validate login page
 * opened or not close browser
 */