package MyPrograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchChrome 
{
	public static void main(String[] args) throws Throwable
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\QSpiders\\Softwares\\BasicSelenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		//Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//Thread.sleep(2000);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}
}
