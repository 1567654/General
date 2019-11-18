package Abstract;

public class PeopleHealth {
	
	public static void main(String[] args) {
		uad[] People = {new Person1(), new Person2(), new Person3()};
		
		for (uad c : People) {
			c.healthy();
			c.sickness();
			c.bloodType();
			
			System.out.println();
		}
	}

}
