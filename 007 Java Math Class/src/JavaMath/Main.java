package JavaMath;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 3.14;
		double y = 10;
		
		double t= -10;
		
		double z = Math.max(x, y);
		
		double a = Math.abs(y);
		
		double b = Math.sqrt(y);
		
		double c = Math.round(x);
		
		double d = Math.ceil(x);
		
		double e = Math.floor(x);
		
		System.out.println(z);
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
		double side1;
		double side2;
		double hypotenuse;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side x: ");
		side1 = scanner.nextDouble();
		System.out.println("Enter sid y: ");
		side2 = scanner.nextDouble();
		
		hypotenuse = Math.sqrt((side1 * side1)+(side2*side2));
		
		System.out.println("The hypotenuse is : " + hypotenuse);
		
		scanner.close();
		
		
		
		
	}

}
