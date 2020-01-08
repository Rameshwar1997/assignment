import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimePopup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		System.out.println("browser lanching");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//a[contains(.,Login)]")).click();
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']/div")).click();
		driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
		String text=driver.findElement(By.xpath("//span[contains(.,'© 2019 actiTIME Inc. All rights reserved')]")).getText();
		System.out.println(text);
}
}