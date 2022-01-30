package yugi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipPop {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	String toolTip=driver.findElement(By.xpath("//img[contains(@src,'s21-fe')]")).getAttribute("title");
		
		System.out.println(toolTip);
		
	}

}
