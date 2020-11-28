
public class CreatingMethodsInsteadOfMainMethod {
	//System.out.println("Inside class");
	// Attributes or Characteristics
	int a ;
	int b;
	
	// Behavior (Method)
	public static void sum(int x, int y) {
		System.out.println("Inside sum method");
		int sum = x+y ;
		System.out.println("The sum is :" + sum);
		System.out.println("Exiting sum method");
	}
	public static void difference(int x, int y) {
		System.out.println("Inside difference  method");
		int difference = x- y ;
		System.out.println("The difference  is :" + difference );
		System.out.println("Exiting difference  method");
	}
	
	public static void main(String args[]){
		System.out.println("Inside main method");
		sum(5,10);
		System.out.println("Exiting main method");
	}
	
	
	

}
