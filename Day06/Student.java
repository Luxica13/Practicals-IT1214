class Student{
	int marks;
	String name;
	
	Student(){
		System.out.println("Creating a Student Object");
		name = "Default name";
	}
	
	Student(String name_in, int marks_in){
		System.out.println("Creating a Student Object with name "+name_in+", marks "+marks_in);
		name = name_in;
		marks = marks_in;
	}
}

class App{
	public static void main(String[] args){
		System.out.println("Welcome to Demo Class App");
		Student s1 = new Student("Kevin",50);
		//s1.marks = 75;
		//s1.name = "Kevin";
		System.out.println("Name of the Student s1 = " + s1.name + ", marks = " + s1.marks);
		
		Student s2 = new Student();
		System.out.println("Name of the Student s2 = " + s2.name + ", marks = " + s2.marks);
		s2.marks = 90;
		s2.name = "Bob";
		System.out.println("Name of the Student s2 = " + s2.name + ", marks = " + s2.marks);
		
	}
}