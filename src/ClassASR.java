import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassASR 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		int count=0;
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		System.out.println("browser lanching");
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
	WebElement r = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	
	r.sendKeys("rings",Keys.ENTER);
	Thread.sleep(4000);
	List<WebElement> ele = driver.findElements(By.xpath("//img[@class=\"hc img-responsive center-block\"]"));
	for(WebElement els: ele)
	{
		count++;
	}
		System.out.println(count);

}
}