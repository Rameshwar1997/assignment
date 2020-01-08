import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class GetAttribute
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	System.out.println("browser lanching");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement email = driver.findElement(By.id("email"));
   String value = email.getAttribute("data-testid");
	System.out.println(value);
}
}