import java.util.Scanner;

public class GrossPayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 Get the no. of hours worked 
		System.out.println("Please enter the no. of hours worked :");
		Scanner scanner = new Scanner(System.in); // Using Scanner Function , we can allow user to enter values on the console
		int hours = scanner.nextInt() ;
		System.out.println("Hours entered by you is :" + hours );
		System.out.println("Please enter the hourly pay rate : ");
		double payRate = scanner.nextDouble();
		System.out.println("The hourly pay rate entered by you is :" + payRate);
		scanner.close();
		//3 Calculate Gross Pay
		double grossPay = hours * payRate;
		//4 Display Gross Pay 
        System.out.println("Your Gross Pay is : USD " + grossPay);
	}

}
