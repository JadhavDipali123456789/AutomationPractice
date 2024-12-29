package org.SwitchingFrame;

import java.util.List;

import org.SeleniumUtil.SeleniumUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestNo2 extends SeleniumUtil {

	public static void main(String[] args) throws InterruptedException {
		TestNo2 ref=new TestNo2();
		ref.sortTheElementIndex();
	}

	public void sortTheElementIndex() throws InterruptedException {
		WebDriver driver = setUp("edge", "https://jqueryui.com/");
		clickOnElement(driver.findElement(By.linkText("Sortable")));
		driver.switchTo().frame(0);
		List<WebElement> itemList = driver.findElements(By.xpath("//body/ul/li"));
		for (int i = 0; i < (itemList.size() - 1); i++) {
			Thread.sleep(2000);
			itemList = driver.findElements(By.xpath("//body/ul/li"));
			SeleniumUtil.action.dragAndDrop(itemList.get(itemList.size() - 1), itemList.get(i)).build().perform();
		}
		driver.quit();
	}
}
/*
TC2:- https://jqueryui.com/ click on sortable sort the elements
*/