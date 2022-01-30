package yugi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gui\\Desktop\\yugi\\DemoProject\\yuFolder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement un=driver.findElement(By.id("email"));
		un.sendKeys("yugandharponna@gmail.com");
		WebElement pw=driver.findElement(By.name("pass"));
		pw.sendKeys("yugi2794");
		WebElement loginBtn=driver.findElement(By.name("login"));
		loginBtn.click();
		
	}

}
