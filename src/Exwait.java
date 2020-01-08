

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exwait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		System.out.println("browser lanching");
		driver.manage().window().maximize();	
		WebDriverWait ww = new WebDriverWait(driver, 10);
		driver.get("https://www.google.com/");
		WebElement username = driver.findElement(By.name("q"));
		username.sendKeys("java",Keys.ENTER);
		ww.until(ExpectedConditions.titleContains("java"));
		driver.close();

	}
}
