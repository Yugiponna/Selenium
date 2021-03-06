package yugi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertConform {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/selenium/testing.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		Thread.sleep(3000);
		String conf=driver.switchTo().alert().getText();
		System.out.print(conf);
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
	}

}
