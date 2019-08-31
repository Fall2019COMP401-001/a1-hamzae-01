package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int type = scan.nextInt();
		// number of groceries
		String [] typeName = new String [type];
		double [] cost = new double [type];
		for(int i=0; i<type; i++) {
			typeName[i] = scan.next();
			cost[i] = scan.nextDouble ();
		
		}
		int count = scan.nextInt();
		String[] firstName = new String[count];
		String[] lastName = new String [count];
		Double[] totalCost = new Double [count];
		for(int zero = 0; zero < count; zero++) {
			totalCost[zero] = 0.0;
		}
		for(int a =0 ; a<count; a++) {			
			firstName[a] = scan.next();
			lastName [a] = scan.next();
			int groc = scan.nextInt();
			
			for(int k=0; k<groc; k++) {
				int quantity = scan.nextInt();
				String typenames = scan.next();
				
			int index=0;
				for(int l=0; l<type; l++) {
					if(typenames.equals(typeName[l])) {
						index = l;
					}
				}
				totalCost[a] += cost[index] * quantity;
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
				 
			}
			sum += totalCost[x];
			//avg = (float)((totalCost[big]+totalCost[small])/2);
		}
		System.out.println("Biggest: " + firstName[big] + " " + lastName[big] + " (" + String.format("%.2f", totalCost[big]) + ")");
		System.out.println("Smallest: " + firstName[small] + " " + lastName[small] + " (" + totalCost[small] + ")");
		System.out.println("Average: " + String.format("%.2f", (sum/totalCost.length)));
	}
}
