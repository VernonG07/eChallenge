package eChallengeDayOne;

public class DayOneChallenge {
	
	public static void main(String[] args) {
		Person person = new Person("Matthew", "Griffin");
		System.out.println(person.getFullName());
		
		person.setFirstName("Vernon");
		System.out.println(person.getFullName());
		
		person.setLastName("Doe");
		System.out.println(person.getFullName());
		
		person.setFullName("Bill Smith");
		System.out.println(person.getFullName());
		
		person.setFullName("NonSpacedName");
		System.out.println(person.getFullName());
		
		person.setFullName("Random Spaced Name");
		System.out.println(person.getFullName());
		
		
	}

}
