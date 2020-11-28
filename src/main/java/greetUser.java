
public class greetUser {

	    //public static void main(String args[]){
		// TODO Auto-generated method stub
		//Attributes
		String name = "Ash" ;
		static //Method Declaration
		String userName;
		public static String greetUserMethod(String userName){
			System.out.println("This is inside greetUserMethod userName "+ userName);
			System.out.println("Hello , Good Evening!"+ userName);
		    String greeting= "I AM THE RETURN VALUE !" ;
			return greeting;	
		}
			public static void main(String[] args){
			String greet = null;
			System.out.println("This is inside Main Method userName "+ userName);
			System.out.println("This is Greet Value before Method Call  "+ greet);
			greet =	greetUserMethod("Diana");
			System.out.println(greet);
			}
	
		}

	

