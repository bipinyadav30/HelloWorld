package org.vtiger.elementpages;

import org.vtiger.webutils.Webutils;

public class LoginPageElement extends LoginPageElementOR{

	private Webutils wt;
	public LoginPageElement(Webutils wu ) {
		super(wu);
		this.wt=wu;
	}

	public void enterTextInUsername(String sendValue) {
  wt.sendKeys(userNameTB, sendValue);
	}
	public void enterTextInPassword(String sendValue) {
wt.sendKeys(passwordTB,  sendValue);
	}
	public void clickOnSignIn() {
wt.click(signinBT);
	}






}
