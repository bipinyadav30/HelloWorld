package org.vtiger.webutils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webutils {
	
public ChromeDriver driver;
 

	
	public void launchBrowser(String webSite) {
		  WebDriverManager.chromedriver().setup();
			Webutils wu=new Webutils();
		  driver=new ChromeDriver();
	     driver.get(webSite);
	}
	
	public void click(WebElement we) {
		we.click();
	}
	
	public void sendKeys(WebElement we,String sendValue) {
		we.sendKeys(sendValue);
	}
	 public void fullSCreen() {
		 driver.manage().window().maximize();
	 }
	 
	 public void minimize() {
		 driver.manage().window().minimize();
	 }
	 
}
