package coreJava;

public class outlookDemo implements EmailServiceProvider {
	
	public void newEmailMessage () {
		System.out.println("Outlook - New Email");
	}

	public void openJunkFolder () {
		System.out.println("Outlook - Open Junk Folder");
	}

	public void closeOutlook () {
		System.out.println("Outlook - Close Email Provider");
	}

	public void createEmailMessage() {
		// TODO Auto-generated method stub
		System.out.println("OUTLOOK : Implementing Abstract Method - New Email");
	}

	public void openJunkSpamFolder() {
		// TODO Auto-generated method stub
		System.out.println("OUTLOOK : Implementing Abstract Method - Junk or Spam");
	}

	public void closeEmailProvider() {
		// TODO Auto-generated method stub
		System.out.println("OUTLOOK : Implementing Abstract Method - Close Email ");
	}
}
