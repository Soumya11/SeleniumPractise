package MyPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation 
{ 
public static void main(String[] args) {
		
		String key = "webdriver.chrome.driver";
		String value = "D:\\QSpiders\\Softwares\\BasicSelenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		WebElement ele = driver.findElement(By.id("pass"));
		Point loc=ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		System.out.println(x);
		System.out.println(y);

}
}
