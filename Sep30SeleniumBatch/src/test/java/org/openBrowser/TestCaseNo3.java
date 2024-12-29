package org.openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCaseNo3 {
	public static void main(String[] args) {
		WebDriver Driver = new EdgeDriver();
		Driver.get("https://sampleapp.tricentis.com/101/app.php");
		String expecturl = "https://sampleapp.tricentis.com/101/app.php";
		String actualurl = Driver.getCurrentUrl();
		System.out.println("check actual and expect url" + expecturl.equals(actualurl));
		Driver.quit();
	}
}



