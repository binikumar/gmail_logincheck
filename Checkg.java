package selenium_part;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkg {
public static WebDriver driver;
	public static void main(String[] args) {
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/intl/en/mail/help/about.html");
		
		driver.findElement(By.id("gmail-sign-in")).click();
		driver.findElement(By.id("Email")).sendKeys("binjim14@gmail.com");
		driver.findElement(By.id("next")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Passwd")));
		
		
		driver.findElement(By.id("Passwd")).sendKeys("1234");
		driver.findElement(By.id("signIn")).click();
		
	}

}
