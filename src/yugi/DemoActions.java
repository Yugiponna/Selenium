package yugi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://krninformatix.com");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	WebElement cs=d.findElement(By.xpath("//span[text()='Courses Offered']"));
	
	Actions a=new Actions(d);
	a.moveToElement(cs).perform();
	Thread.sleep(3000);
	a.contextClick(cs).perform();
	Thread.sleep(3000);
	a.sendKeys(Keys.ARROW_DOWN).perform();
	a.sendKeys(Keys.ENTER).perform();
	Thread.sleep(3000);

	a.sendKeys(Keys.ALT).build();
	a.sendKeys(Keys.SHIFT).build();
	a.sendKeys(Keys.DELETE).perform();
	

	}

}
