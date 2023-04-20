package MyPrograms;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\QSpiders\\Softwares\\BasicSelenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parent_id = driver.getWindowHandle();
		System.out.println(parent_id);
		Set<String> allids = driver.getWindowHandles();
		int count = allids.size();
		System.out.println(count);
		for(String id:allids)
		{
			System.out.println(id);
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
		}
	}
}
