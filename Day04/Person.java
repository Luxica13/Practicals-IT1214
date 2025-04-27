class Person{
	private String name;
	
	public String getName(){
		return name;
	}
	public void setName(String name_in){
		name = name_in;
	}
}
class Main{
	public static void main(String[] args)
	{
		Person p1=new Person();
		//p1.name="john";
		p1.setName("John");
		System.out.println(p1.getName());	
	}
}