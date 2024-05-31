package BasePKG;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {


	public static WebDriver driver;

	public static WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	public static JavascriptExecutor js;
	
	
	ExtentSparkReporter spark = new ExtentSparkReporter("user/build/name/");
	ExtentReports extent = new ExtentReports();


	public void MainRun()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	public String RandomEmail(String Unique)
	{
		Random rd=new Random();
		String Email=rd.nextInt(10000)+Unique;
		return Email;
		
	}
	public void JS(String script)
	{
		String src=script;
		js=(JavascriptExecutor)driver;
		js.executeScript(src, " ");
		
	}
	
	public void Acts(WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).click().perform();
		
	}
	
	
	public void Closedriver()
	{
		driver.close();
	}
	



}
