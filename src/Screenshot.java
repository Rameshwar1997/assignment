import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot
{

	public static void main(String[] args) throws InterruptedException, IOException
		{
			System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			System.out.println("browser lanching");
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File Screenshot = ts.getScreenshotAs(OutputType.FILE);
			File ScreenSave = new File(".\\Screen shot\\flipcart.png");
			Files.copy(Screenshot, ScreenSave);
	

}
}