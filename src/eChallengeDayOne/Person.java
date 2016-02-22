package eChallengeDayOne;

public class Person {
	
	private String lastName;
	private String firstName;
	private String fullName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public void setFullName(String fullName) {
		
		String nameArray[] = fullName.split("\\s");
		
		if (nameArray.length != 2) {
			System.out.println("Incorrect parameter for full name");
		} else {
			this.firstName = nameArray[0];
			this.lastName = nameArray[1];
		}
		
	}

}
