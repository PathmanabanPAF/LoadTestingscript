package com.paf.scripts;


import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import com.paf.wrappermethods.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class Application_Intake {

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
	  	/*WebDriver driver1;
		System.setProperty("webdriver.ie.driver", "J:\\IEDriverServer.exe");
		driver1 = new InternetExplorerDriver(); 
		Thread.sleep(3000);
		Wrappermethods wM = new Wrappermethods(driver1);*/
		//wM.launchApp("http://phqsltcllsqa001.patientadvocate.org:8080/prweb/PRServlet/DGUM90lACED74DAWt5QdLQ%5B%5B*/!STANDARD?");
		
		/*driver1.findElement(By.id("txtUserID")).sendKeys("PAF848");
		driver1.findElement(By.id("txtPassword")).sendKeys("rules");
		driver1.findElement(By.id("sub")).click();
		Thread.sleep(4000);
		driver1.findElement(By.className("RunMenuLaunch")).click();
		Thread.sleep(4000);
		driver1.findElement(By.id("ItemMiddle")).click();
		Thread.sleep(4000);
        driver1.close();*/
        
		WebDriver driver = new FirefoxDriver();
		//test_one(driver);
		test_one_loginlls(driver);
		test_one_llsexecutive(driver);
		Application_appdetermination(driver);
		Application_appdetermination_process(driver);
	    //launch_app(driver);
	   	//Create_newapp_step1(driver);
		close_driver(driver);

}

public void test_one_loginlls(WebDriver driver) throws RowsExceededException, WriteException, IOException, InterruptedException
{
try {
	Wrappermethods wM = new Wrappermethods(driver);
	wM.launchApp("http://phqsltcllsqa001.patientadvocate.org:8080/prweb/PRServlet/DGUM90lACED74DAWt5QdLQ%5B%5B*/!STANDARD?");
	
	driver.findElement(By.id("txtUserID")).sendKeys("PAF848");
	driver.findElement(By.id("txtPassword")).sendKeys("rules");
	driver.findElement(By.id("sub")).click();
	Thread.sleep(4000);
	//driver.findElement(By.className("RunMenuLaunch")).click();
	//Thread.sleep(4000);
	//driver.findElement(By.id("ItemMiddle")).click();
	//Thread.sleep(4000);
	//driver.findElement(By.linkText("LLS Executives portal")).click();
	//Thread.sleep(4000);
	
	
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
	//System.out.println("Problem in URL Launch");
}


}

public void test_one_llsexecutive(WebDriver driver) throws RowsExceededException, WriteException, IOException, InterruptedException
{
try {
	
	Wrappermethods wM = new Wrappermethods(driver);
	driver.navigate().to("http://phqsltcllsqa001.patientadvocate.org:8080/prweb/PRServlet/6D19xiVbN0s28dB0k-DJWFCiTJ5DzKZS*/!Developer?pyActivity=RedirectAndRun&ThreadName=OpenPortal&Location=pyActivity%3DData-Portal.ShowSelectedPortal%26portal%3DExecutive_Portal%26Name%3DExecutive_Portal%26developer%3Dfalse&bPurgeTargetThread=true");

	//Thread.sleep(4000);
	
	/*try {
		Runtime.getRuntime().exec("S:\\PEGA\\PAF_QA\\Automation\\PAF\\PAF_Workspace\\PAF_Library\\username_record.exe");
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Problem in entering username and password");
	}*/
    /*WebElement frame1 = driver.findElement(By.id("testiframe"));		
	driver.switchTo().frame(frame1);
	//driver.findElement(By.className("textIn")).click();
	WebElement element1 = driver.findElement(By.id("Tab3"));
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", element1);
	Thread.sleep(7000);
	 WebElement utype3= driver.findElement(By.xpath("//div[@id='RULE_KEY']/table/tbody/tr/td[2]/nobr/select"));
	 Select d4=new Select(utype3);
	 d4.selectByVisibleText("ApplicationDetermination_LLSWB");
	 Thread.sleep(4000);
	 driver.findElement(By.cssSelector("td.tdLeftStyle")).click();*/
	 
} catch (Exception e) {
	// TODO Auto-generated catch block
    e.printStackTrace();
	System.out.println("Problem in LLS url");
}


}

public void Application_appdetermination(WebDriver driver) throws InterruptedException
{
	try {
		WebElement frame1 = driver.findElement(By.id("testiframe"));		
		driver.switchTo().frame(frame1);
		//driver.findElement(By.className("textIn")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[3]/a/span/span/label")).click();
		Thread.sleep(8000);

		driver.findElement(By.id("objWorkBasketSelect")).click();
		Thread.sleep(4000);
		WebElement utype3= driver.findElement(By.id("objWorkBasketSelect"));
		Select d4=new Select(utype3);
		d4.selectByValue("ApplicationDetermination_LLSWB");
		//driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div/table/tbody/tr[2]/td[1]/table[1]/tbody/tr/td/div/div/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td[1]/div/table[2]/tbody/tr[1]/td[1]/div/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[2]/nobr/select")).click();
		//driver.findElement(By.id("objWorkBasketSelect")).click();
		
	
		 Thread.sleep(4000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Problem in Application determination handling");
	}
}

public void Application_appdetermination_process(WebDriver driver) throws InterruptedException
{
	try {
		driver.findElement(By.xpath("//div/div/div/div/table/tbody/tr[2]/td/span")).click();
	
		 Thread.sleep(4000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Problem in Application determination Process handling");
	}
}


public void close_driver(WebDriver driver) throws InterruptedException, RowsExceededException, WriteException, IOException
{	try {
	Wrappermethods wM = new Wrappermethods(driver);
		/*driver.findElement(By.xpath("//td[6]/nobr/div/div/span/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//tr[5]/td[2]")).click();
		Thread.sleep(4000);
		Alert a=driver.switchTo().alert();
		a.accept();*/
		//driver.findElement(By.xpath("//a[contains(@href, 'https://qacvs.copays.org/lls-beacon-portal/?logout=Provider')]")).click();
		wM.closeApp();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("Problem in LLS Logout");
}
}




}

