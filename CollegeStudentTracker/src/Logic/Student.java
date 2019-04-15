package Logic;

public class Student {
	public static String[] subjects = {"Please select...","Computer Science", "Maths", "English", "Biology", "Latin", "Mandarin", "Firestarting"};
	String name;
	int age;
	String email;
	double height;
	String subject;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public double getHeight() {
		return height;
	}

	public String getSubject() {
		return subject;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Student(String name, int age, String email, double height, String subject) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.height = height;
		this.subject = subject;
	}

	@Override
	public String toString() {
		String student = name + ", " + age + ", " + email + ", " + height +  ", " + subject;
		return student;
	}



}
