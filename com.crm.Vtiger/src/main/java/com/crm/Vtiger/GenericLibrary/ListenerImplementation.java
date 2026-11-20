package com.crm.Vtiger.GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ListenerImplementation extends Baseclass implements ITestListener{
ExtentReports report;
ExtentTest test;
javautility j=new javautility();
	@Override
	public void onTestStart(ITestResult result) {
		String testname = result.getName();
		test=report.createTest(testname);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
String methodname = result.getName();
test.log(Status.PASS, methodname+"test script passed successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		test.log(Status.FAIL,name+"test script failed");
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		javautility j=new javautility();
		String dateandtime = j.getDateAndTime("dd-MM-yyy hh-mm-ss");
		
		File dest = new File("./screenshot/"+name+dateandtime+".png");
		try {
			Files.copy(src, dest);
			test.addScreenCaptureFromPath(dest.getAbsolutePath(),name+"Failure Screenshot");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
		
	
	
			

	@Override
	public void onTestSkipped(ITestResult result) {
	String name = result.getName();
	test.log(Status.SKIP,name+"test script skipped");
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		String dateandtime = j.getDateAndTime("dd-MM-yyy hh-mm-ss");
		ExtentSparkReporter reporter=new ExtentSparkReporter("./ExtentReports/report"+dateandtime+".html");
		reporter.config().setDocumentTitle("Vtiger Organization Report");
		reporter.config().setReportName("Exceution Details");
		reporter.config().setTheme(Theme.STANDARD);
		report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("url", "http://localhost:8888");
		report.setSystemInfo("OS"," windows");
		report.setSystemInfo("Browser", "Edge");
		report.setSystemInfo("Test Engineer", "Ganavi");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
