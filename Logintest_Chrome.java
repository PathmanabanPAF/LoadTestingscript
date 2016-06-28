package com.paf.scripts;


import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import com.paf.wrappermethods.*;

import org.openqa.selenium.By;
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

public class Logintest_Chrome {

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
	    WebDriver driver1;
		//System.setProperty("webdriver.ie.driver", "J:\\IEDriverServer.exe");
		//driver=new InternetExplorerDriver();

		//System.setProperty("webdriver.chrome.driver","S:\\PEGA\\PAF_QA\\Automation\\PAF\\PAF_Workspace\\Driver\\chromedriver.exe");
		//driver=new ChromeDriver();
		
		//driver1=new ChromeDriver();
		
		test_one(driver);
	    launch_app(driver);
	   	Create_newapp_step1(driver);
	   	App_step1(driver);
	   	step2(driver);
	 	step3(driver);
	 	step4(driver);
	 	step5(driver);
	 	step6(driver);
	 	step7(driver);
		step8(driver);
		close_driver(driver);
		   
	

}

public void test_one(WebDriver driver) throws RowsExceededException, WriteException, IOException, InterruptedException
{
try {
	Wrappermethods wM = new Wrappermethods(driver);
	wM.launchApp("https://qacvs.copays.org/");
	
	wM.clicklink("Provider Login");
	wM.setvalueById("userid", "qaprovider@yahoo.com");
	wM.setvalueById("password", "Pathan123!");
	
	wM.clickByXpath("//input[@value='Login']");
	Thread.sleep(6000);
	
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
	System.out.println("Problem in URL Launch");
}


}

public void launch_app(WebDriver driver) throws RowsExceededException, WriteException, IOException
{
	try {
		Wrappermethods wM = new Wrappermethods(driver);
		
		/*FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(60, TimeUnit.SECONDS)
		        .pollingEvery(5, TimeUnit.SECONDS)
		        .ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));*/
		//driver.findElement(By.xpath("//button[@type='button']")).click();
	
		WebElement frame = driver.findElement(By.id("LLSIfr"));		
		driver.switchTo().frame(frame);
		wM.clickByXpath("//button");
		driver.switchTo().defaultContent();
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Problem in launching Application");
		
	}
	
	
	
}


public void Create_newapp_step1(WebDriver driver)
{
	try {
		
	
		WebElement frame1 = driver.findElement(By.id("LLSIfr"));		
		driver.switchTo().frame(frame1);
		WebElement frame2 = driver.findElement(By.id("PR_SubmissionStatusIfr"));		
		driver.switchTo().frame(frame2);
		Wrappermethods wM = new Wrappermethods(driver);
		 WebElement utype= driver.findElement(By.id("FundName"));
		 Select d1=new Select(utype);
		 d1.selectByIndex(1);
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.id("FamilySize")).sendKeys("1");
		 driver.findElement(By.id("ReportedIncome")).sendKeys("12000");
		 driver.findElement(By.id("Answerstrue")).click();
		 driver.findElement(By.xpath("//tr[3]/td/div/table/tbody/tr/td[3]/nobr/input")).click();
		 driver.findElement(By.id("AddressZipCode")).sendKeys("07470");
		 driver.findElement(By.id("submitButton")).click();
		 
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Problem in selectig Fundname");
	}
     
     
}

