package MyPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate 
{
	
public static void main(String[] args) {
		
		String key = "webdriver.chrome.driver";
		String value = "D:\\QSpiders\\Softwares\\BasicSelenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https:\\\\www.facebook.com");
		driver.navigate().to("https:\\\\www.flipkart.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
}
}
