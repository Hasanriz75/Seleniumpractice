package java;
public class abstract1 {
	
public static void main(String[]args){
	cool c = new cool();
c.greet();
relax f = new relax();
f.greet();
}
}
abstract class ab{
	abstract public void greet() ;
	public void babu() {
		System.out.print(false);
	}
	}
class cool extends ab{
	public void greet() {
		System.out.println("Good Morning");
	}
}
class relax extends cool{
	public void greet() {
		System.out.println("Good Evening");
	}
}
//interface
interface Bycycle{
	int a = 77;
	void speedup(int in);
	void break1(int de);
}
class abs1 implements Bycycle{
	public static void pair() {
		System.out.println("Cool");
	}
		public void speedup(int in) {
			System.out.println("Speedup");
		}
		public void break1(int de) {
			System.out.println("Speeddown");
		}
	}
