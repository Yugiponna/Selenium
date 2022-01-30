package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert1 {
	public static void main (String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\gui\\Desktop\\yugi\\DemoProject\\yuFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@aria-expanded='true']")).click();
	
	
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
	String e=driver.switchTo().alert().getText();
	System.out.print(e);
	driver.switchTo().alert().accept();
	
	
}
}



