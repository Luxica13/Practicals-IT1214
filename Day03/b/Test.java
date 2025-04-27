package b;

public class Test{
	void print(){
		System.out.println("Hi from Test in Package B");
	}
	
	public void display(){
		print();
		System.out.println("Display: Hi from Test in Package B");
	}
}