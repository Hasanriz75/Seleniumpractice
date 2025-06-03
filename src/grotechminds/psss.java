package grotechminds;

class psss {
public static void hello() {
	System.out.println("Hello1");
	
}

private void hello11() {
	System.out.println("Hello2");
}
protected static void hello12() {
	System.out.println("Hello3");
}
void hello13(){
	System.out.println("Hello4");
}
public static void main(String args[])
{
	psss m1 = new psss();
	hello12();
	m1.hello11();
	m1.hello13();
	
}
}
