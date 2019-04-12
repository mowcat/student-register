package Logic;

import java.util.ArrayList;
import java.util.List;

public class AppLogic {
	private List<Student> register;
	public List<Student> getRegister() {
		return register;
	}
	
	public void setRegister(List<Student> register) {
		this.register = register;
	}
	
	public AppLogic (int numberOfDefaultStudents) {
		register = new ArrayList<Student>();
		for (int i = 0; i < numberOfDefaultStudents; i++) {
			register.add(new Student("Student", 0, "student@student.com", 0, "English"));
		}
	}
}