package yugi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OnloadPopup {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:manager@the-internet.herokuapp.com/digest_auth");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
