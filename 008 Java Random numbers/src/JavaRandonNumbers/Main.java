package JavaRandonNumbers;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		int x = random.nextInt();
		
		System.out.println(x);
		
		int y = random.nextInt(6)+1;
		System.out.println(y);
		
		double z = random.nextDouble();
		
		System.out.println(z);
		
		boolean a = random.nextBoolean();
		
		System.out.println(a);

	}

}
