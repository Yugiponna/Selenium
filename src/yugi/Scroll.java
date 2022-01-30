package yugi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll {

	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/redmi-9i-sport-metallic-blue-64-gb/p/itmeb95d0b4616cc?pid=MOBG6WQWQZZMGQCU&lid=LSTMOBG6WQWQZZMGQCUR9J4PR&marketplace=FLIPKART&q=mobiles&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=61ff86f9-03b0-4b44-b0ff-89d9b97a6e51.MOBG6WQWQZZMGQCU.SEARCH&ppt=None&ppn=None&ssid=xapvzrkpog0000001643471381536&qH=eb4af0bf07c16429");
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		JavascriptExecutor js= (JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,1000)", "");

	}

}
