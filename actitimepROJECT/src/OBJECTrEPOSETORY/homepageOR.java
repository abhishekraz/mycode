package OBJECTrEPOSETORY;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepageOR {
	@FindBy(xpath="//a[text()='Time-Track']")
	WebElement timeandtrackbtn;
	
	@FindBy(xpath="//span[contains(text(),'Projects & Tasks')]")
	WebElement projectandtasks;
	
	@FindBy(xpath="//a[text()='Users']")
	WebElement usersbtn;
	
	public void movetotimetrack(){
		timeandtrackbtn.click();
	}
	public void moveTOprojectandtasks(){
		projectandtasks.click();
	}
	public void moveTOusers(){
		usersbtn.click();
	}
	
	
	
	
}
