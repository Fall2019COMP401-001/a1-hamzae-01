package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		// number of names^
		String[] firstName = new String[count];
		String[] lastName = new String [count];
		// inserts names^
		double[] totalCost = new double[count];
		// adds all costs together^
		for(int i=0; i<count; i++) {
			firstName [i] = scan.next();
			lastName [i] = scan.next();
			int types = scan.nextInt();
			for(int j=0; j<types; j++) {
				// quantity of groceries
			int quantity = scan.nextInt();
			String typeName = scan.next();
			double cost = scan.nextDouble ();
			totalCost[i] += quantity * cost;
			}
		}
		//end of forloop
		for(int i = 0; i<count; i++) {
			System.out.println(firstName[i].charAt(0) + ". " + lastName[i] + ": " + String.format("%.2f", totalCost[i]));
			// prints all terms, "%.2f" adds the 0 to 12.5
		}
		
}
}
