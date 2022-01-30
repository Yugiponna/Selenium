package yugi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFrames {

	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://krninformatix.com/frames/frames.html");
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		d.switchTo().frame(1);
		d.findElement(By.name("name1")).sendKeys("Yugandhar");
		d.switchTo().parentFrame();
		d.switchTo().frame("secondframe");
		d.findElement(By.name("rep")).click();
		d.switchTo().defaultContent();
		WebElement frm=d.findElement(By.xpath("//frame[@src='third.html']"));
		d.switchTo().frame(frm);
		d.findElement(By.name("check")).click();
		
		
	}

}
