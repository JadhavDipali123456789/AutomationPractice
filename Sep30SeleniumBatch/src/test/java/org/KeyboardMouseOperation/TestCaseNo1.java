package org.KeyboardMouseOperation;

import org.SeleniumUtil.SeleniumUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCaseNo1 extends SeleniumUtil {
	public void loginWithoutIdntifyingLoginButton() {
		WebDriver driver = setUp("edge", "https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("tester01@vomoto.com");
		driver.findElement(By.id("Password")).sendKeys("Abc@12345", Keys.ENTER);
		driver.quit();

	}

	public static void main(String[] args) {
		TestCaseNo1 ref = new TestCaseNo1();
		ref.loginWithoutIdntifyingLoginButton();
	}
}
/*
login into https://demowebshop.tricentis.com/login without identifying login button
tester01@vomoto.com/Abc@12345
*/