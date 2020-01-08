import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumsearchjava {
	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		System.out.println("browser lanching");
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
		Thread.sleep(3000);
	  WebElement box = driver.findElement(By.xpath("//input[@type='text']"));
	  box.sendKeys("test",Keys.ENTER);
	  driver.navigate().back();
	  box.sendKeys("java",Keys.ENTER);
}
}                             