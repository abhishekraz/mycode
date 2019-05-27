package OBJECTrEPOSETORY;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class logoutOR {
	@FindBy(className="logoutImg")
	WebElement logoutbtn;
	
	public void logout(){
		logoutbtn.click();
	}

}
