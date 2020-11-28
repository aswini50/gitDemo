package coreJava;

public class TestEmailServiceProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			EmailServiceProvider outlook = new outlookDemo ();
			outlook.openJunkSpamFolder();
			outlook.createEmailMessage();
			outlook.closeEmailProvider();
			//outlook.saveDraftFolder();
			
			EmailServiceProvider gmail = new gmailDemo ();
			gmail.openJunkSpamFolder();
			gmail.createEmailMessage();
			gmail.closeEmailProvider();
			//gmail.saveDraftFolder();
		}
	}


