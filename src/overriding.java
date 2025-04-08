
class my1{
	public void meth1(){
		System.out.println("this is meth1 of class my1");
	}
	
	public void meth2() {
		System.out.println("this is meth2 of class my1");
		
	}
}

class my2 extends my1{
	public void meth3() {
		System.out.println("this is meth3 of class my2");
	}
	
	public void meth2() {
		System.out.println("this is meth2 of class my2");
}
}

public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
my1 obj = new my2();

obj.meth2();
	}

}

