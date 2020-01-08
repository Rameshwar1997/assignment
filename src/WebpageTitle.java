import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageTitle
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		System.out.println("browser lanching");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement titleEle = driver.findElement(By.tagName("title"));
		System.out.println("title of WEbpage by Webelement title:"+titleEle.getAttribute("textContent"));
        System.out.println("Title of webpage by getTitle() method:"+driver.getTitle());
}
}