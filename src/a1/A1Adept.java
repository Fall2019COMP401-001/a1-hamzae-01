package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int type = scan.nextInt();
		// type is the number of groceries
		String [] typeName = new String [type]; 
		//typeName is the names of groceries stored for reference point later
		double [] cost = new double [type];
		// double cost represents price of each grocery
		for(int i=0; i<type; i++) {
			typeName[i] = scan.next();
			cost[i] = scan.nextDouble ();
		}
		//this for loop interprets the list of groceries depending on number inputed for type
		int count = scan.nextInt();
		//count is the amount of people
		String[] firstName = new String[count];
		String[] lastName = new String [count];
		//arrays storing first and last names
		Double[] totalCost = new Double [count];
		//array storing the final cost of each customer so that they can be compares for size and averaged out
		for(int na = 0; na < count; na++) {
			totalCost[na] = 0.0;
		}
		//below for loop goes through the names and has a nested for loop which goes through the list of groceries each buyer purchased
		for(int a =0 ; a<count; a++) {			
			firstName[a] = scan.next();
			lastName [a] = scan.next();
			int groc = scan.nextInt();
			//groc represents the number of different types of groceries each customer bought
			for(int k=0; k<groc; k++) {
				int quantity = scan.nextInt();
				// quantity is the amount of each type of groc bought
				String typenames = scan.next();
				//typenames represents the names of the groceries in the second section of the input
			int index=0;
				for(int l=0; l<type; l++) {
					if(typenames.equals(typeName[l])) {
						index = l;
					}
					//the above for loop references typenames back to typeName to get the price of each groc item
				}
				totalCost[a] += cost[index] * quantity;
				//gets totalcost from above for loop
			}
		}
		int big=0;
		int small=0;
		double sum=0;
		for(int x=0; x<count; x++) {
			if(totalCost[x] > totalCost[big]) {
				big = x;
			}
			if(totalCost[x] < totalCost[small]) {
				small = x;
			//this for loop compares the totalcost of each buyer and gets the biggest and smallest	 
			}
			sum += totalCost[x];
			//sum of all 3 buyers uses in print statement to find average
			//avg = (float)((totalCost[big]+totalCost[small])/2);
		}
		System.out.println("Biggest: " + firstName[big] + " " + lastName[big] + " (" + String.format("%.2f", totalCost[big]) + ")");
		System.out.println("Smallest: " + firstName[small] + " " + lastName[small] + " (" + String.format("%.2f",totalCost[small]) + ")");
		System.out.println("Average: " + String.format("%.2f", (sum/totalCost.length)));
	}
}
