package PageBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageClass {
	
	
	public static WebDriver  driver;
	public static WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public void OpenPage(String URL)
	{
		driver.get(URL);
	}
	public void TearDown()
	{
		driver.close();
		driver.quit();
	}
}
