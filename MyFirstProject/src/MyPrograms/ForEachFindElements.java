package MyPrograms;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEachFindElements 
{
public static void main(String[] args) {
		
		String key = "webdriver.chrome.driver";
		String value = "D:\\QSpiders\\Softwares\\BasicSelenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println(size);
		for(WebElement ele:links)
		{
			String text = ele.getText();
			System.out.println(text);
		}
}
}
