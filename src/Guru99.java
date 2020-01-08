import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		System.out.println("browser lanching");
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(3000);
		//driver.findElement(By.id("clsBbtn")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@type=\"file\"]")).click();
		//driver.findElement(By.id("uploadfile_0")).click();
		WebElement upload=driver.findElement(By.id("file_wraper0"));
		upload.click();
		Runtime rt = Runtime.getRuntime();
		rt.exec("‪E:\\boxx.exe");
		
		
}
}