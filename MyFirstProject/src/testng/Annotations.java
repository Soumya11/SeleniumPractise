package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Annotations 
{
	WebDriver driver;
	
	public void openbrowser()
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\QSpiders\\Softwares\\BasicSelenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
	}
	public void launchapp()
	{
		driver.get("https://www.facebook.com/");
	}
	public void src()
	{
		driver.findElement(By.name("login")).click();
	}
	public void closeapp()
	{
		driver.close();
	}
	public void closebrowser()
	{
		driver.quit();
	}
}
