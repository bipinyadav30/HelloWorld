package org.testscripts;

import org.vtiger.elementpages.LoginPageElement;
import org.vtiger.webutils.Webutils;

public class TestScriptsOpencart {

	public static void main(String[] args) {
		Webutils wt=new Webutils();
		wt.launchBrowser("http://localhost:8888/index.php?action=Login&module=Users");
		wt.fullSCreen();
		wt.minimize();
		LoginPageElement LPE=	new LoginPageElement(wt);
		LPE.enterTextInUsername("admin");
		LPE.enterTextInPassword("admin");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LPE.clickOnSignIn();
		
		
	}
	
	
	
	
	
	
	
	
}
