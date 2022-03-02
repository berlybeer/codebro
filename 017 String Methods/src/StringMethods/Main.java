package StringMethods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String = a reference data type that can store one or more characters 
		//reference data types have access to useful methods
		
		String name = "Bro";
		
		//boolean result = name.equals("Bro");
		//boolean result = name.equalsIgnoreCase("bro");
		//int result = name.length();
		//char result = name.charAt(0);
		//int result = name.indexOf("o");
		//boolean result = name.isEmpty();
		//tring result = name.toUpperCase();
		//String result = name.toLowerCase();
		
		//String result = name.trim(); //remove spaces
		
		String result = name.replace('o','a'); //replace
		
		System.out.println(result);

	}

}
