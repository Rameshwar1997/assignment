import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScroll {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		System.out.println("browser lanching");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		Screenshotsave.screenShot(driver, "1st");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele= driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));
		js.executeScript("argument[0].scrollIntoView()",ele);
		Screenshotsave.screenShot(driver,"2nd");
		Thread.sleep(3000);
		ele.click();
		Screenshotsave.screenShot(driver, "3rd");
		
}
}