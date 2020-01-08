package Testpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.FlipcartHome;

public class TestFlipcartHome {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		System.out.println("browser lanching");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		FlipcartHome  fh = new FlipcartHome(driver);
		Thread.sleep(3000);
		fh.searchTxt("iphone");
		fh.clickb();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		fh.searchTxt("nike");
		fh.clickb();
}
}