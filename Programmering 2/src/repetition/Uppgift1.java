package repetition;

import java.util.Scanner;

public class Uppgift1 {
	
	public static void main(String[] args) {
		tal();
	}
	
	public static int tal() {
		Scanner sc = new Scanner(System.in);
		
		int summa = 0;
		
		for (int i = 0; i < Math.random()*10; i++) {
			int tal = sc.nextInt();
			summa = summa + tal;
		}
		System.out.println(summa);
		return summa;
		
	}
}
