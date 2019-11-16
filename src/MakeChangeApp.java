import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What was the price of the item?  $");
		double price = keyboard.nextDouble();
		
		System.out.print("How much cash were you given?  $");
		double tendered = keyboard.nextDouble();
		
		System.out.println("Price " + price + " Tendered " + tendered);
		
		double remainder = tendered - price;
		System.out.println(remainder);
		System.out.printf("Cash due: %.2f", + remainder);
		
		
	
		
//		double floor = (double) remainder;
//		if (x < 0) {
//			if (x != floor) {
//				floor = floor - .01;
//			}
//		}
//		System.out.println(floor);
//		
		
		
		
		//System.out.println("Cash due to customer $" + result);
		
		
	
		
		//need to take remainder, have it round, and then determine how many dollars, quarters etc
		// that make up the remaining amount. 
		
		//possibly use a .blah to cut the remaining off. need to look up the rounding. 
		
		// at some point I need a mod operator, and new method possibly for the coins/dollars

		keyboard.close();
	}

}
