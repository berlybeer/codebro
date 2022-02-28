package Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// array = used to store multiple values in a single variable
		
		String[] cars = {"Camaro", "Corvette", "Tesla","BMW"};
		
		cars[0] = "Mustang";
		
		System.out.println(cars[3]);
		
		
		
		String[] fruits = new String[3];
		fruits[0] = "Pineapple";
		fruits[1] = "Strawberry";
		fruits[2] = "Orange";
		
		for(int i=0; i<fruits.length; i++){
			System.out.println(fruits[i]);
		}

	}

}
