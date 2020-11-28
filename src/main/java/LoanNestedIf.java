import java.util.Scanner;

public class LoanNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize the known
		int min_sal = 30000;
		int min_service = 2;
		// Get the unknown
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your salary");
		int salary = scanner.nextInt();
		System.out.println("Please enter the no. of years of service");
		int service = scanner.nextInt();
		scanner.close();
		// Loan Decision Making
		if (salary > min_sal )
		{
			if (service >min_service  )
			{
				System.out.println("Congratulations! QUALIFIED for the loan");
			}
			else 
			{System.out.println("Sorry , you are not eligible for the loan");
			}
			
		}
		else 
		{ 
			System.out.println("Sorry , you are not eligible for the loan");
		}
		
			
		}
	}


