package Base_Package;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.mail.*;

public class Java_Mail extends Base_Class{
	

public static void sendmail() throws EmailException {
				Date date = new Date();
				SimpleDateFormat Date_Format = new SimpleDateFormat("dd-MMM kk:mm");
				String formattedDate = Date_Format.format(date);
				
			  EmailAttachment attachment = new EmailAttachment();
			  attachment.setPath(Utility_Class.userdir+"\\PsyHire_Automation_Report.html");
			  attachment.setDisposition(EmailAttachment.ATTACHMENT);
			  attachment.setDescription("PsyHire"+" "+formattedDate+".html");
			  attachment.setName("PsyHire");
			  
			
			  MultiPartEmail email = new MultiPartEmail();
			  email.setHostName("mail domanin");
			  email.setSmtpPort(465);
			  email.setAuthenticator(new DefaultAuthenticator("mail", "Abcd.1234"));
			  email.setSSLOnConnect(true);
			  email.setTLS(true);
			  email.setFrom("Mail");
			  email.setSubject("Prod : PsyHire Automation Report"+" "+formattedDate);
			
			  email.addTo("dinesh.saiwal@gmail.com");
		      String signature = "\n\nBest regards,\nDinesh Saiwal";
		      
		      email.setMsg(result+signature);
		     
			  

			  email.attach(attachment);
			  
			  try {email.send();
				System.out.println("************************* Email Sent Successfully *****************************");}
				catch (Exception e) {
					System.out.println("Failed to send email.");
					e.printStackTrace();
				}
			  
  
}}