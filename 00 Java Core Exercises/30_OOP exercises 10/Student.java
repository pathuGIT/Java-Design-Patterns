import java.util.ArrayList;

public class Student{
	private String name;
	private int grade;
	private String course;
	private static ArrayList<Student> stdArray = new ArrayList<Student>(); 
	
	public Student(String name, int grade, String course){
		this.name = name;
		this.grade = grade;
		this.course = course;
	}
	
	public String getName(){
		return name;
	}
	public int getGrade(){
		return grade;
	}
	public String getCourse(){
		return course;
	}
	
	public static void addStudent(Student student){
		stdArray.add(student);
	}
	
	public static void remStudent(Student student){
		stdArray.remove(student);
	}
	
}