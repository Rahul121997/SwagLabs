package BasePKG;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {


	public static WebDriver driver;

	public static WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	public static JavascriptExecutor js=(JavascriptExecutor)driver;

	public void MainRun()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public String RandomEmail(String email)
	{
		Random rd=new Random(10000);
		String Email=rd.nextInt()+email;
		return Email;
		
	}
	public void Closedriver()
	{
		driver.close();
	}
	



}
