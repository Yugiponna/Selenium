package demopack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://krninformatix.com");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TakesScreenshot ts=(TakesScreenshot)d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\gui\\Desktop\\yugi\\DemoProject\\YFolder\\img.jpg");
		FileUtils.copyFile(src, dest);
	}
	

}
