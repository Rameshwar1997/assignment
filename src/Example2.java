import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example2 {
	private static final Function ExpectedCondition = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.out.println("browser lanching");
		driver.manage().window().maximize();
		driver.get("https://iqgenie.org/index.php");
		Thread.sleep(3000);
		driver.findElement(By.id("userIcon")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class=\"hollow button alert\"]")).click();
		Thread.sleep(5000);
		//WebDriverWait ww = new WebDriverWait(driver, 10);
		//ww.until(ExpectedCondition.)
		
		
		driver.getTitle();
		
		System.out.println(driver.getTitle());

	}
}