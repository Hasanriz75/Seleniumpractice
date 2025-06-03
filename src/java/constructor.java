package java;
class cons {
	
	String name;
	public int metho(int i){
		System.out.print(i);;
		return i;
		
	}
	 cons(String n) {
		 String name;
		 this.name = n;
		System.out.println(n);	
	}
	 cons(){
		 System.out.println("2nd cons");
	 }
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cons c1 = new cons();
cons c2 = new cons("Hasan");
c1.metho(4);
	}
}
