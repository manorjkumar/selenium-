package com.testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingiFreames {
	WebDriver driver;

	@Test
	public void a_OpenWebSite() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://nunzioweb.com/");
	driver.manage().window().maximize();
	driver.switchTo().frame("oddcouple");
	//Return on invesment(ROI)-->agax
	 String SampleText = driver.findElement(By.xpath("//div[starts-with(text(),'A television')]")).getText();
	 System.out.println(SampleText);
	 driver.switchTo().frame("oddcouple");
	 String text = driver.findElement(By.xpath("//span[starts-with(text(),'Yes - Nunzio ')]")).getText();
	 System.out.println(text);
	}

}
