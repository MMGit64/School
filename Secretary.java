
public class Secretary {

	String name;
	int age;
	String ethnicBackground;
	int secretaryIDnumber;
	String gender;
	
	
	public Secretary(String name, int age, String ethnicBackground, int secretaryIDnumber, String gender) {
		this.name = name;
		this.age = age;
		this.ethnicBackground = ethnicBackground;
		this.secretaryIDnumber = secretaryIDnumber;
		this.gender = gender;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getSecretaryIDnumber() {
		return secretaryIDnumber;
	}
	
	
	public String toString() {
		String output = "Name: " + name;
		output += "\nAge: " + age;
		output += "\nEthnic Background: " + ethnicBackground;
		output += "\nSecretary ID number: " + secretaryIDnumber;
		output += "\nGender: " + gender;
		
		return output;
	}

}