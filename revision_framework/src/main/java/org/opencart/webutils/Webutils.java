package org.opencart.webutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webutils {
	

	public static void main(String args []){
		//System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
WebDriverManager.chromedriver().setup();
	Webutils wu=new Webutils();
	wu.launchBrowser();
	}
	
	public void launchBrowser() {
		ChromeDriver driver=new ChromeDriver();
	     driver.get("https://www.youtube.com/");
	}
	
	
	
}
