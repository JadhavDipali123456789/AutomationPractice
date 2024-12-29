package org.openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCaseNo2 {
	public static void main(String[] args) {
		WebDriver Driver = new FirefoxDriver();
		Driver.get("https://demowebshop.tricentis.com/");
		String expecturl = "https://demowebshop.tricentis.com/";
		String actualurl = Driver.getCurrentUrl();
		System.out.println("check actual and expect url" + expecturl.equals(actualurl));
		Driver.quit();
	}
}
