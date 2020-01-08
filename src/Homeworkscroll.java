import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homeworkscroll {
	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		System.out.println("browser lanching");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("thanos",Keys.ENTER);
		WebElement next= driver.findElement(By.xpath("//canvas[@jsname=\"wvK4k\"]"));
		js.executeScript("arguments[0].scrollIntoView()",next);
		next.click();
		Thread.sleep(100000);
		
}
}