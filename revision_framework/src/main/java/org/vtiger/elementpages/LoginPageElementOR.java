package org.vtiger.elementpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.vtiger.webutils.Webutils;

public class LoginPageElementOR {

	public LoginPageElementOR(Webutils wu) {
PageFactory.initElements(wu.driver, this);
	}
 
	@FindBy(xpath = "//input[@name='user_name']")
	protected WebElement userNameTB;
	

	@FindBy(xpath = "//input[@name='user_password']")
	protected WebElement passwordTB;
	

	@FindBy(xpath = "//input[@name='Login']")
	protected WebElement signinBT;
	
}
