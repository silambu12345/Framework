package com.agro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Login
{
private static WebElement branchselection;
//private static WebElement username;
//private static WebElement password;

public void login()
{
	System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.24.0-win32\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://192.168.1.190:9003/agroweb/login_execute");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	branchselection = driver.findElement(By.id("branch"));
	Select slt = new Select(branchselection);
	slt.selectByIndex(1);
	driver.findElement(By.id("userName")).sendKeys("silambu");
	driver.findElement(By.id("password")).sendKeys("111111111");
	driver.findElement(By.xpath("//ins[@class='iCheck-helper']")).click();
	//driver.findElement(By.className("icheckbox_minimal-grey")).click();
	driver.findElement(By.xpath("//button[@id='btnLogin']"));
	
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Login lg = new Login();
		lg.login();

	}

}
