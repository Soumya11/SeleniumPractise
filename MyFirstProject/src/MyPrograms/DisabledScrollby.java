package MyPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledScrollby {

	public static void main(String[] args) throws InterruptedException 
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\QSpiders\\Softwares\\BasicSelenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Vinay");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("123654");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for (int i = 0; i < 1; i++) 
		{
			js.executeScript("window.scrollBy(0, 200)");
			Thread.sleep(2000);
		}
		
		for (int i = 0; i < 1; i++) 
		{
			js.executeScript("window.scrollBy(0, -200)");
			Thread.sleep(2000);
		}
	}
}
