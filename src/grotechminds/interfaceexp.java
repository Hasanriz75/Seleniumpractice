package grotechminds;

interface helloq
{
void add1();
void add2();
}
abstract class hellow{
	abstract void add3();
	void add4() {
		System.out.println("Ho");
	}
}
public class interfaceexp implements helloq
{

	public static void main(String[] args) {	
		interfaceexp m1 = new interfaceexp();
		m1.add1();
		m1.add2();
	}
	public void add1() {
		System.out.println("Hi");
	}
	public void add2() {
		System.out.println("Hi2");
	}
	static {
		System.out.println("Hi3");
	}
}
