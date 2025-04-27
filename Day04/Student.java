class Student{
	String name="Adam";
	int marks=10;
	
	Student()
	{
		name="No Name";
	}
	Student(String name_in)
	{
		name=name_in;
	}
}

class StudentDemo{
	public static void main(String[] args){
		System.out.println("Hi from StudentDemo class");
		System.out.println("Creating an object from Student class");
		Student s1=new Student();
		System.out.println("Name value of the object is "+s1.name);
		System.out.println("Marks value of the object is "+s1.marks);
		s1.name="Luxica";
		s1.marks=70;
		System.out.println("Created an object from Student class");
		System.out.println("Name value of the object is "+s1.name);
		System.out.println("Marks value of the object is "+s1.marks);
	}
}