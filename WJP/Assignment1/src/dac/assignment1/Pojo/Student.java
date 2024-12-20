package dac.assignment1.Pojo;

public class Student {
	private String Name;
	private int Age;
	private String Grade;
	private String Email;
	
	public Student(String name, int age, String grade, String email) {
		Name = name;
		Age = age;
		Grade = grade;
		Email = email;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
		
}
