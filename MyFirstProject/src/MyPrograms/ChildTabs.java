package MyPrograms;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildTabs {

	public static void main(String[] args) throws Throwable 
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\QSpiders\\Softwares\\BasicSelenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		String parent_Id = driver.getWindowHandle();
		System.out.println(parent_Id);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_HYyiu']")).click();
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[contains(text(),'realme C30')]"));
		int count = ele.size();
		System.out.println(count);
		for(WebElement a:ele)
		{
			a.click();
		}
		Thread.sleep(2000);
		Set<String> allIds = driver.getWindowHandles();
		int count1 = allIds.size();
		System.out.println(count1);
		for(String b:allIds)
		{
			System.out.println(b);
			driver.switchTo().window(b);
			String title = driver.getTitle();
			System.out.println(title);
		}
	}
}
