package org.WindowHandling;

import java.util.Iterator;

import java.util.List;

import java.util.Set;

import org.SeleniumUtil.SeleniumUtil;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class TestCaseNo1 extends SeleniumUtil {

	public static void main(String[] args) throws InterruptedException {

		TestCaseNo1 ref = new TestCaseNo1();

		ref.testTrainApp();

	}

	public void testTrainApp() throws InterruptedException {

		WebDriver driver = setUp("edge", "https://erail.in/");

		clickOnElement(driver.findElement(By.xpath("//a[text()='eCatering']")));

		String parentWindowId = driver.getWindowHandle();

		Set<String> getAllWindowId = driver.getWindowHandles();

		getAllWindowId.remove(parentWindowId);

		Iterator<String> itr = getAllWindowId.iterator();

		String childWindowId = itr.next();

		driver.switchTo().window(childWindowId);

		getUrlMatch("https://www.ecatering.irctc.co.in/");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Search food, brand, station, etc.']")).click();

		driver.findElement(By.xpath("//input[@class='form-input pl-12  text-sm']")).sendKeys("12627");

		Thread.sleep(5000);

		List<WebElement> suggList = driver

				.findElements(By.xpath("//div[@class='w-full mb-48 grid grid-cols-1 gap-4 px-4']/div/div/div/div/p"));

		String expTrainName = "KARNATAKA EXP";

		for (int i = 0; i < suggList.size(); i++) {

			suggList = driver.findElements(

					By.xpath("//div[@class='w-full mb-48 grid grid-cols-1 gap-4 px-4']/div/div/div/div/p"));

			WebElement trainName = suggList.get(i);

			if (trainName.getText().equals(expTrainName)) {

				System.out.println(trainName.getText());

				trainName.click();

				break;

			}

		}

		WebElement date = driver

				.findElement(By.xpath("//input[@class='form-input custom-date-picker h-11.5 pl-12 text-sm']"));

		date.click();

		for (int i = 0; i < 5; i++) {

			Thread.sleep(1000);

			date.sendKeys(Keys.ARROW_DOWN);

		}

		date.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[@placeholder='Boarding Station']")).click();

		List<WebElement> cityName = driver.findElements(By.xpath("//select[@placeholder='Boarding Station']/option"));

		WebElement expectedCity = driver

				.findElement(By.xpath("//select[@placeholder='Boarding Station']/option[@value='ET']"));

		String expectCity = expectedCity.getText();

		for (int i = 0; i < cityName.size(); i++) {

			cityName = driver.findElements(By.xpath("//select[@placeholder='Boarding Station']/option"));

			WebElement currentCity = cityName.get(i);

			String currentCity1 = currentCity.getText();

			if (currentCity1.equals(expectCity)) {

				Thread.sleep(2000);

				currentCity.click();

				break;

			}

		}

		driver.findElement(By.xpath("//button[text()='FIND FOOD']")).click();

		List<WebElement> restN = driver.findElements(By.xpath("//h5[@class='tracking-normal ']"));

		for (int i = 0; i < restN.size(); i++) {

			restN = driver.findElements(By.xpath("//h5[@class='tracking-normal ']"));

			Thread.sleep(1000);

			WebElement names = restN.get(i);

			System.out.println(names.getText());

		}

		driver.switchTo().window(parentWindowId);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("Pune", Keys.ENTER);

		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("Mumbai", Keys.ENTER);

		WebElement dates = driver.findElement(By.xpath("'//a[@class='icon-right-big']'"));

		for (int i = 0; i < 20; i++) {

			dates.click();

		}

		driver.findElement(By.xpath("//input[value='Get Trains']")).click();

		driver.quit();

	}

}

/**
 * 
 * open browser https://erail.in/ click on eCatering enter train number as 12627
 * 
 * and select it from suggestion select future date for boarding select boarding
 * 
 * station as itarsi click on find food get all restaurant names come back to
 * 
 * main page From Pune to Mumbai date in future print train number train name
 * 
 * Dept time Travel time
 * 
 */
