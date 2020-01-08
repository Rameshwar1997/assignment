import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshotsave {
public static void screenShot(WebDriver driver,String name) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File Screenpic = ts.getScreenshotAs(OutputType.FILE);
	File Savepic = new File(".\\Screen shot\\" + name +".png");
	Files.copy(Screenpic, Savepic);


}
}
