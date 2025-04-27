class Rectangle{
	
	private int height;
	int width;
	
	Rectangle(){
		height = 2;
		width = 2;
	}
	
	Rectangle(int height, int width){
		this.height = height;
		this.width = width;
		System.out.println("Just created a Rectangle object with (h*w) "+height+"*"+width);
		print(width, height);
	}
	
	int getDetails(){
		return height;
	}
	
	void print(int width, int height){
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				System.out.print("* ");// * in each line
			}
			System.out.println();//break lines
		}
	}
}

class Main{
	public static void main(String[] args){
		/*for(int i=0; i<10; i++){
			System.out.println("Value of i is "+i);
		}*/
		Rectangle r1 = new Rectangle(4,3);
		Rectangle r2 = new Rectangle();
		Rectangle r3 = r1;
		System.out.println("r1: Height = "+r1.getDetails()+" , Width = "+r1.width);
		System.out.println("r2: Height = "+r2.getDetails()+" , Width = "+r2.width);
		System.out.println("r3: Height = "+r3.getDetails()+" , Width = "+r3.width);
		//r1.print(3,4);
	}
}