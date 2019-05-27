package genericlib;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import OBJECTrEPOSETORY.loginOR;
import OBJECTrEPOSETORY.logoutOR;

@Listeners(genericlib.samplelistener.class)
public class baseclass {
	public static WebDriver d;
	public static excelLib el = new excelLib();

	@BeforeClass
	public void lunchbrowser() {
		d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.manage().window().maximize();
	}

	@BeforeMethod
	public void loginApplication() {
		// d.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		d.get(constants.url);
		loginOR lo = PageFactory.initElements(d, loginOR.class);
		lo.login();
	}

	@AfterMethod
	public void logoutApplication() {
		logoutOR log = PageFactory.initElements(d, logoutOR.class);
		log.logout();
	}

	@AfterClass
	public void Closebrowser() {
		d.close();
	}
}
