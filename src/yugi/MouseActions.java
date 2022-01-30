package yugi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://krninformatix.com");
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement BR=d.findElement(By.xpath("//span[text()='Branches']"));
		
		Actions a=new Actions(d);
		a.moveToElement(BR).perform();
		//BR.click();
		Thread.sleep(3000);
		WebElement MH=d.findElement(By.xpath("//span[text()='Marathahalli']"));
		a.moveToElement(MH).perform();
		
		Thread.sleep(3000);
		WebElement STM=d.findElement(By.xpath("//a[text()='Selenium-Training-in-Marathahalli']"));
		a.moveToElement(STM).perform();
		Thread.sleep(3000);
		a.contextClick(STM).perform();
		//a.sendKeys(Keys.ARROW_DOWN).perform();
		//a.sendKeys(Keys.ENTER).perform();
		a.sendKeys("T").perform();
	}

}
