package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDraganandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement Element1 = driver.findElement(By.id("draggable"));
		WebElement Element2 = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(Element1, Element2).build().perform();	
	}

}
