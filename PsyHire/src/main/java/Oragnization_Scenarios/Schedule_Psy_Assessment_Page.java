package Oragnization_Scenarios;


import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Package.Base_Class;

public class Schedule_Psy_Assessment_Page {
	WebDriver driver = Base_Class.getDriver();
	
		@FindBy(xpath = "//p[text()='Jobs']")
		private WebElement click_on_JObs_tab;
		public void Click_on_Jobs_Tab() 
		{click_on_JObs_tab.click();}
		
		
		@FindBy(xpath = "//p[contains(text(),'CV Screened')]")
		private WebElement click_on_existing_job;
		public void Click_on_Existing_Job() 
		{click_on_existing_job.click();}
		
		
		@FindBy(xpath = "(//h4[@class='text-gray-primary text-xl capitalize cursor-pointer truncate'])[1]")
		private WebElement Open_Candidate_Card;
		public void Open_Candidate_Card() 
		{WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(Open_Candidate_Card));
			Open_Candidate_Card.click();}
		
		
		@FindBy(xpath = "//p[contains(text(),'Move to Stage')]")
		private WebElement Open_Move_To_Stage_Drop_Down;
		public void Open_Move_to_Stage_Drop_Down() 
		{Open_Move_To_Stage_Drop_Down.click();}
		
		
		@FindBy(xpath = "//button[contains(text(),'Psychometric Assessment')]")
		private WebElement Select_Psy_assessment;
		public void Select_Psy_Assessment() 
		{Select_Psy_assessment.click();}
		
		
		@FindBy(xpath = "//span[contains(text(),'Move')]")
		private WebElement Confirm_move;
		public void Confirm_Move() 
		{Confirm_move.click();}
		
		
		
		@FindBy(xpath = "(//h4[@class='text-gray-primary text-xl capitalize cursor-pointer truncate'])[2]")
		private WebElement OpenCandaidateCardForreSchedule;
		public void Open_Candidate_Card_For_ReSchedule() 
		{ OpenCandaidateCardForreSchedule.click();}
		
		
		
		@FindBy(xpath = "(//span[contains(text(),'Re-schedule')])[3]")
		private WebElement ClickOnre_Schedule;
		public void Click_On_re_Schedule() throws InterruptedException 
		{ClickOnre_Schedule.click();
		
		Thread.sleep(2000);
		LocalDate currentDate = LocalDate.now();
        LocalDate nextDay = currentDate.plusDays(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        String nextDayDateFormatted = nextDay.format(formatter);
        String xpath = "//button[@aria-label='" + nextDayDateFormatted + "']";
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement currentDateElement = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        currentDateElement.click();
		}
		
		@FindBy(xpath = "(//span[contains(text(),'Re-schedule')])[4]")
		private WebElement ClickOnre_Schedule_popup;
		public void Click_On_Re_Schedule_Popup() throws InterruptedException 
		{ClickOnre_Schedule_popup.click();}
		 
		
         
         
		public Schedule_Psy_Assessment_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
			} 



}
