package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gui\\Desktop\\yugi\\DemoProject\\yuFolder\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	
		WebElement source=d.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement target=d.findElement(By.xpath("//div[@id='block-3']"));

		Actions a=new Actions(d);
		a.dragAndDrop(source, target).perform();

}}
