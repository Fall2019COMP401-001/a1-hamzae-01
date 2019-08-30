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
		for(int j =0 ; j<count; j++) {
			firstName[j] = scan.next();
			lastName [j] = scan.next();
			int groc = scan.nextInt();
			for(int k=0; k<groc; k++) {
				int quantity = scan.nextInt();
				String typeName = scan.next();
			}
	}
}
}
