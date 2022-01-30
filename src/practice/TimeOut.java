package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TimeOut {

	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement source=d.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
		WebElement target=d.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
		Actions a=new Actions(d);
		a.dragAndDrop(source, target).perform();
	

	}

}
