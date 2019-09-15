package repetition;

import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			String ord = sc.nextLine();
					
			for (int i = ord.length() -1; i >= 0 ; i--) {
				System.out.print(ord.charAt(i));
			}

	}

}
