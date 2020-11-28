import java.util.Scanner;

public class GradeIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize the knowns
		//int marks ; 
		//String grade ;// 90-100 -> A , 80-89->B , 70-79->C, 60-69-D,<59-E
		//Get the unknowns
		System.out.println("Please enter your marks:");
		Scanner scanner = new Scanner(System.in);
		int marks = scanner.nextInt();
		scanner.close();
		//Decision Making
		if (marks >=90 )
		{
			System.out.println("Congrats, You got A Grade");
		}
		else
			
			if (marks >=80)
			{
				System.out.println("Congrats, You got B Grade");
			}
			else 
				if (marks >=70)
				{
					System.out.println(" You got C Grade");
				}
				else
					if (marks >=60)
						{
						System.out.println("You got D Grade");
						}
					else 
					{ System.out.println("Sorry, You got E Grade");	
					}

	}

}
