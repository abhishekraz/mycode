package OBJECTrEPOSETORY;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class projectANDtasksPageOR {
	@FindBy(xpath="//a[text()='Completed Tasks']")
	WebElement CompletedTasksbtn;
	
	@FindBy(xpath="//a[text()='Projects & Customers']")
	WebElement projectandcustomer;
	
	@FindBy(xpath="//a[text()='Archives']")
	WebElement Archivesbtn;
	
	public void movetoCompletedTasks(){
		CompletedTasksbtn.click();
	}
	public void moveTOprojectandcustomer(){
		projectandcustomer.click();
	}
	public void moveTOArchives(){
		Archivesbtn.click();
	}
}
