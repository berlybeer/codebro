package wrapperClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wrapper class = provides a way to use primitive data types as reference data types
			//			 reference data types contain useful methods
		//					can be used with collections (ex.ArrayList)
		
		//primitive  	wrapper
		//---------		---------
		//bolean		Boolean
		//char			Character
		//int			Integer
		//double		Double
		
		//autoboxing = the automatic conversion that the Java compiler makes between the primitive types
						//and their corresponding object wrapper class
		//unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive.
		
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Berly";
		
		if(a==true) {
			System.out.println("This is true");
		}
		
		
		
		
		
		
	}

}
