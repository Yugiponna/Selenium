package yugi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public final class ExcelLoginLogout {

	public static void main(String[] args) throws InterruptedException {
		ExcelLibrary exl=new ExcelLibrary();
		
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://demo.actitime.com/login.do");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		int lr=exl.getLastRowNum("Sheet1");
		for(int i=1;i<=lr;i++) {
		String un=exl.getExcelData("Sheet1",i,0);
		String pw=exl.getExcelData("Sheet1",i,1);
		d.findElement(By.id("username")).sendKeys(un);
		d.findElement(By.name("pwd")).sendKeys(pw);
		d.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		d.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
	}

}
}