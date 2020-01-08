import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imwait 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		System.out.println("browser lanching");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com/search?q=gmailsignin&rlz=1C1CHBF_enIN863IN863&oq=gmail&aqs=chrome.0.69i59j69i57j0l4j69i61l2.4181j0j7&sourceid=chrome&ie=UTF-8");
		
		
		
		
	}

}
