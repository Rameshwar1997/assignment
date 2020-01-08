package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipcartHome {
 @FindBy(xpath="//input[@type=\"text\"]")
 private WebElement search;
 @FindBy(xpath="//button[@type=\"submit\"]")
 private WebElement button;
 public FlipcartHome(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 public void searchTxt(String txt)
 {
	 search.sendKeys(txt);
 }
 public void clickb()
 {
	 button.click();
 }
}
