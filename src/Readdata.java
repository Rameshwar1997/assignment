import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readdata {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException  {
	FileInputStream fis = new FileInputStream("./Data/Book1.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	
 Sheet sh=wb.getSheet("sheet1");
 Row firstrow=sh.getRow(0);
 int rowcount = sh.getPhysicalNumberOfRows();
 for(int i=0;i<rowcount;i++)
 {
	 for(int j=0;j<firstrow.getLastCellNum();j++)
	 {
		 Cell c1=sh.getRow(i).getCell(j);
		 System.out.print(c1);
	 }
	 System.out.println();
 }
	
	String user=sh.getRow(1).getCell(0).toString();
	String pass=sh.getRow(1).getCell(0).toString();
    System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.out.println("browser lanching");
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
     WebElement	email=driver.findElement(By.id("email"));
     email.sendKeys(user);
     WebElement	pass1=driver.findElement(By.id("pass"));
      pass1.sendKeys(pass);

}
}
