package MyPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAbhibus {

	public static void main(String[] args) throws InterruptedException 
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\QSpiders\\Softwares\\BasicSelenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//label[text()='Date of Journey']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='8']")).click();

	}

}
