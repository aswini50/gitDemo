import java.util.Scanner;
public class ForLoopDemo {

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */


    public static void main(String args[]){

        //Get number of items to scan
        System.out.println("Enter the number of items you would you like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        System.out.println("Quantity entered by user is :" + quantity);


        double total = 0;
        System.out.println("The Total Value before entering for loop :"+ total);

        //Create loop to iterate through all of the items and accumulate the costs
        for(int i=0; i<quantity; i++){
        	System.out.println("loop # :" + (i+1));
            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();
            total = total + price;
            System.out.println("loop #:" + (i+1) + "Total Is:" + total);
        }
        System.out.println("Exiting For Loop ");
        scanner.close();

        System.out.println("Your total is $" + total);
    }

}