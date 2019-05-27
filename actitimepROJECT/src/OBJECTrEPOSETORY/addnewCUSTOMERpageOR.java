package OBJECTrEPOSETORY;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addnewCUSTOMERpageOR {
		@FindBy(name="name")
		WebElement custnameTEXT;
		@FindBy(name="description")
		WebElement descriptionTEXT;
		@FindBy(name="createCustomerSubmit")
		WebElement createCustomerSubmitbtn;

		public void custnm_mtd(String name,String des){
			custnameTEXT.sendKeys(name);
			descriptionTEXT.sendKeys(des);
			createCustomerSubmitbtn.click();
		}
}
