package org.openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseNo1 {
	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.saucedemo.com/");
		String expecturl="https://www.saucedemo.com/";
		String actualurl=Driver.getCurrentUrl();
		System.out.println("check actual and expect url"+expecturl.equals(actualurl));
		Driver.quit();
	}
}