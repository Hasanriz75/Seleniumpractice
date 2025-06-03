package java;

class Add {
	 Add(){
		
		 System.out.println("HI");
	 }
	 void Addi(int x,int y) {
		
			int z = x+y;
			System.out.println(z);
		}
	Add(int x){
		this();
		System.out.println("int x");
	}
	}

public class CLASS1 extends Add {	
	CLASS1(){
		super(10);
		System.out.println("int Class1");
	}
	
	
	public static void main(String[] args) {
		CLASS1 c = new CLASS1();
			
	}
}

