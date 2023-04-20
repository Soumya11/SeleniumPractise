package MyPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException
	{
	String key = "webdriver.chrome.driver";
		String value = "D:\\\\QSpiders\\\\Softwares\\\\BasicSelenium\\\\chromedriver_win32\\\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.kalkifashion.com/");
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Indo Western'])[2]"));
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();

	}

}
