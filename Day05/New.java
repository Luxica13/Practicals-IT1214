class Paper{
	int length;
	int width;
	String content;
	
	
}

class Document{
	String name;
	Paper p;
	
	public static void main(String[] args){
		Document d1=new Document();
		System.out.println("Created a document object d1.");
		d1.name="Folder1";
		System.out.println("Name of the document d1 is "+d1.name);
		d1.p= new Paper();
		d1.p.content="This is the first line.";
		System.out.println("Size of the paper of the document d1 is "+d1.p.length+"*"+d1.p.width);
		
		
		Document d2=new Document();
		System.out.println("Created a document object d2.");
		d2.name="Folder2";
		System.out.println("Name of the document d2 is "+d2.name);
		
		
	}
}