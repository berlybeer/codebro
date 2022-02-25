package JavaExpressions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//expression = operands & operators
		//operands = values, variables, numbers, quantity
		//operators = + - * / %
		
		int apples = 5;
		System.out.println("We have "+ apples +" apples.");
		
		apples = apples +1;
		
		System.out.println("We have " + apples +" apples now.");
		
		
		apples++;
		System.out.println("We can use the ++ operator to add one to the current value of an int or char");
		System.out.println("We have "+ apples +" apples now");
		
		
		int a = 18;
		int b = 6;
		System.out.println("If value of A = "+a);
		System.out.println("And value of B = "+b);
		System.out.println("Return the remainder of the division between A and B");
		int c;
		c = a%b;
		
		System.out.println( c+" is the Result and we obteined using the modulo \"%\" operator");
		
		
		int cellphones = 10;
		cellphones = cellphones/3;
		
		System.out.println("In the integer division the result will truncate any decimal portion thats why 10/3 is: "+cellphones);
		
		double friends = 10;
		friends = (double)friends / 3;
		
		
		System.out.println("If we cast the result with double the result will be: "  + friends);
		
		
		System.out.println();

	}

}
