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
import Oragnization_Scenarios.Schedule_Tech_Interview_Page;
 
public class Schedule_Tech_Interview extends Base_Class{
	
	ExtentTest test;
	
	@Test 
	void Schedule_Tech_Interview_Validation() throws Exception{
	
		test = extent.createTest("Schedule/Re-schedule Tech Interview Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Organization");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		WebDriver driver = Base_Class.getDriver();
		Schedule_Tech_Interview_Page page= new Schedule_Tech_Interview_Page(driver);
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
		 try {page.Select_Technical_Interview();
		 	test.pass(MarkupHelper.createLabel("Selected Tech Interview Stage", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Select Tech Interview Stage",  ExtentColor.RED));
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
		
		 Thread.sleep(1000);
		 try {page.Open_Candidate_Card_For_Schedule();
		 	test.pass(MarkupHelper.createLabel("Opened Candate Card", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Open Card",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		
		 Thread.sleep(1000);
		 try {page.Click_On_Schedule();
		 	test.pass(MarkupHelper.createLabel("Click on Schedule Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Click On Schedule Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 
		 Thread.sleep(1000);
		 try {page.Click_Start_Time();
		 	test.pass(MarkupHelper.createLabel("Click on Start Time Drop Down", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Click On Start Time Drop Down",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 Thread.sleep(1000);
		 try {page.Choose_Start_Time();
		 	test.pass(MarkupHelper.createLabel("Selected Start Time", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Select Start Time",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 Thread.sleep(1000);
		 try {page.Click_End_Time();
		 	test.pass(MarkupHelper.createLabel("Click on End Time Drop Down", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Click On End Time Drop Down",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 Thread.sleep(1000);
		 try {page.Choose_End_Time();
		 	test.pass(MarkupHelper.createLabel("Selected End Time", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Select End Time",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 Thread.sleep(1000);
		 try {page.Click_On_Schedule_Button();
		 	test.pass(MarkupHelper.createLabel("Clicked On Schedule Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Click On Schedule Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 
		 try {WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
         	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
         	String Actual_Message = element.getText();
			 if (Actual_Message.contains("Technical Interview is scheduled")) {
				 test.pass(MarkupHelper.createLabel("Technical Interview Scheduled Successfully", ExtentColor.GREEN));
				 test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); }
			 else { throw new Exception();}
			 } 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Schedule Technical Interview",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		}

		 
		 Thread.sleep(1000);
		 try {page.Open_Candidate_Card_For_Schedule();
		 	test.pass(MarkupHelper.createLabel("Opened Candate Card", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Open Card",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 Thread.sleep(1000);
		 try {page.Click_On_ReSchedule();
		 	test.pass(MarkupHelper.createLabel("Clicked On Re-schedule Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Click On Re-schedule Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 Thread.sleep(1000);
		 try {page.Click_Start_Time();
		 	test.pass(MarkupHelper.createLabel("Click on Start Time Drop Down", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Click On Start Time Drop Down",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 Thread.sleep(1000);
		 try {page.Choose_Start_Time();
		 	test.pass(MarkupHelper.createLabel("Selected Start Time", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Select Start Time",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 Thread.sleep(1000);
		 try {page.Click_End_Time();
		 	test.pass(MarkupHelper.createLabel("Click on End Time Drop Down", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Click On End Time Drop Down",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 Thread.sleep(1000);
		 try {page.Choose_End_Time();
		 	test.pass(MarkupHelper.createLabel("Selected End Time", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Select End Time",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}
		 
		 Thread.sleep(1000);
		 try {page.ConfirmReschedule();
		 	test.pass(MarkupHelper.createLabel("Clicked On Re-schedule Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Click On Re-schedule Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
 				}

		
		 try {WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
      	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
      	String Actual_Message = element.getText();
			 if (Actual_Message.contains("Technical Interview is re-scheduled")) {
				 test.pass(MarkupHelper.createLabel("Psy-Assessment is Re-scheduled Successfully", ExtentColor.GREEN));
				 test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); }
			 else { throw new Exception();}
			 } 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Re-schedule Technical Interview",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		}
		 
		 
		 
		 
		}
	}
