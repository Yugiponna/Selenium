package yugi;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTab {
	public static void main (String[] args) throws InterruptedException {
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.air.irctc.co.in");
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//div[@class='Nav-icons Package']")).click();
		
		Set<String> w=d.getWindowHandles();
		Iterator<String>it=w.iterator();
		String P1=it.next();
		String P2=it.next();
		
		System.out.println(P1);
		System.out.println(P2);
		
		d.switchTo().window(P2);
		
		
		d.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//button[@class='close btn btn-radius-none btn-yellow btn-shadow'])[2]")).click();
		Thread.sleep(3000);
		d.close();
		d.switchTo().window(P1);
		d.findElement(By.xpath("//input[@id='stationFrom']")).sendKeys("Bengaluru");
		
		
		
	}

}
