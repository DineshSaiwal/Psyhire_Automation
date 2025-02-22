package Organization_Test_scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Base_Class;
import Base_Package.Login;
import Base_Package.Utility_Class;
import Oragnization_Scenarios.Schedule_Psy_Assessment_Page;
 
public class Schedule_Psy_Assessment extends Base_Class{
	
	ExtentTest test;
	
	@Test 
	void Schedule_Psy_Assessment_Validation() throws Exception{
	
		test = extent.createTest("Schedule/Re-schedule Psy-Assessment Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Organization");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		WebDriver driver = Base_Class.getDriver();
		Schedule_Psy_Assessment_Page page= new Schedule_Psy_Assessment_Page(driver);	
		Login.Organization_Login();
		
		Thread.sleep(1000);
		 try {page.Click_on_Jobs_Tab();
		 	test.pass(MarkupHelper.createLabel("Click on Jobs Tab", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Job Tab",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 Thread.sleep(1000);
		 try {page.Click_on_Existing_Job();
		 	test.pass(MarkupHelper.createLabel("Clicked on Existing Job", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Existing Job",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}

		 Thread.sleep(1000);
		 try {page.Open_Candidate_Card();
		 	test.pass(MarkupHelper.createLabel("Clicked on Candidate Card", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Candidate Card",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 Thread.sleep(1000);
		 try {page.Open_Move_to_Stage_Drop_Down();
		 	test.pass(MarkupHelper.createLabel("Clicked on Move to Stage Drop down", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Move to Stage Drop down",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 Thread.sleep(1000);
		 try {page.Select_Psy_Assessment();
		 	test.pass(MarkupHelper.createLabel("Selected Skill Assessment Stage", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Select Skill Assessment Stage",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 
		 Thread.sleep(1000);
		 try {page.Confirm_Move();
		 	test.pass(MarkupHelper.createLabel("Confirmed To Move", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Move",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		
		 try {WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
         	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
         	String Actual_Message = element.getText();
			 if (Actual_Message.contains("Psychometric Assessment is scheduled")) {
				 test.pass(MarkupHelper.createLabel("Psy-Assessment Scheduled Successfully", ExtentColor.GREEN));
				 test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); }
			 else { throw new Exception();}
			 } 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Schedule Psychometric Assessment",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		}


		 Thread.sleep(2000);
		 try {page.Open_Candidate_Card_For_ReSchedule();
		 	test.pass(MarkupHelper.createLabel("Again Clicked on Candidate Card", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Candidate Card",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 Thread.sleep(1000);
		 try {page.Click_On_re_Schedule();
		 	test.pass(MarkupHelper.createLabel("Clicked on Re-schedule Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Re-schedule Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 
		 Thread.sleep(1000);
		 try {page.Click_On_Re_Schedule_Popup();
		 	test.pass(MarkupHelper.createLabel("Clicked On Confirmed Re-Schedule Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click On Re-Schedule Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 
		
		 try {WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
      	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
      	String Actual_Message = element.getText();
			 if (Actual_Message.contains("Psychometric Assessment is re-scheduled")) {
				 test.pass(MarkupHelper.createLabel("Psy-Assessment is Re-scheduled Successfully", ExtentColor.GREEN));
				 test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); }
			 else { throw new Exception();}
			 } 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Re-schedule Psy-Assessment",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		}
		 
		 
		 
		 
		}
	}
