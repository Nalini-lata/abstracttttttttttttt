package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPageAutomation {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Admin\\Desktop");
	ChromeDriver driver=	new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	//WebElement drop= driver.findElement(By.cssSelector("select#day"));
	//s.selectByIndex(4);
	//WebElement drop= driver.findElement(By.cssSelector("select#month"));
	//Select s= new Select(drop);
	//s.selectByVisibleText("April");
	
	WebElement drop= driver.findElement(By.cssSelector("select#month"));
	Select s= new Select(drop);
	s.selectByValue("7");

	
	}

}
