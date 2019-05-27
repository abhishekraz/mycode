package genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class samplelistener implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
	}
	@Override
	public void onStart(ITestContext arg0) {
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	}
	@Override
	public void onTestFailure(ITestResult t) {
		String s=t.getMethod().getMethodName();
		EventFiringWebDriver e=new EventFiringWebDriver(baseclass.d);
		File scr=e.getScreenshotAs(OutputType.FILE);
		File dst=new File("D:\\EclipseWorkSpace\\actitimepROJECT\\screenshot\\"+s+".png");
		try {
			FileUtils.copyFile(scr, dst);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	@Override
	public void onTestSkipped(ITestResult arg0) {
	}
	@Override
	public void onTestStart(ITestResult arg0) {
	}
	@Override
	public void onTestSuccess(ITestResult arg0) {
	}
	
}
