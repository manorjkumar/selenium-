package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//class name mouseactionsmouseover
public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::button[1]")).click();
		WebElement FashionLink = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
		Actions act = new  Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(FashionLink).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
	}

}
