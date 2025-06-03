package grotechminds;

public class thisss {
	String name ;
	int a;
	void add(String name) {
	//this.name = name;
		name = "Marziya";
		System.out.println(name);
	}
void sub(int a) {
	//this.a=a;
	a = 100;
	System.out.println(a);
}
	public static void main(String[] args) {
		thisss t1 = new thisss();
		t1.add("tazzo");
		t1.sub(0);
	}

}
