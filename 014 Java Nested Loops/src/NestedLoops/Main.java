package NestedLoops;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//nested loop = a loop inside of a loop
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		
		System.out.println("Enter # of comumns: ");
		columns = scanner.nextInt();
		
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			
			for(int j=1; j<=columns; j++) {
				System.out.print(symbol);
			}
		}
		

	}

}
