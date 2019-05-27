package OBJECTrEPOSETORY;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class projectANDcustomersPageOR {
		@FindBy(xpath="//input[@value='Add New Customer']")
		WebElement addnewcustbtn;

		public void addnwcust_mtd(){
			addnewcustbtn.click();
		}
}
