package MyPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\QSpiders\\Softwares\\BasicSelenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement ele = driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
		WebElement ele2 = driver.findElement(By.xpath("//div[text()='Denmark']"));
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		act.dragAndDrop(ele, ele2).perform();

	}

}
