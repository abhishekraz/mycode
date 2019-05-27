package OBJECTrEPOSETORY;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericlib.constants;

public class loginOR {
	@FindBy(name="username")
	WebElement usernametxt;
	
	@FindBy(name="pwd")
	WebElement passwordtxt;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	public void login(){
		usernametxt.sendKeys(constants.username);
		passwordtxt.sendKeys(constants.password);
		loginbtn.click();
	}
	
}
