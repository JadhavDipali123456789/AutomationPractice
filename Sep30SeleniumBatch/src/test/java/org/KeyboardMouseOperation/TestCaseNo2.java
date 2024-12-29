package org.KeyboardMouseOperation;
import java.util.List;

import org.SeleniumUtil.SeleniumUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class TestCaseNo2 extends SeleniumUtil {
	public void performMouseHoverInTheMenuBar() throws InterruptedException {
		WebDriver driver=setUp("edge","https://demowebshop.tricentis.com/login");
		List<WebElement> menuList=driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		Actions action=new Actions(driver);
		for(int i=0;i<menuList.size();i++) {
			action.moveToElement(menuList.get(i)).build().perform();
			Thread.sleep(2000);
		}
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		TestCaseNo2 ref=new TestCaseNo2();
		ref.performMouseHoverInTheMenuBar();
	}
}
/*
TC2:
perform mouse hover in the menu bar
https://demowebshop.tricentis.com/login
*/