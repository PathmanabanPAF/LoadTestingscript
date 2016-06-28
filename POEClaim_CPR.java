package com.paf.scripts;


import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import com.paf.wrappermethods.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.paf.wrappermethods.*;

public class POEClaim_CPR {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws WriteException 
	 * @throws RowsExceededException 
	 * @throws InterruptedException 
	 */
@SuppressWarnings("null")
@Test()
public void test() throws IOException, RowsExceededException, WriteException, InterruptedException
{
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
	    //WebDriver driver;
	
		//System.setProperty("webdriver.ie.driver", "J:\\IEDriverServer.exe");
		//driver=new InternetExplorerDriver();

		//System.setProperty("webdriver.chrome.driver","S:\\PEGA\\PAF_QA\\Automation\\PAF\\PAF_Workspace\\Driver\\chromedriver.exe");
		//driver=new ChromeDriver();
		
		//driver1=new ChromeDriver();
		
		test_one(driver);
	    //launch_app(driver);
	   	//Create_newapp_step1(driver);
		Find_Application(driver);
		Submit_POE(driver);
		upload_file(driver);
		signature(driver);
		close_driver(driver);

}

public void test_one(WebDriver driver) throws RowsExceededException, WriteException, IOException, InterruptedException
{
try {
	Wrappermethods wM = new Wrappermethods(driver);
	wM.launchApp("https://copayuat.copays.org/provider-login");
	
	//wM.clicklink("Provider Login");
	wM.setvalueByname("userid", "portaltest195@patientadvocate.org");
	wM.setvalueByname("password", "Pathan123!");
	
	wM.clickByXpath("//input[@value='Login']");
	Thread.sleep(6000);
	System.out.println("Successfully Logged in");
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
	System.out.println("Problem in logging");
}


}


public void Find_Application(WebDriver driver)
{
	try {
		//SubmissionStatusIfr
		WebElement frame = driver.findElement(By.id("mainform"));		
		driver.switchTo().frame(frame);
		WebElement frame1 = driver.findElement(By.id("BeaconIfr"));		
		driver.switchTo().frame(frame1);
	
		Wrappermethods wM = new Wrappermethods(driver);
		wM.clickByXpath("//tr[@id='$PPatientsEmbed$ppxResults$l1']/td/a");
		Thread.sleep(2000);
		wM.clickByXpath("//div/div/table/tbody/tr/td/div/table/tbody/tr/td/div/div/div[2]/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td/a");
		Thread.sleep(2000);
		wM.clickByXpath("//a[contains(text(),'Submit an Expenditure')]"); 
		Thread.sleep(2000);
		System.out.println("Application found successfully");
		 
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Problem in finding Application");
	}
     
     
}

public void Submit_POE(WebDriver driver)
{
	  try {
		  //BeaconIfr
		    //WebElement frame1 = driver.findElement(By.id("BeaconIfr"));		
			//driver.switchTo().frame(frame1);
		
			WebElement frame2 = driver.findElement(By.id("PR_SubmissionStatusIfr"));		
			driver.switchTo().frame(frame2);
             
			Wrappermethods wM = new Wrappermethods(driver);
			driver.findElement(By.xpath("//div[2]/table/tbody/tr/td/div/div/div[2]/table/tbody/tr/td/div/table/tbody/tr/td[2]/nobr/a")).click();
			Thread.sleep(2000);
	        driver.findElement(By.xpath("//span/input")).sendKeys("2/12/2016");
	    	Thread.sleep(2000);
	        driver.findElement(By.xpath("//td[8]/nobr/span/input")).sendKeys("2/12/2016");
	    	Thread.sleep(2000);
	        driver.findElement(By.xpath("//nobr/div/table/tbody/tr/td/input")).sendKeys("F1234");
	    	Thread.sleep(6000);
	        //driver.findElement(By.xpath("//body[@id='yui-gen0']/div/div/div/span")).click();
	    	//Thread.sleep(2000);
	    	driver.findElement(By.xpath("//tr[2]/td[8]/nobr/span/input")).sendKeys(Keys.ENTER);
	    	Thread.sleep(2000);
	        driver.findElement(By.xpath("//tr[2]/td[8]/nobr/span/input")).sendKeys("1000");
	    	Thread.sleep(4000);
	        driver.findElement(By.id("submitButton")).click();
	    	Thread.sleep(2000);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Problem in POE submission");
	}
}

public void upload_file(WebDriver driver)
{

	try {
		 Thread.sleep(5000);
		  driver.findElement(By.id("$PpyWorkAttach$ppxAttachName")).click();
		  Thread.sleep(5000);
		  Runtime.getRuntime().exec("S:\\PEGA\\PAF_QA\\Automation\\PAF\\PAF_Workspace\\PAF_Library\\fileupload.exe");
		  Thread.sleep(8000);
		  //driver.findElement(By.id("Upload Document")).click();
		  Wrappermethods wM = new Wrappermethods(driver);
		  wM.clickbyid("Upload Document");
		  Thread.sleep(5000);
		  //driver.findElement(By.xpath("//nobr/button")).click();
		  wM.clickbyid("submitButton");
		  System.out.println("Step8 completed successfully");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Probelm in step8");
	}
	
}


public void signature(WebDriver driver)
{
	try {
		driver.findElement(By.id("Esign")).sendKeys("Testpatient");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//nobr/button")).click();
		Thread.sleep(5000);
		System.out.println("POE Raised successfully");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Problem in signature");
	}
	
}

public void close_driver(WebDriver driver) throws InterruptedException, RowsExceededException, WriteException, IOException
{	Wrappermethods wM = new Wrappermethods(driver);
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//a[contains(@href, 'https://qacvs.copays.org/lls-beacon-portal/?logout=Provider')]")).click();
	wM.closeApp();
}





}