public void App_step1(WebDriver driver)
{
	  try {
		String alphabet= "abcdefghijklmnopqrstuvwxyz";
		  String s = "";
		  Random random = new Random();
		  int randomLen = 1+random.nextInt(9);
		  for (int i = 0; i < randomLen; i++) {
		      char c = alphabet.charAt(random.nextInt(26));
		      s+=c;
		  }
		  Wrappermethods wM = new Wrappermethods(driver);
			/*WebElement frame1 = driver.findElement(By.id("LLSIfr"));		
		driver.switchTo().frame(frame1);
		WebElement frame2 = driver.findElement(By.id("PR_SubmissionStatusIfr"));		
		driver.switchTo().frame(frame2);*/
		  System.out.println(s);
		 driver.findElement(By.id("PatientFirstName")).sendKeys("Test"+s);
		 driver.findElement(By.id("PatientLastName")).sendKeys("AutomationApriltwonine");
		 driver.findElement(By.xpath("//input[@id='cal$PpyWorkPage$pPatient$pPatientDateOfBirthField']")).sendKeys("2/2/1965");
		 Thread.sleep(3000);
		 WebElement utype4= driver.findElement(By.id("PatientVeteran"));
		 Select d5=new Select(utype4);
		 d5.selectByIndex(1);
		 Thread.sleep(5000);
		 long timeSeed = System.nanoTime(); // to get the current date time value

	        double randSeed = Math.random() * 1000; // random number generation

	        long midSeed = (long) (timeSeed * randSeed); // mixing up the time and
	                                                        // rand number.

	                                                        // variable timeSeed
	                                                        // will be unique


	                                                       // variable rand will 
	                                                       // ensure no relation 
	                                                      // between the numbers

	        String ss = midSeed + "";
	        String subStr = ss.substring(0, 9);

	        int finalSeed = Integer.parseInt(subStr);    // integer value

	        System.out.println(finalSeed);
	        
		 driver.findElement(By.id("PatientSSN")).sendKeys(""+finalSeed+"");
		 WebElement utype= driver.findElement(By.id("PatientEthnicity"));
		 Select d1=new Select(utype);
		 d1.selectByIndex(1);
		 Thread.sleep(5000);
		 WebElement utype1= driver.findElement(By.id("GenderSelect"));
		 Select d2=new Select(utype1);
		 d2.selectByIndex(2);
		 Thread.sleep(5000);
		 WebElement utype2= driver.findElement(By.id("PatientMaritalStatus"));
		 Select d3=new Select(utype2);
		 d3.selectByIndex(2);
		 Thread.sleep(5000);
		 WebElement utype3= driver.findElement(By.id("PatientEmpStatus"));
		 Select d4=new Select(utype3);
		 d4.selectByIndex(2);
		 Thread.sleep(5000);
		 //Click Tab2
		 driver.findElement(By.xpath("//li[2]/a/span/span/label")).click();
		 
		 WebElement utype5= driver.findElement(By.id("TelephoneNbrType"));
		 Select d6=new Select(utype5);
		 d6.selectByIndex(1);
		 driver.findElement(By.id("TelephoneNbr")).sendKeys("2018877025");
		 WebElement utype6= driver.findElement(By.id("AddressTypes"));
		 Select d7=new Select(utype6);
		 d7.selectByIndex(1);
		 
		 Thread.sleep(5000);
		 driver.findElement(By.id("AddressLine1")).sendKeys("test");
		 Thread.sleep(5000);
		 driver.findElement(By.id("AddressCity")).sendKeys("test");
		 Thread.sleep(5000);
		 WebElement utype7= driver.findElement(By.id("AddressState"));
		 Select d8=new Select(utype7);
		 d8.selectByIndex(10);
		 Thread.sleep(5000);
		 //Click tab-3
		 
		 driver.findElement(By.xpath("//li[3]/a/span/span/label")).click();
		 Thread.sleep(3000);
		 WebElement utype8= driver.findElement(By.id("ReferredSource"));
		 Select d9=new Select(utype8);
		 d9.selectByIndex(2);
		 Thread.sleep(4000);
		 wM.clickByXpath("//button");
		 //driver.findElement(By.xpath("//button")).click();
		 
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Problem in Patient creation");
	}
}

public void close_driver(WebDriver driver) throws InterruptedException, RowsExceededException, WriteException, IOException
{	Wrappermethods wM = new Wrappermethods(driver);
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//a[contains(@href, 'https://qacvs.copays.org/lls-beacon-portal/?logout=Provider')]")).click();
	wM.closeApp();
}


public void step2(WebDriver driver)
{
	try {
		driver.findElement(By.xpath("//td[9]/nobr/button")).click();
		System.out.println("Step2 completed successfully");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Probelm in step2");
	}
	
}


public void step3(WebDriver driver)
{
	try {
		 Thread.sleep(5000);
		 WebElement utype5= driver.findElement(By.id("PatientSpeakBehalf"));
		 Select d6=new Select(utype5);
		 d6.selectByIndex(1);
		 Thread.sleep(5000);
	   	 driver.findElement(By.xpath("//table[@id='HarnessFooter']/tbody/tr/td[2]/table/tbody/tr/td[9]/nobr/button")).click();
		 System.out.println("Step3 completed successfully");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Probelm in step3");
	}
	
}





