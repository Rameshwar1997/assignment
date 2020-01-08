import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
	static WebDriver driver;
	@BeforeMethod
	public void beforeM()
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		 driver = new ChromeDriver();
		System.out.println("browser lanching");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
@Test
public void demo()
{
	driver.findElement(By.xpath("//input[@type=\'text\']")).sendKeys("java",Keys.ENTER);
	Reporter.log("Demo",true);
}
@Test
public void demo1()
{
	driver.findElement(By.xpath("//input[@type=\'text\']")).sendKeys("selenium",Keys.ENTER);
	Reporter.log("Demo",true);
}
@AfterMethod
public void afterM()
{
	driver.close();
}

}

