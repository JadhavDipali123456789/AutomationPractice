package org.xpath;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/gift-card-store/b/?ie=UTF8&node=3704982031&ref_=nav_cs_gc");
		driver.findElement(By.xpath("//li[span[a[span[text()='Anniversary']]]]/span/a/div/label")).click();

		driver.findElement(By.xpath("//li[span[a[span[text()='Birthday']]]]/span/a/div/label")).click();

		driver.findElement(By.xpath("//li[span[a[span[text()='Friendship']]]]/span/a/div/label")).click();
		driver.quit();
	}
}
//click checkbox of anniversary,Birthday,Friendship