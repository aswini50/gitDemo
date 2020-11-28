package coreJava;

public interface EmailServiceProvider {
	
	
	//Abstract Methods
	public void createEmailMessage ();
	public void openJunkSpamFolder ();
	public void closeEmailProvider ();
	
	/*public default void saveDraftFolder() {
		System.out.println("Save Draft \n");
	}
	
	public static void sentEmailFolder() {
		System.out.println("Sent Email");

}*/
}