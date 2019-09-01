package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int type = scan.nextInt();
		// type is the number of groceries
		String [] typeName = new String [type]; 
		//typeName is the names of groceries stored for reference point later
		for(int i=0; i<type; i++) {
			typeName[i] = scan.next();
			scan.nextDouble();
		}
		//this for loop interprets the list of groceries depending on number inputed for type
		int count = scan.nextInt();
		//count is the amount of people
		int [] customers = new int [type];
		int [] finalquant = new int [type];		
		for(int a =0 ; a<count; a++) {
			boolean[] purchaser = new boolean[type];
			scan.next();
			scan.next();
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
				}
				finalquant[index] += quantity;
				if (!purchaser[index]) {
					customers[index] += 1;
				}
				purchaser[index] = true;
			}
		}
		
		for (int m=0; m<type; m++) {
			/*if(customers[m] == 0) {
				System.out.println("No");
			}
			if (finalquant[m] == 0) {
				System.out.println(" ");
			}*/
			if(customers[m] > 0) {
			System.out.println(customers[m] + " customers bought " + finalquant[m] + " " + typeName[m]);
			} else {System.out.println("No customers bought " + typeName[m]);
			
			}
		}
}
}
