package COM.ATITIME.CREATEnewCust;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.xml.XmlTest;

import OBJECTrEPOSETORY.addnewCUSTOMERpageOR;
import OBJECTrEPOSETORY.projectANDcustomersPageOR;
import OBJECTrEPOSETORY.projectANDtasksPageOR;
import genericlib.baseclass;
import genericlib.constants;

@Listeners(genericlib.samplelistener.class)
public class cust extends baseclass{
	    @Parameters("browser")
		@Test
		public void cu(XmlTest t) throws Throwable{
	    	t.getParameter("browser");
	    	
			String name=el.getdata("Sheet1", 0, 0);
			String des=el.getdata("Sheet1", 0, 1);
			
			projectANDtasksPageOR patp=PageFactory.initElements(d, projectANDtasksPageOR.class);
			
			patp.moveTOprojectandcustomer();
			
			projectANDcustomersPageOR pgg=PageFactory.initElements(d, projectANDcustomersPageOR.class);
			
			pgg.addnwcust_mtd();
			
			addnewCUSTOMERpageOR acp=PageFactory.initElements(d, addnewCUSTOMERpageOR.class);
			
			acp.custnm_mtd(name,des);
			
//			acp.custnm_mtd(constants.name, constants.des);
//			SoftAssert s=new SoftAssert();
//			s.assertEquals('a','b');
//			s.assertAll();
//			assertEquals('a', 'b');
			
		}
}
