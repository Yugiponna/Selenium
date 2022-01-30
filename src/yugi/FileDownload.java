package yugi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {

	public static void main(String[] args) {
		FirefoxProfile p=new FirefoxProfile();
		p.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		p.setPreference("browser.download.folderList", 0);
		p.setPreference("browser.download.dir", "C:\\yugi1");
		
		
		
		
		WebDriver d=new FirefoxDriver(p);
		d.manage().window().maximize();
		d.get("https://krninformatix.com/download.php");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//a[@href='https://goo.gl/uJJ5Sc']")).click();

	}

}
