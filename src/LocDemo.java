import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocDemo
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
			Point loc = email.getLocation();
			System.out.println(loc);
			int x =loc.getX();
			int y =loc.getY();
			System.out.println(x+" "+y);
			
	

}
};

