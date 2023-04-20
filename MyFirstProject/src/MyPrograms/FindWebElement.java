package MyPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindWebElement 
{
	public static void main(String[] args) {
		
		String key = "webdriver.chrome.driver";
		String value = "D:\\QSpiders\\Softwares\\BasicSelenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\QSpiders\\Basic Selenium\\WCSA4Application.html");
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		boolean b = ele.isDisplayed();
		System.out.println("Textbox is enabled");
	}
}
