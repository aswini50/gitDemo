package coreJava;

public  class gmailDemo implements EmailServiceProvider {
	
	public void composeEmailMessage () {
		System.out.println("GMail - Compose Email");
	}

	public void openSpamFolder () {
		System.out.println("GMail - Open Spam Folder");
	}

	public void closeGmail () {
		System.out.println("GMail - Close Email Provider");
	}

	public void createEmailMessage() {
		// TODO Auto-generated method stub
		System.out.println("GMail: Implementing abstract method - Compose Email");
	}

	public void openJunkSpamFolder() {
		// TODO Auto-generated method stub
		System.out.println("GMail: Implementing abstract method - Spam Folder");
	}

	public void closeEmailProvider() {
		// TODO Auto-generated method stub
		System.out.println("GMail: Implementing abstract method - Spam Folder");
	}

}