public void step4(WebDriver driver)
{
	try {
		 Thread.sleep(5000);
		 WebElement utype5= driver.findElement(By.id("PrimaryInsuraceCarrier"));
		 Select d6=new Select(utype5);
		 d6.selectByIndex(2);
		 Thread.sleep(5000);
		 WebElement utype3= driver.findElement(By.id("InsuranceType"));
		 Select d4=new Select(utype3);
		 d4.selectByIndex(1);
		 Thread.sleep(5000);
		 driver.findElement(By.id("PolicyIDNumber")).sendKeys("Policy1234");
		 WebElement utype4= driver.findElement(By.id("SubscriberRelationToPatient"));
		 Select d5=new Select(utype4);
		 d5.selectByIndex(4);
		 Thread.sleep(5000);
		 WebElement utype15= driver.findElement(By.id("PlanType"));
		 Select d16=new Select(utype15);
		 d16.selectByIndex(2);
		 Thread.sleep(5000);
		 driver.findElement(By.id("SubscriberName")).sendKeys("Testing");
		 WebElement utype6= driver.findElement(By.id("CoverOutpatientPrescription"));
		 Select d7=new Select(utype6);
		 d7.selectByIndex(1);
		 Thread.sleep(5000);
		 WebElement utype7= driver.findElement(By.id("CoverPharmacyProducts"));
		 Select d8=new Select(utype7);
		 d8.selectByIndex(1);
		 Thread.sleep(5000);
		 WebElement utype8= driver.findElement(By.id("HasMedicareD"));
		 Select d9=new Select(utype8);
		 d9.selectByIndex(1);
		 Thread.sleep(5000);
		 WebElement utype9= driver.findElement(By.id("PreviouslyInsured"));
		 Select d10=new Select(utype9);
		 d10.selectByIndex(1);
		 Thread.sleep(5000);
		 WebElement utype10= driver.findElement(By.id("UninsuredPrior"));
		 Select d11=new Select(utype10);
		 d11.selectByIndex(1);
		 Thread.sleep(5000);
		 WebElement utype11= driver.findElement(By.id("HasSecondaryInsurance"));
		 Select d12=new Select(utype11);
		 d12.selectByIndex(1);
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//table[@id='HarnessFooter']/tbody/tr/td[2]/table/tbody/tr/td[9]/nobr/button")).click();
		 Thread.sleep(5000);
		 System.out.println("Step4 completed successfully");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Probelm in step4");
	}
	
}

public void step5(WebDriver driver)
{
	try {
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//td/a")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//table[@id='HarnessFooter']/tbody/tr/td[2]/table/tbody/tr/td[9]/nobr/button")).click();
		 Thread.sleep(3000);
		 System.out.println("Step5 completed successfully");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Probelm in step5");
	}
	
}

public void step6(WebDriver driver)
{
	try {
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//nobr/table/tbody/tr/td/input")).sendKeys("test");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@name='$PpyWorkPage$pDateOfDiagnosis']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='$PpyWorkPage$pDateOfDiagnosis']")).sendKeys("3/12/2016");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//table[@id='HarnessFooter']/tbody/tr/td[2]/table/tbody/tr/td[9]/nobr/button")).click();
		 System.out.println("Step6 completed successfully");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Probelm in step6");
	}
	
}

public void step7(WebDriver driver)
{
	try {
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@id='RULE_KEY']/table/tbody/tr[2]/td/nobr/button")).click();
		 System.out.println("Step7 completed successfully");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Probelm in step7");
	}
	
}


public void step8(WebDriver driver)
{
	try {
		 Thread.sleep(5000);
		  driver.findElement(By.id("$PpyWorkAttach$ppxAttachName")).click();
		  Thread.sleep(5000);
		  Runtime.getRuntime().exec("S:\\PEGA\\PAF_QA\\Automation\\PAF\\PAF_Workspace\\PAF_Library\\fileupload.exe");
		  Thread.sleep(6000);
		  //driver.findElement(By.id("Upload Document")).click();
		  Wrappermethods wM = new Wrappermethods(driver);
		  wM.clickbyid("Upload Document");
		  Thread.sleep(5000);
		  //driver.findElement(By.xpath("//nobr/button")).click();
		  wM.clickByXpath("//nobr/button");
		  System.out.println("Step8 completed successfully");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Probelm in step8");
	}
	
}



public void test_two(WebDriver driver) throws RowsExceededException, WriteException, IOException, InterruptedException
{
Wrappermethods wM = new Wrappermethods(driver);
wM.launchApp("https://uatcvs.copays.org");

wM.clicklink("Provider Login");
wM.setvalueById("userid", "paftester5@yahoo.com");
wM.setvalueById("password", "Pathan123!");

wM.clickByXpath("//input[@value='Login']");

Thread.sleep(5000);
wM.clicklink("Logout");
wM.closeApp();
}



}

