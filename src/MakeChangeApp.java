import java.util.Scanner;

public class MakeChangeApp {
	static double price;
	static double tendered;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int penniesDue = 0;
		int nicklesDue = 0;
		int dimesDue = 0;
		int quartersDue = 0;
		int onesDue = 0;
		int fivesDue = 0;
		int tensDue = 0;
		int twentiesDue = 0;


		System.out.print("What was the price of the item?  $");
		double price = keyboard.nextDouble();

		System.out.print("How much cash were you given?  $");
		double tendered = keyboard.nextDouble();

		System.out.println("Price $" + price + " Tendered $" + tendered);

		double changeDue = (double) ((tendered - price) * 100) / 100;

		System.out.println("Change Due: $" + changeDue);
		
		if(tendered < price) {
			System.out.println("*** The customer did not provide enough money for purchase! ***");
			System.exit(0);
		}
		if (tendered == price) {
			System.out.println("Thank you for your purchase. No change due.");
			System.exit(0);
		}
		
		keyboard.close();

		while (changeDue > 0) {
			if (changeDue >= 20) {
				changeDue -= 20;
				twentiesDue++;
				continue;
			}
			if (changeDue >= 10) {
				
				changeDue -= 10;
				tensDue++;
				continue;
			}
			if (changeDue >= 5) {
				changeDue -= 5;
				fivesDue++;
				continue;
			}
			if (changeDue >= 1) {
				changeDue -= 1;
				onesDue++;
				continue;
			}
			if (changeDue >= .25) {
				changeDue -= .25;
				quartersDue++;
				continue;
			}
			if (changeDue >= .10) {
				changeDue -= .10;
				dimesDue++;
				continue;
			}
			if (changeDue >= .5) {
				changeDue -= .5;
				nicklesDue++;
				continue;
			}
			if (changeDue >= .001) {
				changeDue -= .01;
				penniesDue++;
				continue;
			} else {
				break;
			}

		}
		System.out.println("[" + twentiesDue + "]-twenties " + "[" + tensDue + "]-tens " + "[" 
				+ fivesDue + "]-fives " + "[" + onesDue + "]-ones " + "[" + quartersDue + "]-quarters " 
				+ "[" + dimesDue + "]-dimes " + "[" + nicklesDue + "]-nickles " + "[" +
				+ penniesDue + "]-pennies ");

	}

}
