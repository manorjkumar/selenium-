package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class similerElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Dhanush");
		driver.manage().window().maximize();
		 int LinkCounts = driver.findElements(By.tagName("a")).size();
		System.out.println(LinkCounts);
		 int images = driver.findElements(By.tagName("img")).size();
		 System.out.println(images);
		
	}

}
