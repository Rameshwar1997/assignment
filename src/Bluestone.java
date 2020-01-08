import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		System.out.println("browser lanching");
		driver.manage().window().maximize();	
        driver.get("https://www.bluestone.com/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@title=\"Rings\"]")).click();
        driver.findElement(By.xpath("//span[contains(.,'Price')]")).click();
        List<WebElement> ele = driver.findElements(By.xpath("//span[@class=\"prcs-dlh\"]"));
        System.out.println("price element");
        for(WebElement fetch:ele)
        {
        	System.out.println(fetch.getText());
        }
        Thread.sleep(3000);
}
}