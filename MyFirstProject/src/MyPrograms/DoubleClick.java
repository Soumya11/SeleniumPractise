package MyPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\QSpiders\\Softwares\\BasicSelenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\QSpiders\\Basic Selenium\\WCSA4Application.html");
		WebElement ele1 = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement ele2 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(ele1).perform();
		Thread.sleep(2000);
		act.contextClick(ele1).perform();
		Thread.sleep(2000);
		act.click(ele2).perform();
	}
}
