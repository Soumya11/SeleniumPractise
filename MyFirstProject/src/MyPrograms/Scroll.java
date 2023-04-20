package MyPrograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws Throwable
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\QSpiders\\Softwares\\BasicSelenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor) driver;	
		//scroll_down
		for (int i = 0; i <3; i++) 
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}
		Thread.sleep(2000);	
		//scroll up
		for (int i = 0; i <3; i++) 
		{
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(1000);
		}
	}
}
