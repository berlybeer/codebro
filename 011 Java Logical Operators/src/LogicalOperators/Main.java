package LogicalOperators;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//logical operators = used to connect two or more expressions
		
		// && = (AND) both conditions must be true

		
		int temp = 25;
		
		if(temp>30) {
			System.out.println("It is hot outside");
		}
		
		else if(temp>=20 && temp<=30) {
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is cold outside");
		}
		// || = (OR) either condition must be true
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! press q or Q to quit");
		String response = scanner.next();
		
		if(response.equals("q")|| response.equals("Q")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("You are still playing the game *pew pew*");
		}
		
		
		// ! = (NOT) reverses boolean value of a condition
		
		
		System.out.println("You are watching TV, press q or Q to turn off");
		String response2 = scanner.next();
		
		if(!response2.equals("q") && !response2.equals("Q")) {
			System.out.println("You are still watching TV");
		}else {
			System.out.println("You quit the game");
		}

	}

}
