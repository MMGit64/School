
public class Teacher {

	
	String name;
	int age;
	String subject;
	int yearsOfTeachExp;
	String ethnicBackground;

	
	public Teacher(String name, int age, String subject, int yearsOfTeachExp, String ethnicBackground) {
		this.name = name;
		this.age = age;
		this.subject = subject;
		this.yearsOfTeachExp = yearsOfTeachExp;	
		this.ethnicBackground = ethnicBackground;
	}

	public String getName() {
		return name;
	
	}
	
	public String toString() {
		String output = "Name: " + name;
		output += "\nAge: " + age;
		output += "\nSubject: " + subject;
		output += "\nYears of teaching experience: " + yearsOfTeachExp;
		output += "\nEthnic background: " + ethnicBackground;
		
		return output;
	}

}